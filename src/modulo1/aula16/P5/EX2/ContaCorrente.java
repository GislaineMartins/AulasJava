package modulo1.aula16.P5.EX2;

public class ContaCorrente {
    private double saldo;
    private double saldoInicial;
    private double saques;
    private double taxaSaque = 2.50;
    private String codigoCliente;

    public ContaCorrente(double saldo, String codigoCliente){
        this.saldoInicial = saldo;
        this.saldo = saldo;
        this.codigoCliente = codigoCliente;
    }

    public void saque(double valorSaque){
        this.saques += valorSaque;
        this.saldo -= (valorSaque + this.taxaSaque);
    }
    public void deposito(double valorDeposito){
        this.saldo += valorDeposito;
    }

    @Override
    public String toString() {
        return "\n\tsaldo Inicial: " + this.saldoInicial +
                "\n\tsaldo Final: " + this.saldo +
                "\n\ttotal saques: " + this.saques+
                "\n\tcod. Cliente: "  + this.codigoCliente +
                "\n\ttaxa saque: "  + this.taxaSaque;
    }
}
