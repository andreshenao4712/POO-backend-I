package model;

import java.util.ArrayList;

public class Veterinaria implements IOperaciones {

    public void guardar(Animal animal) {
        agregarAnimal(animal);
        System.out.println("Animal guardado correctamente");
}
    public void buscar() {
        mostrarAnimales();
}
    public void eliminar() {
        System.out.println("Eliminando Animal");
}

    private ArrayList<Animal> animales;
    
    public Veterinaria() {
        this.animales = new ArrayList<>();
    }

    public Veterinaria(ArrayList<Animal> animales) {
          this.animales = animales;
    }

    public void setAnimales(ArrayList<Animal> animales) {
        this.animales = animales;
    }

    public void agregarAnimal(Animal animal){
        animales.add(animal);
    }

    public void mostrarAnimales() {
    if (animales.isEmpty()) {
        System.out.println("No hay animales registrados.");
    } else {
        for (Animal animal : animales) {
            System.out.println("Especie: " + animal.getEspecie());
            System.out.println("Raza: " + animal.getRaza());
            System.out.println("Edad: " + animal.getEdad());
            System.out.println("Id Dueño: " + animal.getIdDueño());
            System.out.println("--------------------");
        }
    }
}
}