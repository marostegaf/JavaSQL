package Entity;

public class Pessoa {
    private String nome;
    private int num_residencia;

    public Pessoa(String n) {
        this.nome = n;
        this.num_residencia = 0;
    }

    public Pessoa(String n, int nr) {
        this.nome = n;
        this.num_residencia = nr;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

        public int getNum_residencia() {
        return num_residencia;
    }

    public void setNum_residencia(int num_residencia) {
        this.num_residencia = num_residencia;
    }
    
}
