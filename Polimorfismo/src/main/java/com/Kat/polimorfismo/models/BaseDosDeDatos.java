package com.Kat.polimorfismo.models;

import java.util.ArrayList;

public class BaseDosDeDatos implements ISudent{
    private ArrayList<Student> estudiantes = new ArrayList<>();

    @Override
    public boolean save(Student newStudent) {
        return estudiantes.add(newStudent);
    }

    @Override
    public boolean upDate(Student editedStudent) {
        boolean found = false;
        for (int i = 0; i < estudiantes.size(); i++){
            if (editedStudent.getMatricula() == estudiantes.get(i).getMatricula()){
                estudiantes.set(i, editedStudent);
                found=true;
            }
        }
        return found;
    }
    @Override
    public ArrayList<Student> getStudent() {
        return estudiantes;
    }
}
