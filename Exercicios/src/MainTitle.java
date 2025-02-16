import java.util.*;

public class MainTitle {
    public static void main(String[] args) {

        List<String>listaA = new ArrayList<>();
        listaA.add("Nome 1");
        listaA.add("Nome 2");
        listaA.add("Nome 3");
        listaA.add("Nome 4");
        listaA.add("Nome 5");
        listaA.add("Nome 6");
        System.out.println("Nomes: "+ listaA);

        List<String>listaB = new LinkedList<>();
        listaA.add("Nome A");
        listaA.add("Nome B");
        listaA.add("Nome C");
        listaA.add("Nome D");
        listaA.add("Nome E");
        listaA.add("Nome F");
        System.out.println("Nomes: "+ listaB);

        List<String> listaC;

        listaC = new ArrayList<>();
        listaC.add("TESTE 1");
        listaC.add("TESTE 2");
        listaC.add("TESTE 3");
        listaC.add("TESTE 4");
        listaC.add("TESTE 5");
        listaC.add("TESTE 6");
        System.out.println("TESTE: "+ listaC);

       List<Integer> listD;

        listD = new LinkedList<>();
        listaC.add("213");
        listaC.add("432");
        listaC.add("231");
        listaC.add("5432");
        listaC.add("312");
        listaC.add("34576");
        System.out.println("NÚMEROS: "+ listD);





    }
}
