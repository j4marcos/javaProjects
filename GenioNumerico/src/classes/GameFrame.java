/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package classes;

/**
 *
 * @author j4marcos
 */
public class GameFrame extends javax.swing.JFrame {

    /**
     * Creates new form GameFrame
     */
    
    int genioNumber = (int) (1+Math.random()*(10-1));
    
    public GameFrame() {
        System.out.println(System.getProperties());
        initComponents();
        System.out.println("");
        btnTry.requestFocus();     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTry = new javax.swing.JButton();
        genioMsg = new javax.swing.JLabel();
        numberInput = new javax.swing.JSpinner();
        backgroundImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Genio Numerico");
        setIconImages(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTry.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnTry.setText("tentar");
        btnTry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTryActionPerformed(evt);
            }
        });
        getContentPane().add(btnTry, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, -1));

        genioMsg.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        genioMsg.setForeground(new java.awt.Color(255, 255, 255));
        genioMsg.setFocusCycleRoot(true);
        getContentPane().add(genioMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 200, 30));

        numberInput.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        getContentPane().add(numberInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 80, 30));

        backgroundImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Capture.PNG"))); // NOI18N
        backgroundImg.setFocusable(false);
        getContentPane().add(backgroundImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTryActionPerformed
        int n = Integer.parseInt(numberInput.getValue().toString());
        if (n == genioNumber ) {
            genioMsg.setText("acertou!");
        } else {
            String dica = n < genioNumber ? "é maior.": "é menor.";
            genioMsg.setText("errooouu! " + dica);
        }
        
    }//GEN-LAST:event_btnTryActionPerformed

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
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundImg;
    private javax.swing.JButton btnTry;
    private javax.swing.JLabel genioMsg;
    private javax.swing.JSpinner numberInput;
    // End of variables declaration//GEN-END:variables
}