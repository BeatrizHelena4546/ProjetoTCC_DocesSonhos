package exemplocrud;

import acessoDados.moduloConexao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;

public class CadastrarCliente extends javax.swing.JInternalFrame {
    
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    private void localizaFunc(){
        String sql = "select * from funcionario where idFuncionario = ?";
        try{
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtID.getText());
            rs = pst.executeQuery();
            if(rs.next()){
                txtID.setText(rs.getString(1));
                txtNomeFunc.setText(rs.getString(2));
                txtDataNasc.setText(rs.getString(3));
                txtCPF.setText(rs.getString(4));
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void salvar(){
        String sql = "insert into funcionario (idFuncionario, nome, dtnascimento, CPF) values (?,?,?,?)";
            try{
                //preparando o comando sql na conexão
                pst = conexao.prepareStatement(sql);
                pst.setString(1, null);
                pst.setString(2, txtNomeFunc.getText());
                pst.setString(3, txtDataNasc.getText());
                pst.setString(4, txtCPF.getText());
                
                
                if((txtNomeFunc.getText().isEmpty()) || (txtDataNasc.getText().isEmpty()) || 
                        (txtCPF.getText().isEmpty()))  {
                    JOptionPane.showMessageDialog(null,"Preencha todos os campos");
            }
                int incluiFuncOK = pst.executeUpdate();
                if(incluiFuncOK > 0){
                   JOptionPane.showMessageDialog(null, "Perfil incluído com Sucesso!!!");
                    txtNomeFunc.setText(null);
                    txtDataNasc.setText(null);
                    txtCPF.setText(null);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
    }
    
    private void excluir(){
        int excluiOK = JOptionPane.showConfirmDialog(null, "Você deseja realmente excluir? ","Atenção!!!",
                YES_NO_OPTION);
        if(excluiOK == JOptionPane.YES_OPTION){
            System.exit(0);
            String sql = "delete from funcionario where idFuncionario = ?";
            try{
                //preparando o comando sql na conexão
                pst = conexao.prepareStatement(sql);
                pst.setString(1, txtID.getText());
                //executar a atualização/comando no banco
                int excluidoFuncOK = pst.executeUpdate();
                if(excluidoFuncOK > 0){
                   JOptionPane.showMessageDialog(null, "Excluído Com Sucesso!!!");
                    txtNomeFunc.setText(null);
                    txtDataNasc.setText(null);
                    txtCPF.setText(null);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    
    private void alterar(){
      
            String sql = "update funcionario set nome = ?, CPF = ?, dtnascimento = ? where idFuncionario = ?";
            try{
                //preparando o comando sql na conexão
                pst = conexao.prepareStatement(sql);
                pst.setString(1, txtID.getText());
                pst.setString(2, txtNomeFunc.getText());
                pst.setString(3, txtDataNasc.getText());
                pst.setString(4, txtCPF.getText());
                
                if((txtNomeFunc.getText().isEmpty()) || (txtDataNasc.getText().isEmpty()) || 
                        txtCPF.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Preencha todos os campos");
            }
                int alteradoFuncOK = pst.executeUpdate();
                if(alteradoFuncOK > 0){
                   JOptionPane.showMessageDialog(null, "Perfil alterado Com Sucesso!!!");
                    txtID.setText(null);
                    txtNomeFunc.setText(null);
                    txtDataNasc.setText(null);
                    txtCPF.setText(null);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    
    
    public CadastrarCliente() {
        initComponents();
        conexao = moduloConexao.connector();
    }
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNomeFunc = new javax.swing.JTextField();
        txtDataNasc = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 153, 102));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setForeground(java.awt.Color.white);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastrar Funcionario");
        setToolTipText("");

        btSalvar.setBackground(new java.awt.Color(153, 0, 0));
        btSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btCancelar.setBackground(new java.awt.Color(153, 0, 0));
        btCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        jLabel5.setText("ID:");

        jLabel6.setText("Nome:");

        jLabel7.setText("Data de nascimento:");

        jLabel8.setText("CPF:");

        txtID.setEditable(false);
        txtID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        txtNomeFunc.setToolTipText("");
        txtNomeFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeFuncActionPerformed(evt);
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
                        .addComponent(btSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 178, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btCancelar))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        salvar();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void txtNomeFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeFuncActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtDataNasc;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNomeFunc;
    // End of variables declaration//GEN-END:variables
}
