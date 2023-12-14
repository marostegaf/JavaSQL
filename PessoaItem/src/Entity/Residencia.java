package Entity;

public class Residencia {
    private int numero;
    private String rua;
    private String bairro;

    public Residencia(int n, String r, String b) {
        this.numero = n;
        this.rua = r;
        this.bairro = b;
    }

    public int getNumero() {
        return numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
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
