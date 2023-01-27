package com.example.healthtech;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("/Views/Login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 500);
        stage.setTitle("Healthtech :Login");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.getIcons().add(new Image(MainApplication.class.getResourceAsStream("/images/Logo.png"))
        );


        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
