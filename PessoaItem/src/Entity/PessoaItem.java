package Entity;

public class PessoaItem {
    private int transacao;
    private int pessoa;
    private int item;

    public PessoaItem(int t, int p, int i) {
        this.transacao = t;
        this.pessoa = p;
        this.item = i;
    }

    public int getTransacao() {
        return transacao;
    }

    public void setTransacao(int transacao) {
        this.transacao = transacao;
    }

    public int getPessoa() {
        return pessoa;
    }

    public void setPessoa(int pessoa) {
        this.pessoa = pessoa;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }
    
}
