package com.example.javafx;
import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;


import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.io.IOException;

public class HelloApplication extends Application {



    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 800, 530);
//        scene.getStylesheets().add("styles.css");
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setTitle("myResume Login");
        stage.setScene(scene);
        stage.show();


    }


    public static void main(String[] args) {
        launch();
    }

    // Method for close button
    public void close_app(MouseEvent mouseEvent) {
        System.exit(0);
    }
}