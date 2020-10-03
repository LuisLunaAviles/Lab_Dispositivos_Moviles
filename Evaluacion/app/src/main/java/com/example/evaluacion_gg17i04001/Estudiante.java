package com.example.evaluacion_gg17i04001;

public class Estudiante {

    private String Nombre;
    private String Codigo;
    private String Materia;
    private double parcial1;
    private double parcial2;
    private double parcial3;
    private double promedio;
    private  double p1,p2,p3;

    public Estudiante(){

    }
    public Estudiante(String nombre,String Codigo,String Materia,double parcial1,double parcial2,double parcial3){
        this.Nombre = nombre;
        this.Codigo = Codigo;
        this.Materia = Materia;
        this.parcial1 = parcial1;
        this.parcial2 =parcial2;
        this.parcial3 =parcial3;
        this.promedio = (parcial1*0.3)+(parcial2*0.3)+(parcial3*0.4);


    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getMateria() {
        return Materia;
    }

    public void SetMateria(String materia) {
        this.Materia = materia;
    }

    public double getparcial1() {

        return parcial1;
    }

    public void setParcial1(double p1) {
        this.parcial1 = p1;
    }

    public double getparcial2() {

        return parcial2; }

    public void setParcial2(double p2) {
        this.parcial2 = p2;
    }

    public double getparcial3() {

        return parcial3; }

    public void setParcial3(double parcial3) {
        this.parcial3 = parcial3;
    }

    public double getPromedio() {

        return promedio; }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }








}
