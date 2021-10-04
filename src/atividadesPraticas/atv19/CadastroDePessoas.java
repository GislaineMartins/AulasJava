package atividadesPraticas.atv19;


import jdk.swing.interop.SwingInterOpUtils;

public class CadastroDePessoas {
    public static void main(String[] args) {

        PessoaFisica[] pessoas = new PessoaFisica[5];

        PessoaFisica p1 = new PessoaFisica();
        p1.setCodigo(1);
        p1.setNome("Carla");
        p1.setSobrenome("Ferreira");
        p1.setIdade(21);
        p1.setRg("111111");
        p1.setCpf("11111111111");

        PessoaFisica p2 = new PessoaFisica();
        p2.setCodigo(2);
        p2.setNome("Jorge");
        p2.setSobrenome("Dos Santos");
        p2.setIdade(22);
        p2.setRg("222222");
        p2.setCpf("22222222222");

        PessoaFisica p3 = new PessoaFisica();
        p3.setCodigo(3);
        p3.setNome("Mateus");
        p3.setSobrenome("Fernandes");
        p3.setIdade(23);
        p3.setRg("333333");
        p3.setCpf("33333333333");

        PessoaFisica p4 = new PessoaFisica();
        p4.setCodigo(4);
        p4.setNome("Rafaela");
        p3.setSobrenome("Fernandes");
        p3.setIdade(24);
        p3.setRg("444444");
        p3.setCpf("44444444444");

        PessoaFisica p5 = new PessoaFisica();
        p5.setCodigo(5);
        p5.setNome("Lais");
        p5.setSobrenome("Rodrigues");
        p5.setIdade(25);
        p5.setRg("555555");
        p5.setCpf("55555555555");

        pessoas[0] = p1;
        pessoas[1] = p2;
        pessoas[2] = p3;
        pessoas[3] = p4;
        pessoas[4] = p5;

        System.out.println("+++++++++++++++PESSOAS CADASTRADAS++++++++++++++++++++");
       for(PessoaFisica p: pessoas){
           System.out.println("Codigo: "+ p.getCodigo());
           System.out.println("Nome: "+ p.getNome());
           System.out.println("Sobrenome: "+ p.getSobrenome());
           System.out.println("Idade: "+ p.getIdade());
           System.out.println("RG: "+ p.getRg());
           System.out.println("CPF: "+ p.getCpf());
           System.out.println("---------------------------------");

       }











    }
}
