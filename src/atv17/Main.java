package atv17;

import atividadesPraticas.atv16.CalculadoraTexas;

public class Main {
    public static void main(String[] args) {

        CalculoImposto cal = new CalculoImposto();
        double result = cal.calculoISS(5000);
        System.out.println("Valor do imposto ISS: "+ result);

    }
}
