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
        java.awt.GridBagConstraints gridBagConstraints;

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        padding = new javax.swing.JPanel();
        fightButton = new javax.swing.JButton();
        padding2 = new javax.swing.JPanel();
        padding3 = new javax.swing.JPanel();
        shopButton = new javax.swing.JButton();
        padding4 = new javax.swing.JPanel();
        padding5 = new javax.swing.JPanel();
        inventoryButton = new javax.swing.JButton();
        padding6 = new javax.swing.JPanel();
        padding7 = new javax.swing.JPanel();
        quitButton = new javax.swing.JButton();
        padding8 = new javax.swing.JPanel();

        jButton2.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(new java.awt.Color(51, 51, 51));
        setPreferredSize(Config.WINDOW_DIMENSION);
        setResizable(false);

        jPanel1.setBackground(Config.COLOR_BLACK);
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(Config.COLOR_YELLOW, 2));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jLabel1.setForeground(Config.COLOR_YELLOW);
        jLabel1.setText("MAIN MENU");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(478, 478, 478))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
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
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel3.setBackground(Config.COLOR_BLACK);
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(Config.COLOR_YELLOW, 2));
        jPanel3.setLayout(new java.awt.GridLayout(4, 2, 0, 10));

        padding.setBackground(Config.COLOR_BLACK);

        javax.swing.GroupLayout paddingLayout = new javax.swing.GroupLayout(padding);
        padding.setLayout(paddingLayout);
        paddingLayout.setHorizontalGroup(
            paddingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 213, Short.MAX_VALUE)
        );
        paddingLayout.setVerticalGroup(
            paddingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );

        jPanel3.add(padding);

        fightButton.setBackground(Config.COLOR_DARK_BLACK);
        fightButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fightButton.setForeground(Config.COLOR_YELLOW);
        fightButton.setText("Fight");
        fightButton.setBorder(javax.swing.BorderFactory.createLineBorder(Config.COLOR_YELLOW, 2));
        fightButton.addActionListener(this::fightButtonActionPerformed);
        jPanel3.add(fightButton);

        padding2.setBackground(Config.COLOR_BLACK);

        javax.swing.GroupLayout padding2Layout = new javax.swing.GroupLayout(padding2);
        padding2.setLayout(padding2Layout);
        padding2Layout.setHorizontalGroup(
            padding2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 213, Short.MAX_VALUE)
        );
        padding2Layout.setVerticalGroup(
            padding2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );

        jPanel3.add(padding2);

        padding3.setBackground(Config.COLOR_BLACK);

        javax.swing.GroupLayout padding3Layout = new javax.swing.GroupLayout(padding3);
        padding3.setLayout(padding3Layout);
        padding3Layout.setHorizontalGroup(
            padding3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 213, Short.MAX_VALUE)
        );
        padding3Layout.setVerticalGroup(
            padding3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );

        jPanel3.add(padding3);

        shopButton.setBackground(Config.COLOR_DARK_BLACK);
        shopButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        shopButton.setForeground(Config.COLOR_YELLOW);
        shopButton.setText("Shop");
        shopButton.setBorder(javax.swing.BorderFactory.createLineBorder(Config.COLOR_YELLOW, 2));
        shopButton.addActionListener(this::shopButtonActionPerformed);
        jPanel3.add(shopButton);

        padding4.setBackground(Config.COLOR_BLACK);

        javax.swing.GroupLayout padding4Layout = new javax.swing.GroupLayout(padding4);
        padding4.setLayout(padding4Layout);
        padding4Layout.setHorizontalGroup(
            padding4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 213, Short.MAX_VALUE)
        );
        padding4Layout.setVerticalGroup(
            padding4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );

        jPanel3.add(padding4);

        padding5.setBackground(Config.COLOR_BLACK);

        javax.swing.GroupLayout padding5Layout = new javax.swing.GroupLayout(padding5);
        padding5.setLayout(padding5Layout);
        padding5Layout.setHorizontalGroup(
            padding5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 213, Short.MAX_VALUE)
        );
        padding5Layout.setVerticalGroup(
            padding5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );

        jPanel3.add(padding5);

        inventoryButton.setBackground(Config.COLOR_DARK_BLACK);
        inventoryButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        inventoryButton.setForeground(Config.COLOR_YELLOW);
        inventoryButton.setText("Inventory");
        inventoryButton.setBorder(javax.swing.BorderFactory.createLineBorder(Config.COLOR_YELLOW, 2));
        inventoryButton.addActionListener(this::inventoryButtonActionPerformed);
        jPanel3.add(inventoryButton);

        padding6.setBackground(Config.COLOR_BLACK);

        javax.swing.GroupLayout padding6Layout = new javax.swing.GroupLayout(padding6);
        padding6.setLayout(padding6Layout);
        padding6Layout.setHorizontalGroup(
            padding6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 213, Short.MAX_VALUE)
        );
        padding6Layout.setVerticalGroup(
            padding6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );

        jPanel3.add(padding6);

        padding7.setBackground(Config.COLOR_BLACK);

        javax.swing.GroupLayout padding7Layout = new javax.swing.GroupLayout(padding7);
        padding7.setLayout(padding7Layout);
        padding7Layout.setHorizontalGroup(
            padding7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 213, Short.MAX_VALUE)
        );
        padding7Layout.setVerticalGroup(
            padding7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );

        jPanel3.add(padding7);

        quitButton.setBackground(Config.COLOR_DARK_BLACK);
        quitButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        quitButton.setForeground(Config.COLOR_YELLOW);
        quitButton.setText("Quit");
        quitButton.setBorder(javax.swing.BorderFactory.createLineBorder(Config.COLOR_YELLOW, 2));
        quitButton.addActionListener(this::quitButtonActionPerformed);
        jPanel3.add(quitButton);

        padding8.setBackground(Config.COLOR_BLACK);

        javax.swing.GroupLayout padding8Layout = new javax.swing.GroupLayout(padding8);
        padding8.setLayout(padding8Layout);
        padding8Layout.setHorizontalGroup(
            padding8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 213, Short.MAX_VALUE)
        );
        padding8Layout.setVerticalGroup(
            padding8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );

        jPanel3.add(padding8);

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
    private javax.swing.JPanel padding;
    private javax.swing.JPanel padding2;
    private javax.swing.JPanel padding3;
    private javax.swing.JPanel padding4;
    private javax.swing.JPanel padding5;
    private javax.swing.JPanel padding6;
    private javax.swing.JPanel padding7;
    private javax.swing.JPanel padding8;
    private javax.swing.JButton quitButton;
    private javax.swing.JButton shopButton;
    // End of variables declaration//GEN-END:variables
}
