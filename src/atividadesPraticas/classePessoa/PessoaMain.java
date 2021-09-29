package atividadesPraticas.classePessoa;

public class PessoaMain {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.nome = "Carlos";
        p1.sobrenome = "Ferreira";
        p1.idade = 30;

        Pessoa p2 = new Pessoa();
        p2.nome = "Rodrigo";
        p2.sobrenome = "Souza";
        p2.idade = 28;

        System.out.println("***********Dados pessoa 1************");
        System.out.println("Nome: "+p1.nome);
        System.out.println("Nome: "+p1.sobrenome);
        System.out.println("Nome: "+p1.idade);

        System.out.println("***********Dados pessoa 2************");
        System.out.println("Nome: "+p2.nome);
        System.out.println("Nome: "+p2.sobrenome);
        System.out.println("Nome: "+p2.idade);
    }
}
