/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class TelaGerenciarProfessor extends javax.swing.JFrame {

    /**
     * Creates new form TelaGerenciarProfessor
     */
    
    
    
     public TelaGerenciarProfessor() {
        initComponents();
        
        ImageIcon icone = new ImageIcon(getClass().getResource("/images/ceetecaicon16x16.png"));
        this.setIconImage(icone.getImage());
        
        //ListarCadastros();
    }
    
        /*public void ListarCadastros(){
        //Pegamos o modelo da tabela, as colunas.
        DefaultTableModel tableModel = (DefaultTableModel) tabelaGerProfessor.getModel();
        //Itera sobre os elementos no banco
        for (int i = 0; i < Banco.professores.size(); i++) {
            //Pega o biliotecario
            professorGetSet professor = Banco.professores.get(i);
            //Passa os dados do bibliotecario para um objeto
            Object[] linha = new Object[]{
                professor.getNome(),
                professor.getCpf(),
                professor.getEmail(),
                professor.getCelular(),
                professor.getTelefone()
            };
            //Adiciona o objeto na linha da coluna
            tableModel.addRow(linha);
        }
        //Definimos o modelo com as linhas adicionadas novamente para a tabela
        tabelaGerProfessor.setModel(tableModel);
    }*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelGerProfessor = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cTxtBuscaGerProfessor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaGerProfessor = new javax.swing.JTable();
        btVoltarGerProfessor = new javax.swing.JButton();
        btExcluirGerProfessor = new javax.swing.JButton();
        btEditarGerProfessor = new javax.swing.JButton();
        btCadastrarGerProfessor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CEETECA");
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Termo para busca:");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("(Digite o nome ou CPF do professor!)");

        cTxtBuscaGerProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cTxtBuscaGerProfessorActionPerformed(evt);
            }
        });
        cTxtBuscaGerProfessor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cTxtBuscaGerProfessorKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout painelGerProfessorLayout = new javax.swing.GroupLayout(painelGerProfessor);
        painelGerProfessor.setLayout(painelGerProfessorLayout);
        painelGerProfessorLayout.setHorizontalGroup(
            painelGerProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGerProfessorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelGerProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cTxtBuscaGerProfessor)
                    .addGroup(painelGerProfessorLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(0, 421, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelGerProfessorLayout.setVerticalGroup(
            painelGerProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGerProfessorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelGerProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(cTxtBuscaGerProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText("Busca");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setText("GERENCIAMENTO DE PROFESSOR");

        tabelaGerProfessor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "E-mail", "Telefone", "Celular"
            }
        ));
        jScrollPane1.setViewportView(tabelaGerProfessor);

        btVoltarGerProfessor.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btVoltarGerProfessor.setText("Voltar");
        btVoltarGerProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarGerProfessorActionPerformed(evt);
            }
        });

        btExcluirGerProfessor.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btExcluirGerProfessor.setText("Excluir");
        btExcluirGerProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirGerProfessorActionPerformed(evt);
            }
        });

        btEditarGerProfessor.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btEditarGerProfessor.setText("Editar");
        btEditarGerProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarGerProfessorActionPerformed(evt);
            }
        });

        btCadastrarGerProfessor.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btCadastrarGerProfessor.setText("Cadastrar");
        btCadastrarGerProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarGerProfessorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(282, 282, 282)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(painelGerProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2)
                            .addComponent(jScrollPane1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btCadastrarGerProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(btEditarGerProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(btExcluirGerProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(btVoltarGerProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelGerProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltarGerProfessor)
                    .addComponent(btExcluirGerProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditarGerProfessor)
                    .addComponent(btCadastrarGerProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarGerProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarGerProfessorActionPerformed
        // TODO add your handling code here:

        setVisible(false);
        new TelaCadProfessor().setVisible(true);
    }//GEN-LAST:event_btCadastrarGerProfessorActionPerformed

    private void btVoltarGerProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarGerProfessorActionPerformed
        // 

        setVisible(false);
        new TelaPrincipal().setVisible(true);
    }//GEN-LAST:event_btVoltarGerProfessorActionPerformed

    private void cTxtBuscaGerProfessorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cTxtBuscaGerProfessorKeyReleased
        // TODO add your handling code here:
        
        cTxtBuscaGerProfessor.setText(cTxtBuscaGerProfessor.getText().toUpperCase());
    }//GEN-LAST:event_cTxtBuscaGerProfessorKeyReleased

    private void cTxtBuscaGerProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cTxtBuscaGerProfessorActionPerformed
        
        
        
    }//GEN-LAST:event_cTxtBuscaGerProfessorActionPerformed

    private void btExcluirGerProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirGerProfessorActionPerformed
        
        int sim = JOptionPane.showConfirmDialog(null, "Deseja excluir este professor?");
        if (sim == 0) {
            
            //metodo excluir. 
            JOptionPane.showMessageDialog(null, "Excluido com sucesso");
        }
    }//GEN-LAST:event_btExcluirGerProfessorActionPerformed

    private void btEditarGerProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarGerProfessorActionPerformed
        int sim = JOptionPane.showConfirmDialog(null, "Deseja editar?");
        
        if (sim == 0) {
            // metodo editar
        }
    }//GEN-LAST:event_btEditarGerProfessorActionPerformed

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
            java.util.logging.Logger.getLogger(TelaGerenciarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGerenciarProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrarGerProfessor;
    private javax.swing.JButton btEditarGerProfessor;
    private javax.swing.JButton btExcluirGerProfessor;
    private javax.swing.JButton btVoltarGerProfessor;
    private javax.swing.JTextField cTxtBuscaGerProfessor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel painelGerProfessor;
    private javax.swing.JTable tabelaGerProfessor;
    // End of variables declaration//GEN-END:variables
}
