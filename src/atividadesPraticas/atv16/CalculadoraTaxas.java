package atividadesPraticas.atv16;

public class CalculadoraTaxas {

    private double valor;

    public double taxaTransacaoBancaria(double valor){
        double taxa = (valor /100) * 0.001;
        double resultado = valor - taxa;
        return  resultado;

    }

}
