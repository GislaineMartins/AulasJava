package atividadesPraticas.atv16;

public class CalculadoraTexas {

    private double valor;
    private int cont;

    public double taxaTransacaoBancaria(double valor){
        double taxa = (valor /100) * 0.001;
        double resultado = valor - taxa;
        return  resultado;

    }

    public double taxaDeSaque(double valor){
        cont++;
        if(cont == 5){
            valor = valor - 1.30;
            return valor;
        }else{
            return valor;
        }

    }

}
