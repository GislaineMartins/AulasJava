package modulo1.aula4;

import java.util.Scanner;

public class a4_3_SwitchCaseExemplo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Castro de clientes");
        System.out.println("\t1- Cadastrar");
        System.out.println("\t2- Listar");
        System.out.println("\t0- Sair");
        System.out.println("Escolha uma opção do Menu:");
        int op = sc.nextInt();

        switch (op){
            case 1:
                System.out.println("Cadastrar clientes");
                break;
            case 2:
                System.out.println("Listar clientes");
                break;
            case 0:
                System.out.println("Saindo");
                break;
            default:
                System.out.println("Opção invalida");
                break;

        }
    }
}
