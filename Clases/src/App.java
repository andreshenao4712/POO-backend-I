import model.Veterinaria;

import java.util.Scanner;

import model.Animal;
import model.Gato;
import model.Perro;

public class App {

        public static void main(String[] args) throws Exception {

     Scanner leer = new Scanner(System.in);
            
    Veterinaria veterinaria = new Veterinaria();

    Animal zeus = new Perro("perro", "bulldog", 5, 456123, "cafe", "mediano", "saludable");
        veterinaria.agregarAnimal(zeus);

    Animal diego = new Perro("Perro", "labrador", 7, 789456, "Negro", "Grande", "Estable");
        veterinaria.agregarAnimal(diego);

    Animal juan = new Perro("Perro", "Bullterrier", 10, 123456, "Blanco", "Grande", "Enfermo");
        veterinaria.agregarAnimal(juan);

    Animal david = new Gato("Gato", "Angora", 3, 741852, "Gris", "Mediano", "Saludable");
        veterinaria.agregarAnimal(david);

    Animal ramirez =new Gato("Gato", "Mainecoon", 4, 852951, "Blanco", "Grande", "Saludable");
        veterinaria.agregarAnimal(ramirez);

        int opcion;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Registrar animal");
            System.out.println("2. Mostrar animales");
            System.out.println("3. Buscar");
            System.out.println("4. Eliminar");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Registrar animal");
                    System.out.println("1. Perro");
                    System.out.println("2. Gato");
                    int tipo = leer.nextInt();
                    leer.nextLine();
                    System.out.print("Especie: ");
                    String especie = leer.nextLine();

                    System.out.print("Raza: ");
                    String raza = leer.nextLine();

                    System.out.print("Edad: ");
                    int edad = leer.nextInt();

                    System.out.print("Id Dueño: ");
                    int id = leer.nextInt();
                    leer.nextLine();

                    System.out.print("Color: ");
                    String color = leer.nextLine();

                    System.out.print("Tamaño: ");
                    String tamaño = leer.nextLine();

                    System.out.print("Estado de salud: ");
                    String estado = leer.nextLine();

                        Animal nuevo;
                       if(tipo == 1){
                            nuevo = new Perro(especie, raza, edad, id, color, tamaño, estado);
                        } else if(tipo == 2){
                            nuevo = new Gato(especie, raza, edad, id, color, tamaño, estado);
                        } else {
                            System.out.println("Opcion inválida");
                            break;
                        }
                        veterinaria.agregarAnimal(nuevo);
                        System.out.println("Animal registrado correctamente");

                    break;

                case 2:
                    veterinaria.mostrarAnimales();
                    break;

                case 3:
                    veterinaria.buscar();
                    break;

                case 4:
                    veterinaria.eliminar();
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 5);

        leer.close();
    }
}