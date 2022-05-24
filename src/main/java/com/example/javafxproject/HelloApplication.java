package com.example.javafxproject;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;



public class HelloApplication extends Application {

    Label label;
    Stage window;
    Button button;

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

        button = new Button("Click here");

        //Action happening when a button is clicked(Open a new window)
        button.setOnAction(e -> NewWindow.display());

        //Create VBox
        StackPane layout = new StackPane();

        layout.getChildren().add(button);

        VBox vbox = new VBox(messageLabel,label, button, layout);

        vbox.setAlignment(Pos.CENTER);

        //Set Margins
        vbox.setMargin(label, new Insets(100,50 , 20, 50));

        Scene scene =  new Scene(vbox, 300, 250);

        primaryStage.setScene(scene);

        primaryStage.show();

    }

}