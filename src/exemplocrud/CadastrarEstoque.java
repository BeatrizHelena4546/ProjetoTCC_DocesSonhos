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

public class CadastrarEstoque extends javax.swing.JInternalFrame {
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    CadastrarEstoque() {
        initComponents();
        conexao = moduloConexao.connector;
        }

    private void localizaFunc(){
        String sql = "select * from estoque where idEstoque = ?";
        try{
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtID.getText());
            rs = pst.executeQuery();
            if(rs.next()){
                txtID.setText(rs.getString(1));
                txtProduto.setText(rs.getString(2));
                txtdtPedido.setText(rs.getString(3));
                txtdtEntrega.setText(rs.getString(4));
                txtqtd.setText(rs.getString(5));
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void salvar(){
        String sql = "insert into Funcionario (id, produto, dtPedido, dtEntrega, qtd) values (?,?,?,?,?)";
            try{
                pst = conexao.prepareStatement(sql);
                pst.setString(1, txtID.getText());
                pst.setString(2, txtProduto.getText());
                pst.setString(3, txtdtPedido.getText());
                pst.setString(4, txtdtEntrega.getText());
                pst.setString(6, txtqtd.getText());
                                
                if((txtProduto.getText().isEmpty()) || txtdtPedido.getText().isEmpty())  {
                    JOptionPane.showMessageDialog(null,"Preencha todos os campos");
            }
                int incluiAutorOK = pst.executeUpdate();
                if(incluiAutorOK > 0){
                   JOptionPane.showMessageDialog(null, "Perfil incluído com Sucesso!!!");
                    txtProduto.setText(null);
                    txtdtEntrega.setText(null);
                    txtqtd.setText(null);
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
            String sql = "delete from funcionario where idtautor = ?";
            try{
                //preparando o comando sql na conexão
                pst = conexao.prepareStatement(sql);
                pst.setString(1, txtID.getText());
                //executar a atualização/comando no banco
                int excluidoFuncOK = pst.executeUpdate();
                if(excluidoFuncOK > 0){
                   JOptionPane.showMessageDialog(null, "Excluído Com Sucesso!!!");
                    txtID.setText(null);
                    txtProduto.setText(null);
                    txtdtPedido.setText(null);
                    txtdtEntrega.setText(null);
                    txtqtd.setText(null);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    
    private void alterar(){
      
            String sql = "update funcionario set produto = ?, dtEntrega = ?, dtPedido = ? where funcionario = ?";
            try{
                //preparando o comando sql na conexão
                pst = conexao.prepareStatement(sql);
                pst.setString(1, txtID.getText());
                pst.setString(2, txtProduto.getText());
                pst.setString(3, txtdtPedido.getText());
                pst.setString(4, txtdtEntrega.getText());
                pst.setString(5, txtqtd.getText());
                
                if((txtProduto.getText().isEmpty()) || (txtdtPedido.getText().isEmpty()) || 
                        txtqtd.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Preencha todos os campos");
            }
                int alteradoFuncOK = pst.executeUpdate();
                if(alteradoFuncOK > 0){
                   JOptionPane.showMessageDialog(null, "Perfil alterado Com Sucesso!!!");
                    txtID.setText(null);
                    txtProduto.setText(null);
                    txtdtPedido.setText(null);
                    txtdtEntrega.setText(null);
                    txtqtd.setText(null);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    
    public CadastrarEstoque(int idAlteracao) {
        initComponents();
        conexao = moduloConexao.connector();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtID = new javax.swing.JTextField();
        txtProduto = new javax.swing.JTextField();
        txtdtPedido = new javax.swing.JTextField();
        txtqtd = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        txtdtEntrega = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 153, 102));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setForeground(java.awt.Color.white);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastrar Estoque");
        setToolTipText("");

        txtID.setEditable(false);
        txtID.setEnabled(false);

        txtProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdutoActionPerformed(evt);
            }
        });

        txtdtPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdtPedidoActionPerformed(evt);
            }
        });

        jLabel1.setText("ID:");

        jLabel2.setText("Produto:");

        jLabel4.setText("Data de pedido:");

        jLabel5.setText("Quantidade:");

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

        txtdtEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdtEntregaActionPerformed(evt);
            }
        });

        jLabel3.setText("Data de entrega:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtdtEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(56, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtdtPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btSalvar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btCancelar)
                                    .addGap(100, 100, 100))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtqtd, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel4, jLabel5});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtdtPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdtEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtqtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btCancelar))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdutoActionPerformed

    private void txtdtPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdtPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdtPedidoActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        salvar();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void txtdtEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdtEntregaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdtEntregaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtdtEntrega;
    private javax.swing.JTextField txtdtPedido;
    private javax.swing.JTextField txtqtd;
    // End of variables declaration//GEN-END:variables
}
