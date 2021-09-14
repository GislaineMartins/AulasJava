package atividadesPraticas;

import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("*************CADASTRO DE CLIENTE*******************");
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if(idade < 18){
            System.out.println("Cadastro Invalido. Cliente menor de idade");
        }else{
            System.out.println("*************DADOS DO CADASTRO*******************\n");
            System.out.println("Digite seu nome: " + nome);
            System.out.println("Digite seu sobrenome: " + sobrenome);
            System.out.println("Digite sua idade: "+ idade);

        }

    }
}
