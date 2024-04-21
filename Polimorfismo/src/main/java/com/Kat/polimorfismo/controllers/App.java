package com.Kat.polimorfismo.controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class App {

    @FXML
    private Button addButton;

    @FXML
    private Button base1;

    @FXML
    private Button base2;

    @FXML
    private Button base3;

    @FXML
    private Button closeButton;

    @FXML
    private Button updataButton;

    @FXML
    void onMouseClickedBase1(MouseEvent event) {
        com.Kat.polimorfismo.App.newStage("baseUno-view", "Base de datos 1");
    }

    @FXML
    void onMouseClickedBase2(MouseEvent event) {
        com.Kat.polimorfismo.App.newStage("baseDos-view", "Base de datos 2");
    }

    @FXML
    void onMouseClickedBase3(MouseEvent event) {
        com.Kat.polimorfismo.App.newStage("baseTres-view", "Base de datos 3");
    }

    @FXML
    void onMouseClickedAñadir(MouseEvent event) {
        com.Kat.polimorfismo.App.newStage("add-view", "Añadir");
    }

    @FXML
    void onMouseClickedUpdata(MouseEvent event) {
        com.Kat.polimorfismo.App.newStage("updata-view", "Actualizar");
    }

    @FXML
    void onMouseClickedCerrar(MouseEvent event) {
        Platform.exit();
    }
}
