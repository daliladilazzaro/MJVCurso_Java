package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.Conexao;
import model.CadastroModel;

/**
 *
 * @author dilaz
 */
public class CadastroDAO {

    private Connection connection;

    public CadastroDAO() {
        Conexao con = new Conexao();//chama a classe
        connection = con.criarConecao();//instancia
    }

    public void incluir(CadastroModel cadastro) {
        try {
//            String sql = "INSERT INTO public.tab_cadastro (nome,telefone)VALUES ('Vanessa Loren',45975263695);";
//String txt = "INSERT INTO public.tab_cadastro (nome,telefone)VALUES ('%s',%d);";
//            String sql = String.format(txt, cadastro.getNome(), cadastro.getTelefone());
//            Statement st = connection.createStatement();
            String sql = "INSERT INTO public.tab_cliente (pf_pj, nome, cpf_cnpj, telefone1, telefone2, email,"
                    + "area_atuacao, cep, estado, cidade, rua, numero, complemento, bairro, site_instagram, observacao)"
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
            PreparedStatement instruSQL = connection.prepareStatement(sql);
            instruSQL.setString(1, cadastro.getPf_pj());
            instruSQL.setString(2, cadastro.getNome());
            instruSQL.setString(3, cadastro.getCpf_cnpj());
            instruSQL.setLong(4, cadastro.getTelefone1());
            instruSQL.setLong(5, cadastro.getTelefone2());
            instruSQL.setString(6, cadastro.getEmail());
            instruSQL.setString(7, cadastro.getArea_atuacao());
            instruSQL.setString(8, cadastro.getCep());
            instruSQL.setString(9, cadastro.getEstado());
            instruSQL.setString(10, cadastro.getCidade());
            instruSQL.setString(11, cadastro.getRua());
            instruSQL.setString(12, cadastro.getNumero());
            instruSQL.setString(13, cadastro.getComplemento());
            instruSQL.setString(14, cadastro.getBairro());
            instruSQL.setString(15, cadastro.getSite_instagram());
            instruSQL.setString(16, cadastro.getObservacao());
            instruSQL.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void alterar(CadastroModel cadastro) {
        try {
            String sql = "UPDATE tab_cliente SET pf_pj = ?, nome = ?, cpf_cnpj = ?, telefone1 = ?, telefone2 = ?,"
                    + " email = ?, area_atuacao = ?, cep = ?, estado = ?, cidade = ?, rua = ?, numero = ?, "
                    + "complemento = ?, bairro = ?, site_instagram = ?, observacao = ? WHERE id=?";
            PreparedStatement instruSQL = connection.prepareStatement(sql);

            instruSQL.setString(1, cadastro.getPf_pj());
            instruSQL.setString(2, cadastro.getNome());
            instruSQL.setString(3, cadastro.getCpf_cnpj());
            instruSQL.setLong(4, cadastro.getTelefone1());
            instruSQL.setLong(5, cadastro.getTelefone2());
            instruSQL.setString(6, cadastro.getEmail());
            instruSQL.setString(7, cadastro.getArea_atuacao());
            instruSQL.setString(8, cadastro.getCep());
            instruSQL.setString(9, cadastro.getEstado());
            instruSQL.setString(10, cadastro.getCidade());
            instruSQL.setString(11, cadastro.getRua());
            instruSQL.setString(12, cadastro.getNumero());
            instruSQL.setString(13, cadastro.getComplemento());
            instruSQL.setString(14, cadastro.getBairro());
            instruSQL.setString(15, cadastro.getSite_instagram());
            instruSQL.setString(16, cadastro.getObservacao());
            instruSQL.setInt(17, cadastro.getId());
            instruSQL.executeUpdate();
            instruSQL.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void excluir(Integer id) {
        try {
            String sql = "DELETE FROM tab_cliente WHERE id=?;";
            PreparedStatement instruSQL = connection.prepareStatement(sql);

            instruSQL.setInt(1, id);
            instruSQL.executeUpdate();
            instruSQL.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public CadastroModel buscarID(Integer id) {
        CadastroModel c = null;//enquanto não achar nao pode dar new 
        try {
            String sql = "SELECT * FROM tab_cliente WHERE id = ?";
            PreparedStatement instruSQL = connection.prepareStatement(sql);
            instruSQL.setInt(1, id);
            ResultSet rs = instruSQL.executeQuery(); //execute set pra todas linhas com colunas

            while (rs.next()) { //enquanto tiver registro
                c = new CadastroModel();//pode dar new quando achar
                c.setId(rs.getInt("id"));
                c.setPf_pj(rs.getString("pf_pj"));
                c.setNome(rs.getString("nome"));
                c.setCpf_cnpj(rs.getString("cpf_cnpj"));
                c.setTelefone1(rs.getLong("telefone1"));
                c.setTelefone2(rs.getLong("telefone2"));
                c.setEmail(rs.getString("email"));
                c.setArea_atuacao(rs.getString("area_atuacao"));
                c.setCep(rs.getString("cep"));
                c.setEstado(rs.getString("estado"));
                c.setCidade(rs.getString("cidade"));
                c.setRua(rs.getString("rua"));
                c.setNumero(rs.getString("numero"));
                c.setComplemento(rs.getString("complemento"));
                c.setBairro(rs.getString("bairro"));
                c.setSite_instagram(rs.getString("site_instagram"));
                c.setObservacao(rs.getString("observacao"));
            }
            instruSQL.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return c;
    }

    public List<CadastroModel> listar() {
        List<CadastroModel> lista = new ArrayList<CadastroModel>();
        try {
            String sql = "SELECT * FROM tab_cliente";
            PreparedStatement instruSQL = connection.prepareStatement(sql);
            ResultSet rs = instruSQL.executeQuery(); //execute set pra todas linhas com colunas

            while (rs.next()) { //enquanto tiver registro
                CadastroModel c = new CadastroModel();//objeto na memoria 
                c.setId(rs.getInt("id"));
                c.setPf_pj(rs.getString("pf_pj"));
                c.setNome(rs.getString("nome"));
                c.setCpf_cnpj(rs.getString("cpf_cnpj"));
                c.setTelefone1(rs.getLong("telefone1"));
                c.setTelefone2(rs.getLong("telefone2"));
                c.setEmail(rs.getString("email"));
                c.setArea_atuacao(rs.getString("area_atuacao"));
                c.setCep(rs.getString("cep"));
                c.setEstado(rs.getString("estado"));
                c.setCidade(rs.getString("cidade"));
                c.setRua(rs.getString("rua"));
                c.setNumero(rs.getString("numero"));
                c.setComplemento(rs.getString("complemento"));
                c.setBairro(rs.getString("bairro"));
                c.setSite_instagram(rs.getString("site_instagram"));
                c.setObservacao(rs.getString("observacao"));

                lista.add(c); // lista: para cada while ele add 
            }
            instruSQL.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }

    public Integer buscarNome(String nome) {
        Integer id = null;//enquanto não achar nao pode dar new 
        try {
            String sql = "SELECT * FROM tab_cliente WHERE nome = ?";
            PreparedStatement instruSQL = connection.prepareStatement(sql);
            instruSQL.setString(1, nome);
            ResultSet rs = instruSQL.executeQuery(); //execute set pra todas linhas com colunas

            while (rs.next()) { //enquanto tiver registro
                id = rs.getInt("id");
            }
            instruSQL.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return id;
    }

    public boolean verificaNome(String nome) {
        boolean ver = false;
//        CadastroModel c = null;//enquanto não achar nao pode dar new 
        try {
            String sql = "SELECT * FROM tab_cliente WHERE nome = ?";
            PreparedStatement instruSQL = connection.prepareStatement(sql);
            instruSQL.setString(1, nome);
            ResultSet rs = instruSQL.executeQuery(); //execute set pra todas linhas com colunas

            while (rs.next()) { //enquanto tiver registro
                ver = true;
                break;
//                c = new CadastroModel();//pode dar new quando achar
//                c.setId(rs.getInt("id"));
//                c.setNome(rs.getString("nome"));
//                c.setTelefone(rs.getLong("telefone"));
            }
            instruSQL.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ver;
    }
}
