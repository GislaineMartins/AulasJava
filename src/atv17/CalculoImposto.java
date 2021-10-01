package atv17;

public class CalculoImposto {

    private double impostoISS = 0.04;
    private double impostoIOF = 0.0038;
    private double impostoIR = 0.09;
    private double valor;
    private double resultado;


    public double calculoISS(double valor){
        resultado = valor * impostoISS;
        return resultado;

    }

    public double calculoIOF(double valor){
        double resultado = valor * impostoIOF;
        return resultado;

    }

    public double calculoIR(double valor){
        double resultado = valor * impostoIR;
        return resultado;

    }


}
