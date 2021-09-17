package atividadesPraticas;

import java.util.Scanner;

public class CadastroDeClintesFor {
    public static void main(String[] args) {
        //cadastrar 4 pesosas com nome e sobrenome

        Scanner scanner = new Scanner(System.in);
        int qtd =0;

        for (int cliente = 0; cliente < 4; cliente++) {
            System.out.println("Digite nome do Cliente: ");
            String nome = scanner.nextLine();
            System.out.println("Digite sobrenome do cliente:");
            String sobrenome = scanner.nextLine();
            qtd++;
        }

        //Verificando a quantidade de clientes
        System.out.println(qtd);
    }
}
