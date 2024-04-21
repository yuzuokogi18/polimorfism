package com.Kat.polimorfismo.controllers;

import com.Kat.polimorfismo.App;
import com.Kat.polimorfismo.models.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class BaseDosController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<Student, Integer> matriculaColumn;

    @FXML
    private TableColumn<Student, String> nombreColumn;

    @FXML
    private TableView<Student> studentsTable;

    private ObservableList<Student> students;

    @FXML
    void initialize() {
        students = FXCollections.observableArrayList();
        loadStudents();
        setupTable();
    }

    private void loadStudents() {
        ArrayList<Student> estudiantes = App.getBases().getStudentBase2();
        students.addAll(estudiantes);
    }

    private void setupTable() {
        matriculaColumn.setCellValueFactory(new PropertyValueFactory<>("matricula"));
        nombreColumn.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        studentsTable.setItems(students);
    }

    @FXML
    void onMouseClickedCerrar(MouseEvent event) {
        App.getStageView().close();
    }
}
