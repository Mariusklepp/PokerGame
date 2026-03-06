package edu.ntnu.IDATT2003.marius;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
        }
    public void start(Stage stage) {
        HomeView homeView = new HomeView();
        Scene scene = new Scene(homeView.getView(), 1920, 1080);

        stage.setTitle("Card games");
        stage.setScene(scene);
        stage.show();
    }

}
