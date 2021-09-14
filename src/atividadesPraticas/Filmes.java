package atividadesPraticas;

import java.util.Scanner;

public class Filmes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("*************CADASTRO DE FILMES***************");
        System.out.println("1 - Cadastras filmes");
        System.out.println("2 - Cadastrar séries");
        System.out.println("3 - Cadastrar Documentarios");
        System.out.println("0 - Sair");
        int op = sc.nextInt();
        sc.nextLine();

        switch (op){
            case 1:
                System.out.println("-----Cadastro de filmes----");
                System.out.println("Digite nome: ");
                String nomeFilme = sc.nextLine();
                System.out.println("Digite descrição: ");
                String descricaoFilme = sc.nextLine();
                System.out.println("Digite genero: ");
                String generoFilme = sc.nextLine();
                System.out.println("Digite ano de lançamento: ");
                int anoFilme = sc.nextInt();


                break;
            case 2:
                System.out.println("-----Cadastro de series-----");
                System.out.println("Digite nome: ");
                String nomeSerie = sc.next();
                System.out.println("Digite ano de lançamento: ");
                int anoSerie = sc.nextInt();
                System.out.println("Digite nome da produtora: ");
                String produtoraSerie = sc.nextLine();

                break;
            case 3:
                System.out.println("-----Cadastro de documentarios-----");
                System.out.println("Digite nome: ");
                String nomeDocumentario = sc.nextLine();
                System.out.println("Digite ano de lançamento: ");
                int anoDocumentario = sc.nextInt();
                System.out.println("Digite o tema: ");
                String temaDocumentario = sc.nextLine();

                break;
            case 0:
                System.out.println("Saindo do programa");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }

    }
}
