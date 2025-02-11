package Carro.exercicio;

public class Carro {
    private String Modelo;
    double[] precos = new double[3]; // 3 anos

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public void setPrecos(double preco1, double preco2, double preco3) {
        this.precos[0] = preco1;
        this.precos[1] = preco2;
        this.precos[2] = preco3;
    }
    public void menorPreco(){
        double menor = precos[0];
        if(precos[1] > menor){
            menor = precos[1];
        } if (precos[2] > menor){
            menor = precos[2];
        }
        System.out.println("O MENOR valor é: R$ "+ menor);
    }
    public void maiorPreco() {
        double maior = precos[0];
        if (precos[1] < maior) {
            maior = precos[1];
        }
        if (precos[2] < maior) {
            maior = precos[2];
        }
        System.out.println("O MAIOR valor é: R$ "+ maior);
    }
}
