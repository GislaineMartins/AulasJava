package modulo1.aula6;

public class a6_2_semanal {

    public static void main(String[] args) {
        int contador = 0;

      /*  while (contador < 5){
            System.out.println(contador);
            contador++;

        }
        System.out.println();
        System.out.printf("O valor final: %d", contador);*/

        int num = 1;


        while (num <= 10) {
            int mult = 0;
            while (mult <= 10) {
                System.out.println(num * mult);
                mult++;
            }
            num++;

        }
    }

}
