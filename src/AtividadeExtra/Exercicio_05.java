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
public class Exercicio_05 {
    public static void main(String[] args) {
        System.out.println("Informe o salário bruto");
        Scanner sc = new Scanner (System.in);
        String stringSalarioBruto = sc.next();        
        double salarioBruto = Double.parseDouble(stringSalarioBruto);
        double descontoINSS = salarioBruto * 0.08;
        System.out.printf("Desconto do INSS R$ %.02f;\n", descontoINSS);
        double descontoIR = salarioBruto * 0.15;
        System.out.printf("Desconto do IR R$ %.02f;\n", descontoIR);
        double desconto = descontoINSS + descontoIR;
        double salarioLiquido = salarioBruto - desconto;
        double bonus = salarioLiquido * 0.0575;
        System.out.printf("Bônus R$ %.02f;\n", bonus);
        System.out.printf("O salario bruto é R$ %.02f;\n", salarioBruto);
        System.out.printf("O salario liquido é R$ %.02f.\n", salarioLiquido);
    }
    
}
