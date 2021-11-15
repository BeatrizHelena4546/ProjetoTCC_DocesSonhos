package exemplocrud;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        int TipoTela;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jdpPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        mnConsEstoque = new javax.swing.JMenuItem();
        mnConsFuncionario = new javax.swing.JRadioButtonMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnCadEstoque = new javax.swing.JRadioButtonMenuItem();
        mnCadFuncionario = new javax.swing.JRadioButtonMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jdpPrincipal.setBackground(new java.awt.Color(255, 153, 102));
        jdpPrincipal.setForeground(new java.awt.Color(255, 204, 102));

        javax.swing.GroupLayout jdpPrincipalLayout = new javax.swing.GroupLayout(jdpPrincipal);
        jdpPrincipal.setLayout(jdpPrincipalLayout);
        jdpPrincipalLayout.setHorizontalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
        );
        jdpPrincipalLayout.setVerticalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 334, Short.MAX_VALUE)
        );

        jMenu3.setText("Consultar");

        mnConsEstoque.setText("Estoque");
        mnConsEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnConsEstoqueActionPerformed(evt);
            }
        });
        jMenu3.add(mnConsEstoque);

        mnConsFuncionario.setSelected(true);
        mnConsFuncionario.setText("Funcionario");
        mnConsFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnConsFuncionarioActionPerformed(evt);
            }
        });
        jMenu3.add(mnConsFuncionario);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Cadastrar");

        mnCadEstoque.setSelected(true);
        mnCadEstoque.setText("Estoque");
        mnCadEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadEstoqueActionPerformed(evt);
            }
        });
        jMenu4.add(mnCadEstoque);

        mnCadFuncionario.setSelected(true);
        mnCadFuncionario.setText("Funcionario");
        mnCadFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadFuncionarioActionPerformed(evt);
            }
        });
        jMenu4.add(mnCadFuncionario);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnConsEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnConsEstoqueActionPerformed

        ConsultarEstoque consultarEstoque = new ConsultarEstoque(jdpPrincipal);
        this.jdpPrincipal.add(consultarEstoque);
        consultarEstoque.setVisible(true);
    }//GEN-LAST:event_mnConsEstoqueActionPerformed

    private void mnCadEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadEstoqueActionPerformed
        CadastrarEstoque cadastrarEstoque = new CadastrarEstoque();
        this.jdpPrincipal.add(cadastrarEstoque);
        cadastrarEstoque.setVisible(true);
        
    }//GEN-LAST:event_mnCadEstoqueActionPerformed

    private void mnConsFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnConsFuncionarioActionPerformed
        ConsultarCliente consultaCliente = new ConsultarCliente(jdpPrincipal);
        this.jdpPrincipal.add(consultaCliente);
        consultaCliente.setVisible(true);
    }//GEN-LAST:event_mnConsFuncionarioActionPerformed

    private void mnCadFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadFuncionarioActionPerformed
        CadastrarCliente cadastrarCliente = new CadastrarCliente();
        this.jdpPrincipal.add(cadastrarCliente);
        cadastrarCliente.setVisible(true);
    }//GEN-LAST:event_mnCadFuncionarioActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JDesktopPane jdpPrincipal;
    private javax.swing.JRadioButtonMenuItem mnCadEstoque;
    private javax.swing.JRadioButtonMenuItem mnCadFuncionario;
    private javax.swing.JMenuItem mnConsEstoque;
    private javax.swing.JRadioButtonMenuItem mnConsFuncionario;
    // End of variables declaration//GEN-END:variables
}
