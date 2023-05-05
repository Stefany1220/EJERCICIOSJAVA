/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package resultadoselecciones;

/**
 *
 * @author Ambiente 209-1
 */
import java.util.Scanner;
public class ResultadosElecciones {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] votos = new int[3];
        
        for (int i = 0; i < 2500000; i++) {
            System.out.print("Ingrese el número del candidato por el cual votó (1, 2 o 3): ");
            int candidato = sc.nextInt();
            
            if (candidato == 1) {
                votos[0]++;
            } else if (candidato == 2) {
                votos[1]++;
            } else if (candidato == 3) {
                votos[2]++;
            } else {
                System.out.println("Opción inválida, voto descartado.");
            }
        }
        
        int ganador = 0;
        int votosGanador = votos[0];
        
        if (votos[1] > votosGanador) {
            ganador = 1;
            votosGanador = votos[1];
        }
        
        if (votos[2] > votosGanador) {
            ganador = 2;
            votosGanador = votos[2];
        }
        
        System.out.println("El candidato ganador es el número " + (ganador + 1) + " con " + votosGanador + " votos.");
    }
}