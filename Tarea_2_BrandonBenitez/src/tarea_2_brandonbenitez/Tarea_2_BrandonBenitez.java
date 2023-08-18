/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea_2_brandonbenitez;

import java.util.Scanner;

/**
 *
 * @author brhb2
 */
public class Tarea_2_BrandonBenitez {

    static Scanner rd = new Scanner(System.in); // Scanner para numeros 
    static Scanner rd1 = new Scanner(System.in); // Scanner para cadenas

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean menu = true;

        while (menu) {

            System.out.print("""
                               == MENU ==
                               1. Replace
                               2. Factorial
                               3. Mensajes
                               4. Promedios
                               5. Aprobado o Reprobado
                               6. Contains
                               7. Salir
                               Ingrese una opcion: """);
            int opcion = rd.nextInt();

            switch (opcion) {

                case 1:

                    System.out.println("== REPLACE ==");
                    System.out.print("Ingrese una palabra: ");
                    String pal = rd1.next();

                    System.out.print("Ingrese el caracter que desea cambiar: ");
                    char carac = rd1.next().charAt(0);

                    //Comprobar si el caracter ingresado existe
                    boolean igual = true;
                    for (int i = 0; i < pal.length(); i++) {

                        char a = pal.charAt(i);

                        if (a != carac) {// Evalua si el caracter existe
                            igual = false;
                        } else {
                            igual = true;
                        }

                    }
                    // Validacion de que el caracter ingresado existe
                    while (!igual) {
                        System.out.println("¡El caracter ingresado no existe!");
                        System.out.print("Ingrese el caracter que desea cambiar: ");
                        carac = rd1.next().charAt(0);

                        igual = true;
                        for (int i = 0; i < pal.length(); i++) {

                            char a = pal.charAt(i); //Captura un caracter en especifico del String

                            if (a != carac) { // Evalua si el caracter no existe para manter el ciclo
                                igual = false;
                            } else {
                                igual = true;
                            }

                        }

                    }

                    System.out.print("Ingrese el nuevo caracter: ");
                    char newCarac = rd1.next().charAt(0);

                    System.out.println("Palabra modificada");
                    System.out.println(replace(pal, carac, newCarac));

                    break;

                case 2:

                    System.out.println("== FACTORIAL ==");
                    System.out.print("Ingrese un numero: ");
                    int num = rd.nextInt();

                    //Validacion de que el numero debe ser mayor a 0, porque los negativos no tienen factorial
                    while (num < 0) {
                        System.out.println("El numero no puede ser menor a 0");
                        System.out.print("Ingrese un numero: ");
                        num = rd.nextInt();
                    }

                    System.out.println("El factorial de " + num + " es " + factorial(num));

                    break;

                case 3:

                    System.out.print("Ingrese un palabra: ");
                    String pal1 = rd1.next();

                    //Llamado del método print, ingresando los argumentos del mismo
                    print(pal1);

                    break;

                case 4:

                    System.out.println("El promedio de todas las notas es: " + promedio());

                    break;

                case 5:

                    System.out.print("Ingrese una nota: ");
                    int nota = rd.nextInt();

                    //Validacion del valor de nota
                    while (nota < 0) {
                        System.out.println("La nota no puede ser menor a 0");
                        System.out.print("Ingrese una nota: ");
                        nota = rd.nextInt();
                    }

                    if (aprobReprob(nota)) {
                        System.out.println("¡El alunno aprobo!");
                    } else {
                        System.out.println("¡El alunno reprobo!");
                    }

                    break;

                case 6:

                    System.out.print("Ingrese la primer cadena: ");
                    String cad1 = rd1.nextLine();

                    System.out.print("Ingrese la segunda cadena: ");
                    String cad2 = rd1.nextLine();

                    if (contains(cad1, cad2)) {
                        System.out.println("La cadena principal contiene la subcadena");
                    } else {
                        System.out.println("La cadena principal no contiene la subcadena");
                    }

                    break;

                case 7:
                    menu = false;
                    break;

                default:
                    System.out.println("Opcion Invalida!!!!");

            }

        }

    }

    public static String replace(String pal, char carac, char newCarac) {

        //Variable acumuladora tipo String
        String newPal = "";

        for (int i = 0; i < pal.length(); i++) { //For que recorre la palabra recibida en los parametos

            char x = pal.charAt(i);

            if (x == carac) {

                x = newCarac;
            }
            newPal += x;
        }

        return newPal;
    }

    public static int factorial(int num) {

        int factorial = 1;

        for (int i = 1; i <= num; i++) {

            factorial = factorial * i;

        }

        return factorial;
    }

    public static void print(String pal1) {

        System.out.println("Este método no debe retorna nada");

    }

    public static double promedio() {

        double prom = 0;

        System.out.print("Ingrese la 1er nota: ");
        double nota1 = rd.nextDouble();
        System.out.print("Ingrese la 2da nota: ");
        double nota2 = rd.nextDouble();
        System.out.print("Ingrese la 3er nota: ");
        double nota3 = rd.nextDouble();
        System.out.print("Ingrese la 4ta nota: ");
        double nota4 = rd.nextDouble();

        //Validacion del valor de las notas 1, 2, 3 y 4
        while (nota1 < 0 || nota2 < 0 || nota3 < 0 || nota4 < 0) {

            if (nota1 < 0) {
                System.out.println("La 1er nota no puede ser menor a 0");
                System.out.print("Ingrese la primer nota: ");
                nota1 = rd.nextDouble();
            }
            if (nota2 < 0) {
                System.out.println("La 2da nota no puede ser menor a 0");
                System.out.print("Ingrese la segunda nota: ");
                nota2 = rd.nextDouble();
            }
            if (nota3 < 0) {
                System.out.println("La 3er nota no puede ser menor a 0");
                System.out.print("Ingrese la tercer nota: ");
                nota3 = rd.nextDouble();
            }
            if (nota4 < 0) {
                System.out.println("La 4ta nota no puede ser menor a 0");
                System.out.print("Ingrese la cuarta nota: ");
                nota4 = rd.nextDouble();
            }
        }

        prom = (nota1 + nota2 + nota3 + nota4) / 4;

        return prom;
    }

    public static boolean aprobReprob(int nota) {

        boolean aprob;

        if (nota >= 60) {
            aprob = true;
            return aprob;
        } else {
            aprob = false;
            return aprob;
        }
    }

    public static boolean contains(String cad1, String cad2) {

        boolean contiene = false;
        String acum = "";

        for (int i = 0; i < cad2.length(); i++) {

            char x = cad2.charAt(i);

            for (int j = i; j < cad1.length(); j++) {

                char y = cad1.charAt(j);

                if (x == y) {

                    acum += y;

                }
            }

        }

        if (acum.equals(cad2)) {
            contiene = true;
        }

        return contiene;
    }

}
