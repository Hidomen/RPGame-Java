package rpgame;

import java.awt.event.*;



public class CombatPrototypeGUI extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CombatPrototypeGUI.class.getName());


    
    PlayerClass p;
    Enemy enemy;
    
    int turnCount = 1;
    Game game = new Game(turnCount);
    
    public CombatPrototypeGUI() {
        initComponents();


        game.selectClass(Classes.Mage);
        

        game.confirmClassSelection();
        
        
        game.initEnemy(1);
        game.initCombat(1);
        
        
        
        p = game.getPlayer(0);
        enemy = game.getEnemy(0);
        
    
        actionListener();
        updateLabels();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        enemyHealthLabel = new javax.swing.JLabel();
        enemyAttackPowerLabel = new javax.swing.JLabel();
        enemyManaLabel = new javax.swing.JLabel();
        enemyAbilityPowerLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        playerAttackPowerLabel = new javax.swing.JLabel();
        playerHealthLabel = new javax.swing.JLabel();
        playerManaLabel = new javax.swing.JLabel();
        playerAbilityPowerLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        turnLabel = new javax.swing.JLabel();
        attackButton = new javax.swing.JButton();
        abilityButton = new javax.swing.JButton();
        defenceButton = new javax.swing.JButton();
        abilitySelectionPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        useAbility0 = new javax.swing.JButton();
        useAbility1 = new javax.swing.JButton();
        useAbility2 = new javax.swing.JButton();
        useAbility3 = new javax.swing.JButton();
        useAbility4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel1.setText("Enemy");

        enemyHealthLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        enemyHealthLabel.setText("Health");

        enemyAttackPowerLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        enemyAttackPowerLabel.setText("AttackPower");

        enemyManaLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        enemyManaLabel.setText("Mana");

        enemyAbilityPowerLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        enemyAbilityPowerLabel.setText("AbilityPower");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enemyHealthLabel)
                    .addComponent(enemyAttackPowerLabel)
                    .addComponent(enemyManaLabel)
                    .addComponent(enemyAbilityPowerLabel)
                    .addComponent(jLabel1))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enemyHealthLabel)
                .addGap(29, 29, 29)
                .addComponent(enemyAttackPowerLabel)
                .addGap(29, 29, 29)
                .addComponent(enemyManaLabel)
                .addGap(29, 29, 29)
                .addComponent(enemyAbilityPowerLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel2.setText("You");

        playerAttackPowerLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        playerAttackPowerLabel.setText("AttackPower");

        playerHealthLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        playerHealthLabel.setText("Health");

        playerManaLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        playerManaLabel.setText("Mana");

        playerAbilityPowerLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        playerAbilityPowerLabel.setText("AbilityPower");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(playerHealthLabel)
                        .addComponent(playerAttackPowerLabel)
                        .addComponent(playerManaLabel)
                        .addComponent(playerAbilityPowerLabel))
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerHealthLabel)
                .addGap(29, 29, 29)
                .addComponent(playerAttackPowerLabel)
                .addGap(29, 29, 29)
                .addComponent(playerManaLabel)
                .addGap(29, 29, 29)
                .addComponent(playerAbilityPowerLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        turnLabel.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        turnLabel.setText("Turn");

        attackButton.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        attackButton.setText("Attack");

        abilityButton.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        abilityButton.setText("Ability");

        defenceButton.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        defenceButton.setText("Defence");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel4.setText("Player Abilities");

        useAbility0.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        useAbility0.setText("Ability0");

        useAbility1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        useAbility1.setText("Ability1");

        useAbility2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        useAbility2.setText("Ability2");

        useAbility3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        useAbility3.setText("Ability3");

        useAbility4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        useAbility4.setText("Ability4");
        useAbility4.setToolTipText("");

        javax.swing.GroupLayout abilitySelectionPanelLayout = new javax.swing.GroupLayout(abilitySelectionPanel);
        abilitySelectionPanel.setLayout(abilitySelectionPanelLayout);
        abilitySelectionPanelLayout.setHorizontalGroup(
            abilitySelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abilitySelectionPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(abilitySelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(abilitySelectionPanelLayout.createSequentialGroup()
                        .addComponent(useAbility0)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(useAbility1))
                    .addGroup(abilitySelectionPanelLayout.createSequentialGroup()
                        .addComponent(useAbility2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(useAbility3))
                    .addGroup(abilitySelectionPanelLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(useAbility4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        abilitySelectionPanelLayout.setVerticalGroup(
            abilitySelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abilitySelectionPanelLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(abilitySelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(useAbility0)
                    .addComponent(useAbility1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(abilitySelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(useAbility2)
                    .addComponent(useAbility3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(useAbility4)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(attackButton)
                        .addComponent(abilityButton)
                        .addComponent(defenceButton))
                    .addComponent(turnLabel))
                .addContainerGap(199, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abilitySelectionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(turnLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(attackButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(abilityButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(defenceButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(abilitySelectionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel5.setText("Log");

        jLabel3.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel3.setText("PLAYER used ...");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(171, 171, 171))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(135, 135, 135))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(36, 36, 36)
                .addComponent(jLabel3)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 53, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void playerTurnEnded(){
        //update mana
        game.changeState(GameState.ENEMY_TURN);
        updateLabels();
        enemyTurn();
    }
    
    private void abilityButtonUsed(int index){
        
        switch(index){
            case 0 -> {
                p.useAbility(p.getAbility(0),enemy);
            }
            case 1 -> {
                p.useAbility(p.getAbility(1),enemy);
            }
            case 2 -> {
                p.useAbility(p.getAbility(2),enemy);
            }
            case 3 -> {
                p.useAbility(p.getAbility(3),enemy);
            }
            case 4 -> {
                p.useAbility(p.getAbility(4),enemy);
            }
            case 5 -> {
                p.useAbility(p.getAbility(5),enemy);
            }
        }
        
        
        abilitySelectionPanel.setVisible(false);
        playerTurnEnded();
    }
    
    
    private void actionListener(){
        
        if(GameState.PLAYER_TURN == game.getState()){
            
            abilityButton.addActionListener((ActionEvent e) -> {

                abilitySelectionPanel.setVisible(true);
            });

            attackButton.addActionListener((ActionEvent e) -> {

                p.attack(enemy);
                playerTurnEnded();
            });

            defenceButton.addActionListener((ActionEvent e) -> {

                //
                playerTurnEnded();
            });

            
            
            useAbility0.addActionListener((ActionEvent e) -> {

                abilityButtonUsed(0);
            });

            useAbility1.addActionListener((ActionEvent e) -> {

                abilityButtonUsed(1);
            });

            useAbility2.addActionListener((ActionEvent e) -> {

                abilityButtonUsed(2);
            });

            useAbility3.addActionListener((ActionEvent e) -> {

                abilityButtonUsed(3);
            });

            useAbility4.addActionListener((ActionEvent e) -> {

                abilityButtonUsed(4);
            });
            /*
            useAbility5.addActionListener((ActionEvent e) -> {

                abilityButtonUsed(5);
            });
            */

       }

    }
    
    
    private void updateLabels(){
        
        abilitySelectionPanel.setVisible(false);
        
        useAbility0.setText(p.getAbility(0).name);
        useAbility1.setText(p.getAbility(1).name);
        useAbility2.setText(p.getAbility(2).name);
        useAbility3.setText(p.getAbility(3).name);
        useAbility4.setText(p.getAbility(4).name);
        
        enemyAbilityPowerLabel.setText("AbilityPower: " + enemy.abilityPower);
        enemyAttackPowerLabel.setText("AttackPower: " + enemy.attackPower);
        enemyHealthLabel.setText("Health: " + enemy.HP + " / " + enemy.maxHP);
        enemyManaLabel.setText("Mana: " + enemy.mana);
        
        
        playerAbilityPowerLabel.setText("AbilityPower: " + p.abilityPower);
        playerAttackPowerLabel.setText("AttackPower: " + p.attackPower);
        playerHealthLabel.setText("Health: " + p.HP + " / " + p.maxHP);
        playerManaLabel.setText("Mana: " + p.mana);
        
        
        jLabel3.setText("TurnCount: " + turnCount);
        turnLabel.setText("Turn:"); //gonna fixed

    }
    
    
    private void enemyTurn(){
        game.enemyTurn();
        updateLabels();
        
    }
    
    private void combatTracker(){
    
        updateLabels();        

        //while(p.HP > 0 && enemy.HP > 0){
        
            
            
            if(GameState.PLAYER_TURN == game.getState()){
                abilityButton.setEnabled(true);
                attackButton.setEnabled(true);
                defenceButton.setEnabled(true);
            } else {
                
                abilityButton.setEnabled(false);
                attackButton.setEnabled(false);
                defenceButton.setEnabled(false);
                
                
                //e.checkStatus();
                enemy.turn(p); 
                enemy.endTurnEffects();
                
                //combat.nextTurn();
                
                combatTracker();
            }

            turnCount++;
        
    }
    
    
    public static void main(String args[]) {

        
        java.awt.EventQueue.invokeLater(() -> new CombatPrototypeGUI().setVisible(true));
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abilityButton;
    private javax.swing.JPanel abilitySelectionPanel;
    private javax.swing.JButton attackButton;
    private javax.swing.JButton defenceButton;
    private javax.swing.JLabel enemyAbilityPowerLabel;
    private javax.swing.JLabel enemyAttackPowerLabel;
    private javax.swing.JLabel enemyHealthLabel;
    private javax.swing.JLabel enemyManaLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel playerAbilityPowerLabel;
    private javax.swing.JLabel playerAttackPowerLabel;
    private javax.swing.JLabel playerHealthLabel;
    private javax.swing.JLabel playerManaLabel;
    private javax.swing.JLabel turnLabel;
    private javax.swing.JButton useAbility0;
    private javax.swing.JButton useAbility1;
    private javax.swing.JButton useAbility2;
    private javax.swing.JButton useAbility3;
    private javax.swing.JButton useAbility4;
    // End of variables declaration//GEN-END:variables
}
