package atividadesPraticas.atv18;

public class PrincipalLoja {
    public static void main(String[] args) {

        Produto produto = new Produto();
        produto.setCodigo(1);
        produto.setNome("TV");
        produto.setDescricao("Smart TV LED 55'' ");
        produto.setValor(1500.00);

        int codigo = produto.getCodigo();
        String nome = produto.getNome();
        String descricao = produto.getDescricao();
        double valor = produto.getValor();

        System.out.println("+++++++++++++++++++DESCRIÇÃO++++++++++++++++++++");
        System.out.println("Codigo: "+ codigo);
        System.out.println("Nome: "+ nome);
        System.out.println("Descrição: "+ descricao);
        System.out.println("Valor: "+ valor);




    }


}
