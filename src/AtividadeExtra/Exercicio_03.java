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
public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double pi = 3.14959;
        double raio;
        double volume;
        System.out.println("Digite o raio");
        raio = entrada.nextDouble();
        volume = (4.0/3) * pi * Math.pow(raio,3);
        System.out.printf("Volume: %.3f\n", volume);       
    }
    
}
