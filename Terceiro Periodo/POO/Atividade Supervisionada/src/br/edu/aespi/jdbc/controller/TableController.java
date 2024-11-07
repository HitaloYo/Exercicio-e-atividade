package br.edu.aespi.jdbc.controller;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import br.edu.aespi.jdbc.model.Herois;
import br.edu.aespi.jdbc.model.HeroisDao;
import br.edu.aespi.jdbc.view.TelaEdicao;
import br.edu.aespi.jdbc.view.TelaNovo;
import java.sql.SQLException;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;

/**
 *
 * @author hitaloyo
 */
public class TableController {
    
    public static void pesquisar(JTable table) throws ClassNotFoundException, SQLException{
    List<Herois> listaDeHerois = new HeroisDao().getHerois();
    DefaultTableModel model = (DefaultTableModel)table.getModel();
    model.setRowCount(0);
        
    for(Herois heroi : listaDeHerois){
        Long id = heroi.getId();
        String nome = heroi.getNome();
        String idSecreto = heroi.getIdentidadeSecreta();
        String skill = heroi.getHabilidade();
        model.addRow(new Object[]{id,nome,idSecreto,skill});

        }
    
    }
    
    public static void novo(){
        new TelaNovo().setVisible(true); 
    }
    
    public static void editar(JTable table){
    int linhaSelecionada = table.getSelectedRow();

    if (linhaSelecionada == -1) {
        JOptionPane.showMessageDialog(null, "Por favor, selecione um heroi para editar.");
        return;
    }

    // Obter os dados da linha selecionada
    Long id = Long.parseLong(table.getValueAt(linhaSelecionada, 0).toString());
    String nome = (String) table.getValueAt(linhaSelecionada, 1);
    String idSecreto = (String) table.getValueAt(linhaSelecionada, 2);
    String habilidade = (String) table.getValueAt(linhaSelecionada, 3);

    // Abrir a janela de edição passando os dados do contato
     new TelaEdicao(id, nome,idSecreto,habilidade, table).setVisible(true);
    }
    
    public static void deletar(JTable table){
        int linhaSelecionada = table.getSelectedRow();

        if (linhaSelecionada == -1) {

            JOptionPane.showMessageDialog(null, "Por favor, selecione um Heroi para deletar.");
            return;
        }

        try {

            Object valorId = table.getValueAt(linhaSelecionada, 0);

            if (valorId == null) {

                javax.swing.JOptionPane.showMessageDialog(null, "Erro ao obter o ID do Heroi.");
                return;
            }

            Long id = Long.parseLong(valorId.toString());

            int confirm = javax.swing.JOptionPane.showConfirmDialog(null, "Tem certeza que deseja deletar o Heroi?", "Confirmação", javax.swing.JOptionPane.YES_NO_OPTION);

            if (confirm == javax.swing.JOptionPane.YES_OPTION) {

                HeroisDao heroiDao = new HeroisDao();
                heroiDao.deletaHeroi(id);  // Certifique-se de que o método existe no DAO

                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.removeRow(linhaSelecionada);

                JOptionPane.showMessageDialog(null, "Heroi deletado com sucesso.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao deletar Heroi: " + e.getMessage());
        }
    }
    
    
}