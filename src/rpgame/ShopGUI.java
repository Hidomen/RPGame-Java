package rpgame;
import javax.swing.*;
import java.awt.*;
import static rpgame.Classes.*;

public class ShopGUI extends javax.swing.JFrame { 
    
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ShopGUI.class.getName());

    private static GUICallback callback;
    
    private static Group group;
    
    private static int itemCount = 20;
    
    private static final Item[] goodies = {

        //WEAPONS                                                                        	   HEALTH, ATTACK, ABILITY, MANA
        new Item("Dual Daggers" 	, 80 , new Classes[] {Archer},             		new int[] { 0 , 9 , 7 , 0 }),
        new Item("Crossbow" 		, 85 , new Classes[] {Archer},                 		new int[] { 0 , 14, 8 , 0 }),
        new Item("Long Sword" 		, 90 , new Classes[] {Warrior},              		new int[] { 0 , 8 , 0 , 0 }),
        new Item("Blessed Mace" 	, 95 , new Classes[] {Healer},             		new int[] { 0 , 2 , 7 , 0 }),
        new Item("Hunter Bow" 		, 95 , new Classes[] {Archer},               		new int[] { 0 , 12, 0 , 0 }),
        new Item("Arcane Wand" 		, 100, new Classes[] {Mage},               		new int[] { 0 , -5, 10, 1 }),
        new Item("Divine Staff" 	, 105, new Classes[] {Healer, Mage},     		new int[] { 0 , 0 , 10, 2 }),
        new Item("Battle Axe" 		, 110, new Classes[] {Warrior},             		new int[] { 0 , 12, 3 , 0 }),
        new Item("War Hammer" 		, 115, new Classes[] {Warrior, Healer},    		new int[] { 8 , 10, 8 , 0 }),
        new Item("Crystal Orb" 		, 120, new Classes[] {Mage},               		new int[] { 0 , 8 , 7 , 1 }),
        

        // ARMORS
        new Item("Cloth Robe"		, 60 , new Classes[] {Mage},				new int[] { 5 , 0 , 0 , 3 }),
        new Item("Leather Armor"	, 70 , new Classes[] {Archer},				new int[] { 6 , 0 , 0 , 0 }),
        new Item("Holy Vestments"	, 75 , new Classes[] {Healer},				new int[] { 8 , 0 , 0 , 3 }),
        new Item("Ranger Vest"		, 85 , new Classes[] {Archer},				new int[] { 9 , 0 , 0 , 0 }),
        new Item("Shadow Cloak"		, 95 , new Classes[] {Archer, Mage},			new int[] { 9 , 0 , 0 , 1 }),
        new Item("Iron Armor"		, 100, new Classes[] {Warrior},				new int[] { 10, 0 , 0 , 0 }),
        new Item("Mystic Robe"		, 110, new Classes[] {Mage, Healer},			new int[] { 12, 0 , 0 , 4 }),
        new Item("Knight Plate"		, 130, new Classes[] {Warrior, Healer},			new int[] { 13, 0 , 0 , 0 }),
        new Item("Enchanted Armor"	, 140, new Classes[] {Warrior, Mage, Healer, Archer},	new int[] { 15, 0 , 0 , 2 }),
        new Item("Dragon Scale Armor"	, 150, new Classes[] {Warrior},				new int[] { 20, 0 , 0 , 0 })
    };
    
    public ShopGUI(GUICallback callback, Group group) {
        
        this.callback = callback;
        this.group = group;
        
        initComponents();
        moneyLabel.setText(group.getMoney() + "$");
        setupItems();
        continueButton.setFocusPainted(false);
    }
    
    @Override
    public void setVisible(boolean visible)
    {
        super.setVisible(visible);
        if (visible) {
            moneyLabel.setText(group.getMoney() + "$");
        }
    }

    private boolean itemControl(Item item){
        boolean check = false;
        for (Classes c : item.getCompabilities())
        {
            if (group.isInGroup(c)) {
                    check = true;
            }
        }
        if (check == false) {
            JOptionPane.showMessageDialog(this, "Your group does not have any member compatible with this item." , "Non-Compatible Item" , JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (group.getMoney() < item.getPrice())
        {
            JOptionPane.showMessageDialog(this, "Insufficient balance to buy this item. Your gold: " + group.getMoney() , "Insufficient Balance" , JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        return true;
    }
    
    private void buyActionListener(Item item , JPanel cWrapper){
 
        buyButton.addActionListener(e -> 
            {
                if(!itemControl(item)) return;
                
                group.addToInventory(item);
                System.out.println("purchased");
                group.setMoney(group.getMoney() - item.getPrice());

                moneyLabel.setText(group.getMoney() + "$");

                JOptionPane.showMessageDialog(this, "Item: " + item.getName() + " is bought successfully. Remaining gold: " + group.getMoney() , "Success!" , JOptionPane.WARNING_MESSAGE);
                cWrapper.setVisible(false);

                itemsPanel.revalidate();
                itemsPanel.repaint();
            });
    }
    
    private void setupItems()
{
        itemsPanel = new JPanel();
        itemsPanel.setLayout(new BoxLayout(itemsPanel, BoxLayout.Y_AXIS));
        itemsPanel.setBackground(Color.BLACK);
    
        moneyLabel.setText(group.getMoney() + "$");
        
        for (Item item : goodies) {
            
            final JPanel wrapper     = new JPanel(new BorderLayout());
            card        = new JPanel(new BorderLayout());
            buyButton   = new JButton("Buy");
            
            card.setBackground(new Color(20, 20, 20)); //magic
            card.setMaximumSize(new Dimension(Integer.MAX_VALUE, 110)); 
            card.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            
            buyButton.setBackground(Color.YELLOW); //magic
            buyButton.setForeground(Color.BLACK); 
            buyButton.setFont(Config.getFont(13, true));
            
            wrapper.setBackground(Color.BLACK);
            wrapper.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
            wrapper.add(card);
            
            buyActionListener(item , wrapper);

            JLabel itemNameLabel = new JLabel(item.getName() + " - " + item.getPrice() + " Gold");
            itemNameLabel.setForeground(Color.YELLOW); //magic
            itemNameLabel.setFont(Config.getFont(16, true));

            
            JLabel compLabel = new JLabel(item.toString());
            compLabel.setForeground(new Color(200, 200, 200));
            compLabel.setFont(new Font("Arial", Font.PLAIN, 14));


            card.add(itemNameLabel, BorderLayout.NORTH);
            card.add(compLabel, BorderLayout.CENTER);
            card.add(buyButton , BorderLayout.EAST);
            
            itemsPanel.add(wrapper);
        }
        
        
        
        jScrollPane1.setViewportView(itemsPanel);

        jScrollPane1.getViewport().setBackground(Color.BLACK);
}
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        continueButton = new javax.swing.JButton();
        moneyLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();

        jLabel6.setText("Item Description");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1015, 700));
        setMinimumSize(new java.awt.Dimension(1015, 700));
        setPreferredSize(new java.awt.Dimension(1015, 700));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Welcome to the shop traveler");

        continueButton.setText("Continue");
        continueButton.addActionListener(this::continueButtonActionPerformed);

        moneyLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        moneyLabel.setForeground(new java.awt.Color(255, 255, 0));
        moneyLabel.setText("money");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                .addGap(120, 120, 120)
                .addComponent(moneyLabel)
                .addGap(18, 18, 18)
                .addComponent(continueButton)
                .addGap(40, 40, 40))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(continueButton)
                    .addComponent(moneyLabel))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);
        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void continueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueButtonActionPerformed
        callback.setGUIState(GUIState.LOBBY);
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
