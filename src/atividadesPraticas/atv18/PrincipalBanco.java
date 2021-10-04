package atividadesPraticas.atv18;

public class PrincipalBanco {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();

        cc.setAgencia(1234);
        cc.setNumero(222222);
        cc.setCodigoDoCliente(1212121212);
        cc.setSaldo(5000);

        int agencia = cc.getAgencia();
        int numero = cc.getNumero();
        int codigoDoCliente = cc.getCodigoDoCliente();
        float saldo = cc.getSaldo();

        System.out.println("Agencia: "+agencia);
        System.out.println("Numero: "+numero);
        System.out.println("Código do cliente: "+codigoDoCliente);
        System.out.println("Saldo: "+saldo);

    }
}
