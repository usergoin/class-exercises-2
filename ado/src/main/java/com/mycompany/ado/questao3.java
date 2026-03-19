package com.mycompany.ado;
import java.util.Scanner;

public class questao3 {
    
    public static double spositivos(double[] numeros) {
        double soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                soma += numeros [i];
            }
        }
        return soma;
    }
    
    public static int contanegtiv(double[] numeros) {
        int cont = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                cont++;
            }
        }
        return cont;
    }
    
    public static void main(String[] args) {
        Scanner feel = new Scanner(System.in);
        double[] numeros = new double[12];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + " numero real: ");
            numeros[i] = feel.nextDouble();
        }
        
        System.out.print("Vetor padrao: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        
        double soma = spositivos(numeros);
        int negativos = contanegtiv(numeros);
        
        System.out.println("Quantidade de numeros positivos: " + soma);
        System.out.println("Quantidade de numeros negativos: " + negativos);
        
        feel.close();
    }
}
