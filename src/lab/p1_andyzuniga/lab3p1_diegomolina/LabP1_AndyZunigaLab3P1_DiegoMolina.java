/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.p1_andyzuniga.lab3p1_diegomolina;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class LabP1_AndyZunigaLab3P1_DiegoMolina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int opcion;
        
        do {
            System.out.println("-----Menu-----");
            System.out.println("1) Reloj de Arena");
            System.out.println("2) Calculadora de combinaciones");
            System.out.println("3) Sandwich");
            System.out.println("4) Salir");
            System.out.println("Ingrese una opcion: ");
            opcion = entrada.nextInt();
            
            
            switch (opcion){
                case 1:
                    break;
                case 2:
                    System.out.println("Calculadora de combinaciones");
                    CalcularCombi(entrada);
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Fin");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            System.out.println();
        } while (opcion !=4);
        
        entrada.close();
    }

    private static void CalcularCombi(Scanner entrada) {
        System.out.print("Ingrese el valor de n: ");
        int n = entrada.nextInt();
        
        System.out.print("Ingresa el valor de r: ");
        int r = entrada.nextInt();
        
        if (n>=r){
            int combi = CalcularCombi(n, r);
            System.out.println("Combinaciones posibles con " + n + " y " + r + " son: " + combi);
        } else {
            System.out.println("Error, verifique sus numeros");
        }
    }

    private static int CalcularCombi(int n, int r) {
        return factorial(n) / (factorial(n-r) * factorial(r));
    }

    private static int factorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++){
            resultado *=i;
        }
        return resultado;
    }       
}