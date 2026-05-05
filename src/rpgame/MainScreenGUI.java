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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        playButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        playerCountField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));

        jPanel1.setBackground(Config.COLOR_BLACK);
        jPanel1.setForeground(Config.COLOR_BLACK);
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 300));
        jPanel1.setPreferredSize(Config.WINDOW_DIMENSION);
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 2, 48)); // NOI18N
        jLabel1.setForeground(Config.COLOR_YELLOW);
        jLabel1.setText("JAVENTURE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 108);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setForeground(Config.COLOR_YELLOW);
        jLabel2.setText("We don't care about name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel1.add(jLabel2, gridBagConstraints);

        playButton.setBackground(Config.COLOR_DARK_BLACK);
        playButton.setForeground(Config.COLOR_YELLOW);
        playButton.setText("Play");
        playButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));
        playButton.addActionListener(this::playButtonActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 115;
        gridBagConstraints.ipady = 34;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 6, 0, 0);
        jPanel1.add(playButton, gridBagConstraints);

        exitButton.setBackground(Config.COLOR_DARK_BLACK);
        exitButton.setForeground(Config.COLOR_YELLOW);
        exitButton.setText("Exit");
        exitButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));
        exitButton.addActionListener(this::exitButtonActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 119;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 110, 0);
        jPanel1.add(exitButton, gridBagConstraints);

        playerCountField.setBackground(Config.COLOR_DARK_BLACK);
        playerCountField.setForeground(Config.COLOR_YELLOW);
        playerCountField.setText("1");
        playerCountField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 3));
        playerCountField.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 6, 0, 0);
        jPanel1.add(playerCountField, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        try
        {
            if (playerCountField.getText() == null || Integer.parseInt(playerCountField.getText()) <= 0) {
                throw new InvalidPlayerCountException(this);
            }

            System.out.println("play button");

            playerCount = Integer.parseInt(playerCountField.getText());
            callback.setPlayerCount(playerCount);

            callback.setGUIState(GUIState.PLAYER_SELECTION, this.getLocation());
            playButton.setFocusPainted(false); //not necessary 
        } catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "String entry detected. Please enter an integer.", "Number Format Exception", JOptionPane.WARNING_MESSAGE);
        } catch (InvalidPlayerCountException e1)
        {
            e1.message();
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
