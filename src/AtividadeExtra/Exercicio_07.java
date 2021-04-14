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
public class Exercicio_07 {
    public static void main(String[] args) {
        System.out.println("Digite o primeiro número");
        Scanner sc1 = new Scanner (System.in);
        String stringNumero1 = sc1.next();
        int numero1 = Integer.parseInt(stringNumero1);
        System.out.println("Digite o segundo número");
        Scanner sc2 = new Scanner (System.in);
        String stringNumero2 = sc2.next();
        int numero2 = Integer.parseInt(stringNumero2);
        int resto = numero1 % numero2; 
        if(resto == 0) {
            System.out.println("Os números são múltiplos");
        } else {
            System.out.println("Os números não são múltiplos");
        }
        
    }
    
    
}
