package atividadesPraticas.atv18;

public class ContaCorrente {

    private int agencia;
    private int numero;
    private int codigoDoCliente;
    private float saldo;

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setCodigoDoCliente(int codigoDoCliente) {
        this.codigoDoCliente = codigoDoCliente;
    }

    public int getCodigoDoCliente() {
        return this.codigoDoCliente;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return this.saldo;
    }
}
