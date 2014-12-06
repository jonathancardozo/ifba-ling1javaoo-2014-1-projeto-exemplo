/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import controles.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Jonathan
 */
public class ProdutoDAO {

    Connection conn;

    public ProdutoDAO() {
        this.conn = ConnectionFactory.getConnection();
    }

    public boolean inserir(Produto p) {
        
        String sql = "INSERT INTO produto(nome, especificacao, preco_custo, preco_venda, habilitado) VALUES(?,?,?,?,?);";
        
        try {

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getEspecificacao());
            stmt.setDouble(3, p.getPrecoCusto());
            stmt.setDouble(4, p.getPrecoVenda());
            stmt.setBoolean(5, p.getHabilitado());

            stmt.execute();
            stmt.close();
            this.conn.close();
            return true;
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
    }

}
