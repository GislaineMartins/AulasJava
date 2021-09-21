package atividadesPraticas;

import java.util.Scanner;

public class AtividadeMetodos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite primeiro numero: ");
        double n1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Digite segundo numero: ");
        double n2 = Double.parseDouble(scanner.nextLine());

        System.out.println("O resultado da soma é: "+soma(n1,n2));
        System.out.println("O resultado da subtração é: "+subtracao(n1,n2));
        System.out.println("O resultado da multiplicacao é: "+multiplicacao(n1,n2));
        System.out.println("O resultado da divisão é: "+divisao(n1,n2));

    }

    static double soma(double numero1, double numero2){
        double resultado = numero1 + numero2;
        return resultado;
    }

    static double subtracao(double numero1, double numero2){
        double resultado = numero1 - numero2;
        return resultado;
    }

    static double multiplicacao(double numero1, double numero2){
        double resultado = numero1 + numero2;
        return resultado;
    }

    static double divisao(double numero1, double numero2){
        double resultado = numero1 / numero2;
        return resultado;
    }
}
