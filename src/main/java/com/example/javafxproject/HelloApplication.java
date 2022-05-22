package com.example.javafxproject;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;



public class HelloApplication extends Application {

    private Label label;

    public static void main(String[] args) {
        //Launch the application
        launch();
    }

    @Override
    public void start(Stage primaryStage) {

        //Set stage title
        primaryStage.setTitle("My reaction game");

        //Create Label and Button
        Label messageLabel = new Label("SharpShooter");

        label = new Label("Click to start the game. ");

        Button button = new Button("Here!");

        //Register event handler
        button.setOnAction(new ButtonClickHandler());

        //Margin of Label and Button
        VBox vbox = new VBox(messageLabel,label, button);

        vbox.setAlignment(Pos.CENTER);

        vbox.setMargin(label, new Insets(100,50 , 20, 50));

        //Create scene
        Scene scene = new Scene(vbox, 500, 300);

        primaryStage.setScene(scene);

        //Show window
        primaryStage.show();
    }

}