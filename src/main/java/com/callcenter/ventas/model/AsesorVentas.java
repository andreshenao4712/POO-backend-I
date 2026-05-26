package com.callcenter.ventas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "asesores_ventas")
public class AsesorVentas extends Empleado {

    private int cantidadVentas;
    private double metaMensual;
    private double comision;

    public AsesorVentas() {
    }

    public AsesorVentas(String nombre, int edad, int idEmpleado, double salario,
            int cantidadVentas, double metaMensual, double comision) {

        super(nombre, edad, idEmpleado, salario);

        this.cantidadVentas = cantidadVentas;
        this.metaMensual = metaMensual;
        this.comision = comision;
    }

    public int getCantidadVentas() {
        return cantidadVentas;
    }

    public void setCantidadVentas(int cantidadVentas) {
        this.cantidadVentas = cantidadVentas;
    }

    public double getMetaMensual() {
        return metaMensual;
    }

    public void setMetaMensual(double metaMensual) {
        this.metaMensual = metaMensual;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
}