package com.example.javafxproject;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class NewWindow {


    private static double r = 50;

    static int count1 = 0;
    static int count2 = 0;

    public static void display() {

        Stage window = new Stage();

        HBox root = new HBox();



        window.initModality(Modality.APPLICATION_MODAL);

        window.setTitle("Sharpshooter");

        Label circle = new Label();

        circle.setText("Clicks on circle: 0");

        circle.setMaxHeight(25);

        circle.setMaxWidth(25);

        circle.setScaleX(25);

        circle.setScaleY(25);

        Label square = new Label();

        square.setText("Clicks on square: 0");

        square.setMaxHeight(25);

        square.setMaxWidth(25);

        square.setScaleX(25);

        square.setScaleY(25);


        //Round Button
        Button roundbutton = new Button("Circle");

        roundbutton.setShape(new Circle(r));

        roundbutton.setMinSize(2*r, 2*r);

        roundbutton.setMaxSize(2*r, 2*r);



        roundbutton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                count1++;
                circle.setText(Integer.toString(count1));
            }
        });

        //Square Button
        Button squarebutton = new Button("Square");

        squarebutton.setMinSize(100,100);

        squarebutton.setMaxSize(100,100);

        squarebutton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                count2++;
                square.setText(Integer.toString(count2));
            }
        });


        root.getChildren().addAll(circle, square,roundbutton,squarebutton);

        root.setAlignment(Pos.CENTER);
        root.setSpacing(30);

        Scene scene = new Scene(root, 500,500);

        window.setScene(scene);

        window.showAndWait();
    }
}
