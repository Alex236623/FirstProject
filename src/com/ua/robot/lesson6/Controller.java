package com.ua.robot.lesson6;

import javafx.animation.AnimationTimer;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private final BooleanProperty wPressed = new SimpleBooleanProperty();
    private final BooleanProperty aPressed = new SimpleBooleanProperty();
    private final BooleanProperty sPressed = new SimpleBooleanProperty();
    private final BooleanProperty dPressed = new SimpleBooleanProperty();

    private final BooleanBinding keyPressed = wPressed.or(aPressed).or(sPressed).or(dPressed);

    public Label label;

    @FXML
    private Rectangle shape1;

    @FXML
    private AnchorPane scene;

    @FXML
    void start() {
        shape1.setLayoutY(200);
        shape1.setLayoutX(50);
    }

    AnimationTimer timer = new AnimationTimer() {
        @Override
        public void handle(long timestamp) {

            int movementVariable = 2;

            if (aPressed.get()) {
                shape1.setLayoutX(shape1.getLayoutX() - movementVariable);
            }

            if (dPressed.get()) {
                shape1.setLayoutX(shape1.getLayoutX() + movementVariable);
            }

        }
    };

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        movementSetup();

        keyPressed.addListener(((observableValue, aBoolean, t1) -> {
            if (!aBoolean) {
                timer.start();
            } else {
                timer.stop();
            }
        }));
    }

    public void movementSetup() {
        scene.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.W) {
                wPressed.set(true);

                if (shape1.getLayoutX() > 0 && shape1.getLayoutX() <= 150) {
                    label.setText(numbersFromOneToTen());
                }
                if (shape1.getLayoutX() > 150 && shape1.getLayoutX() <= 300) {
                    label.setText(doubleNumbers());
                }
                if (shape1.getLayoutX() > 300 && shape1.getLayoutX() <= 450) {
                    label.setText(factorialNumber());
                }
                if (shape1.getLayoutX() > 450 && shape1.getLayoutX() <= 600) {
                    label.setText(fibonacciNumber());
                }


            }

            if (e.getCode() == KeyCode.A) {
                aPressed.set(true);

            }

            if (e.getCode() == KeyCode.S) {
                sPressed.set(true);
            }

            if (e.getCode() == KeyCode.D) {
                dPressed.set(true);

            }
        });

        scene.setOnKeyReleased(e -> {
            if (e.getCode() == KeyCode.W) {
                wPressed.set(false);
            }

            if (e.getCode() == KeyCode.A) {
                aPressed.set(false);
            }

            if (e.getCode() == KeyCode.S) {
                sPressed.set(false);
            }

            if (e.getCode() == KeyCode.D) {
                dPressed.set(false);
            }
        });


    }

    public static String numbersFromOneToTen() {
        StringBuilder iCount = new StringBuilder();
        int i = 1;
        while (i <= 10) {
            iCount.append(i).append(" ");
            i++;
        }
        return iCount.toString();
    }

    public static String doubleNumbers() {
        StringBuilder doubleCount = new StringBuilder();
        for (int i = 0; i < 100; i += 2) {
            doubleCount.append(i).append(" ");
        }
        return doubleCount.toString();
    }

    public static String factorialNumber() {
        String result = "";
        int a = 1;
        for (int i = 1; i <= 7; i++) {
            a = a * i;
            if (i == 7) {
                result = String.valueOf(a);
            }
        }
        return result;
    }

    public static String fibonacciNumber() {
        StringBuilder result = new StringBuilder();
        int a = 1;
        int b = 1;
        int c = 0;
        while (c < 100) {
            c = a + b;
            a = b;
            b = c;
            result.append(a).append(" ");
        }
        return result.toString();
    }


}