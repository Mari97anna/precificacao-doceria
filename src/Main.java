import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Custo dos ingredientes (R$): ");
        double custoIngredientes = scanner.nextDouble();

        System.out.print("Custo da embalagem (R$): ");
        double custoEmbalagem = scanner.nextDouble();

        System.out.print("Porcentagem de lucro desejada (%): ");
        double margemLucro = scanner.nextDouble();

        System.out.print("Quantidade de unidades produzidas: ");
        int quantidadeProducao = scanner.nextInt();

        Produto produto = new Produto(nome, custoIngredientes, custoEmbalagem, margemLucro, quantidadeProducao);

        produto.exibirInfo();

        scanner.close();
    }


}
