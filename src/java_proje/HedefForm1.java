/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package java_proje;


/**
 *
 * @author musta
 */
public class HedefForm1 extends javax.swing.JFrame {

    /**
     * Creates new form HedefForm
     */
    public HedefForm1() {
        initComponents();
    }
    public HedefForm1(String GelenPuan1, String GelenPuan2,String GelenPuan3){
        initComponents();
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        lblBes.setVisible(false);
        lblAlti.setVisible(false);
        lblYedi.setVisible(false);
        lblSekiz.setVisible(false);
        lblDokuz.setVisible(false);
        lblOn.setVisible(false);
       
        if(GelenPuan1.equals("5") || GelenPuan2.equals("5") || GelenPuan3.equals("5")){
             lblBes.setVisible(true);
        }
        if(GelenPuan1.equals("6")|| GelenPuan2.equals("6") || GelenPuan3.equals("6")){
            lblAlti.setVisible(true);
        } if(GelenPuan1.equals("7")|| GelenPuan2.equals("7") || GelenPuan3.equals("7")){
            lblYedi.setVisible(true);
        } if(GelenPuan1.equals("8")|| GelenPuan2.equals("8") || GelenPuan3.equals("8")){
            lblSekiz.setVisible(true);
        } if (GelenPuan1.equals("9")|| GelenPuan2.equals("9") || GelenPuan3.equals("9")){
            lblDokuz.setVisible(true);
        }if(GelenPuan1.equals("10")|| GelenPuan2.equals("10") || GelenPuan3.equals("10")){
            lblOn.setVisible(true);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDokuz = new javax.swing.JLabel();
        lblYedi = new javax.swing.JLabel();
        lblOn = new javax.swing.JLabel();
        lblBes = new javax.swing.JLabel();
        lblAlti = new javax.swing.JLabel();
        lblSekiz = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(730, 600));
        setMinimumSize(new java.awt.Dimension(730, 600));
        setPreferredSize(new java.awt.Dimension(730, 600));
        setSize(new java.awt.Dimension(730, 600));
        getContentPane().setLayout(null);

        lblDokuz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resmiler/chevron.png"))); // NOI18N
        getContentPane().add(lblDokuz);
        lblDokuz.setBounds(350, 310, 40, 40);

        lblYedi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resmiler/chevron.png"))); // NOI18N
        getContentPane().add(lblYedi);
        lblYedi.setBounds(390, 400, 40, 30);

        lblOn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resmiler/chevron.png"))); // NOI18N
        getContentPane().add(lblOn);
        lblOn.setBounds(312, 260, 40, 30);

        lblBes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resmiler/chevron.png"))); // NOI18N
        getContentPane().add(lblBes);
        lblBes.setBounds(102, 370, 40, 30);

        lblAlti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resmiler/chevron.png"))); // NOI18N
        getContentPane().add(lblAlti);
        lblAlti.setBounds(530, 190, 40, 30);

        lblSekiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resmiler/chevron.png"))); // NOI18N
        getContentPane().add(lblSekiz);
        lblSekiz.setBounds(440, 270, 40, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resmiler/hedefbüyük.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(700, 500));
        jLabel1.setMinimumSize(new java.awt.Dimension(700, 500));
        jLabel1.setPreferredSize(new java.awt.Dimension(700, 500));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(HedefForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HedefForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HedefForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HedefForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HedefForm1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAlti;
    private javax.swing.JLabel lblBes;
    private javax.swing.JLabel lblDokuz;
    private javax.swing.JLabel lblOn;
    private javax.swing.JLabel lblSekiz;
    private javax.swing.JLabel lblYedi;
    // End of variables declaration//GEN-END:variables
}
