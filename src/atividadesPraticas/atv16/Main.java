package atividadesPraticas.atv16;

public class Main {
    public static void main(String[] args) {

        CalculadoraTexas c = new CalculadoraTexas();
        double v = c.taxaTransacaoBancaria(50);
        System.out.println(v);
        double contagem1 = c.taxaDeSaque(100);
        System.out.println("valor: "+contagem1);
        double contagem2 = c.taxaDeSaque(100);
        System.out.println("valor: "+contagem2);
        double contagem3 = c.taxaDeSaque(100);
        System.out.println("valor: "+contagem3);
        double contagem4 = c.taxaDeSaque(100);
        System.out.println("valor: "+contagem4);
        double contagem5 = c.taxaDeSaque(100);
        System.out.println("valor: "+contagem5);




    }
}
