import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu limite do cartão:");
        double limite = scanner.nextDouble();

        Cartao cartao = new Cartao(limite);

        int exit = 1;
        while (exit != 0){
            System.out.println("Digite o que você vai comprar: ");
            String nome = scanner.next();
            System.out.println("Qual o valor da compra: ");
            double valor = scanner.nextDouble();

            Compra compra = new Compra(nome, valor);
            boolean comprei = cartao.determinaCompra(compra);

            if(comprei){
                System.out.println("Compra Realizada com sucesso!");
                System.out.println("Tecle ( 0 ) para sair ou ( 1 ) para continuar comprando.");
                exit = scanner.nextInt();
            } else {
                System.out.println("Compra não efetuada, verifique o saldo.");
                exit = 0;
            }
        }
        System.out.println("[][][][][][][][][][][][][][][][]");
        System.out.println("EXTRATO DE COMPRA: \n");

        for (Compra compra : cartao.getCompras()) {
            System.out.println(compra.getNome() + " - "+ compra.getValor());
        }
        System.out.println("\n[][][][][][][][][][][][][][][][]");
        System.out.println("saldo restante - > "+ cartao.getSaldo());
    }
}
