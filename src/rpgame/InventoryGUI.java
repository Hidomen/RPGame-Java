package rpgame;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class InventoryGUI extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(InventoryGUI.class.getName());
    
    private static GUICallback callback;
    private static Group group;
    private static ArrayList<Item> invItems;
    
    JPanel itemsPanel;
    
    public InventoryGUI(GUICallback callback, Group group ) {
        this.callback = callback;
        this.group = group;
        
        invItems = group.getInventory();
        
        initComponents();
        continueButton1.setFocusPainted(false);
        
        setupItems();
    }
    
    @Override
    public void setVisible(boolean visible)
    {
        super.setVisible(visible);
        if (visible) {
            setupItems();
            refreshAttributes();
        }
    }
    
    private void setupItems() {
        
        itemsPanel = new JPanel();
        itemsPanel.setBackground(new java.awt.Color(51, 51, 51));
        itemsPanel.setLayout(new BoxLayout(itemsPanel, BoxLayout.Y_AXIS));

        
        for (Item item : invItems) {
            JPanel itemRow = new JPanel();
            
            itemRow.setBackground(Config.colors[Config.COLOR_BLACK]);
            
            itemRow.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 5));
            itemRow.setMaximumSize(new Dimension(Integer.MAX_VALUE, 50));
            itemRow.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 0))); //magic

            JLabel itemLabel = new JLabel(item.getName());
            
            itemLabel.setForeground(Config.colors[Config.COLOR_YELLOW]);
            
            itemLabel.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 14)); //magic


            JLabel modLabel = new JLabel(item.toString());
            modLabel.setForeground(new java.awt.Color(180, 255, 180));
            modLabel.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 13));

            itemRow.add(itemLabel);
            itemRow.add(modLabel);
            itemsPanel.add(itemRow);
        }

        if (invItems.isEmpty()) {
            JLabel emptyLabel = new JLabel("Inventory is empty!");
            
            emptyLabel.setForeground(new java.awt.Color(255, 255, 0));
            emptyLabel.setFont(new java.awt.Font("Segoe UI", Font.ITALIC, 14));
            emptyLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
            itemsPanel.add(Box.createVerticalStrut(20));
            itemsPanel.add(emptyLabel);
        }

        itemsPanel.add(Box.createVerticalGlue());

        jScrollPane1.setViewportView(itemsPanel);
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);
        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.getViewport().setBackground(new java.awt.Color(51, 51, 51));
    }
    
    public int getTotalHealth()
    {
        if (invItems == null) {
            return 0;
        }
        int totalHealth = 0;
        for (Item i : invItems) {
            totalHealth += i.getHealthModifier();
        }
        return totalHealth;
    }
    
    public int getTotalAttack()
    {
        if (invItems == null) {
            return 0;
        }
        int totalAttack = 0;
        for (Item i : invItems) {
            totalAttack += i.getAttackModifier();
        }
        return totalAttack;
    }
    
    public int getTotalAbility()
    {
        if (invItems == null) {
            return 0;
        }
        int totalAbility = 0;
        for (Item i : invItems) {
            totalAbility += i.getAbilityModifier();
        }
        return totalAbility;
    }
    
    public int getTotalMana()
    {
        if (invItems == null) {
            return 0;
        }
        int totalMana = 0;
        for (Item i : invItems) {
            totalMana += i.getMaxManaModifier();
        }
        return totalMana;
    }

    public void refreshAttributes() //Everytime we buy it needs to be refreshed in order to work. DO NOT İNTERVENE!
    {
        healthLabel.setText("Health: " + getTotalHealth());

        attackLabel.setText("Attack: " + getTotalAttack());

        abilityLabel.setText("Ability: " + getTotalAbility());

        manaLabel.setText("Mana: " + getTotalMana());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        activeAttributesLabel = new javax.swing.JLabel();
        healthLabel = new javax.swing.JLabel();
        attackLabel = new javax.swing.JLabel();
        abilityLabel = new javax.swing.JLabel();
        manaLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        continueButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1015, 700));
        setMinimumSize(new java.awt.Dimension(1015, 700));
        setPreferredSize(new java.awt.Dimension(1015, 700));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 3));

        activeAttributesLabel.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        activeAttributesLabel.setForeground(new java.awt.Color(255, 255, 0));
        activeAttributesLabel.setText("Current Attributes");

        healthLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        healthLabel.setForeground(new java.awt.Color(255, 255, 0));
        healthLabel.setText("Health: " + getTotalHealth());

        attackLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        attackLabel.setForeground(new java.awt.Color(255, 255, 0));
        attackLabel.setText("Attack: " + getTotalAttack());

        abilityLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        abilityLabel.setForeground(new java.awt.Color(255, 255, 0));
        abilityLabel.setText("Ability: " + getTotalAbility());

        manaLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        manaLabel.setForeground(new java.awt.Color(255, 255, 0));
        manaLabel.setText("Mana: " + getTotalMana());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(activeAttributesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(healthLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(attackLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(abilityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(activeAttributesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(healthLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(attackLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(abilityLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manaLabel)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.LINE_END);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 3));
        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 3));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Inventory");

        continueButton1.setText("Continue");
        continueButton1.addActionListener(this::continueButton1ActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(continueButton1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(continueButton1)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void continueButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueButton1ActionPerformed
        callback.setGUIState(GUIState.LOBBY);
    }//GEN-LAST:event_continueButton1ActionPerformed


    public static void main(String args[]) {

        
        java.awt.EventQueue.invokeLater(() -> new InventoryGUI(callback , group).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel abilityLabel;
    private javax.swing.JLabel activeAttributesLabel;
    private javax.swing.JLabel attackLabel;
    private javax.swing.JButton continueButton1;
    private javax.swing.JLabel healthLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel manaLabel;
    // End of variables declaration//GEN-END:variables
}
