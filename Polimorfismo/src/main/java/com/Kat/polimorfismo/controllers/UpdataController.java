package com.Kat.polimorfismo.controllers;

import com.Kat.polimorfismo.App;
import com.Kat.polimorfismo.models.Student;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class UpdataController {

    @FXML
    private TextField textFieldMatricula;

    @FXML
    private TextField textFieldNombre;

    @FXML
    private Button updataButton;

    private AlertHelper alertHelper;

    public UpdataController() {
        this.alertHelper = new AlertHelper();
    }

    @FXML
    void onMouseClickedGuardar(MouseEvent event) {
        String matriculaText = textFieldMatricula.getText().trim();
        String nombreText = textFieldNombre.getText().trim();

        if (matriculaText.isEmpty() || nombreText.isEmpty()) {
            alertHelper.showAlert("Error", "Los campos están vacíos", Alert.AlertType.INFORMATION);
        } else {
            try {
                int matricula = Integer.parseInt(matriculaText);
                Student student = new Student(matricula, nombreText);

                if (App.getBases().updataStudent(student)) {
                    alertHelper.showAlert("Notificación", "Los datos se han guardado exitosamente", Alert.AlertType.INFORMATION);
                } else {
                    alertHelper.showAlert("Error", "Los datos no se han podido guardar", Alert.AlertType.INFORMATION);
                }
            } catch (NumberFormatException e) {
                alertHelper.showAlert("Error", "Formato incorrecto, solo puede ingresar números en la matrícula: " + e.getMessage(), Alert.AlertType.INFORMATION);
            }
        }
    }
}
