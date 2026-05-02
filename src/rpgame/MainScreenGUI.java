package rpgame;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class MainScreenGUI extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MainScreenGUI.class.getName());
    
    
    private static GUICallback callback;
    private int playerCount;
    
    
    public MainScreenGUI(GUICallback callback) {
        this.callback = callback;
        initComponents();
        
        playerCount = 1;
        
        playButton.setFocusPainted(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        playButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        playerCountField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(Config.WINDOW_DIMENSION);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(Config.WINDOW_DIMENSION);

        jLabel1.setFont(new java.awt.Font("Arial", 2, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("JAVENTURE");

        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("We don't care about name");

        playButton.setBackground(new java.awt.Color(0, 0, 0));
        playButton.setForeground(new java.awt.Color(255, 255, 0));
        playButton.setText("Play");
        playButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));
        playButton.addActionListener(this::playButtonActionPerformed);

        exitButton.setBackground(new java.awt.Color(0, 0, 0));
        exitButton.setForeground(new java.awt.Color(255, 255, 0));
        exitButton.setText("Exit");
        exitButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));
        exitButton.addActionListener(this::exitButtonActionPerformed);

        playerCountField.setBackground(new java.awt.Color(0, 0, 0));
        playerCountField.setForeground(new java.awt.Color(255, 255, 0));
        playerCountField.setText("1");
        playerCountField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 3));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(playerCountField, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(258, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerCountField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 959, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        try
        {
            if (playerCountField.getText() == null || Integer.parseInt(playerCountField.getText()) <= 0) {
                JOptionPane.showMessageDialog(this, "Invalid number of players!", "Invalid Player Count", JOptionPane.WARNING_MESSAGE);
                return;
            }

            System.out.println("play button");

            playerCount = Integer.parseInt(playerCountField.getText());
            callback.setPlayerCount(playerCount);

            callback.setGUIState(GUIState.PLAYER_SELECTION, this.getLocation());
            playButton.setFocusPainted(false); //not necessary 
        } catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "Bruh you lowkey entered strings for player count.", "String ? Really ?", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_playButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        exitButton.setFocusPainted(false);
        callback.setGUIState(GUIState.EXIT, this.getLocation());
    }//GEN-LAST:event_exitButtonActionPerformed

    
    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(() -> new MainScreenGUI(callback).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton playButton;
    private javax.swing.JTextField playerCountField;
    // End of variables declaration//GEN-END:variables
}
