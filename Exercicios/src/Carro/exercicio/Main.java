package Carro.exercicio;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro();
        ModeloCarro modeloCarro = new ModeloCarro();

        System.out.println("Digite a marca do carro: ");
        modeloCarro.setMarca(scanner.nextLine());

        System.out.println("Digite o modelo do carro: ");
        carro.setModelo(scanner.nextLine());

        System.out.println("Digite os valores dos carros nos últimos 3 anos: ");

        for (int i = 0; i < 3; i++) {
            System.out.println("Preço do ano "+ (i + 1)+": ");
            carro.precos[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        carro.maiorPreco();
        carro.menorPreco();

        scanner.close();
    }
}
