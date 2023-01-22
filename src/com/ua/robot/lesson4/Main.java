package com.ua.robot.lesson4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {


    public void start(Stage primaryStage) {
        primaryStage.setTitle("Программа для обробки символьних рядків");
        primaryStage.setWidth(300);
        primaryStage.setHeight(400);

        VBox vbox = new VBox();
        vbox.setPadding(new Insets(10, 10, 10, 10));
        vbox.setSpacing(10);
        TextField text = new TextField();
        Button btn1 = new Button("Обробити символьні рядки");
        Label label = new Label("Результат:");
        Label label2 = new Label();
        Label label3 = new Label();
        Label label4 = new Label();
        label.setVisible(false);
        label2.setVisible(false);
        label3.setVisible(false);
        label4.setVisible(false);

        text.textProperty().addListener((observable, oldValue, newValue) -> {
            label2.setText("UpperCase : "+newValue.toUpperCase());
            label3.setText("Перший символ: "+ (newValue.charAt(0)));
            int lastChar = newValue.length() - 1;
            label4.setText("Останній симовл: "+ newValue.charAt(lastChar));
        });

        btn1.setOnAction(actionEvent -> {

            label.setVisible(true);
            label2.setVisible(true);
            label3.setVisible(true);
            label4.setVisible(true);
        });


        vbox.getChildren().addAll(text, btn1, label, label2, label3, label4);
        Scene primaryScene = new Scene(vbox);
        primaryStage.setScene(primaryScene);

        primaryStage.show();
    }


}


