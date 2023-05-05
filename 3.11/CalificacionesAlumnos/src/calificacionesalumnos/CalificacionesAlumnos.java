/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calificacionesalumnos;

/**
 *
 * @author Ambiente 209-1
 */
import java.util.Scanner;

public class CalificacionesAlumnos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = 40; // cantidad de alumnos
        int contador = 0; // contador de alumnos que no tienen derecho al examen
        
        for (int i = 1; i <= n; i++) { 
            System.out.println("Ingrese las calificaciones del alumno " + i + ":");
            double sum = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.print("Unidad " + j + ": ");
                double calif = sc.nextDouble();
                sum += calif;
            }
            double promedio = sum / 5;
            if (promedio < 6) {
                contador++;
            }
        }
        
        System.out.println("Cantidad de alumnos que no tienen derecho al examen: " + contador);
    }
}