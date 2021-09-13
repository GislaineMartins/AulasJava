package atividadesPraticas;

import java.util.Scanner;

public class Produto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("**************Cadastro de produtos ************");
        System.out.println("Digite nome do produto: ");
        String nome = sc.next();
        System.out.println("Digite a descrição do produto: ");
        String descricao = sc.next();
        System.out.println("Digite o valor do produto: ");
        double valor = sc.nextDouble();
        System.out.println("Digite a categoria do produto: ");
        String  categoria = sc.next();

        System.out.printf("ola %s seja bem vindo(a)",nome);

        System.out.println("Cadastro realizado com sucesso");

        System.out.printf("Nome do produto %s  descrição do produto %s valor do produto %.2f categoria do produto %s", nome, descricao, valor, categoria);






    }
}
