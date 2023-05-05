/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumatoria;

/**
 *
 * @author Ambiente 209-1
 */
import java.util.Scanner;

public class Sumatoria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        int n = sc.nextInt();
        int sumatoria = 0;
        for (int i = 1; i <= n; i++) {
            sumatoria += i;
        }
        System.out.println("La sumatoria de 1 hasta " + n + " es: " + sumatoria);
    }
}