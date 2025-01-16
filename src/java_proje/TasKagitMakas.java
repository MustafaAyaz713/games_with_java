/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package java_proje;

/**
 *
 * @author musta
 */
public class TasKagitMakas extends javax.swing.JFrame {

    /**
     * Creates new form TasKagitMakas
     */
    
    public TasKagitMakas() {
        initComponents();
        lblBiz.setVisible(true);  
    }
    
    public TasKagitMakas(String GelenV){
        initComponents();
        lbloyuncununseçimi.setText("Oyuncu: " + GelenV );
        lblOyuncu.setText(GelenV);
        lblSonuc.setVisible(false);
        lblSonuc.setText(GelenV + " kazandı");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        lblBiz = new javax.swing.JLabel();
        lblSonuc = new javax.swing.JLabel();
        btnBitir = new javax.swing.JButton();
        btnOyna = new javax.swing.JButton();
        btn = new javax.swing.JButton();
        lbloyuncununseçimi = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        lblPcSkor = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblOyuncu = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblOyuncuSkor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setMaximumSize(new java.awt.Dimension(700, 700));
        setMinimumSize(new java.awt.Dimension(700, 700));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(700, 700));
        setSize(new java.awt.Dimension(700, 700));
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel3.setName(""); // NOI18N
        jPanel3.setLayout(null);

        lblBiz.setFont(new java.awt.Font("Copperplate Gothic Light", 3, 48)); // NOI18N
        lblBiz.setText("M&M OYUN");
        jPanel3.add(lblBiz);
        lblBiz.setBounds(160, 10, 310, 110);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 10, 650, 130);

        lblSonuc.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblSonuc.setText("--");
        getContentPane().add(lblSonuc);
        lblSonuc.setBounds(210, 410, 180, 40);

        btnBitir.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnBitir.setText("BİTİR");
        btnBitir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBitirActionPerformed(evt);
            }
        });
        getContentPane().add(btnBitir);
        btnBitir.setBounds(500, 440, 140, 40);

        btnOyna.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnOyna.setText("OYNA");
        btnOyna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOynaActionPerformed(evt);
            }
        });
        getContentPane().add(btnOyna);
        btnOyna.setBounds(180, 330, 100, 70);

        btn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn.setBorderPainted(false);
        btn.setContentAreaFilled(false);
        getContentPane().add(btn);
        btn.setBounds(20, 250, 150, 110);

        lbloyuncununseçimi.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbloyuncununseçimi.setText("Oyuncunun Seçimi");
        getContentPane().add(lbloyuncununseçimi);
        lbloyuncununseçimi.setBounds(20, 160, 150, 40);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("DURUM:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(120, 410, 120, 40);

        btn2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn2.setBorderPainted(false);
        btn2.setContentAreaFilled(false);
        getContentPane().add(btn2);
        btn2.setBounds(290, 250, 150, 110);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Bilgisayarın Seçimi");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(290, 160, 150, 40);

        jComboBox3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TAŞ", "KAĞIT", "MAKAS" }));
        jComboBox3.setSelectedIndex(-1);
        jComboBox3.setActionCommand("comboBoxChanged\n");
        jComboBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox3İtemStateChanged(evt);
            }
        });
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(20, 200, 150, 40);

        jComboBox4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TAŞ", "KAĞIT", "MAKAS" }));
        jComboBox4.setSelectedIndex(-1);
        jComboBox4.setActionCommand("comboBoxChanged\n");
        jComboBox4.setEnabled(false);
        jComboBox4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox4İtemStateChanged(evt);
            }
        });
        getContentPane().add(jComboBox4);
        jComboBox4.setBounds(290, 200, 150, 40);

        jPanel1.setBackground(new java.awt.Color(250, 228, 250));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        lblPcSkor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblPcSkor.setText("0");
        jPanel1.add(lblPcSkor);
        lblPcSkor.setBounds(150, 100, 20, 40);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("SKOR:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(70, 10, 60, 40);

        lblOyuncu.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblOyuncu.setText("OYUNCU:");
        jPanel1.add(lblOyuncu);
        lblOyuncu.setBounds(10, 60, 140, 40);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("BİLGİSAYAR:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 100, 120, 40);

        lblOyuncuSkor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblOyuncuSkor.setText("0");
        jPanel1.add(lblOyuncuSkor);
        lblOyuncuSkor.setBounds(150, 60, 20, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(450, 150, 190, 220);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
   int oyuncuskor = 0, bilgisayarskor=0,oyuncu=0,bilgisayar =0;
   String ad ="";
   
   
    private void jComboBox3İtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox3İtemStateChanged
        if ("TAŞ".equals(String.valueOf(jComboBox3.getSelectedItem()))){
            btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resmiler/tas.png")));
            oyuncu= 0;
        } else if ("KAĞIT".equals(String.valueOf(jComboBox3.getSelectedItem()))){
            btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resmiler/kagıt.png")));
            oyuncu= 1;
        } else if ("MAKAS".equals(String.valueOf(jComboBox3.getSelectedItem()))){
             btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resmiler/makas.png")));
             oyuncu= 2;
        }
    }//GEN-LAST:event_jComboBox3İtemStateChanged

    private void btnOynaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOynaActionPerformed
        lblSonuc.setVisible(true);
        bilgisayar = (int)(Math.random()*3);
        jComboBox4.setSelectedIndex(bilgisayar);
        if( bilgisayar ==0 ){
            btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resmiler/tas.png")));
        }
        else if ( bilgisayar == 1){
            btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resmiler/kagıt.png")));
        }
        else if ( bilgisayar == 2){
            btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resmiler/makas.png")));
        }
        kontrol();
    }//GEN-LAST:event_btnOynaActionPerformed

    private void jComboBox4İtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox4İtemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4İtemStateChanged

    private void btnBitirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBitirActionPerformed
        AnaForm fr = new AnaForm();
        fr.show();
        this.hide();
        
    }//GEN-LAST:event_btnBitirActionPerformed

    public void kontrol(){
        if(oyuncu == 0 && bilgisayar == 0 || oyuncu == 1 && bilgisayar == 1 || oyuncu == 2 && bilgisayar == 2){
            lblSonuc.setText("Berabere");
        } else if(oyuncu == 0 && bilgisayar == 1 || oyuncu == 1 && bilgisayar == 2 || oyuncu == 2 && bilgisayar == 0 ){
            lblSonuc.setText("Bilgisayar Kazandı");
            bilgisayarskor++;
        }
        else if(oyuncu == 0 && bilgisayar == 2 || oyuncu == 1 && bilgisayar == 0 || oyuncu == 2 && bilgisayar == 1){
            lblSonuc.setText( " Oyuncu Kazandı");
            oyuncuskor++;
        }
        lblOyuncuSkor.setText(String.valueOf(oyuncuskor));
        lblPcSkor.setText(String.valueOf(bilgisayarskor));
    }
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
            java.util.logging.Logger.getLogger(TasKagitMakas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TasKagitMakas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TasKagitMakas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TasKagitMakas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TasKagitMakas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btnBitir;
    private javax.swing.JButton btnOyna;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblBiz;
    private javax.swing.JLabel lblOyuncu;
    private javax.swing.JLabel lblOyuncuSkor;
    private javax.swing.JLabel lblPcSkor;
    private javax.swing.JLabel lblSonuc;
    private javax.swing.JLabel lbloyuncununseçimi;
    // End of variables declaration//GEN-END:variables
}
