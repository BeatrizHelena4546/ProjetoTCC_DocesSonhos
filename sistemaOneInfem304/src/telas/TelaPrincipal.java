package telas;

import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDesktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        lblDataSistema = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblUserLogado = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnUtilitarios = new javax.swing.JMenu();
        mnCadastrosUsuarios = new javax.swing.JMenuItem();
        mnCadastroPerfil = new javax.swing.JMenuItem();
        mnFazerMedias = new javax.swing.JMenu();
        mnFazerMedia = new javax.swing.JMenuItem();
        mnUtiltarios = new javax.swing.JMenu();
        mnVerNumerosPares = new javax.swing.JMenuItem();
        mnUtilitariosCalculadora = new javax.swing.JMenuItem();
        mnAjuda = new javax.swing.JMenu();
        mnAjudaHelp = new javax.swing.JMenuItem();
        mnAjudaSobre = new javax.swing.JMenuItem();
        mnSair = new javax.swing.JMenu();
        mnSairExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SistemaUm304");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        pnlDesktop.setBackground(new java.awt.Color(51, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tela Principal");

        pnlDesktop.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pnlDesktopLayout = new javax.swing.GroupLayout(pnlDesktop);
        pnlDesktop.setLayout(pnlDesktopLayout);
        pnlDesktopLayout.setHorizontalGroup(
            pnlDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDesktopLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel1)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        pnlDesktopLayout.setVerticalGroup(
            pnlDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDesktopLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblDataSistema.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDataSistema.setForeground(new java.awt.Color(102, 0, 0));
        lblDataSistema.setText("DataSistema");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Usuario Logado");

        lblUserLogado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUserLogado.setForeground(new java.awt.Color(0, 0, 153));
        lblUserLogado.setText("usuario");

        mnUtilitarios.setText("Cadastros");
        mnUtilitarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnUtilitariosActionPerformed(evt);
            }
        });

        mnCadastrosUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        mnCadastrosUsuarios.setText("Usuarios");
        mnCadastrosUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadastrosUsuariosActionPerformed(evt);
            }
        });
        mnUtilitarios.add(mnCadastrosUsuarios);

        mnCadastroPerfil.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        mnCadastroPerfil.setText("Perfil");
        mnCadastroPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadastroPerfilActionPerformed(evt);
            }
        });
        mnUtilitarios.add(mnCadastroPerfil);

        jMenuBar1.add(mnUtilitarios);

        mnFazerMedias.setText("Medias");

        mnFazerMedia.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        mnFazerMedia.setText("Fazer Medias");
        mnFazerMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnFazerMediaActionPerformed(evt);
            }
        });
        mnFazerMedias.add(mnFazerMedia);

        jMenuBar1.add(mnFazerMedias);

        mnUtiltarios.setText("Utilitarios");

        mnVerNumerosPares.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        mnVerNumerosPares.setText("Ver Numeros Pares");
        mnVerNumerosPares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnVerNumerosParesActionPerformed(evt);
            }
        });
        mnUtiltarios.add(mnVerNumerosPares);

        mnUtilitariosCalculadora.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        mnUtilitariosCalculadora.setText("Calculadora");
        mnUtilitariosCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnUtilitariosCalculadoraActionPerformed(evt);
            }
        });
        mnUtiltarios.add(mnUtilitariosCalculadora);

        jMenuBar1.add(mnUtiltarios);

        mnAjuda.setText("Ajuda");

        mnAjudaHelp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mnAjudaHelp.setText("Help");
        mnAjudaHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAjudaHelpActionPerformed(evt);
            }
        });
        mnAjuda.add(mnAjudaHelp);

        mnAjudaSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        mnAjudaSobre.setText("Sobre");
        mnAjudaSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAjudaSobreActionPerformed(evt);
            }
        });
        mnAjuda.add(mnAjudaSobre);

        jMenuBar1.add(mnAjuda);

        mnSair.setText("Sair");
        mnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSairActionPerformed(evt);
            }
        });

        mnSairExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK));
        mnSairExit.setText("Exit");
        mnSairExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSairExitActionPerformed(evt);
            }
        });
        mnSair.add(mnSairExit);

        jMenuBar1.add(mnSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlDesktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lblDataSistema))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(lblUserLogado)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblDataSistema)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(58, 58, 58)
                .addComponent(lblUserLogado)
                .addGap(86, 86, 86))
            .addComponent(pnlDesktop)
        );

        setSize(new java.awt.Dimension(494, 477));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnAjudaHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAjudaHelpActionPerformed
        // TODO add your handling code here:
        TelaAjuda ajuda = new TelaAjuda();
        ajuda.setVisible(true);
    }//GEN-LAST:event_mnAjudaHelpActionPerformed

    private void mnSairExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSairExitActionPerformed
        // TODO add your handling code here:
        int sair = JOptionPane.showConfirmDialog(null,"Você tem certeza????????", "ATENÇAO", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
   
    }//GEN-LAST:event_mnSairExitActionPerformed

    private void mnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnSairActionPerformed

    private void mnVerNumerosParesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnVerNumerosParesActionPerformed
        // TODO add your handling code here:
        TelaNumPar NumPar = new TelaNumPar();
        NumPar.setVisible(true);
    }//GEN-LAST:event_mnVerNumerosParesActionPerformed

    private void mnUtilitariosCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnUtilitariosCalculadoraActionPerformed
        // TODO add your handling code here:
        TelaCalculadora calcul = new TelaCalculadora();
        calcul.setVisible(true);
    }//GEN-LAST:event_mnUtilitariosCalculadoraActionPerformed

    private void mnFazerMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnFazerMediaActionPerformed
        // TODO add your handling code here:
        TelaMedias tl_media = new TelaMedias();
        tl_media.setVisible(true);
    }//GEN-LAST:event_mnFazerMediaActionPerformed

    private void mnCadastrosUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadastrosUsuariosActionPerformed
        // TODO add your handling code here:
        TelaUsuario tlusuario = new TelaUsuario();
        tlusuario.setVisible(true);
        pnlDesktop.add(tlusuario);
    }//GEN-LAST:event_mnCadastrosUsuariosActionPerformed

    private void mnAjudaSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAjudaSobreActionPerformed
        // TODO add your handling code here:
        TelaSobre sobre = new TelaSobre();
        sobre.setVisible(true);
    }//GEN-LAST:event_mnAjudaSobreActionPerformed

    private void mnCadastroPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadastroPerfilActionPerformed
        // TODO add your handling code here:
        TelaPerfil tlperfil = new TelaPerfil();
        tlperfil.setVisible(true);
        pnlDesktop.add(tlperfil);
    }//GEN-LAST:event_mnCadastroPerfilActionPerformed

    private void mnUtilitariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnUtilitariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnUtilitariosActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
        lblDataSistema.setText(formatador.format(data));
    }//GEN-LAST:event_formWindowActivated

    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblDataSistema;
    public static javax.swing.JLabel lblUserLogado;
    private javax.swing.JMenu mnAjuda;
    private javax.swing.JMenuItem mnAjudaHelp;
    private javax.swing.JMenuItem mnAjudaSobre;
    private javax.swing.JMenuItem mnCadastroPerfil;
    private javax.swing.JMenuItem mnCadastrosUsuarios;
    private javax.swing.JMenuItem mnFazerMedia;
    private javax.swing.JMenu mnFazerMedias;
    private javax.swing.JMenu mnSair;
    private javax.swing.JMenuItem mnSairExit;
    private javax.swing.JMenu mnUtilitarios;
    private javax.swing.JMenuItem mnUtilitariosCalculadora;
    private javax.swing.JMenu mnUtiltarios;
    private javax.swing.JMenuItem mnVerNumerosPares;
    private javax.swing.JDesktopPane pnlDesktop;
    // End of variables declaration//GEN-END:variables
}
