import java.util.LinkedList;
import java.util.List;

public class Title implements Comparable<Title>{
    String nome;

    public Title(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return this.getNome();
    }

    @Override
    public int compareTo(Title otherTitle) {
        return this.nome.compareTo(otherTitle.getNome());
    }
}
