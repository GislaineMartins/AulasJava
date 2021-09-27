package revisao;

import java.util.Scanner;

public class a15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = Integer.parseInt(sc.nextLine());

        int fatorial = 1;

        for(int i = numero; i > 0; i--){
            System.out.printf("%d* ", i);
            fatorial = fatorial * i;
        }

        System.out.printf("=%d",fatorial);
        sc.close();
    }
}
