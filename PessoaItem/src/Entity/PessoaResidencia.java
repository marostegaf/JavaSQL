package Entity;

public class PessoaResidencia {
    private String nome;
    private String rua;
    private String bairro;

    public PessoaResidencia(String nome, String rua, String bairro) {
        this.nome = nome;
        this.rua = rua;
        this.bairro = bairro;
    }

    public PessoaResidencia() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

}