/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.aespi.jdbc.controller;

import br.edu.aespi.jdbc.model.HeroisDao;
import br.edu.aespi.jdbc.view.TelaEdicao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author hitaloyo
 */
public class EdicaoController {
    public static void salvar(Long id, String nome, String idSecreto, String habilidade){
        
        try {
            HeroisDao dao = new HeroisDao();
            dao.atualizaHeroi(id, nome, idSecreto, habilidade);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaEdicao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TelaEdicao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
