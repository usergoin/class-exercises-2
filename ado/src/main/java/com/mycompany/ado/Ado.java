package com.mycompany.ado;

import java.util.Scanner;

public class Ado {

    public static double notamedia(double[] notas) {
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return soma / notas.length;
    }

    public static double mvp(double[] notas) {
        double maior = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > maior) {
                maior = notas[i];
            }
        }
        return maior;
    }

    public static void main(String[] args) {
        Scanner feel = new Scanner(System.in);

        int alunos;
        do {
            System.out.print("Quantos alunos? (entre 5 e 20): ");
            alunos = feel.nextInt();
        } while (alunos < 5 || alunos > 20);

        double[] notas = new double[alunos];

        for (int i = 0; i < notas.length; i++) {
            double nota;
            do {
                System.out.print("Digite a nota do aluno " + (i + 1) + " (0 a 10): ");
                nota = feel.nextDouble();
            } while (nota < 0 || nota > 10);
            notas[i] = nota;
        }

        System.out.print("Notas da turma: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " ");
        }

        double media = notamedia(notas);
        double maior = mvp(notas);

        System.out.println("Média da turma: " + media);
        System.out.println("Maior nota: " + maior);

        feel.close();
    }
}
