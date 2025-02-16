public class Compra {
    private String nome;
    private double valor;

    public Compra(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }
    public String getNome() {
        return nome;
    }
    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compra: Nome do item =  "+ nome + '\'' + "Valor: "+ valor + "}";
    }

}
