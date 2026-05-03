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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        difficultyLabel = new javax.swing.JLabel();
        playAgainButton = new javax.swing.JButton();
        mainScreen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setPreferredSize(Config.WINDOW_DIMENSION);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(Config.WINDOW_DIMENSION);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("YOU DIED");

        difficultyLabel.setFont(Config.getFont(24, true)
        );
        difficultyLabel.setForeground(new java.awt.Color(255, 255, 0));
        difficultyLabel.setText("Difficulty:");

        playAgainButton.setBackground(new java.awt.Color(0, 0, 0));
        playAgainButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        playAgainButton.setForeground(new java.awt.Color(255, 255, 0));
        playAgainButton.setText("One More");
        playAgainButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 3));
        playAgainButton.addActionListener(this::playAgainButtonActionPerformed);

        mainScreen.setBackground(new java.awt.Color(0, 0, 0));
        mainScreen.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        mainScreen.setForeground(new java.awt.Color(255, 255, 0));
        mainScreen.setText("Main Screen");
        mainScreen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 3));
        mainScreen.addActionListener(this::mainScreenActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(difficultyLabel)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(playAgainButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mainScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(difficultyLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mainScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playAgainButton, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

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
