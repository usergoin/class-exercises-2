package com.mycompany.ado;

import java.util.Scanner;

public class questão6 {

   
    public static double produtoEscalar(double[] vetor1, double[] vetor2) {
        double soma = 0;
        for (int i = 0; i < vetor1.length; i++) {
            soma += vetor1[i] * vetor2[i]; 
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner feel = new Scanner(System.in);
        double[]vetor1 = new double[5];
        double[]vetor2 = new double[5];
    
        System.out.println("Digite o valor dos 5 primeiros elementos: ");
        for(int i = 0; i < vetor1.length; i++){
            System.out.println("Elemento " + (i + 1) + "> ");
            vetor1[i] = feel.nextDouble();
        }
        
        System.out.println("Digite o valor dos outros 5 elementos: ");
        for(int i = 0; i < vetor2.length; i++){
            System.out.println("Elemento " + (i + 1) + "> ");
            vetor2[i] = feel.nextDouble();
        }
        
        System.out.println("5 primeiros valores dos elementos >  ");
        for(int i = 0; i < vetor1.length; i++){
            System.out.println(vetor1[i] + " ");
        }
        
        System.out.println("outros 5 valores dos elementos > ");
        for(int i = 0; i < vetor2.length; i++){
            System.out.println(vetor2[i] + " ");
        }
        
        double resultado = produtoEscalar(vetor1,vetor2);
        System.out.println("Produto escalar >  " + resultado);
    }
}    
