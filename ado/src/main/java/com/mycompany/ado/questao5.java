package com.mycompany.ado;

import java.util.Scanner;

public class questao5 {

    public static double notamedia(double[] notas) {
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return soma / notas.length;
    }

    public static double[] mvp(double[] numeros, double media) {
        int cont = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > media) {
                cont++;
            }
        }

        double[] mvp = new double[cont];
        int indice = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > media) {
                mvp[indice] = numeros[i];
                indice++;
            }
        }
        return mvp;
    }

    public static void main(String[] args) {
        Scanner feel = new Scanner(System.in);
        double[] numeros = new double[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = feel.nextDouble();
        }

        double media = notamedia(numeros);
        System.out.println("Média: " + media);

        double[] acima = mvp(numeros, media);

        System.out.print("Números acima da média: ");
        for (int i = 0; i < acima.length; i++) {
            System.out.print(acima[i] + " ");
        }
    }
}
