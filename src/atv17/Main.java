package atv17;

import atividadesPraticas.atv16.CalculadoraTexas;

public class Main {
    public static void main(String[] args) {

        double result;

        CalculoImposto cal = new CalculoImposto();
        result = cal.calculoISS(5000);
        System.out.println("Valor do imposto ISS: "+ result);
        result = cal.calculoIOF(5000);
        System.out.println("Valor do imposto ISS: "+ result);

    }
}
