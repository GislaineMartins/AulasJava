package modulo1;

import java.util.Scanner;

public class atividade {
    static Scanner scanner= new Scanner(System.in);
    static String nome = "", sobrenome = "", senioridade = "";
    static short idade = 0;
    static boolean valido = true;
    static String nomeL = "";
    static String aplicacao = "";
    static String descricao ;


    public static void main(String[] args) {

        menu();
        escolha();

    }

    static void menu(){

        System.out.println("**************CADASTRO DEV****************");
        System.out.println("1- Cadastro DEV  \n 2- Cadastro linguagem \n0- Sair ");


    }

    static void escolha(){
        int op = scanner.nextInt();
        scanner.nextLine();

        switch (op){
            case 1:
                System.out.println("Cadastro Dev");
                nomeDev();
                sobrenomeDev();
                senioridade();
                escolhaSenioridade();
                idadeDev();
                System.out.println("CADASTRO REALIZADO DE DEV COM SUCESSO");
                System.out.printf("NOME: %s,\n SOBRENOME: %s,\n SENIORIDADE: %s,\n IDADE: %d\n ",nome, sobrenome, senioridade, idade);
                break;
            case 2:
                System.out.println("Cadastro de linguagem");
                nomeLinguagem();
                descricaoLinguagem();
                menuAplicacao();
                escolhaAplicacao();
                System.out.println("CADASTRO REALIZADO COM SUCESSO ");
                System.out.printf("NOME: %s,\n DESCRIÇÃO: %s,\n APLICAÇÃO: %s,\n",nomeL,descricao, aplicacao );
                break;

            case 0:
                System.out.println("Saindo do programa");
                break;

            default:
                System.out.println("Opção Invalida");
                break;

        }



    }

    static String nomeDev(){

        System.out.println("Cadastro de Desenvolvedor");
        do{
            System.out.print("Digite nome do Dev: ");
            nome = scanner.nextLine();
            if(nome.length() < 3){
                System.out.println("O nome precisa conter no minimo 3 caracteres");
            }
        }while (nome.length() < 3);
        return nome;
    }

    static String sobrenomeDev(){
        do{
            System.out.print("Digite sobrenome do Dev: ");
            sobrenome = scanner.nextLine();
            if(sobrenome.length() < 3){
                System.out.println("O sobrenome precisa conter no minimo 3 caracteres");
            }
        }while (sobrenome.length() < 3);
        return sobrenome;
    }

    static void senioridade(){
        System.out.println("********opçoes senioridade*************");
        System.out.println("1- Junior");
        System.out.println("2- Pleno");
        System.out.println("3- Senior");
    }

    static void escolhaSenioridade(){
        do{
            System.out.println("Digite a senioridade do DEV: ");
            int opS = scanner.nextInt();
            scanner.nextLine();

            switch (opS){
                case 1:
                    senioridade = "Junior";
                    valido = false;
                    break;

                case 2:
                    senioridade = "Pleno";
                    valido = false;
                    break;

                case 3:
                    senioridade = "Senior";
                    valido = false;
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;

            }

        }while(valido);
    }

    static int idadeDev(){
        do{
            System.out.print("Digite idade do Dev: ");
            idade = scanner.nextShort();
            if(idade <=0 ){
                System.out.println("A idade precisa ser maior do que 0");
            }
        }while (idade <=0);
        return idade;
    }

    static String nomeLinguagem(){
        System.out.println("*************CADASTRO DE LINGUAGEM***************");
        do{
            System.out.println("Digite nome da Linguagem");
            nomeL = scanner.nextLine();
            if(nomeL.length() < 3){
                System.out.println("O nome da linguagem precisa ter no minimo 3 caracteres");
            }

        }while(nomeL.length() < 3);
        return nomeL;
    }

    static String descricaoLinguagem(){
        System.out.println("Informe a descricao:");
        descricao = scanner.nextLine();

        return descricao;
    }

    static void menuAplicacao(){
        System.out.println("********opçoes aplicação*************");
        System.out.println("1- FrontEnd");
        System.out.println("2- BackEnd");
        System.out.println("3- Mobile");
    }

    static String escolhaAplicacao(){
        valido = true;
        do{
            System.out.println("Informe a aplicação");
            int opA = scanner.nextInt();
            scanner.nextLine();

            switch (opA){
                case 1:
                    aplicacao = "FrontEnd";
                    valido = false;
                    break;
                case 2:
                    aplicacao = "BackEnd";
                    valido = false;
                    break;
                case 3:
                    aplicacao = "Mobile";
                    valido = false;
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;

            }
        }while(valido);
        return aplicacao;
    }





    }

