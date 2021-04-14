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
public class Exercicio_04 {
    public static void main(String[] args) {
        System.out.println("Qual o custo de fabrica do carro?");
        Scanner sc = new Scanner (System.in);
        String stringCustoFabrica = sc.next();
        double custoFabrica = Double.parseDouble(stringCustoFabrica);
        double custoImposto = custoFabrica * 0.48;
        double custoParcial = custoFabrica + custoImposto;
        double custoDistribuidor = custoParcial * 0.28;
        double custoFinal = custoFabrica + custoImposto + custoDistribuidor;
        System.out.printf("O valor final do carro é R$ %.02f", custoFinal);      
    }
}
