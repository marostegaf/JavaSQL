package Entity;

public class Item {
    private String nome;
    private Double preco;
    
    public Item(String n, Double p) {
        this.nome = n;
        this.preco = p;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

}
