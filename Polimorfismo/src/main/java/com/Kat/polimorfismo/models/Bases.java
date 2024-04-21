package com.Kat.polimorfismo.models;

import java.util.ArrayList;

public class Bases {
    private ISudent estudiantesBase1 = new BaseUnoDatos();
    private ISudent estudiantesBase2 = new BaseDosDeDatos();
    private ISudent estudiantesBase3 = new BaseTresDeDatos();

    public boolean addStudent(Student newStudent) {
        boolean bandera;
        if (estudiantesBase1.save(newStudent) && estudiantesBase2.save(newStudent) &&  estudiantesBase3.save(newStudent)){
            System.out.println("Registro exitoso");
            bandera=true;
        }
        else {
            bandera=false;
            System.out.println("Error al registrar el registro");
        }
    return bandera;
    }
    public boolean updataStudent(Student editedStudent){
        boolean bandera=false;
        if (estudiantesBase1.upDate(editedStudent) && estudiantesBase2.upDate(editedStudent)&&estudiantesBase3.upDate(editedStudent)){
            bandera=true;
        }
        return bandera;
    }
    public ArrayList<Student> getStudentBase1(){
        return estudiantesBase1.getStudent();
    }
    public ArrayList<Student> getStudentBase2(){return estudiantesBase2.getStudent();}
    public ArrayList<Student> getStudentBase3(){return estudiantesBase3.getStudent();}
}
