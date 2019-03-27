/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.sistemaGestao.JFrames;

import br.senai.sc.JPainels.AlterarEquipe;
import br.senai.sc.JPainels.CadastrarEquipeJPanel;
import br.senai.sc.JPainels.CadastroTarefas;
import br.senai.sc.JPainels.EditarColaborador;
import br.senai.sc.JPainels.ListarColaboradorJPanel;
import br.senai.sc.JPainels.ListarEquipeJPanel;
import br.senai.sc.JPainels.RegistroColaboradorJPanel;
import java.awt.CardLayout;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aluno
 */
public class GestorJFrame extends javax.swing.JFrame {

    private CardLayout cl;

    public GestorJFrame() {
        initComponents();

        this.cl = (CardLayout) painelPrincipal.getLayout();
        painelPrincipal.add(painelMenu, "painelMenu");
        this.cl.show(painelPrincipal, "painelMenu");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        painelMenu = new javax.swing.JPanel();
        buttonCadastro = new javax.swing.JButton();
        buttonCadastroEquipe = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonEditarEquipe = new javax.swing.JButton();
        buttonEditarColaborador = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        buttonListarEquipe = new javax.swing.JButton();
        buttonListarColaborador = new javax.swing.JButton();
        buttonTarefaC = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jVoltar = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelPrincipal.setLayout(new java.awt.CardLayout());

        buttonCadastro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonCadastro.setText("Cadastrar Colaborador");
        buttonCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCadastroMouseClicked(evt);
            }
        });
        buttonCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastroActionPerformed(evt);
            }
        });

        buttonCadastroEquipe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonCadastroEquipe.setText("Cadastrar Equipe");
        buttonCadastroEquipe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCadastroEquipeMouseClicked(evt);
            }
        });
        buttonCadastroEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastroEquipeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Cadastro");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Editar");

        buttonEditarEquipe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonEditarEquipe.setText("Editar Equipe");
        buttonEditarEquipe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonEditarEquipeMouseClicked(evt);
            }
        });
        buttonEditarEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarEquipeActionPerformed(evt);
            }
        });

        buttonEditarColaborador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonEditarColaborador.setText("Editar Colaborador");
        buttonEditarColaborador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonEditarColaboradorMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Listar");

        buttonListarEquipe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonListarEquipe.setText("Listar Equipe");
        buttonListarEquipe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonListarEquipeMouseClicked(evt);
            }
        });
        buttonListarEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonListarEquipeActionPerformed(evt);
            }
        });

        buttonListarColaborador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonListarColaborador.setText("Listar Colaboradores");
        buttonListarColaborador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonListarColaboradorMouseClicked(evt);
            }
        });

        buttonTarefaC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonTarefaC.setText("Cadastrar Tarefa");
        buttonTarefaC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonTarefaCMouseClicked(evt);
            }
        });
        buttonTarefaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTarefaCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelMenuLayout = new javax.swing.GroupLayout(painelMenu);
        painelMenu.setLayout(painelMenuLayout);
        painelMenuLayout.setHorizontalGroup(
            painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMenuLayout.createSequentialGroup()
                .addGroup(painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelMenuLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1)
                        .addGap(166, 166, 166)
                        .addComponent(jLabel2)
                        .addGap(156, 156, 156)
                        .addComponent(jLabel3))
                    .addGroup(painelMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonCadastroEquipe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(81, 81, 81)
                        .addGroup(painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonEditarEquipe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonEditarColaborador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(69, 69, 69)
                        .addGroup(painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonListarEquipe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonListarColaborador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(painelMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonTarefaC, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(313, Short.MAX_VALUE))
        );
        painelMenuLayout.setVerticalGroup(
            painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMenuLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonListarEquipe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonCadastro)
                        .addComponent(buttonEditarEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonListarColaborador)
                    .addGroup(painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonCadastroEquipe)
                        .addComponent(buttonEditarColaborador)))
                .addGap(18, 18, 18)
                .addComponent(buttonTarefaC)
                .addGap(259, 259, 259))
        );

        jVoltar.setText("voltar");
        jVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jVoltarMouseClicked(evt);
            }
        });
        jMenuBar1.add(jVoltar);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCadastroMouseClicked
        RegistroColaboradorJPanel rc = new RegistroColaboradorJPanel();
        painelPrincipal.add(rc, "painelCadastro");
        this.cl.show(painelPrincipal, "painelCadastro");


    }//GEN-LAST:event_buttonCadastroMouseClicked

    private void buttonCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCadastroActionPerformed

    private void jVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jVoltarMouseClicked
        this.cl.show(painelPrincipal, "painelMenu");
    }//GEN-LAST:event_jVoltarMouseClicked

    private void buttonCadastroEquipeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCadastroEquipeMouseClicked
        CadastrarEquipeJPanel ce = new CadastrarEquipeJPanel();
        painelPrincipal.add(ce, "painelCadastroEquipe");
        this.cl.show(painelPrincipal, "painelCadastroEquipe");
    }//GEN-LAST:event_buttonCadastroEquipeMouseClicked

    private void buttonCadastroEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastroEquipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCadastroEquipeActionPerformed

    private void buttonEditarEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarEquipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEditarEquipeActionPerformed

    private void buttonEditarEquipeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEditarEquipeMouseClicked
        AlterarEquipe ae = new AlterarEquipe();
        painelPrincipal.add(ae, "AlterarEquipe");
        this.cl.show(painelPrincipal, "AlterarEquipe");
    }//GEN-LAST:event_buttonEditarEquipeMouseClicked

    private void buttonEditarColaboradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEditarColaboradorMouseClicked
        EditarColaborador ec = new EditarColaborador();
        painelPrincipal.add(ec, "EditarColaborador");
        this.cl.show(painelPrincipal, "EditarColaborador");
    }//GEN-LAST:event_buttonEditarColaboradorMouseClicked

    private void buttonListarEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonListarEquipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonListarEquipeActionPerformed

    private void buttonListarEquipeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonListarEquipeMouseClicked
        ListarEquipeJPanel le = new ListarEquipeJPanel();
        painelPrincipal.add(le, "ListarEquipe");
        this.cl.show(painelPrincipal, "ListarEquipe");
    }//GEN-LAST:event_buttonListarEquipeMouseClicked

    private void buttonListarColaboradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonListarColaboradorMouseClicked
        ListarColaboradorJPanel lc = new ListarColaboradorJPanel();
        painelPrincipal.add(lc, "ListarColaborador");
        this.cl.show(painelPrincipal, "ListarColaborador");
    }//GEN-LAST:event_buttonListarColaboradorMouseClicked

    private void buttonTarefaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTarefaCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonTarefaCActionPerformed

    private void buttonTarefaCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonTarefaCMouseClicked
        CadastroTarefas ct = new CadastroTarefas();
         painelPrincipal.add(ct, "CadastroTarefas");
        this.cl.show(painelPrincipal, "CadastroTarefas");
    }//GEN-LAST:event_buttonTarefaCMouseClicked

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
            java.util.logging.Logger.getLogger(GestorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestorJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCadastro;
    private javax.swing.JButton buttonCadastroEquipe;
    private javax.swing.JButton buttonEditarColaborador;
    private javax.swing.JButton buttonEditarEquipe;
    private javax.swing.JButton buttonListarColaborador;
    private javax.swing.JButton buttonListarEquipe;
    private javax.swing.JButton buttonTarefaC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jVoltar;
    private javax.swing.JPanel painelMenu;
    private javax.swing.JPanel painelPrincipal;
    // End of variables declaration//GEN-END:variables
}
