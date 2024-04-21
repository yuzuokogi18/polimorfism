package com.Kat.polimorfismo.controllers;

import com.Kat.polimorfismo.App;
import com.Kat.polimorfismo.models.Student;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class AddController {
    @FXML
    private TextField textFieldMatricula;

    @FXML
    private TextField textFieldNombre;

    @FXML
    private Button saveButton;

    private AlertHelper alertHelper;

    public AddController() {
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

                if (App.getBases().addStudent(student)) {
                    alertHelper.showAlert("Notificación", "Datos agregados correctamente.", Alert.AlertType.INFORMATION);
                } else {
                    alertHelper.showAlert("Error", "Ha habido un error al añadir, intente de nuevo, por favor", Alert.AlertType.INFORMATION);
                }
            } catch (NumberFormatException e) {
                alertHelper.showAlert("Error", "Formato incorrecto, solo puede ingresar números en la matrícula: " + e.getMessage(), Alert.AlertType.INFORMATION);
            }
        }
    }
}

class AlertHelper {
    public void showAlert(String title, String content, Alert.AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
