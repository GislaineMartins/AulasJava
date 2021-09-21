package atividadesPraticas;

/*Crie um programa em linguagem Java que atenda aos seguintes requisitos:
        _ Calcule o retorno total de um investimento de R$ 5.000,00 durante 24 meses
        a uma taxa de juros de 2% ao mês. Utilize o laço FOR para imprimir o valor do retorno mês a mês.*/


import java.text.DecimalFormat;
import java.util.Scanner;

public class EstruturaFor03 {
    public static void main(String[] args) {

      double inicial = 5000, tempo = 24, taxa = 0.02, m=0;

      for (int i = 0; i <=tempo; i++) {
           m = inicial * taxa;
           inicial += m;
            System.out.println("mes: "+ i+ " R$" + inicial);

        }




    }



}
