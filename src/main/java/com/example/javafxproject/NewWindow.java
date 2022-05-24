package com.example.javafxproject;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class NewWindow {


    private static double r = 50;


    public static void display() {

        Stage window = new Stage();

        Group root = new Group();

        window.initModality(Modality.APPLICATION_MODAL);

        window.setTitle("Sharpshooter");

        window.setMinWidth(300);

        window.setMinHeight(250);

        Label label = new Label();

        label.setText("Click on the shapes");

        label.setAlignment(Pos.CENTER);



        Button roundbutton = new Button("Circle");

        roundbutton.setShape(new Circle(r));
        roundbutton.setMinSize(2*r, 2*r);

        roundbutton.setMaxSize(2*r, 2*r);

        Button squarebutton = new Button("Square");

        squarebutton.setMinSize(100, 100);

        squarebutton.setMaxSize(200,200);

        Scene scene = new Scene(root, 300,300);

        root.getChildren().addAll(label, roundbutton,squarebutton);

        window.setScene(scene);

        window.showAndWait();
    }
}
