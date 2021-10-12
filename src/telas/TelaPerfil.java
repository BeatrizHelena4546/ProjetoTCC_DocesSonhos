package telas;
import java.sql.*;
import javax.swing.JOptionPane;
import AcessoDadosDao.ModuloDbConect;

public class TelaPerfil extends javax.swing.JInternalFrame {
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public TelaPerfil() {
        initComponents();
        conexao = ModuloDbConect.conector();
        if(conexao != null) {
            lblStatusDB.setText("Conectado");
                                
        }else{
            lblStatusDB.setText("Não Conectado");
        }
    }
    
    private void consultar(){
        String sql = "select * from tbusuario where nmusuario=? and cdsenha=?";
        try{
            pst = conexao.prepareStatement(sql);
            pst.setString(1,txtIdCodPerfil.getText());
            //Executar a consulta com a variavel rs
            rs = pst.executeQuery();
            if(rs.next()){
                txtIdCodPerfil.setText(rs.getString(1));
                txtDsNomePerfil.setText(rs.getString(2));
                txtCodNivelPerfil.setText(rs.getString(3));
            }else{
                txtIdCodPerfil.setText(null);
                txtDsNomePerfil.setText(null);
                txtCodNivelPerfil.setText(null);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"ERRO");
        }
    }
    
    private void adicionar() {
        String sql = "insert into tbperfil (idtbperfil, dsperfil, cdperfil) values (?,?,?))";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, null);   
            pst.setString(2,txtDsNomePerfil.getText());
            pst.setString(3,txtCodNivelPerfil.getText());
            int addOK = pst.executeUpdate();
            if(addOK > 0){
                JOptionPane.showMessageDialog(null, "Incluido com sucesso!!!");
                txtIdCodPerfil.setText(null);
                txtDsNomePerfil.setText(null);
                txtCodNivelPerfil.setText(null);
            }
        } catch (Exception e){
            JOptionPane(null,"ERRO");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        txtIdCodPerfil = new javax.swing.JTextField();
        txtDsNomePerfil = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        txtCodNivelPerfil = new javax.swing.JTextField();
        lblStatusDB = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro de perfil");
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(300, 113));

        jLabel1.setText("IdCodigo do perfil");

        jLabel2.setText("descrição do perfil");

        jLabel3.setText("Codigo do perfil");

        btnIncluir.setText("Incluir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        txtIdCodPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdCodPerfilActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        txtCodNivelPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodNivelPerfilActionPerformed(evt);
            }
        });

        lblStatusDB.setText("Conectado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(btnConsultar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFechar)
                            .addComponent(btnExcluir))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblStatusDB))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(2, 2, 2)
                                            .addComponent(jLabel1))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDsNomePerfil, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtIdCodPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCodNivelPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 90, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnIncluir)
                                .addGap(65, 65, 65)
                                .addComponent(btnAlterar)
                                .addGap(43, 43, 43)))))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblStatusDB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdCodPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDsNomePerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCodNivelPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIncluir)
                    .addComponent(btnAlterar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConsultar)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir)
                .addGap(33, 33, 33)
                .addComponent(btnFechar)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        setBounds(0, 0, 334, 443);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtIdCodPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdCodPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdCodPerfilActionPerformed

    private void txtCodNivelPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodNivelPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodNivelPerfilActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        // TODO add your handling code here:
        this.dispose();
        try{
            conexao.close();
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Erro eita bixo!!!!!!!!!");
        }
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        consultar();
    }//GEN-LAST:event_btnConsultarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblStatusDB;
    private javax.swing.JTextField txtCodNivelPerfil;
    private javax.swing.JTextField txtDsNomePerfil;
    private javax.swing.JTextField txtIdCodPerfil;
    // End of variables declaration//GEN-END:variables

    private void JOptionPane(Object object, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
