package com.mycompany.ado;

import java.util.Scanner;

public class questao7 {

    public static double[] notamedia(double[][] notas) {
        double[] media = new double[notas.length];
        for (int i = 0; i < notas.length; i++) {
            double soma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                soma += notas[i][j];
            }
            media[i] = soma / notas[i].length;
        }
        return media;
    }

    public static int aprovados(double[] medias) {
        int aprovados = 0;
        for (int i = 0; i < medias.length; i++) {
            if (medias[i] >= 6) {
                aprovados++;
            }
        }
        return aprovados;
    }

    public static void main(String[] args) {
        Scanner feel = new Scanner(System.in);
        double[][] notas = new double[5][3];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite as 3 notas do aluno " + (i + 1) + ":");
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                notas[i][j] = feel.nextDouble();
            }
        }

        double[] medias = notamedia(notas);
        int totalAprovados = aprovados(medias);

        System.out.println("Medias dos alunos:");
        for (int i = 0; i < medias.length; i++) {
            System.out.printf("Aluno %d: %.2f\n", (i + 1), medias[i]);
        }

        System.out.println("Total de alunos aprovados: " + totalAprovados);
    }
}
