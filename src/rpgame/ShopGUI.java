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

        // WEAPONS
        new WeaponItem(1.3 , 1.0 , "Long Sword" , 90 , new Classes[] {Warrior}),
        new WeaponItem(1.1 , 1.2 , "Blessed Mace" , 95 , new Classes[] {Healer}),
        new WeaponItem(0.9 , 1.6 , "Arcane Wand" , 100 , new Classes[] {Mage}),
        new WeaponItem(1.4 , 0.8 , "Crossbow" , 85 , new Classes[] {Archer}),
        new WeaponItem(1.2 , 1.1 , "Battle Axe" , 110 , new Classes[] {Warrior}),
        new WeaponItem(1.0 , 1.3 , "Divine Staff" , 105 , new Classes[] {Healer , Mage}),
        new WeaponItem(1.5 , 0.7 , "Dual Daggers" , 80 , new Classes[] {Archer}),
        new WeaponItem(0.8 , 1.7 , "Crystal Orb" , 120 , new Classes[] {Mage}),
        new WeaponItem(1.3 , 0.9 , "War Hammer" , 115 , new Classes[] {Warrior , Healer}),
        new WeaponItem(1.2 , 1.0 , "Hunter Bow" , 95 , new Classes[] {Archer}),

        // ARMORS
        new ArmorItem(1.2 , "Iron Armor" , 100 , new Classes[] {Warrior}),
        new ArmorItem(1.05 , "Cloth Robe" , 60 , new Classes[] {Mage}),
        new ArmorItem(1.1 , "Holy Vestments" , 75 , new Classes[] {Healer}),
        new ArmorItem(1.1 , "Leather Armor" , 70 , new Classes[] {Archer}),
        new ArmorItem(1.4 , "Dragon Scale Armor" , 150 , new Classes[] {Warrior}),
        new ArmorItem(1.2 , "Mystic Robe" , 110 , new Classes[] {Mage , Healer}),
        new ArmorItem(1.1 , "Shadow Cloak" , 95 , new Classes[] {Archer , Mage}),
        new ArmorItem(1.3 , "Knight Plate" , 130 , new Classes[] {Warrior , Healer}),
        new ArmorItem(1.2 , "Ranger Vest" , 85 , new Classes[] {Archer}),
        new ArmorItem(1.3 , "Enchanted Armor" , 140 , new Classes[] {Warrior , Mage , Healer , Archer})
    };
    
    public ShopGUI(GUICallback callback, Group group) {
        
        this.callback = callback;
        this.group = group;
        
        initComponents();
        setupItems();
    }
    
    public void AddItem(Item item)
    {
        if (itemCount < goodies.length) {
            goodies[itemCount] = item;
            itemCount++;
        }
        else {
            System.out.println("Shop is full. Can not add another item.");
        }
    }
    
    //debug
        public void ListItems()
    {
        for (Item il : goodies) {
            
            
            if (null == goodies){
                System.out.println("1");
                return;
            }
            
            System.out.println("=====================");
            System.out.println("Item Name");
            System.out.println(il.name + "\n");
            System.out.println("Item Price : " + il.price);
            System.out.println("=====================\n");
        }
    }
    
    
    private void setupItems()
{
    
        moneyLabel.setText(group.getMoney() + "$");
    
        JPanel itemsPanel = new JPanel();
        itemsPanel.setLayout(new BoxLayout(itemsPanel, BoxLayout.Y_AXIS));
        itemsPanel.setBackground(Color.BLACK);

        for (Item i : goodies) {

            JPanel card = new JPanel(new BorderLayout());
            card.setBackground(new Color(20, 20, 20)); 
            card.setMaximumSize(new Dimension(Integer.MAX_VALUE, 110)); 
            card.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

            JLabel label = new JLabel(i.name + " - " + i.price + " Gold");
            label.setForeground(Color.YELLOW);
            label.setFont(new Font("Arial", Font.BOLD, 16));

            JLabel compLabel = new JLabel("Compatibility: " + getCompability(i));
            compLabel.setForeground(new Color(200, 200, 200));
            compLabel.setFont(new Font("Arial", Font.PLAIN, 14));

            JButton buyButton = new JButton("Buy");
            buyButton.setBackground(Color.YELLOW);
            buyButton.setForeground(Color.BLACK);        
            buyButton.setFont(new Font("Arial", Font.BOLD, 13));

            JPanel wrapper = new JPanel(new BorderLayout());

            buyButton.addActionListener(e -> 
            {
                boolean Compatible = false;
                boolean CanAfford = false;
                for (Classes c : i.compability) {
                    if (true /*c.toString() == player.className*/) {
                        Compatible = true;
                        break;
                    }
                }
                if (!Compatible) {
                    JOptionPane.showMessageDialog(this, "Your group does not have any member compatible with this item. Your class: ", "Non-Compatible Item" , JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if (group.getMoney() >= i.price) {
                    CanAfford = true;
                }
                if (!CanAfford) {
                    JOptionPane.showMessageDialog(this, "Insufficient balance to buy this item. Your gold: " + group.getMoney() , "Insufficient Balance" , JOptionPane.WARNING_MESSAGE);
                    return;
                }

                if (CanAfford && Compatible) {
                    group.addToInventory(i);
                    System.out.println("purchased");
                    group.setMoney(group.getMoney() - i.price);
                    
                    JOptionPane.showMessageDialog(this, "Item: " + i.name + " is bought successfully. Remaining gold: " + group.getMoney() , "Success!" , JOptionPane.WARNING_MESSAGE);
                    wrapper.setVisible(false);
                    itemsPanel.revalidate();
                    itemsPanel.repaint();
                }

            });
            card.add(label, BorderLayout.NORTH);
            card.add(compLabel, BorderLayout.CENTER);
            card.add(buyButton , BorderLayout.EAST);


            wrapper.setBackground(Color.BLACK);
            wrapper.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
            wrapper.add(card);

            itemsPanel.add(wrapper);
        }

        jScrollPane1.setViewportView(itemsPanel);

        jScrollPane1.getViewport().setBackground(Color.BLACK);
}
    
    
    private String getCompability(Item i)
    {
        String a = "";
        for (Classes c : i.compability) {
            a += c + " ";
        }
        return a;
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
        setMinimumSize(new java.awt.Dimension(1250, 600));
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
        callback.shopGUIEnded();
    }//GEN-LAST:event_continueButtonActionPerformed

    

    public static void main(String args[]) {
            
    
        
        java.awt.EventQueue.invokeLater(() -> new ShopGUI(callback, group).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton continueButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel moneyLabel;
    // End of variables declaration//GEN-END:variables
}
