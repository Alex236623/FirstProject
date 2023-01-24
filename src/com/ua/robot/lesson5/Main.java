package com.ua.robot.lesson5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Main extends Application {
    private static int result1;
    private static int result2;

    public void start(Stage primaryStage) {


        primaryStage.setTitle("Домашнє завдання №5");
        primaryStage.setWidth(350);
        primaryStage.setHeight(150);

        Pane pane = new Pane();

        TextField text = new TextField();
        TextField text2 = new TextField();
        Button btn1 = new Button("Порівняти числа");
        Label label = new Label();

        btn1.setLayoutX(100);
        btn1.setLayoutY(25);
        text.setLayoutX(0);
        text.setLayoutY(0);
        text2.setLayoutX(150);
        text2.setLayoutY(0);
        label.setLayoutX(100);
        label.setLayoutY(50);

        label.setVisible(false);

        text.textProperty().addListener((observable, oldValue, newValue) -> {
            result1 = Integer.parseInt(newValue);
            System.out.println(result1);
        });
        text2.textProperty().addListener((observable, oldValue, newValue2) -> {
            result2 = Integer.parseInt(newValue2);
            System.out.println(result2);
        });

        btn1.setOnAction(actionEvent -> {

            if (result1 == result2) {
                label.setText("Вони рівні");
            } else if (result1 > result2) {
                label.setText("Перше число більше другого");
            } else {
                label.setText("Друге число більше першого");
            }
            label.setVisible(true);
        });


        pane.getChildren().addAll(text, text2, btn1, label);
        Scene primaryScene = new Scene(pane);
        primaryStage.setScene(primaryScene);
        primaryStage.show();
    }


}


