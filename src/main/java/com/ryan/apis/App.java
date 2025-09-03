package com.ryan.apis;


import org.json.JSONObject;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {

    private String city;
    private double  temperature;
    private double  humidity;
    
    @Override
    public void start(Stage primaryStage) {
        NetworkResponse network = new NetworkResponse();
        StackPane root = new StackPane();
        root.setBackground(new Background(new BackgroundFill(Color.GREY, null, null)));
        Scene scene = new Scene(root, 300, 500);

        HBox box = new HBox(20);
        TextField getCity = new TextField("ENTER CITY");
        
        Button getResponse = new Button("Check");
        box.getChildren().addAll(getCity , getResponse);
        root.getChildren().add(box);

        //event when clicked
        getResponse.setOnMouseClicked(eh->{
            if(network.getCityWeather(getCity.getText().toLowerCase().trim())!="invalid"){
            JSONObject obj = new JSONObject(network.getCityWeather(getCity.getText().toLowerCase().trim()));
            temperature = obj.getJSONObject("main").getDouble("temp");
            humidity = obj.getJSONObject("main").getInt("humidity");

            HBox cityData = new HBox(20);
            Text Temp = new Text("Temperature"+temperature);
            Text Hum = new Text("Temperature"+humidity);
            cityData.getChildren().addAll(Temp,Hum);
            cityData.setAlignment(Pos.CENTER);
            root.getChildren().add(cityData);
            
        }
        });

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}