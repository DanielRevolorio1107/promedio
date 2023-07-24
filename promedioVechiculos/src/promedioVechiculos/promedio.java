package promedioVechiculos;
import java.io.*;
import java.util.Scanner;
public class promedio {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("Menu:");
            System.out.println("1. Calcular velocidad promedio");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el número de vehículos: ");
                    int numVehiculos = scanner.nextInt();
                    if (numVehiculos!=0){
                    for (int i = 1; i <= numVehiculos; i++) {
                        System.out.println("Ingrese la cantidad de vueltas recorridas");
                        System.out.println("Vehículo " + i);
                    
                        System.out.print("Ingrese el número de vueltas: ");
                        int numVueltas = scanner.nextInt();
                        if(numVueltas !=0){
                        double tiempoTotal = 0;
                        for (int j = 1; j <= numVueltas; j++) {
                            System.out.print("Ingrese el tiempo de la vuelta " + j + " (en segundos): ");
                            double tiempo = scanner.nextDouble();
                            if (tiempo!=0){
                            tiempoTotal += tiempo;
                        }

                        double velocidadPromedio = numVueltas / tiempoTotal;
                        System.out.println("La velocidad promedio del vehículo " + i + " es: " + velocidadPromedio + " vueltas/seg");
                    }
                    }
                    }
                    }
                    break;
                case 2:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }

            System.out.println();
        } while (opcion != 2);

        scanner.close();
    }





	}

