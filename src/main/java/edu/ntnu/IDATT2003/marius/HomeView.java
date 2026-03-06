package edu.ntnu.IDATT2003.marius;

import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HomeView {

    VBox root;

    public HomeView () {
        root = new VBox();

        Image image = new Image(getClass().getResource("/images/pokerPicture.jpg").toExternalForm());
        ImageView logo = new ImageView(image);
        logo.setFitWidth(600);
        logo.setPreserveRatio(true);

        Label title = new Label("Poker games");
        title.setStyle("-fx-font-size: 80px");

        Label subText = new Label("Choose a game:");
        subText.setStyle("-fx-font-size: 30px");

        HBox buttonBox = new HBox();

        Button fiveCardBtn = new Button("5 Card Poker");
        fiveCardBtn.setPrefWidth(200);
        fiveCardBtn.setPrefHeight(60);


        Button holdemBtn = new Button("Texas Hold'em");
        holdemBtn.setPrefWidth(200);
        holdemBtn.setPrefHeight(60);

        buttonBox.getChildren().addAll(fiveCardBtn, holdemBtn);
        buttonBox.setAlignment(Pos.CENTER);

        root.getChildren().addAll(logo, title, subText, buttonBox);
        root.setAlignment(Pos.CENTER);
        root.setSpacing(40);
        buttonBox.setSpacing(20);


    }

    public VBox getView () {
        return root;
    }
}
