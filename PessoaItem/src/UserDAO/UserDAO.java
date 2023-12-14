package UserDAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Conexao.Conexao;
import Entity.Item;
import Entity.Pessoa;
import Entity.PessoaItem;
import Entity.PessoaResidencia;
import Entity.Residencia;

//Data Access Object
public class UserDAO {
    PreparedStatement ps = null;
    public void registrarPessoa(Pessoa p) {
        String sql = "INSERT INTO loja.pessoa (nome, num_residencia) VALUES (?, ?)";

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, p.getNome());
            ps.setInt(2, p.getNum_residencia());            
    
            ps.execute();
            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void registrarBairro(Residencia r) {
        String sql = "INSERT INTO loja.residencia VALUES (?, ?, ?)";

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, r.getNumero());
            ps.setString(2, r.getRua());
            ps.setString(3, r.getBairro());           
    
            ps.execute();
            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void registrarItem(Item i) {
        String sql = "INSERT INTO loja.item (nome, preco) VALUES (?, ?)";
       
        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, i.getNome());
            ps.setDouble(2, i.getPreco());

            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void registrarPessoaItem(PessoaItem pi) {
        String sql = "CALL criar_transacao (?, ?, ?)";

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, pi.getTransacao());
            ps.setInt(2, pi.getPessoa());
            ps.setInt(3, pi.getItem());

            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static public List<PessoaResidencia> selecionarPessoaResidencia() {
        List<PessoaResidencia> pessoasResidencia = new ArrayList<>();
        String sql = "SELECT * FROM pessoa_residencia";

        try (PreparedStatement ps = Conexao.getConexao().prepareStatement(sql)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    PessoaResidencia pessoaResidencia = new PessoaResidencia();
                    pessoaResidencia.setNome(rs.getString("nome"));
                    pessoaResidencia.setRua(rs.getString("rua"));
                    pessoaResidencia.setBairro(rs.getString("bairro"));

                    pessoasResidencia.add(pessoaResidencia);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return pessoasResidencia;
        /*List<PessoaResidencia> pessoasResidencia = UserDAO.selecionarPessoaResidencia();

        for (PessoaResidencia pessoaResidencia : pessoasResidencia) {
            System.out.println(pessoaResidencia.getNome() + " / " + 
            pessoaResidencia.getRua() + " / " + pessoaResidencia.getBairro());
        }*/
    }

    static public void selecionarTransacao() {
        String sql = "SELECT * FROM transacoes";

        try (PreparedStatement ps = Conexao.getConexao().prepareStatement(sql)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    int transacao = (rs.getInt("transacao"));
                    String pessoa = (rs.getString("nome_pessoa"));
                    String item = (rs.getString("nome_item"));
                    Double preco = (rs.getDouble("preco"));

                    System.out.println(transacao + " / " +
                                       pessoa + " / " +
                                       item + " / " +
                                       preco);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
