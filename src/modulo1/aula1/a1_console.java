package modulo1.aula1;

import java.util.Scanner;

public class a1_console {

    public static void main(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        System.out.println("Digite seu nome: ");
        String sobrenome = scanner.next();

        System.out.println("O nome e sobrenome digitado foi: "+ nome +" "+ sobrenome);


    }

}
