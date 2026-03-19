package com.mycompany.ado;
import java.util.Scanner;

public class questao8 {

    public static double imposto(double salarios) {
        if (salarios <= 2000) {
            return 0;
        } else if (salarios <= 5000) {
            return salarios * 0.10;
        } else {
            return salarios * 0.20;     
        }
    } 

    public static void main(String[] args) {
        Scanner feel = new Scanner(System.in);
        double [] salarios = new double[8];
        double [] impostos = new double[8];
        
        for(int i = 0; i < salarios.length; i++){
            System.out.println("Digite o salario do funcionario " + (i + 1) + ": ");
            salarios[i] = feel.nextDouble();
            impostos[i] = imposto(salarios[i]);
        }
        
        System.out.println("Impostos Calculados:");
        for(int i = 0; i < impostos.length; i++) {
            System.out.println((i + 1) + ": R$ " + impostos[i]);
        }
    }
}
