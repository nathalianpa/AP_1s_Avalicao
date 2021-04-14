/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtividadeExtra;

import java.util.Scanner;

/**
 *
 * @author Nathalia
 */
public class Exercicios_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double salarioMinimo = 1045.0;
        System.out.println("Digite seu salário");
        Scanner sc = new Scanner(System.in);
        String salarioString = sc.next();
        double salario = Double.parseDouble(salarioString);
        double resultado = salario / salarioMinimo;
        System.out.println("Seu salario tem " + resultado + " salarios minimos");
    }
    
}
