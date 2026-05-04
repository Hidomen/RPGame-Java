package rpgame;


public class GameOverGUI extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GameOverGUI.class.getName());

    
    private static GUICallback callback;
    private static int difficulty;
    
    public GameOverGUI(GUICallback callback, int difficulty) {
        
        this.callback = callback;
        this.difficulty = difficulty;
        
        
        
        initComponents();
        playAgainButton.setFocusPainted(false);
        difficultyLabel.setText("Difficulty: " + difficulty);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        difficultyLabel = new javax.swing.JLabel();
        playAgainButton = new javax.swing.JButton();
        mainScreen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setPreferredSize(Config.WINDOW_DIMENSION);
        setResizable(false);

        jPanel1.setBackground(Config.COLOR_BLACK);
        jPanel1.setPreferredSize(Config.WINDOW_DIMENSION);
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(Config.COLOR_YELLOW);
        jLabel1.setText("YOU DIED");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        difficultyLabel.setFont(Config.getFont(24, true)
        );
        difficultyLabel.setForeground(Config.COLOR_YELLOW);
        difficultyLabel.setText("Difficulty:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel1.add(difficultyLabel, gridBagConstraints);

        playAgainButton.setBackground(Config.COLOR_DARK_BLACK);
        playAgainButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        playAgainButton.setForeground(Config.COLOR_YELLOW);
        playAgainButton.setText("One More");
        playAgainButton.setBorder(javax.swing.BorderFactory.createLineBorder(Config.COLOR_YELLOW, 3));
        playAgainButton.addActionListener(this::playAgainButtonActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 23;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 6, 13, 0);
        jPanel1.add(playAgainButton, gridBagConstraints);

        mainScreen.setBackground(Config.COLOR_DARK_BLACK);
        mainScreen.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        mainScreen.setForeground(Config.COLOR_YELLOW);
        mainScreen.setText("Main Screen");
        mainScreen.setBorder(javax.swing.BorderFactory.createLineBorder(Config.COLOR_YELLOW, 3));
        mainScreen.addActionListener(this::mainScreenActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 6, 13, 7);
        jPanel1.add(mainScreen, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playAgainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playAgainButtonActionPerformed
        callback.setGUIState(GUIState.START_GAME, this.getLocation());
    }//GEN-LAST:event_playAgainButtonActionPerformed

    private void mainScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainScreenActionPerformed
        
        callback.setGUIState(GUIState.MAIN_SCREEN, this.getLocation());
    }//GEN-LAST:event_mainScreenActionPerformed

   
    public static void main(String args[]) {

        
        java.awt.EventQueue.invokeLater(() -> new GameOverGUI(callback, difficulty).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel difficultyLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mainScreen;
    private javax.swing.JButton playAgainButton;
    // End of variables declaration//GEN-END:variables
}
