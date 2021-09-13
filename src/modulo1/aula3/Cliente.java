package modulo1.aula3;

import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("************ Cadastro de cliente *************");
        System.out.println("Bem vindo. Digite as informações do cliente");
        System.out.println("Digite o nome do cliente: ");
        String nome = sc.next();
        System.out.println("Digite a idade do cliente: ");
        short idade = sc.nextShort();
        System.out.printf("O cliente %s de idade %d foi cadastrado com sucesso ", nome, idade);
    }
}
