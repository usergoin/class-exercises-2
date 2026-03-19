package com.mycompany.ado;
import java.util.Scanner;

public class questao10 {

    public static double maior(double[] numeros){
        double maior = numeros[0];
        for(int i = 1; i < numeros.length; i++){
            if (numeros[i] > maior){
                maior = numeros[i];
            }
        }
        return maior;
    }

    public static double[] normalizar(double[] numeros, double maior){
        double[] normal = new double[numeros.length];
        for(int i = 0; i < numeros.length; i++){
            normal[i] = numeros[i] / maior;
        }
        return normal;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[8];

        for(int i = 0; i < 8; i++){
            System.out.print("Digite o número " + (i+1) + ": ");
            numeros[i] = sc.nextDouble();
        }

        double maiorValor = maior(numeros);
        double[] normalizado = normalizar(numeros, maiorValor);

        System.out.println("Vetor:");
        for(double n : numeros){
            System.out.print(n + " ");
        }

        System.out.println("Maior valor: " + maiorValor);

        System.out.println("Vetor n:");
        for(double n : normalizado){
            System.out.print(n + " ");
        }
    }
}
