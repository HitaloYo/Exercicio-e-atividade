/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.aespi.jdbc.controller;

import br.edu.aespi.jdbc.model.Herois;
import br.edu.aespi.jdbc.model.HeroisDao;
import br.edu.aespi.jdbc.view.TelaNovo;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author hitaloyo
 */
public class NovoController {
   public static void gravar(String nome, String idSecreto, String skill){
                   Herois heroi = new Herois();
                heroi.setNome(nome);
                heroi.setIdentidadeSecreta(idSecreto);
                heroi.setHabilidade(skill);
                
                HeroisDao dao = null;
        try {
            dao = new HeroisDao();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaNovo.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
                
                dao.adiciona(heroi);

                
   } 
}
