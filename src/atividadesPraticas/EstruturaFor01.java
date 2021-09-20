package atividadesPraticas;

import java.util.Scanner;

/*Crie um programa em linguagem Java que atenda aos seguintes requisitos:
        _ Armazene o seu nome completo em duas variáveis, nome e sobrenome
        _ Imprima seu nome 10 vezes no terminal com a função PRINTF usando o laço de repetição
        while utilizando uma variável contadora.
        _ Recrie o passo anterior feito com WHILE agora com o laço FOR.*/


public class EstruturaFor01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = "";
        String sobrenome = "";
        int contador = 0;

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite seu sobrenome");
        sobrenome = sc.nextLine();

        System.out.println("Utilizando WHILE");
        while(contador < 10){
            System.out.println("Nome: "+nome);
            contador++;
        }

        System.out.println("Utilizando FOR");
        for (int i = 0; i <10 ; i++) {
            System.out.println("Nome: "+nome);
        }


    }
}
