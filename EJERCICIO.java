/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio;

import java.util.Scanner;

/**
 *
 * @author kspg
 */
public class EJERCICIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        Scanner pesoT = new Scanner(System.in);
        System.out.print("cual es el peso en la tierra?");
        int peso = pesoT.nextInt();
        System.out.print("elija el plantea\n1. Marte\n2. Venus\n3. Mercurio\n4. Jupiter\n5. Saturno\n6. Urano\n");
        int planeta = pesoT.nextInt();
        double pesoP;
        switch (planeta) {
            case 1:
                pesoP = peso * 0.38;
                break;
            case 2:
                pesoP = peso * 0.91;
                break;
            case 3:
                pesoP = peso * 0.38;
                break;
            case 4:
                pesoP = peso * 2.34;
                break;
            case 5:
                pesoP = peso * 1.06;
                break;
            case 6:
                pesoP = peso * 0.92;
                break;
            default:
                System.out.println("ese planeta no esta en  la lista");
                return;
        }

        System.out.println("Su peso en " + planeta + " es de " + pesoP + " kilos.");
    }
}
