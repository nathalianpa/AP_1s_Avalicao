/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Avaliação_01;

import java.util.Scanner;

/**
 *
 * @author Nathalia Pereira Alves | Patricia Faustino Ferreira
 * 
 * //4. Criar um programa que leia a idade de um nadador e apresente a sua 
 * categoria de acordo com a tabela abaixo:
 * 
 * +--------------------------------+------------+
 * | Idade                          | Categoria  |
 * +--------------------------------+------------+
 * | 5 a 7 anos                     | Infantil   |
 * | 8 a 10 anos                    | Infantil B |
 * | 11-13 anos                     | Juvenil A  |
 * | 14-17 anos                     | Juvenil B  |
 * | Maiores de 18 anos (inclusive) | Adulto     |
 * +--------------------------------+------------+

 */
public class Exercicio_04 {
    public static void main(String[] args) {
        System.out.println("Qual a sua idade?");
        Scanner sc = new Scanner(System.in);
        String idadeString = sc.next();
        int idade = Integer.parseInt(idadeString);
        
        if (idade >=5 && idade <=7) {
            System.out.println("A sua categoria é: Infantil");
            
        } else if (idade >=8 && idade <=10) {
            System.out.println("A sua categoria é: Infantil B");
            
       } else if (idade >=11 && idade <=13) {
           System.out.println("A sua categoria é: Juvenil A");
           
       } else if (idade >=14 && idade <=17) {
           System.out.println("A sua categoria é: Juvenil B");
           
       } else if (idade >=18) {
           System.out.println("A sua categoria é: Adulto");
           
       } else {
           System.out.println("Idade inválida.");
       }    
    }   
}
