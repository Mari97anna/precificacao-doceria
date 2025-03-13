public class Produto {
    private String nome;
    private double custoIngredientes;
    private double custoEmbalagens;
    private double margemDeLucro;
    private int quantidadeProducao;

    public Produto(String nome, double custoIngredientes, double custoEmbalagens, double margemDeLucro, int quantidadeProducao) {
        this.nome = nome;
        this.custoIngredientes = custoIngredientes;
        this.custoEmbalagens = custoEmbalagens;
        this.margemDeLucro = margemDeLucro;
        this.quantidadeProducao = quantidadeProducao;
    }

    public double calcularCustoUnitario() {
        double custoTotal = custoIngredientes + custoEmbalagens;
        return custoTotal / quantidadeProducao;
    }

    public double calcularPrecoVenda() {
        double custoTotal = custoIngredientes + custoEmbalagens;
        return custoTotal * (1 + margemDeLucro / 100);

    }

    public void exibirInfo() {
        System.out.printf("\nProduto: %s\n", nome);
        System.out.printf("Preço sugerido: R$ %.2f\n", calcularPrecoVenda());
        System.out.printf("Custo unitário: R$ %.2f\n", calcularCustoUnitario());
    }
}


