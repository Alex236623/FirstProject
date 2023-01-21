package com.ua.robot.lesson4;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.geometry.Orientation;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class Main extends Application {

    public void start(Stage primaryStage) {
        FlowPane root = new FlowPane(Orientation.VERTICAL, 5,5);


        TextField textField = new TextField();


        textField.textProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println("text-field changed from " + oldValue + " to " + newValue);
            System.out.println(newValue.toUpperCase());
            System.out.println(newValue.charAt(0));
            int lastChar = newValue.length() - 1;
            System.out.println(newValue.charAt(lastChar));


        });

        Label label = new Label("Резултат у консолі... такі справи... ");


        root.getChildren().add(label);
        root.getChildren().add(textField);

        Button button = new Button("Кнопка не працює....(!)Ахах");
        root.getChildren().add(button);

        Scene scene = new Scene(root, 400, 300);

        primaryStage.setTitle("Програма для обробки символьних рядків");
        primaryStage.setScene(scene);
        primaryStage.show();
        button.setOnAction(event -> root.getChildren().setAll(button));
    }

    public static class Controller {
        @FXML
        public TextField text;
        @FXML
        private Button button;
        @FXML
        private Label label;

        public void handleButtonPress() {
            text.setVisible(false);
            button.setVisible(false);
            label.setVisible(true);

        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}





