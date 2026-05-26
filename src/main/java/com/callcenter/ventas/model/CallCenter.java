package com.callcenter.ventas.model;

import java.util.ArrayList;

public class CallCenter implements IOperaciones {

    private ArrayList<Empleado> empleados;

    public CallCenter() {
        this.empleados = new ArrayList<>();
    }

    public CallCenter(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void mostrarEmpleados() {

        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados");
        } else {

            for (Empleado empleado : empleados) {

                System.out.println("Nombre: " + empleado.getNombre());
                System.out.println("Edad: " + empleado.getEdad());
                System.out.println("ID: " + empleado.getIdEmpleado());
                System.out.println("Salario: " + empleado.getSalario());
                System.out.println("-------------------------");
            }
        }
    }

    @Override
    public void guardar(Empleado empleado) {
        agregarEmpleado(empleado);
        System.out.println("Empleado guardado correctamente");
    }

    @Override
    public void buscar() {
        mostrarEmpleados();
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando empleado");
    }
}