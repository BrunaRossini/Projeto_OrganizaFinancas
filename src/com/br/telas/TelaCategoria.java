/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.telas;

import com.br.dao.CategoriaDAO;
import com.br.modelo.Categoria;
import com.br.utils.Mensagem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bruna Rossini
 */
public class TelaCategoria extends javax.swing.JDialog {
    
    private List<Categoria> lista = new ArrayList<>();    

   //Iniciação da Classe  TelaCategoria
    public TelaCategoria(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        atualizarTabelaCategoria();
    }

    private void atualizarTabelaCategoria(){
        try {
            DefaultTableModel modeloTabelaCategoria = (DefaultTableModel) jtTabelaCategoria.getModel();
            modeloTabelaCategoria.setNumRows(0);
            
             lista = new CategoriaDAO().listarCategoria(tfPesquisarCategoria.getText());             
                                       
           lista.forEach((Categoria categoria) -> {
                 modeloTabelaCategoria.addRow(new Object[]{
                     categoria.getIdcategoria(),
                     categoria.getDescricao(),
                     categoria.getTipo()
                 });
            });
                        
        } catch (Exception e) {
            System.err.println(e);
            Mensagem.erro(this,"Erro ao Atualizar a tabela de Categorias: \n" + e.getMessage());
        } 
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabelaCategoria = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jbTelaCategoriaInserir = new javax.swing.JButton();
        jbTelaCategoriaAlterar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfPesquisarCategoria = new javax.swing.JTextField();
        jbPesquisarTelaCategoria = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("OrganizaFinança - Categoria");

        jtTabelaCategoria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtTabelaCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descricao", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtTabelaCategoria);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 3, true));

        jbTelaCategoriaInserir.setText("Inserir");
        jbTelaCategoriaInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTelaCategoriaInserirActionPerformed(evt);
            }
        });
        jPanel1.add(jbTelaCategoriaInserir);

        jbTelaCategoriaAlterar.setText("Alterar");
        jbTelaCategoriaAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTelaCategoriaAlterarActionPerformed(evt);
            }
        });
        jPanel1.add(jbTelaCategoriaAlterar);

        jButton3.setText("Excluir");
        jPanel1.add(jButton3);

        jButton4.setText("Sair");
        jPanel1.add(jButton4);

        jLabel1.setText("Pesquisar:");

        tfPesquisarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPesquisarCategoriaActionPerformed(evt);
            }
        });

        jbPesquisarTelaCategoria.setText("Pesquisar");
        jbPesquisarTelaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarTelaCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfPesquisarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbPesquisarTelaCategoria)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPesquisarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jbPesquisarTelaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbTelaCategoriaInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTelaCategoriaInserirActionPerformed
        TelaCategoriaCadastro t = new TelaCategoriaCadastro(null, true);
        t.setInserirCategoriaCadastro(true);
        t.setVisible(true);
    }//GEN-LAST:event_jbTelaCategoriaInserirActionPerformed

    private void tfPesquisarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPesquisarCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPesquisarCategoriaActionPerformed

    private void jbPesquisarTelaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarTelaCategoriaActionPerformed
        atualizarTabelaCategoria();
    }//GEN-LAST:event_jbPesquisarTelaCategoriaActionPerformed

    private void jbTelaCategoriaAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTelaCategoriaAlterarActionPerformed
        TelaCategoriaCadastro t = new TelaCategoriaCadastro(null, true);
        t.setInserirCategoriaCadastro(false);
        t.setVisible(true);
    }//GEN-LAST:event_jbTelaCategoriaAlterarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaCategoria dialog = new TelaCategoria(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbPesquisarTelaCategoria;
    private javax.swing.JButton jbTelaCategoriaAlterar;
    private javax.swing.JButton jbTelaCategoriaInserir;
    private javax.swing.JTable jtTabelaCategoria;
    private javax.swing.JTextField tfPesquisarCategoria;
    // End of variables declaration//GEN-END:variables
}
