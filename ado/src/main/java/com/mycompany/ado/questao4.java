package com.mycompany.ado;
import java.util.Scanner;

public class questao4 {
    
    public static boolean buscarnumero(int[] numeros, int procurado) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == procurado) {
                System.out.println("Numero encontrado na posisao; " + i);
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner feel = new Scanner(System.in);
        int[] numeros = new int[10];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + " numero inteiro: ");
            numeros[i] = feel.nextInt();
        }
        
        System.out.print("Vetor digitado: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        
        System.out.println("Digite o numero para pesquisar: ");
        int procurado = feel.nextInt();
        
        boolean encontrado = buscarnumero(numeros, procurado);
        
        if(encontrado){
          System.out.println("O numero " + procurado + " esta presente no vetor!");
        } else{
            System.out.println("O numero " + procurado + " nao presente no vetor!");
        }
        
        feel.close();
    }
}
