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
public class Exercicio_09 {
    public static void main(String[] args) {
        System.out.println("Informe seu peso em kg");
        Scanner sc1 = new Scanner (System.in);
        String stringPeso = sc1.next();
        double peso = Double.parseDouble(stringPeso);
        System.out.println("Informe sua altura em metros");
        Scanner sc2 = new Scanner (System.in);
        String stringAltura = sc2.next();
        double altura = Double.parseDouble(stringAltura);
        double imc = peso / Math.pow(altura, 2);
        if(imc < 20) {
            System.out.println("Você está abaixo do peso");
        } else if(imc < 25) {
            System.out.println("Você está no peso ideal");
        } else {
            System.out.println("Você está acima do peso");
        }
    }    
}
