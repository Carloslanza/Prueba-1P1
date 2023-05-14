/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author Carlos PC
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int juego = 0, vecesm=0;
        boolean variable=true;
        Scanner scanner = new Scanner(System.in);
        while(variable){
            vecesm=vecesm+1;
            System.out.println("Bienvenido a mi primera prueba practica en java");
            System.out.println("1. repetir mi nombre");
            System.out.println("2. SubMenu de mensajes");
            System.out.println("3. Salir");
            juego = scanner.nextInt();
            switch (juego) {
                case 1: //Inicio del primer programa a repetir el nombre las veces que el usuario quiera 
                    System.out.println("Texto a repetir: Hola mi nombre es: ");
                    scanner.nextLine();
                    String nombre = scanner.nextLine();

                    System.out.println("Cuantas veces te gustaria repetir el siguiente texto?");
                    int repeticiones = scanner.nextInt();

                    for (int c = 0; c < repeticiones; c++) {
                        String texto = "Hola mi nombre es " + nombre + " y miren mi prueba!";
                        System.out.println(texto);
                    }
                    break;
                case 2:
                    int opcion = 0;
                    boolean carro=true;
                    while (carro){
                        System.out.println("MENU");
                        System.out.println("1. Bienvenida");
                        System.out.println("2. Despedida");
                        System.out.println("3. Salir");

                        opcion = scanner.nextInt();

                        switch (opcion) {
                            case 1:
                                System.out.println("Bienvenido! Esperamos que disfrutes usando estre programa.");
                                break;
                            case 2:
                                System.out.println("Hasta luego, gracias por usar este programa.");
                                break;
                            case 3:
                                System.out.println("Saliendo del submenu...");
                                carro=false;
                                variable=true;
                                break;
                            default:
                                System.out.println("Opción invalida. Por favor, seleccione una opción del menu.");
                                break;
                        }
                    }
                    break;
                case 3: //aqui es el fin del menu
                    System.out.println("Opcion 3 salir");
                    System.out.println("Hasta luego esta fue mi prueba");
                    System.out.println("Se ingreso " + vecesm + " veces al menu principal");
                    variable = false;
                    break;
                default:
                    System.out.println("La opcion que ingreso no es valida");
                    variable = true;
                    break;
            }

        }
    }
}// Aqui termina el programa
    

