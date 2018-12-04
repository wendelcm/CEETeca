/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import DAO.NewHibernateUtil;
import static DAO.NewHibernateUtil.getSessionFactory;
import java.util.List;
import javax.persistence.Query;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;

/**
 *
 * @author Aluno
 */
public class TelaGerenciarProfessor extends javax.swing.JFrame {

    /**
     * Creates new form TelaGerenciarProfessor
     */
    public TelaGerenciarProfessor() {
        initComponents();

        ImageIcon icone = new ImageIcon(getClass().getResource("/images/ceetecaicon16x16.png"));
        this.setIconImage(icone.getImage());
        
        
        
    listarCadastros();
}
public void listarCadastros(){
    Session sessao = NewHibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        //Chama a view
        Query q = sessao.createSQLQuery("SELECT p.nomePessoa as Nome , p.cpfPessoa as CPF, c.emailContato as E_mail, c.telefoneContato as Telefone, c.CelularContato as Celular\n" +
"\n" +
"FROM pessoa p, professor pe, contato c\n" +
"\n" +
"WHERE p.idPessoa = pe.pessoa_idpessoa and p.idPessoa= c.pessoa_idPessoa\n" +
"order by p.nomePessoa;").addEntity(viewmodel.viewGerProfessor.class);
        
        //pega o resultado da query e retorna uma lista
        List<viewmodel.viewGerProfessor> registrosTelaPrincipal = q.getResultList();
        sessao.getTransaction().commit();
        sessao.close();

        //pega o modelo da tabela
        DefaultTableModel model = (DefaultTableModel) tabelaGerProfessor.getModel();

        for (int i = 0; i < registrosTelaPrincipal.size(); i++) {
            //Pega o dado do registro usando i
            viewmodel.viewGerProfessor registro = registrosTelaPrincipal.get(i);
            //adiciona os valores na linha
            Object[] row = {
                registro.getCPF(),
                registro.getNome(),
                registro.getEmail(),
                registro.getCelular(),
                registro.getTelefone()
            };
            //adiciona a linha no modelo da tabela
            model.addRow(row);
        }
        //adiciona o modelo novamente na tabela
        tabelaGerProfessor.setModel(model);

        //Atualiza a parte grafica da tabela mostrando os novos valores
        tabelaGerProfessor.setVisible(true);

    
}
/**
 * This method is called from within the constructor to initialize the form.
 * WARNING: Do NOT modify this code. The content of this method is always
 * regenerated by the Form Editor.
 */
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        painelGerProfessor = new javax.swing.JPanel();
        cTxtBuscaGerProfessor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaGerProfessor = new javax.swing.JTable();
        btVoltarGerProfessor = new javax.swing.JButton();
        btExcluirGerProfessor = new javax.swing.JButton();
        btEditarGerProfessor = new javax.swing.JButton();
        btCadastrarGerProfessor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CEETECA");

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setText("GERENCIAMENTO DE PROFESSOR");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Termo para busca: ");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText(" (Digite o nome ou CPF do professor!)");

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
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelGerProfessorLayout.setVerticalGroup(
            painelGerProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelGerProfessorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelGerProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(cTxtBuscaGerProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("Busca");

        tabelaGerProfessor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CPF", "Nome", "E-mail", "Telefone", "Celular"
            }
        ));
        jScrollPane1.setViewportView(tabelaGerProfessor);

        btVoltarGerProfessor.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btVoltarGerProfessor.setText("Voltar");
        btVoltarGerProfessor.setPreferredSize(new java.awt.Dimension(110, 25));
        btVoltarGerProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarGerProfessorActionPerformed(evt);
            }
        });

        btExcluirGerProfessor.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btExcluirGerProfessor.setText("Excluir");
        btExcluirGerProfessor.setPreferredSize(new java.awt.Dimension(110, 25));
        btExcluirGerProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirGerProfessorActionPerformed(evt);
            }
        });

        btEditarGerProfessor.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btEditarGerProfessor.setText("Editar");
        btEditarGerProfessor.setPreferredSize(new java.awt.Dimension(110, 25));
        btEditarGerProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarGerProfessorActionPerformed(evt);
            }
        });

        btCadastrarGerProfessor.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btCadastrarGerProfessor.setText("Cadastrar");
        btCadastrarGerProfessor.setPreferredSize(new java.awt.Dimension(110, 25));
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
                        .addGap(269, 269, 269)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(painelGerProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 210, Short.MAX_VALUE)
                        .addComponent(btCadastrarGerProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btEditarGerProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btExcluirGerProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btVoltarGerProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(3, 3, 3)
                .addComponent(painelGerProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltarGerProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluirGerProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditarGerProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCadastrarGerProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 60, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarGerProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarGerProfessorActionPerformed
        // 
        setVisible(false);
        new TelaCadProfessor().setVisible(true);
    }//GEN-LAST:event_btCadastrarGerProfessorActionPerformed

    private void btVoltarGerProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarGerProfessorActionPerformed
        // 
        setVisible(false);
        new TelaPrincipal().setVisible(true);
    }//GEN-LAST:event_btVoltarGerProfessorActionPerformed

    private void btEditarGerProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarGerProfessorActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja editar?", "", JOptionPane.YES_NO_OPTION);

        switch (resposta) {
            case JOptionPane.YES_OPTION:
                break;
            case JOptionPane.NO_OPTION:
                break;
        }
    }//GEN-LAST:event_btEditarGerProfessorActionPerformed

    private void btExcluirGerProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirGerProfessorActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja Excluir?", "", JOptionPane.YES_NO_OPTION);

        switch (resposta) {
            case JOptionPane.YES_OPTION:
                break;
            case JOptionPane.NO_OPTION:
                break;
        }
    }//GEN-LAST:event_btExcluirGerProfessorActionPerformed

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
            java.util.logging.Logger.getLogger(TelaGerenciarProfessor.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarProfessor.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarProfessor.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarProfessor.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
