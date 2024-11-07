
package br.edu.aespi.jdbc.model;

import br.edu.aespi.jdbc.model.Herois;
import java.sql.Connection;
import br.edu.aespi.jdbc.factory.ConnectionFactory;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;


 


public class HeroisDao {
    private Connection connection;
    
    public HeroisDao() throws ClassNotFoundException{
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adiciona(Herois contato){
    
        String sql = "insert into herois"
                + "(nome, identidadeSecreta, habilidade)"
                + "values (?,?,?)";
        
        try(
        PreparedStatement stmt = connection.prepareStatement(sql)){
        stmt.setString (1, contato.getNome());
        stmt.setString (2, contato.getIdentidadeSecreta());
        stmt.setString (3, contato.getHabilidade());
        
        stmt.execute();
        }catch (SQLException ex){
            Logger.getLogger(HeroisDao.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }
    public List<Herois> getHerois() throws SQLException{
        List<Herois> listaDeHerois = new ArrayList<>();
        
        try{
            String sql = "select * from herois";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()){
                
                Long id = rs.getLong("id");
                String nome = rs.getString("nome");
                String identidadeSecreta = rs.getString("identidadeSecreta");
                String habilidade = rs.getString("habilidade");

                
                
                Herois contato = new Herois();
                contato.setId(id);
                contato.setNome(nome);
                contato.setIdentidadeSecreta(identidadeSecreta);
                contato.setHabilidade(habilidade);

                
                listaDeHerois.add(contato);
            }
        }catch (SQLException ex) {
          System.err.println(ex.getMessage());
        }
        return listaDeHerois;
    }
    public void deletaHeroi(Long id) throws SQLException, ClassNotFoundException {
        String sql = "DELETE FROM herois WHERE id = ?";

        try (
             PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setLong(1, id);
            stmt.executeUpdate();
        }
}
    public void atualizaHeroi(Long id, String nome, String identidadeSecreta, String habilidade) throws SQLException {
    String sql = "UPDATE herois SET nome = ?, identidadeSecreta = ?, habilidade = ? WHERE id = ?";
    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
        stmt.setString(1, nome);
        stmt.setString(2, identidadeSecreta);
        stmt.setString(3, habilidade);
        stmt.setLong(4, id);
        stmt.executeUpdate();
    }
}

    
}

