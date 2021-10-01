package atv17;

import atividadesPraticas.atv16.CalculadoraTexas;

public class Main {
    public static void main(String[] args) {


        CalculoImposto cal = new CalculoImposto();
        double resultISS = cal.calculoISS(5000);
        double resultIOF = cal.calculoIOF(5000);
        double resultIR = cal.calculoIR(5000);


        System.out.println("---------------Relatorio---------------");
        System.out.println("Imposto calculo ISS: "+ resultISS);
        System.out.println("Imposto calculo IOF: "+ resultIOF);
        System.out.println("Imposto calculo IR: "+ resultIR);

    }
}
