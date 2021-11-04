package modulo1.aula16.P5.EX2;

public class TelaBanco {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1000, "15315Ab");

        cc.saque(10);
        cc.deposito(600);

        System.out.println(cc);
    }
}
