package Atividades;

import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        System.out.print("Digite a quantidade do produto: ");
        int quantidadeProduto = scanner.nextInt();

        double valorTotal = valorProduto * quantidadeProduto;

        System.out.print("Digite a forma de pagamento (D para debito, C para credito): ");
        char formaPagamento = scanner.next().charAt(0);

        if (formaPagamento == 'D' || formaPagamento == 'd') {
            if (valorTotal <= 100.0) {
                valorTotal -= valorTotal * 0.05;
            } else {
                valorTotal -= valorTotal * 0.03;
            }
            System.out.println("Valor com desconto: R$ " + valorTotal);
        } else if (formaPagamento == 'C' || formaPagamento == 'c') {
            System.out.print("Digite o numero de parcelas: ");
            int numeroParcelas = scanner.nextInt();
            double valorParcela = valorTotal / numeroParcelas;
            System.out.println("Valor da parcela: R$ " + valorParcela);
        } else {
            System.out.println("Forma de pagamento inválida.");
        }

        System.out.println("Informacoes da compra:");
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Valor unitario: R$ " + valorProduto);
        System.out.println("Quantidade: " + quantidadeProduto);
        System.out.println("Valor total: R$ " + valorTotal);

        scanner.close();
    }
}