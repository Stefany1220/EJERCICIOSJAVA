/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package preciohuevo;

/**
 *
 * @author Ambiente 209-1
 */
import java.util.Scanner;

public class PrecioHuevo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de gallinas en la granja: ");
        int n = sc.nextInt();
        
        double peso, altura, numHuevos, calidad, promCalidad = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Gallina " + i + ":");
            System.out.print("Peso (kg): ");
            peso = sc.nextDouble();
            System.out.print("Altura (cm): ");
            altura = sc.nextDouble();
            System.out.print("Número de huevos que pone: ");
            numHuevos = sc.nextDouble();
            
            calidad = (peso * altura) / numHuevos;
            promCalidad += calidad;
        }
        promCalidad /= n;
        
        double precio;
        if (promCalidad >= 15) {
            precio = 1.2 * promCalidad;
        } else if (promCalidad > 8 && promCalidad < 15) {
            precio = 1.0 * promCalidad;
        } else {
            precio = 0.8 * promCalidad;
        }
        
        System.out.println("El precio del kilo de huevo es: $" + precio);
    }
}
