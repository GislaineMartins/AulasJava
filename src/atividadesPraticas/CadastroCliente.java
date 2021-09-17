package atividadesPraticas;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class CadastroCliente {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("*************CADASTRO DE CLIENTE******************");
        System.out.println("1- Cadastro de clientes");
        System.out.println("2- Listar clientes");
        System.out.println("0- Sair");
        System.out.print("Digite a opção desejada: ");
        int opcao = sc.nextInt();
        sc.nextLine();

       switch (opcao){

           case 1:
               String nome = "";
               String sobrenome = "";
               String rg = "";
               String cpf = "";

               System.out.println("cadastre o cliente");
               boolean invalido = true;
               do{
                   System.out.println("Digite o nome do cliente: ");
                   nome = sc.nextLine();

                   if( nome.length() < 3){
                       System.out.println("O nome deve conter 3 caracteres");

                   }else{
                       invalido = false;
                   }
               }while(invalido);

               invalido = true;

               do{
                   System.out.println("Digite o sobrenome do cliente: ");
                   sobrenome = sc.nextLine();

                   if( sobrenome.length() < 3){
                       System.out.println("O sobrenome deve conter 3 caracteres");

                   }else{
                       invalido = false;
                   }
               }while(invalido);

               invalido = true;

               do{
                   System.out.println("Digite o RG do cliente: ");
                   rg = sc.nextLine();

                   if( rg.length() < 4){
                       System.out.println("O RG deve conter no minimo 4 caracteres");

                   }else{
                       invalido = false;
                   }
               }while(invalido);

               invalido = true;

               do{
                   System.out.println("Digite o CPF do cliente: ");
                   cpf = sc.nextLine();

                   if( cpf.length() < 11){
                       System.out.println("O CPF deve conter no minimo 11 caracteres");

                   }else{
                       invalido = false;
                   }
               }while(invalido);
               System.out.println("CADASTRO REALIZADO COM SUCESSO");
               System.out.printf("NOME: %s,\n SOBRENOME: %s,\n RG: %s,\n CPF: %s\n ",nome, sobrenome, rg,cpf);


               break;
           case 2:
               System.out.println("Listar clientes");
               break;
           case 0:
               System.out.println("Saindo do sistema");
               break;
           default:
               System.out.println("Opção invalida");

       }

    }
}
