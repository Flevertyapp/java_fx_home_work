package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;


public class Controller {

    @FXML
    public TextField textField;

    @FXML
    private TextArea textArea;

    public void onClickBtn(ActionEvent actionEvent) { //кнопки быстрого ответа
        textArea.appendText(((Button)actionEvent.getSource()).getText() + "\n"); //каст к баттону, после этого можно вытащить текст
    }

/*    public void onClickBtnSendMessage(ActionEvent actionEvent) { //клик по отправить сообщение
        textArea.appendText(textField.getText() + "\n");
        textField.clear();
        textField.requestFocus();

    }*/

    public void onClickKey(KeyEvent keyEvent) { //работает только после клика мышкой
        if (keyEvent.getCode() == KeyCode.ENTER) {
            textArea.appendText(textField.getText() + "\n");
            textField.clear();
            textField.requestFocus();
        }
    }

}
