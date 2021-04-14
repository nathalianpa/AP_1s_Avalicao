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
public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Informe a idade (anos meses dias):");
        int anos=input.nextInt(), meses=input.nextInt(), dias=input.nextInt();
        int total=anos*365+meses*30+dias;
        System.out.println("Idade em dias: "+total);                
    }
    
}
