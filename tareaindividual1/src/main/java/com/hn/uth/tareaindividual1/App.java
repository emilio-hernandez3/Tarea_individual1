package com.hn.uth.tareaindividual1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione una operación para calcular el área:");
            System.out.println("1. Área de un círculo");
            System.out.println("2. Área de un cuadrado");
            System.out.println("3. Área de un rectángulo");
            System.out.println("4. Área de un triángulo");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = scanner.nextDouble();
                    System.out.println("El área del círculo es: " + calcularAreaCirculo(radio));
                    break;
                case 2:
                    System.out.print("Ingrese el lado del cuadrado: ");
                    double lado = scanner.nextDouble();
                    System.out.println("El área del cuadrado es: " + calcularAreaCuadrado(lado));
                    break;
                case 3:
                    System.out.print("Ingrese la base del rectángulo: ");
                    double baseRectangulo = scanner.nextDouble();
                    System.out.print("Ingrese la altura del rectángulo: ");
                    double alturaRectangulo = scanner.nextDouble();
                    System.out.println("El área del rectángulo es: " + calcularAreaRectangulo(baseRectangulo, alturaRectangulo));
                    break;
                case 4:
                    System.out.print("Ingrese la base del triángulo: ");
                    double baseTriangulo = scanner.nextDouble();
                    System.out.print("Ingrese la altura del triángulo: ");
                    double alturaTriangulo = scanner.nextDouble();
                    System.out.println("El área del triángulo es: " + calcularAreaTriangulo(baseTriangulo, alturaTriangulo));
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);
        scanner.close();
    }

    public static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public static double calcularAreaCuadrado(double lado) {
        return lado * lado;
    }

    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
}
