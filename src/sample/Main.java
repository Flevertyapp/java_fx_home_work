package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Home Work #4");
        primaryStage.setScene(new Scene(root, 500, 575));
        primaryStage.show();
        /*primaryStage.getScene().getStylesheets().add("src\\css\\style.css"); //этот вызов тоже не находит CSS*/
    }


    public static void main(String[] args) {
        launch(args);
    }
}
