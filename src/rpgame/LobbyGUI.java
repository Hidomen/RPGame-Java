package rpgame;

import java.util.ArrayList;

public class LobbyGUI extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(LobbyGUI.class.getName());
    
    private static ArrayList<PlayerClass> players;
    private static GUICallback callback;    
  
    
    public LobbyGUI(GUICallback callback , ArrayList <PlayerClass> players) {
        initComponents();
        this.callback = callback;
        this.players = players;
        
        playersInit(players);     
    }
    
    @Override
    public void setVisible(boolean visible)
    {
        super.setVisible(visible);
        if (visible) {
            playersInit(players);
        }
    }

    public void playersInit(ArrayList<PlayerClass> players1) {
        javax.swing.DefaultListModel<String> listModel = new javax.swing.DefaultListModel<>();
        for (PlayerClass p : players1) {
            listModel.addElement(p.getEntityName());
        }
        jList1.setModel(listModel);     
    }
    

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        shopButton = new javax.swing.JButton();
        fightButton = new javax.swing.JButton();
        inventoryButton = new javax.swing.JButton();
        quitButton = new javax.swing.JButton();

        jButton2.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(Config.COLOR_BLACK);
        setForeground(Config.COLOR_BLACK);
        setPreferredSize(Config.WINDOW_DIMENSION);
        setResizable(false);

        jPanel1.setBackground(Config.COLOR_BLACK);
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(Config.COLOR_YELLOW, 2));

        jLabel1.setBackground(Config.COLOR_BLACK);
        jLabel1.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jLabel1.setForeground(Config.COLOR_YELLOW);
        jLabel1.setText("---------------------------------------------------------MAIN MENU----------------------------------------------------------------");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1229, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(Config.COLOR_BLACK);
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(Config.COLOR_YELLOW, 2));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(Config.COLOR_YELLOW);
        jLabel2.setText("Players :");

        jScrollPane1.setBorder(null);

        jList1.setBackground(Config.COLOR_BLACK);
        jList1.setBorder(null);
        jList1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jList1.setForeground(Config.COLOR_YELLOW);
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 252, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel3.setBackground(Config.COLOR_BLACK);
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(Config.COLOR_YELLOW, 2));

        shopButton.setBackground(Config.COLOR_BLACK);
        shopButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        shopButton.setForeground(Config.COLOR_YELLOW);
        shopButton.setText("Shop");
        shopButton.setBorder(javax.swing.BorderFactory.createLineBorder(Config.COLOR_YELLOW, 2));
        shopButton.addActionListener(this::shopButtonActionPerformed);

        fightButton.setBackground(Config.COLOR_BLACK);
        fightButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fightButton.setForeground(Config.COLOR_YELLOW);
        fightButton.setText("Fight");
        fightButton.setBorder(javax.swing.BorderFactory.createLineBorder(Config.COLOR_YELLOW, 2));
        fightButton.addActionListener(this::fightButtonActionPerformed);

        inventoryButton.setBackground(Config.COLOR_BLACK);
        inventoryButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        inventoryButton.setForeground(Config.COLOR_YELLOW);
        inventoryButton.setText("Inventory");
        inventoryButton.setBorder(javax.swing.BorderFactory.createLineBorder(Config.COLOR_YELLOW, 2));
        inventoryButton.addActionListener(this::inventoryButtonActionPerformed);

        quitButton.setBackground(Config.COLOR_BLACK);
        quitButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        quitButton.setForeground(Config.COLOR_YELLOW);
        quitButton.setText("Quit");
        quitButton.setBorder(javax.swing.BorderFactory.createLineBorder(Config.COLOR_YELLOW, 2));
        quitButton.addActionListener(this::quitButtonActionPerformed);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fightButton, javax.swing.GroupLayout.DEFAULT_SIZE, 1119, Short.MAX_VALUE)
                    .addComponent(shopButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inventoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, 1119, Short.MAX_VALUE)
                    .addComponent(quitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 1119, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inventoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(462, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fightButtonActionPerformed
        fightButton.setFocusPainted(false);
        callback.setGUIState(GUIState.COMBAT, this.getLocation());
    }//GEN-LAST:event_fightButtonActionPerformed

    private void shopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shopButtonActionPerformed
        shopButton.setFocusPainted(false);
        callback.setGUIState(GUIState.SHOP, this.getLocation());
    }//GEN-LAST:event_shopButtonActionPerformed

    private void inventoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventoryButtonActionPerformed
        inventoryButton.setFocusPainted(false);
        callback.setGUIState(GUIState.INVENTORY, this.getLocation());
    }//GEN-LAST:event_inventoryButtonActionPerformed

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        quitButton.setFocusPainted(false);
        callback.setGUIState(GUIState.EXIT, this.getLocation());
    }//GEN-LAST:event_quitButtonActionPerformed


    public static void main(String args[]) {

        
        java.awt.EventQueue.invokeLater(() -> new LobbyGUI(callback , players).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fightButton;
    private javax.swing.JButton inventoryButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton quitButton;
    private javax.swing.JButton shopButton;
    // End of variables declaration//GEN-END:variables
}
