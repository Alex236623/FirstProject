package com.ua.robot.lesson11.nfs;

import javafx.animation.AnimationTimer;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.*;

public class Controller implements Initializable {

    private final BooleanProperty wPressed = new SimpleBooleanProperty();
    private final BooleanProperty aPressed = new SimpleBooleanProperty();
    private final BooleanProperty sPressed = new SimpleBooleanProperty();
    private final BooleanProperty dPressed = new SimpleBooleanProperty();
    public Rectangle shape2;
    public Rectangle shape3;
    public Rectangle shape4;

    boolean isKeyNotPressed = true;

    private final BooleanBinding keyPressed = wPressed.or(aPressed).or(sPressed).or(dPressed);
    public Label speed;

    Car bmw = new Car("BMW", "m3 gtr", 310, 2, 5, "image/1.jpg");

    public ImageView car;

    public int currentSpeed = 0;
    @FXML
    private Rectangle shape1;


    @FXML
    private AnchorPane scene;


    @FXML
    void start() {


        shape1.setLayoutY(59);
        shape2.setLayoutY(59);
        shape3.setLayoutY(59);
        shape4.setLayoutY(59);
        shape1.setLayoutX(205);
        shape2.setLayoutX(258);
        shape3.setLayoutX(309);
        shape4.setLayoutX(363);

    }

    AnimationTimer timer = new AnimationTimer() {
        @Override
        public void handle(long timestamp) {

            if (shape1.getLayoutY() > 410.0 || shape2.getLayoutY() > 410.0 || shape3.getLayoutY() > 410.0 || shape4.getLayoutY() > 410.0) {
                Random random = new Random();
                shape1.setLayoutY(0);
                shape2.setLayoutY(0);
                shape3.setLayoutY(0);
                shape4.setLayoutY(0);
                shape1.setLayoutX(random.nextInt(0, 560));
                shape2.setLayoutX(random.nextInt(0, 560));
                shape3.setLayoutX(random.nextInt(0, 560));
                shape4.setLayoutX(random.nextInt(0, 560));
            }

            if (isKeyNotPressed && currentSpeed > 0) {

                currentSpeed = currentSpeed - 1;
                speed.setText(String.valueOf(currentSpeed));
                shape1.setLayoutY(shape1.getLayoutY() + Math.round(currentSpeed / 10.2));
                shape2.setLayoutY(shape2.getLayoutY() + Math.round(currentSpeed / 10.2));
                shape3.setLayoutY(shape3.getLayoutY() + Math.round(currentSpeed / 10.2));
                shape4.setLayoutY(shape4.getLayoutY() + Math.round(currentSpeed / 10.2));

            }

            if (aPressed.get()) {
                shape1.setLayoutX(shape1.getLayoutX() + Math.round(currentSpeed / 10.2));
                shape2.setLayoutX(shape2.getLayoutX() + Math.round(currentSpeed / 10.2));
                shape3.setLayoutX(shape3.getLayoutX() + Math.round(currentSpeed / 10.2));
                shape4.setLayoutX(shape4.getLayoutX() + Math.round(currentSpeed / 10.2));
            }
            if (dPressed.get()) {
                shape1.setLayoutX(shape1.getLayoutX() - Math.round(currentSpeed / 10.2));
                shape2.setLayoutX(shape2.getLayoutX() - Math.round(currentSpeed / 10.2));
                shape3.setLayoutX(shape3.getLayoutX() - Math.round(currentSpeed / 10.2));
                shape4.setLayoutX(shape4.getLayoutX() - Math.round(currentSpeed / 10.2));

            }
            if (wPressed.get()) {
                if (currentSpeed <= bmw.getMaxSpeed()) {
                    currentSpeed = currentSpeed + bmw.getAcceleration();
                }

                speed.setText(String.valueOf(currentSpeed));
                shape1.setLayoutY(shape1.getLayoutY() + Math.round(currentSpeed / 10.2));
                shape2.setLayoutY(shape2.getLayoutY() + Math.round(currentSpeed / 10.2));
                shape3.setLayoutY(shape3.getLayoutY() + Math.round(currentSpeed / 10.2));
                shape4.setLayoutY(shape4.getLayoutY() + Math.round(currentSpeed / 10.2));


            }

            if (sPressed.get()) {
                if (currentSpeed > 0) {
                    currentSpeed = currentSpeed - bmw.getBrakingForce();
                }
                speed.setText(String.valueOf(currentSpeed));
                shape1.setLayoutY(shape1.getLayoutY() + Math.round(currentSpeed / 10.2));
                shape2.setLayoutY(shape2.getLayoutY() + Math.round(currentSpeed / 10.2));
                shape3.setLayoutY(shape3.getLayoutY() + Math.round(currentSpeed / 10.2));
                shape4.setLayoutY(shape4.getLayoutY() + Math.round(currentSpeed / 10.2));


            }


        }

    };

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        movementSetup();

        keyPressed.addListener(((observableValue, aBoolean, t1) -> {
            if (!aBoolean || currentSpeed > 0) {
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
                isKeyNotPressed = false;

            }

            if (e.getCode() == KeyCode.A) {
                aPressed.set(true);


            }

            if (e.getCode() == KeyCode.S) {
                sPressed.set(true);
                isKeyNotPressed = false;
            }

            if (e.getCode() == KeyCode.D) {
                dPressed.set(true);


            }
        });

        scene.setOnKeyReleased(e -> {
            if (e.getCode() == KeyCode.W) {
                wPressed.set(false);
                isKeyNotPressed = true;

            }

            if (e.getCode() == KeyCode.A) {
                aPressed.set(false);

            }

            if (e.getCode() == KeyCode.S) {
                sPressed.set(false);
                isKeyNotPressed = true;


            }

            if (e.getCode() == KeyCode.D) {
                dPressed.set(false);

            }
        });


    }


}