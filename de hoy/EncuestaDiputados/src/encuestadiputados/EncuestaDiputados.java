/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encuestadiputados;

/**
 *
 * @author Ambiente 209-1
 */
import java.util.Scanner;

public class EncuestaDiputados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad total de diputados en la cámara: ");
        int n = sc.nextInt();
        
        System.out.print("Ingrese la cantidad de diputados que están a favor del Tratado de Libre Comercio: ");
        int aFavor = sc.nextInt();
        
        System.out.print("Ingrese la cantidad de diputados que están en contra del Tratado de Libre Comercio: ");
        int enContra = sc.nextInt();
        
        System.out.print("Ingrese la cantidad de diputados que se abstienen de opinar: ");
        int abstencion = sc.nextInt();
        
        double porcFavor = (aFavor * 100) / n;
        double porcEnContra = (enContra * 100) / n;
        double porcAbstencion = (abstencion * 100) / n;
        
        System.out.println("Porcentaje de diputados a favor: " + porcFavor + "%");
        System.out.println("Porcentaje de diputados en contra: " + porcEnContra + "%");
        System.out.println("Porcentaje de diputados que se abstienen de opinar: " + porcAbstencion + "%");
    }
}
