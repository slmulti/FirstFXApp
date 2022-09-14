package com.example.firstfxapp;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void init() throws Exception {
        System.out.println("Before the App Start");
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(5000);
    }

    @Override
    public void start(Stage stage) {
        Platform.setImplicitExit(false);
        System.out.println(Thread.currentThread().getName());
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20, 20, 20, 20));
        root.setSpacing(20);
        Label text = new Label("");
        Button button = new Button("Click Me!");
        Button button1 =  new Button("Exit Explicitly");
        button.setOnAction(e -> text.setText("Welcome to JavaFX Application!"));
        button1.setOnAction(e-> Platform.exit());
        root.getChildren().addAll(text, button, button1);
        Scene scene = new Scene(root, 350, 300);
        stage.setScene(scene);
        stage.setTitle("Javafx Button");
        stage.show();
    }
//    @Override
//    public void stop(){
//        System.out.println(Thread.currentThread().getName());
//        System.out.println("Closing app");
//    }

    public static void main(String[] args) {
        launch();
    }
}