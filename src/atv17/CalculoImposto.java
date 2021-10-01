package atv17;

public class CalculoImposto {

    private double impostoISS = 0.04;
    private double impostoIOF = 0.0038;
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

        if(valor < 1985.97){
            return 0;
        }else if(valor > 1985.97 && valor < 2948.37){
            double resultado = valor * 0.075; // 7.5%
            return resultado;
        }else if(valor > 2948.37 && valor > 3912.58){
            double resultado = valor * 0.15; // 15%
            return resultado;
        }else if(valor > 3912.58 && valor < 4865.55){
            double resultado = valor * 0.225; // 22.5%
            return resultado;
        }else if(valor > 4865.55 &&  valor > 39293.00){
            double resultado = valor * 0.275; // 27.5%
            return resultado;
        }
        double resultado = valor * 0.3; // 30%
        return resultado;

    }


}
