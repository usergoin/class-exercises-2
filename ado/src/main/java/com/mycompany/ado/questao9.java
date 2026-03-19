package com.mycompany.ado;

import java.util.Scanner;

public class questao9 {

    
    public static int[] contarFrequencias(int[] numeros) {
        int[] frequencia = new int[10]; 

        for (int i = 0; i < numeros.length; i++) {
            int valor = numeros[i];
            frequencia[valor]++; 
        }

        return frequencia;
    }

    public static void main(String[] args) {
        Scanner feel = new Scanner(System.in);

        int[] numeros = new int[10];

       
        for (int i = 0; i < numeros.length; i++) {
            int valor;
            do {
                System.out.print("Digite um" + (i + 1) + "numero (entre 0 e 9): ");
                valor = feel.nextInt();
            } while (valor < 0 || valor > 9);

            numeros[i] = valor;
        }

        
        int[] frequencias = contarFrequencias(numeros);

        
        System.out.println("--- Tabela de Frequencias ---");
        for (int i = 0; i < frequencias.length; i++) {
            System.out.println("Numero " + i + ": " + frequencias[i] + " vez(es)");
        }
    }
}
