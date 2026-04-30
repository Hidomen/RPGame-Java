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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        difficultyLabel = new javax.swing.JLabel();
        playAgainButton = new javax.swing.JButton();
        mainScreen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setMaximumSize(new java.awt.Dimension(1015, 700));
        setMinimumSize(new java.awt.Dimension(1015, 700));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("YOU DIED");

        difficultyLabel.setForeground(new java.awt.Color(255, 255, 0));
        difficultyLabel.setText("Difficulty:");

        playAgainButton.setText("One More");
        playAgainButton.addActionListener(this::playAgainButtonActionPerformed);

        mainScreen.setText("Main Screen");
        mainScreen.addActionListener(this::mainScreenActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(playAgainButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152)
                .addComponent(mainScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(210, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(352, 352, 352)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(difficultyLabel)
                        .addComponent(jLabel1))
                    .addContainerGap(489, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(354, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playAgainButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(196, 196, 196))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGap(18, 18, 18)
                    .addComponent(difficultyLabel)
                    .addContainerGap(618, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playAgainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playAgainButtonActionPerformed
        callback.setGUIState(GUIState.START_GAME);
    }//GEN-LAST:event_playAgainButtonActionPerformed

    private void mainScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainScreenActionPerformed
        
        callback.setGUIState(GUIState.MAIN_SCREEN);
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
