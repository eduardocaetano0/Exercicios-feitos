package VIACEP_DESAFIO_FINAL.exercicio;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) throws IOException, ErroCepException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        ApiDados apidados = new ApiDados();
        Gson gson = new Gson();

        System.out.println("Digite o CEP: ");
          String cep = sc.nextLine();

          try{
              apidados.setCep(cep);
              apidados.consultaCep();
          }catch (ErroCepException e){
              System.out.println("Erro: " + e.getMessage());
          }catch (IOException | IllegalArgumentException e){
              System.out.println("Erro ao buscar dados do CEP" + e.getMessage());
          }

        sc.close();
    }
}
