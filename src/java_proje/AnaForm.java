/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package java_proje;

/**
 *
 * @author musta
 */
public class AnaForm extends javax.swing.JFrame {

    /**
     * Creates new form AnaForm
     */
    public AnaForm() {
        initComponents();
        
        
    }public AnaForm(String GelenV){
        initComponents();
        lblAraDeger.setText(GelenV);
        lblAraDeger.setVisible(false);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnTaşKagitMakas = new javax.swing.JButton();
        btnOkculuk = new javax.swing.JButton();
        lblAraDeger = new javax.swing.JLabel();
        btnXOX = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(725, 600));
        setSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(234, 195, 195));

        jLabel1.setFont(new java.awt.Font("Britannic Bold", 2, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Oyun Kütüphanesi");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resmiler/bos.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resmiler/bos.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 754, 122);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resmiler/pokemaon.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(500, 310, 200, 155);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resmiler/rulet.png"))); // NOI18N
        jButton3.setText("RULET");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(60, 310, 194, 155);

        btnTaşKagitMakas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resmiler/taşkağitmakas.png"))); // NOI18N
        btnTaşKagitMakas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnTaşKagitMakas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaşKagitMakasActionPerformed(evt);
            }
        });
        getContentPane().add(btnTaşKagitMakas);
        btnTaşKagitMakas.setBounds(60, 140, 194, 162);

        btnOkculuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resmiler/okçuluk.png"))); // NOI18N
        btnOkculuk.setMinimumSize(new java.awt.Dimension(600, 600));
        btnOkculuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkculukActionPerformed(evt);
            }
        });
        getContentPane().add(btnOkculuk);
        btnOkculuk.setBounds(280, 220, 200, 162);
        getContentPane().add(lblAraDeger);
        lblAraDeger.setBounds(650, 110, 70, 50);

        btnXOX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resmiler/xox.png"))); // NOI18N
        btnXOX.setMinimumSize(new java.awt.Dimension(600, 600));
        btnXOX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXOXActionPerformed(evt);
            }
        });
        getContentPane().add(btnXOX);
        btnXOX.setBounds(500, 140, 200, 162);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
   
    
    private void btnTaşKagitMakasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaşKagitMakasActionPerformed
        
        new TasKagitMakas(lblAraDeger.getText()).setVisible(true);
        this.hide();


    }//GEN-LAST:event_btnTaşKagitMakasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new PokemonForm(lblAraDeger.getText()).setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnOkculukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkculukActionPerformed
        new OkculukAnaForm(lblAraDeger.getText()).setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnOkculukActionPerformed

    private void btnXOXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXOXActionPerformed
      new XOXForm(lblAraDeger.getText()).setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnXOXActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new Ruletform(lblAraDeger.getText()).setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])  {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaForm().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOkculuk;
    private javax.swing.JButton btnTaşKagitMakas;
    private javax.swing.JButton btnXOX;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAraDeger;
    // End of variables declaration//GEN-END:variables
}
