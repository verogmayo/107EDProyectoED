package com.crudia;

import controller.PersonaController;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PersonaController controller = new PersonaController();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== CRUD Persona ===");
            System.out.println("1. Crear persona");
            System.out.println("2. Listar personas");
            System.out.println("3. Actualizar persona");
            System.out.println("4. Eliminar persona");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Edad: ");
                    int edad = sc.nextInt();
                    controller.crearPersona(id, nombre, edad);
                    break;
                case 2:
                    controller.listarPersonas();
                    break;
                case 3:
                    System.out.print("ID de la persona a actualizar: ");
                    int idUpd = sc.nextInt(); sc.nextLine();
                    System.out.print("Nuevo nombre: ");
                    String nuevoNombre = sc.nextLine();
                    System.out.print("Nueva edad: ");
                    int nuevaEdad = sc.nextInt();
                    controller.actualizarPersona(idUpd, nuevoNombre, nuevaEdad);
                    break;
                case 4:
                    System.out.print("ID de la persona a eliminar: ");
                    int idDel = sc.nextInt();
                    controller.eliminarPersona(idDel);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}