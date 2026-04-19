package model;

public abstract class Animal {
    private String especie;
    private String raza;
    private int edad;
    private int idDueño;
    
    public Animal(String especie, String raza, int edad, int idDueño) {
        setEspecie(especie);
        setRaza(raza);
        setEdad(edad);
        setIdDueño(idDueño);
    }

    public Animal() {
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        if(especie != null && !especie.equals("")){
            this.especie = especie;
        }else{
            System.out.println("los datos son invalidos");
        }
        }
        

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        if(raza != null && !raza.equals("")){
            this.raza = raza;
        }else{
            System.out.println("el dato es incorrecto");
        }
        
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad >0){
            this.edad = edad;
        }else{
            System.out.println("la edad es incorrecta");
        }
        
    }

    public int getIdDueño() {
        return idDueño;
    }

    public void setIdDueño(int idDueño) {
        if(idDueño>0){
            this.idDueño = idDueño;
        }else{
            System.out.println("el numero no es correcto");
        }
        
    }
}