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
public class Exercicio_06 {
    public static void main(String[] args) {
        System.out.println("Quantas maças deseja comprar?");
        Scanner sc = new Scanner (System.in);
        String stringQuantidade = sc.next();
        int quantidade = Integer.parseInt(stringQuantidade);
        double resultado;
        if(quantidade < 12) {
            resultado = quantidade * 1.30;
        } else {
            resultado = quantidade * 1.0;
        }
        System.out.printf("O valor total das maças é R$ %.02f", resultado);
        
    }
    
    
}
