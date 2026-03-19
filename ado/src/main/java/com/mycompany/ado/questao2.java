package com.mycompany.ado;
import java.util.Scanner;

public class questao2 {
    
    public static int contadoresp(int[] numeros) {
        int cont = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                cont++;
            }
        }
        return cont;
    }
    
    public static int contadoresi(int[] numeros) {
        int cont = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                cont++;
            }
        }
        return cont;
    }
    
    public static void main(String[] args) {
        Scanner feel = new Scanner(System.in);
        int[] numeros = new int[15];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + " numero inteiro: ");
            numeros[i] = feel.nextInt();
        }
        
        System.out.print("Vetor padrao: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        
        int pares = contadoresp(numeros);
        int impares = contadoresi(numeros);
        
        System.out.println("Quantidade de numeros pares: " + pares);
        System.out.println("Quantidade de numeros ímpares: " + impares);
        
        feel.close();
    }
}
