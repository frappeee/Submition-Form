package main;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class FormJavaFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("MPF Session 5");

        MenuBar menuBar = new MenuBar();
        Menu menu = new Menu("Menu");
        MenuItem loginItem = new MenuItem("Login");
        MenuItem registerItem = new MenuItem("Register");
        menu.getItems().addAll(registerItem, loginItem);
        menuBar.getMenus().add(menu);
        menuBar.getStyleClass().add("styled-menu");
        loginItem.getStyleClass().add("styled-menu");
        registerItem.getStyleClass().add("styled-menu");

        Label headingLabel = new Label("Registration Form");
        headingLabel.getStyleClass().add("heading-label");

        Label nameLabel = new Label("Username");
        TextField nameField = new TextField();
        nameField.getStyleClass().add("styled-text-field");

        Label passwordLabel = new Label("Password");
        TextField passwordField = new TextField();
        passwordField.setPromptText("Password");
        passwordField.getStyleClass().add("styled-text-field");

        Label genderLabel = new Label("Gender");
        RadioButton male = new RadioButton("Male");
        RadioButton female = new RadioButton("Female");
        ToggleGroup genderGroup = new ToggleGroup();
        male.setToggleGroup(genderGroup);
        female.setToggleGroup(genderGroup);

        CheckBox checkBox = new CheckBox("Agree to terms and Condition");

        Button resetButton = new Button("Reset");
        Button regisButton = new Button("Register");
        resetButton.getStyleClass().add("styled-button");
        regisButton.getStyleClass().add("styled-button");

        HBox buttonBox = new HBox(10);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.getChildren().addAll(resetButton, regisButton);

        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setAlignment(Pos.CENTER);

        gridPane.add(nameLabel, 0, 0);
        gridPane.add(nameField, 1, 0);
        gridPane.add(passwordLabel, 0, 1);
        gridPane.add(passwordField, 1, 1);
        gridPane.add(genderLabel, 0, 2);
        gridPane.add(male, 1, 2);
        gridPane.add(female, 2, 2);
        gridPane.add(checkBox, 0, 3, 2, 1);
        gridPane.add(buttonBox, 0, 4, 2, 1);

        VBox layout = new VBox(10, menuBar, headingLabel, gridPane);
        layout.setAlignment(Pos.CENTER);
        layout.getStyleClass().add("main-layout");

        Scene scene = new Scene(layout, 500, 400);
        scene.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
