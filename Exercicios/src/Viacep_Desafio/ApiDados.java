package VIACEP_DESAFIO_FINAL.exercicio;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiDados {
    int cep;

    private int getCep() {
        return cep;
    }

    public void setCep(String cep) throws ErroCepException{
        if(cep.length() != 8){
            throw new ErroCepException("CEP inválido, ele deve conter 8 dígitos.");

        }
        this.cep = Integer.parseInt(cep);
    }

    public ApiDados(int cep) {
        this.cep = cep;
    }
    public ApiDados() {

    }

        public void consultaCep() throws IOException, InterruptedException {
            HttpClient client = HttpClient.newHttpClient();
            String endereco = "https://viacep.com.br/ws/" + cep + "/json/";
            System.out.println("URL: " + endereco);

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
        }

}
