package rpgame;


public class GameOverGUI extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GameOverGUI.class.getName());

    
    private static GUICallback callback;
    private static int difficulty;
    
    public GameOverGUI(GUICallback callback, int difficulty) {
        
        this.callback = callback;
        this.difficulty = difficulty;
        
        
        
        initComponents();
        
        difficultyLabel.setText("Difficulty: " + difficulty);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        difficultyLabel = new javax.swing.JLabel();
        playAgainButton = new javax.swing.JButton();
        mainScreen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("YOU DIED");

        difficultyLabel.setText("Difficulty:");

        playAgainButton.setText("One More");
        playAgainButton.addActionListener(this::playAgainButtonActionPerformed);

        mainScreen.setText("Main Screen");
        mainScreen.addActionListener(this::mainScreenActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(difficultyLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(playAgainButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(mainScreen)
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addComponent(difficultyLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playAgainButton)
                    .addComponent(mainScreen))
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playAgainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playAgainButtonActionPerformed
        callback.setGUIState(GUIState.START_GAME);
    }//GEN-LAST:event_playAgainButtonActionPerformed

    private void mainScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainScreenActionPerformed
        
        callback.setGUIState(GUIState.MAIN_SCREEN);
    }//GEN-LAST:event_mainScreenActionPerformed

   
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new GameOverGUI(callback, difficulty).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel difficultyLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton mainScreen;
    private javax.swing.JButton playAgainButton;
    // End of variables declaration//GEN-END:variables
}
