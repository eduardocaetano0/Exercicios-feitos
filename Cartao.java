import java.util.ArrayList;
import java.util.List;

public class Cartao {
   private double saldo;
   private double limite;
   private List<Compra>compras;

    public Cartao(double limite) {
        this.saldo = limite;
        this.limite = limite;
        this.compras = new ArrayList<>();
    }
    public boolean determinaCompra(Compra compra){
        if(this.saldo > compra.getValor()){
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }
    public List<Compra> getCompras() {
        return compras;
    }
    public double getLimite() {
        return limite;
    }

    @Override
    public String toString() {
        return "Saldo: "+ saldo + "Limite: "+ limite;
    }

}
