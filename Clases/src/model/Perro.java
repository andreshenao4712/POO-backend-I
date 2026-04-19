package model;

public class Perro extends Animal {
    private String color;
    private String tamaño;
    private String estadoSalud;
    public Perro(String especie, String raza, int edad, int idDueño, String color, String tamaño, String estadoSalud) {
        super(especie, raza, edad, idDueño);
        this.color = color;
        this.tamaño = tamaño;
        this.estadoSalud = estadoSalud;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getTamaño() {
        return tamaño;
    }
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    public String getEstadoSalud() {
        return estadoSalud;
    }
    public void setEstadoSalud(String estadoSalud) {
        this.estadoSalud = estadoSalud;
    }
    
}
