package rpgame;


public class mainGUI extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(mainGUI.class.getName());

    static Game game;
    
    int playerCount = 2;
    
    public mainGUI() {
        initComponents();
        
        game = new Game(playerCount);
        
        InfoPanel.setVisible(false);
        
        //CombatPrototypeGUI cu = new CombatPrototypeGUI();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mageButton = new javax.swing.JButton();
        archerButton = new javax.swing.JButton();
        healerButton = new javax.swing.JButton();
        warriorButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        InfoPanel = new javax.swing.JPanel();
        classIndicator = new javax.swing.JLabel();
        ability1_name = new javax.swing.JLabel();
        ability2_name = new javax.swing.JLabel();
        ability3_name = new javax.swing.JLabel();
        ability1_desc = new javax.swing.JLabel();
        ability2_desc = new javax.swing.JLabel();
        ability3_desc = new javax.swing.JLabel();
        healthLabel = new javax.swing.JLabel();
        attackLabel = new javax.swing.JLabel();
        manaLabel = new javax.swing.JLabel();
        abilityPowerLabel = new javax.swing.JLabel();
        addPlayerButton = new javax.swing.JButton();
        continueButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mageButton.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        mageButton.setText("Mage");
        mageButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mageButtonMouseEntered(evt);
            }
        });
        mageButton.addActionListener(this::mageButtonActionPerformed);

        archerButton.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        archerButton.setText("Archer");
        archerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                archerButtonMouseEntered(evt);
            }
        });
        archerButton.addActionListener(this::archerButtonActionPerformed);

        healerButton.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        healerButton.setText("Healer");
        healerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                healerButtonMouseEntered(evt);
            }
        });
        healerButton.addActionListener(this::healerButtonActionPerformed);

        warriorButton.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        warriorButton.setText("Warrior");
        warriorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                warriorButtonMouseEntered(evt);
            }
        });
        warriorButton.addActionListener(this::warriorButtonActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(warriorButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(healerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(archerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(mageButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(archerButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(healerButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(warriorButton)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 36)); // NOI18N
        jLabel1.setText("Pick your Class");

        InfoPanel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        classIndicator.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        classIndicator.setText("No Class Hovered");

        ability1_name.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ability1_name.setText("Ability1_name");
        ability1_name.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        ability2_name.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ability2_name.setText("Ability2_name");
        ability2_name.setFocusable(false);
        ability2_name.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        ability3_name.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ability3_name.setText("Ability3_name");

        ability1_desc.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ability1_desc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ability1_desc.setText("Ability1_desc");
        ability1_desc.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        ability2_desc.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ability2_desc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ability2_desc.setText("Ability2_desc");
        ability2_desc.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        ability3_desc.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ability3_desc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ability3_desc.setText("Ability3_desc");

        healthLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        healthLabel.setText("Health:");

        attackLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        attackLabel.setText("Attack:");

        manaLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        manaLabel.setText("Mana:");

        abilityPowerLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        abilityPowerLabel.setText("AbilityPower:");

        javax.swing.GroupLayout InfoPanelLayout = new javax.swing.GroupLayout(InfoPanel);
        InfoPanel.setLayout(InfoPanelLayout);
        InfoPanelLayout.setHorizontalGroup(
            InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ability1_name)
                    .addComponent(ability2_name)
                    .addComponent(classIndicator)
                    .addComponent(ability3_name)
                    .addGroup(InfoPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ability1_desc)
                            .addComponent(ability2_desc)
                            .addComponent(ability3_desc)))
                    .addGroup(InfoPanelLayout.createSequentialGroup()
                        .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(attackLabel)
                            .addComponent(healthLabel))
                        .addGap(141, 141, 141)
                        .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(abilityPowerLabel)
                            .addComponent(manaLabel))))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        InfoPanelLayout.setVerticalGroup(
            InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(classIndicator)
                .addGap(52, 52, 52)
                .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(attackLabel)
                    .addComponent(manaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(healthLabel)
                    .addComponent(abilityPowerLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(ability1_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ability1_desc)
                .addGap(18, 18, 18)
                .addComponent(ability2_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ability2_desc)
                .addGap(18, 18, 18)
                .addComponent(ability3_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ability3_desc)
                .addGap(138, 138, 138))
        );

        classIndicator.getAccessibleContext().setAccessibleName("ClassIndicator");
        healthLabel.getAccessibleContext().setAccessibleName("Health");
        attackLabel.getAccessibleContext().setAccessibleName("Attack");
        manaLabel.getAccessibleContext().setAccessibleName("Mana");
        abilityPowerLabel.getAccessibleContext().setAccessibleName("AbilityPower");

        addPlayerButton.setFont(new java.awt.Font("Arial", 3, 20)); // NOI18N
        addPlayerButton.setText("Add Player");
        addPlayerButton.addActionListener(this::addPlayerButtonActionPerformed);

        continueButton.setFont(new java.awt.Font("Arial", 3, 20)); // NOI18N
        continueButton.setText("Continue");
        continueButton.setToolTipText("");
        continueButton.addActionListener(this::continueButtonActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addPlayerButton)
                            .addComponent(continueButton))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addComponent(InfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(InfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addPlayerButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(continueButton)
                        .addGap(85, 85, 85))))
        );

        InfoPanel.getAccessibleContext().setAccessibleName("InfoPanel");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mageButtonActionPerformed
        
        game.selectClass(Classes.Mage);
    }//GEN-LAST:event_mageButtonActionPerformed

    private void archerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archerButtonActionPerformed
        
        game.selectClass(Classes.Archer);
    }//GEN-LAST:event_archerButtonActionPerformed

    private void healerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healerButtonActionPerformed
        
        game.selectClass(Classes.Healer);
    }//GEN-LAST:event_healerButtonActionPerformed

    private void warriorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warriorButtonActionPerformed
        
        game.selectClass(Classes.Warrior);
    }//GEN-LAST:event_warriorButtonActionPerformed

    
    private void infoPanel(PlayerClass hoveredClass){
        
        if(!InfoPanel.isVisible()) InfoPanel.setVisible(true);
        
        classIndicator.setText(hoveredClass.className);

        Ability infoPanelAbilityLister; //used for list ability features
        
        javax.swing.JLabel[][] abilityLabels = {
            {ability1_name, ability1_desc},
            {ability2_name, ability2_desc},
            {ability3_name, ability3_desc},
        };
        
        for(int i = 0; i < abilityLabels.length; i++){
            
            infoPanelAbilityLister = hoveredClass.getAbility(i);
            
            if(infoPanelAbilityLister != null){
            
                abilityLabels[i][0].setVisible(true);
                abilityLabels[i][1].setVisible(true);
                
                abilityLabels[i][0].setText(infoPanelAbilityLister.name);
                abilityLabels[i][1].setText(infoPanelAbilityLister.description);
            } else {
                
                abilityLabels[i][0].setVisible(false);
                abilityLabels[i][1].setVisible(false);
            }
        }

        attackLabel.setText("Attack: " + hoveredClass.attackPower);
        healthLabel.setText("Health: " + hoveredClass.HP);
        manaLabel.setText("Mana: " + hoveredClass.mana);
        abilityPowerLabel.setText("AbilityPower: " + hoveredClass.abilityPower);
    }
    
    
    private void mageButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mageButtonMouseEntered

        infoPanel(new Mage());
    }//GEN-LAST:event_mageButtonMouseEntered

    private void archerButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_archerButtonMouseEntered

        infoPanel(new Archer());        
    }//GEN-LAST:event_archerButtonMouseEntered

    private void healerButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_healerButtonMouseEntered

        infoPanel(new Healer());        
    }//GEN-LAST:event_healerButtonMouseEntered

    private void warriorButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_warriorButtonMouseEntered

        infoPanel(new Warrior());
    }//GEN-LAST:event_warriorButtonMouseEntered

    
    
    private void addPlayerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPlayerButtonActionPerformed
        

        game.confirmClassSelection();
        
        
        /*
        //=======================================================
        while(p.HP > 0){
            difficulty++;

            System.out.println("DIFFICULTY: " + difficulty);
            Enemy e = new Enemy(difficulty);
        
            Combat c = new Combat(p,e);
            c.combatLoop();
        
        }
        System.out.println(p.className + " took until the Difficulty: " + difficulty);
        difficulty = 0;
        
        //=======================================================
        */
    }//GEN-LAST:event_addPlayerButtonActionPerformed

    private void continueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueButtonActionPerformed
        
        
        if(game.getPlayerCount() < playerCount){
            
            System.err.println("INSUFFICIENT PLAYER ADDED");
        }
        

        //open next window
        
    }//GEN-LAST:event_continueButtonActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new mainGUI().setVisible(true));
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel InfoPanel;
    private javax.swing.JLabel ability1_desc;
    private javax.swing.JLabel ability1_name;
    private javax.swing.JLabel ability2_desc;
    private javax.swing.JLabel ability2_name;
    private javax.swing.JLabel ability3_desc;
    private javax.swing.JLabel ability3_name;
    private javax.swing.JLabel abilityPowerLabel;
    private javax.swing.JButton addPlayerButton;
    private javax.swing.JButton archerButton;
    private javax.swing.JLabel attackLabel;
    private javax.swing.JLabel classIndicator;
    private javax.swing.JButton continueButton;
    private javax.swing.JButton healerButton;
    private javax.swing.JLabel healthLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mageButton;
    private javax.swing.JLabel manaLabel;
    private javax.swing.JButton warriorButton;
    // End of variables declaration//GEN-END:variables
}
