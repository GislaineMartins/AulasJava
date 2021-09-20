package atividadesPraticas;

/*Crie um programa em linguagem Java que atenda aos seguintes requisitos:
        _ Calcule o retorno total de um investimento de R$ 5.000,00 durante 24 meses
        a uma taxa de juros de 2% ao mês. Utilize o laço FOR para imprimir o valor do retorno mês a mês.*/


import java.util.Scanner;

public class EstruturaFor03 {
    public static void main(String[] args) {

      double inicial = 5000, tempo = 24, taxa = 2;

      double M =0, total =0;

        for (int i = 0; i <24 ; i++) {
            M = (total + (inicial/ 100)*2);
            total = M + inicial;
            System.out.println("mes "+i + " total = "+M);

        }


    }



}
