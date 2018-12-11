/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import DAO.NewHibernateUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.persistence.Query;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Aluno;
import models.Bibliotecaria;
import models.Contato;
import models.Emprestimo;
import models.Endereco;
import org.hibernate.Session;

/**
 *
 * @author PC
 */
public class TelaGerenciarAluno extends javax.swing.JFrame {

    /**
     * Creates new form TelaGerenciarAluno
     */
    public TelaGerenciarAluno() {
        initComponents();

        ImageIcon icone = new ImageIcon(getClass().getResource("/images/ceetecaicon16x16.png"));
        this.setIconImage(icone.getImage());

        listarCadastros();
    }

    public void listarCadastros() {
        Session sessao = NewHibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        //Chama a view  //p.idPessoa
        Query q = sessao.createSQLQuery("    SELECT al.idAluno , p.nomePessoa as Nome , p.cpfPessoa as CPF, c.emailContato as E_mail, c.telefoneContato as Telefone, c.CelularContato\n"
                + "    as Celular\n"
                + "\n"
                + "    FROM pessoa p, aluno al, contato c\n"
                + "\n"
                + "\n"
                + "    WHERE p.idPessoa = al.pessoa_idpessoa and p.idPessoa= c.pessoa_idPessoa\n"
                + "    order by al.idAluno;").addEntity(viewmodel.viewGerAluno.class);

        //pega o resultado da query e retorna uma lista
        List<viewmodel.viewGerAluno> registrosTelaPrincipal = q.getResultList();
        sessao.getTransaction().commit();
        sessao.close();

        //pega o modelo da tabela
        DefaultTableModel model = (DefaultTableModel) tabelaGerAluno.getModel();

        for (int i = 0; i < registrosTelaPrincipal.size(); i++) {
            //Pega o dado do registro usando i
            viewmodel.viewGerAluno registro = registrosTelaPrincipal.get(i);
            //adiciona os valores na linha
            Object[] row = {
                registro.getId(),
                registro.getCpf(),
                registro.getNome(),
                registro.getEmail(),
                registro.getCelular(),
                registro.getTelefone()
            };
            //adiciona a linha no modelo da tabela
            model.addRow(row);
        }
        //adiciona o modelo novamente na tabela
        tabelaGerAluno.setModel(model);

        //Atualiza a parte grafica da tabela mostrando os novos valores
        tabelaGerAluno.setVisible(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelGerAluno = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cTxtBuscaGerAluno = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaGerAluno = new javax.swing.JTable();
        btVoltarGerAluno = new javax.swing.JButton();
        btExcluirGerAluno = new javax.swing.JButton();
        btEditarGerAluno = new javax.swing.JButton();
        btCadastrarGerAluno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CEETECA");
        setResizable(false);

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Termo para a busca:");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("(Digite o nome ou o CPF do aluno!)");

        cTxtBuscaGerAluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cTxtBuscaGerAlunoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout painelGerAlunoLayout = new javax.swing.GroupLayout(painelGerAluno);
        painelGerAluno.setLayout(painelGerAlunoLayout);
        painelGerAlunoLayout.setHorizontalGroup(
            painelGerAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGerAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelGerAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cTxtBuscaGerAluno)
                    .addGroup(painelGerAlunoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(0, 408, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelGerAlunoLayout.setVerticalGroup(
            painelGerAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGerAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelGerAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(cTxtBuscaGerAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setText("GERENCIAMENTO DE ALUNO");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Busca");

        tabelaGerAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "CPF", "Nome", "E-mail", "Telefone", "Celular"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaGerAluno);

        btVoltarGerAluno.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btVoltarGerAluno.setText("Voltar");
        btVoltarGerAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarGerAlunoActionPerformed(evt);
            }
        });

        btExcluirGerAluno.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btExcluirGerAluno.setText("Excluir");
        btExcluirGerAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirGerAlunoActionPerformed(evt);
            }
        });

        btEditarGerAluno.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btEditarGerAluno.setText("Editar");
        btEditarGerAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarGerAlunoActionPerformed(evt);
            }
        });

        btCadastrarGerAluno.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btCadastrarGerAluno.setText("Cadastrar");
        btCadastrarGerAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarGerAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(290, 290, 290)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(painelGerAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btCadastrarGerAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btEditarGerAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btExcluirGerAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btVoltarGerAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelGerAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltarGerAluno)
                    .addComponent(btExcluirGerAluno)
                    .addComponent(btEditarGerAluno)
                    .addComponent(btCadastrarGerAluno))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btExcluirGerAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirGerAlunoActionPerformed

        int sim = JOptionPane.showConfirmDialog(null, "Deseja excluir?", "", JOptionPane.YES_NO_OPTION);

        if (sim == JOptionPane.YES_NO_OPTION) {
            // metodo editar         
            this.setVisible(false);

            DefaultTableModel dtm = (DefaultTableModel) tabelaGerAluno.getModel();

            //Pega a linha da jtable
            Vector row = (Vector) dtm.getDataVector().elementAt(tabelaGerAluno.getSelectedRow());

            //Abre a sessão
            Session sessao = NewHibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            //Pega o primeiro valor da linha
            int id = (int) row.get(0);

            Aluno aluno = (Aluno) sessao.get(Aluno.class, id);

            //conferir
            //Pega o objeto 
            
            List<Endereco> enderecos =  new ArrayList<Endereco>(aluno.getPessoa().getEnderecos());
            
            for(Endereco endereco : enderecos){
                sessao.remove(endereco);
            }
            sessao.getTransaction().commit();
            sessao.beginTransaction();
            
            List<Contato> contatos = new ArrayList<Contato>(aluno.getPessoa().getContatos());
            
            for(Contato contato : contatos){
                sessao.remove(contato);
            }
            
             sessao.getTransaction().commit();
             sessao.beginTransaction();
             
             List<Emprestimo> emprestimos = new ArrayList<>(aluno.getPessoa().getEmprestimos());
            
            for(Emprestimo emprestimo  : emprestimos){
                sessao.remove(emprestimo);
            }
            
             sessao.getTransaction().commit();
             sessao.beginTransaction();
              
            //Deleta o objeto do banco
            sessao.remove(aluno);
            sessao.getTransaction().commit();
            sessao.close();
            JOptionPane.showMessageDialog(null, "Excluído com sucesso");

            TelaCadastroAluno tela = new TelaCadastroAluno();

            tela.SetInformacoes(aluno);

            tela.setVisible(true);

            this.dispose();

            //JOptionPane.showMessageDialog(null, "Alteração Realizada");
        } else {
            JOptionPane.showMessageDialog(null, "Exclusão não realizada");
        }
 
    }//GEN-LAST:event_btExcluirGerAlunoActionPerformed

    private void btCadastrarGerAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarGerAlunoActionPerformed
        // TODO add your handling code here:

        setVisible(false);
        new TelaCadastroAluno().setVisible(true);

    }//GEN-LAST:event_btCadastrarGerAlunoActionPerformed

    private void btVoltarGerAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarGerAlunoActionPerformed
        // 
        setVisible(false);
        new TelaPrincipal().setVisible(true);


    }//GEN-LAST:event_btVoltarGerAlunoActionPerformed

    private void btEditarGerAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarGerAlunoActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja editar?", "", JOptionPane.YES_NO_OPTION);

        if (resposta == JOptionPane.YES_OPTION) {
            // metodo editar
            JOptionPane.showMessageDialog(null, "Alteração Realizada");
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma alteração realizada");
        }
    }//GEN-LAST:event_btEditarGerAlunoActionPerformed

    private void cTxtBuscaGerAlunoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cTxtBuscaGerAlunoKeyReleased
        // TODO add your handling code here:

        cTxtBuscaGerAluno.setText(cTxtBuscaGerAluno.getText().toUpperCase());
    }//GEN-LAST:event_cTxtBuscaGerAlunoKeyReleased

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
            java.util.logging.Logger.getLogger(TelaGerenciarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGerenciarAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrarGerAluno;
    private javax.swing.JButton btEditarGerAluno;
    private javax.swing.JButton btExcluirGerAluno;
    private javax.swing.JButton btVoltarGerAluno;
    private javax.swing.JTextField cTxtBuscaGerAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel painelGerAluno;
    private javax.swing.JTable tabelaGerAluno;
    // End of variables declaration//GEN-END:variables
}
