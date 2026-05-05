package rpgame;
import javax.swing.*;
import java.awt.*;
import static rpgame.Classes.*;
import java.util.ArrayList;

public class ShopGUI extends javax.swing.JFrame { 
    
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ShopGUI.class.getName());

    private static GUICallback callback;
    
    private static Group group;
    
    
    private static final ArrayList<Item> itemList = new ArrayList<>(){{
    
        //WEAPONS                                                                               HEALTH, ATTACK, ABILITY, MANA
        add(new Item("Dual Daggers",80 , new Classes[] {Archer},                                new int[] { 0 , 9 , 7 , 0 }));
        add(new Item("Crossbow",    85 , new Classes[] {Archer},                                new int[] { 0 , 14, 8 , 0 }));
        add(new Item("Long Sword",  90 , new Classes[] {Warrior},                               new int[] { 0 , 8 , 0 , 0 }));
        add(new Item("Blessed Mace",95 , new Classes[] {Healer},                                new int[] { 0 , 2 , 7 , 0 }));
        add(new Item("Hunter Bow",  95 , new Classes[] {Archer},                                new int[] { 0 , 12, 0 , 0 }));
        add(new Item("Arcane Wand", 100, new Classes[] {Mage},                                  new int[] { 0 , -5, 10, 1 }));
        add(new Item("Divine Staff",105, new Classes[] {Healer, Mage},                          new int[] { 0 , 0 , 10, 2 }));
        add(new Item("Battle Axe",  110, new Classes[] {Warrior},                               new int[] { 0 , 12, 3 , 0 }));
        add(new Item("War Hammer",  115, new Classes[] {Warrior, Healer},                       new int[] { 8 , 10, 8 , 0 }));
        add(new Item("Crystal Orb", 120, new Classes[] {Mage},                                  new int[] { 0 , 8 , 7 , 1 }));
        
        // ARMORS
        add(new Item("Cloth Robe",          60 , new Classes[] {Mage},                          new int[] { 5 , 0 , 0 , 3 }));
        add(new Item("Leather Armor",       70 , new Classes[] {Archer},                        new int[] { 6 , 0 , 0 , 0 }));
        add(new Item("Holy Vestments",      75 , new Classes[] {Healer},                        new int[] { 8 , 0 , 0 , 3 }));
        add(new Item("Ranger Vest",         85 , new Classes[] {Archer},                        new int[] { 9 , 0 , 0 , 0 }));
        add(new Item("Shadow Cloak",        95 , new Classes[] {Archer, Mage},                  new int[] { 9 , 0 , 0 , 1 }));
        add(new Item("Iron Armor",          100, new Classes[] {Warrior},                       new int[] { 10, 0 , 0 , 0 }));
        add(new Item("Mystic Robe",         110, new Classes[] {Mage, Healer},                  new int[] { 12, 0 , 0 , 4 }));
        add(new Item("Knight Plate",        130, new Classes[] {Warrior, Healer},               new int[] { 13, 0 , 0 , 0 }));
        add(new Item("Enchanted Armor",     140, new Classes[] {Warrior, Mage, Healer, Archer}, new int[] { 15, 0 , 0 , 2 }));
        add(new Item("Dragon Scale Armor",  150, new Classes[] {Warrior},                       new int[] { 20, 0 , 0 , 0 }));

    }};
            
    private static ArrayList<Item> goodies;
    
    public ShopGUI(GUICallback callback, Group group) {
        
        this.callback = callback;
        this.group = group;
        
        resetShop();
        
        initComponents();
        
        moneyLabel.setText(group.getMoney() + "$");
        setupItems();
        continueButton.setFocusPainted(false);
        
        
    }
    

    public void resetShop(){
        goodies = new ArrayList <> (itemList);
    }

    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        if(visible) {
            moneyLabel.setText(group.getMoney() + "$");
        }
    }    
    
    private void buyActionListener(Item item , JPanel wrapper){
 
        buyButton.addActionListener(e -> 
            {
                try
                {
                    if (group.getMoney() < item.getPrice()) {
                        throw new InsufficientBalanceException(this , item.getName());
                    }

                    //purchased
                    group.addToInventory(item);
                    group.setMoney(group.getMoney() - item.getPrice());
                    goodies.remove(item);
                    moneyLabel.setText(group.getMoney() + "$");

                    wrapper.setVisible(false);

                    itemsPanel.revalidate();
                    itemsPanel.repaint();                    
                } catch(InsufficientBalanceException ex)
                {
                    ex.message();
                }

            });
    }
    
    private boolean isCompatible(Item item){
        
        for(Classes c : item.getCompabilities()){
            if(group.isInGroup(c)) return true;
        }
        
        return false;
    }
    
    private void setupItems()
{
        itemsPanel = new JPanel();
        itemsPanel.setLayout(new BoxLayout(itemsPanel, BoxLayout.Y_AXIS));
        itemsPanel.setBackground(Config.COLOR_BLACK);
    
        moneyLabel.setText(group.getMoney() + "$");
        
        
        for (Item item : goodies) {
            
            if(!isCompatible(item)) continue;
            
            JPanel wrapper = new JPanel(new BorderLayout());
            card = new JPanel(new BorderLayout());
            buyButton = new JButton("Buy");
            
            card.setBackground(Config.COLOR_DARK_BLACK); //magic
            card.setMaximumSize(new Dimension(Integer.MAX_VALUE, 110)); 
            card.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            
            buyButton.setBackground(Config.COLOR_YELLOW);
            buyButton.setForeground(Config.COLOR_BLACK); 
            buyButton.setFont(Config.getFont(13, true));
            
            wrapper.setBackground(Config.COLOR_BLACK);
            wrapper.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
            wrapper.add(card);
            
            buyActionListener(item , wrapper);

            JLabel itemNameLabel = new JLabel(item.getName() + " - " + item.getPrice() + " Gold");
            itemNameLabel.setForeground(Config.COLOR_YELLOW);
            itemNameLabel.setFont(Config.getFont(16, true));

            
            JLabel compLabel = new JLabel(item.toString());
            compLabel.setForeground(Config.COLOR_WHITE);
            compLabel.setFont(new Font("Arial", Font.PLAIN, 14));


            card.add(itemNameLabel, BorderLayout.NORTH);
            card.add(compLabel, BorderLayout.CENTER);
            card.add(buyButton , BorderLayout.EAST);
            
            itemsPanel.add(wrapper);
        }
        
        
        
        jScrollPane1.setViewportView(itemsPanel);

        jScrollPane1.getViewport().setBackground(Config.COLOR_BLACK);
}
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        continueButton = new javax.swing.JButton();
        moneyLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();

        jLabel6.setText("Item Description");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(Config.WINDOW_DIMENSION);
        setResizable(false);

        jPanel2.setBackground(Config.COLOR_BLACK);
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 24)); // NOI18N
        jLabel2.setForeground(Config.COLOR_YELLOW);
        jLabel2.setText("Welcome to the shop traveler");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 56;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 0);
        jPanel2.add(jLabel2, gridBagConstraints);

        continueButton.setBackground(Config.COLOR_DARK_BLACK);
        continueButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        continueButton.setForeground(Config.COLOR_YELLOW);
        continueButton.setText("Continue");
        continueButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 3));
        continueButton.addActionListener(this::continueButtonActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(33, 18, 0, 20);
        jPanel2.add(continueButton, gridBagConstraints);

        moneyLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        moneyLabel.setForeground(Config.COLOR_YELLOW);
        moneyLabel.setText("money");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(43, 98, 0, 0);
        jPanel2.add(moneyLabel, gridBagConstraints);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);
        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void continueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueButtonActionPerformed
        callback.setGUIState(GUIState.LOBBY, this.getLocation());
    }//GEN-LAST:event_continueButtonActionPerformed


    public static void main(String args[]) {
            
        java.awt.EventQueue.invokeLater(() -> new ShopGUI(callback, group).setVisible(true));
    }

    private javax.swing.JButton buyButton;
    private javax.swing.JPanel card;
    private javax.swing.JPanel itemsPanel;
    private javax.swing.JPanel wrapper;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton continueButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel moneyLabel;
    // End of variables declaration//GEN-END:variables
}
