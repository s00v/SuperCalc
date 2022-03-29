package com.example.supercalc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {



    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 450, 520);
        stage.setTitle("SuperCalc!");
        stage.setScene(scene);
        stage.show();


    }


    public static void main(String[] args) {

        RomeConvert rmc = new RomeConvert();


//        System.out.println(rmc.rNumsConv("MMCDLXIX"));

        launch();


    }



}
