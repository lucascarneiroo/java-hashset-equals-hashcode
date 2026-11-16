
import java.util.HashSet;
import java.util.Objects;

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Pessoa outra = (Pessoa) obj;

        return idade == outra.idade &&
                Objects.equals(nome, outra.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Idade: " + idade;
    }
}

public class Main {
    public static void main(String[] args) {

        HashSet<Pessoa> pessoas = new HashSet<>();

        pessoas.add(new Pessoa("Ana", 22));
        pessoas.add(new Pessoa("Carlos", 25));
        pessoas.add(new Pessoa("Maria", 30));
        pessoas.add(new Pessoa("Ana", 22));
        pessoas.add(new Pessoa("Carlos", 25));
        pessoas.add(new Pessoa("Pedro", 20));
        pessoas.add(new Pessoa("Ana", 23));

        System.out.println("Quantidade de pessoas cadastradas: "
                + pessoas.size());
    }
}
