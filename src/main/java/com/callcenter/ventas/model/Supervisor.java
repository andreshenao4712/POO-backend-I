package com.callcenter.ventas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "supervisores")
public class Supervisor extends Empleado {

    private String area;
    private int cantidadAsesores;
    private double bono;

    public Supervisor() {
    }

    public Supervisor(String nombre, int edad, int idEmpleado, double salario,
            String area, int cantidadAsesores, double bono) {

        super(nombre, edad, idEmpleado, salario);

        this.area = area;
        this.cantidadAsesores = cantidadAsesores;
        this.bono = bono;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getCantidadAsesores() {
        return cantidadAsesores;
    }

    public void setCantidadAsesores(int cantidadAsesores) {
        this.cantidadAsesores = cantidadAsesores;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }
}