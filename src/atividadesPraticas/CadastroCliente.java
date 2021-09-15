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
        int opcao = sc.nextInt();
        sc.nextLine();

       switch (opcao){
           case 1:
               System.out.println("cadastre o cliente");
               boolean invalido = true;
               do{
                   System.out.println("Digite o nome do cliente: ");
                   String nome = sc.nextLine();
                   System.out.println("Digite o sobrenome do cliente: ");
                   String sobrenome = sc.nextLine();

                   if( nome.length() <= 3 && sobrenome.length() <= 3){
                       System.out.println("O nome deve e sobrenome deve conter 3 caracteres");
                       System.out.println("Digite o nome do cliente novamente: ");
                       nome = sc.nextLine();
                       System.out.println("Digite o sobrenome do cliente novamente: ");
                       sobrenome = sc.nextLine();
                   }
                   else{

                       invalido = false;
                   }
               }while(invalido);

                boolean invalido2 = true;

               do{
                   System.out.println("Digite o RG: ");
                   String rg = sc.nextLine();
                   System.out.println("Digite o CPF: ");
                   String cpf = sc.nextLine();

                   if( rg.length() > 4 && cpf.length() > 11){
                       System.out.println("O rg deve ter no minimo 4 caracteres e cpf no minimo 11");
                       System.out.println("Digite o RG novamente: ");
                       rg = sc.nextLine();
                       System.out.println("Digite o CPF novamente: ");
                       cpf = sc.nextLine();
                   }
                   else{

                       invalido2 = false;
                   }
               }while(invalido2);

               break;
           case 2:
               System.out.println("Saindo do sistema");
               break;
           case 0:
               break;
           default:
               System.out.println("Opção invalida");

       }

    }
}
