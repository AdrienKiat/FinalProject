package com.example.javafxproject;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;



public class HelloApplication extends Application {


    public static void main(String[] args) {
        //Launch the application
        launch();
    }

    @Override
    public void start(Stage primaryStage) {

        //Set stage title
        primaryStage.setTitle("My reaction game");

        Label messageLabel = new Label("Sharpshooter");

        VBox vbox = new VBox(messageLabel);

        vbox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vbox , 500, 300);

        primaryStage.setScene(scene);

        //Show window
        primaryStage.show();
    }
}