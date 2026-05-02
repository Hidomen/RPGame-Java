package rpgame;

import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CombatGUI extends javax.swing.JFrame{
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CombatGUI.class.getName());
    
    private static ArrayList<PlayerClass> players;
    private static Enemy enemy;

    private int turnCount = 1;
    private EntityType state = EntityType.Player;
    
    private PlayerClass currentPlayer;  //used for checking things
    private int currentPlayerIndex = 0;     //used if an action affects player
    
    private int alivePlayerCount;
    
    private static GUICallback callback;

    
    public CombatGUI(GUICallback callback, ArrayList<PlayerClass> players, Enemy enemy) {
        
        this.callback = callback;
        this.players = players;
        this.enemy = enemy;
        
        
        currentPlayer = players.get(0);
        alivePlayerCount = players.size();
        
        initComponents();
        
        abilitySelectionPanel.setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().setBackground(new java.awt.Color(51, 51, 51));
        
        
        actionListener();
        
        attackButton.setFocusPainted(false); 
        updateLabels();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        enemyHealthLabel = new javax.swing.JLabel();
        enemyAttackPowerLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        playerNameLabel = new javax.swing.JLabel();
        playerAttackPowerLabel = new javax.swing.JLabel();
        playerHealthLabel = new javax.swing.JLabel();
        playerManaLabel = new javax.swing.JLabel();
        playerAbilityPowerLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
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
        useAbility5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        logLabel = new javax.swing.JLabel();
        turnLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 3));
        jPanel1.setForeground(new java.awt.Color(255, 255, 0));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Enemy");

        enemyHealthLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        enemyHealthLabel.setForeground(new java.awt.Color(255, 255, 0));
        enemyHealthLabel.setText("Health");

        enemyAttackPowerLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        enemyAttackPowerLabel.setForeground(new java.awt.Color(255, 255, 0));
        enemyAttackPowerLabel.setText("AttackPower");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enemyAttackPowerLabel)
                            .addComponent(enemyHealthLabel))))
                .addContainerGap(377, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(enemyHealthLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enemyAttackPowerLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 3));
        jPanel2.setForeground(new java.awt.Color(255, 255, 0));

        playerNameLabel.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        playerNameLabel.setForeground(new java.awt.Color(255, 255, 0));
        playerNameLabel.setText("Player Name");

        playerAttackPowerLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        playerAttackPowerLabel.setForeground(new java.awt.Color(255, 255, 0));
        playerAttackPowerLabel.setText("AttackPower");

        playerHealthLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        playerHealthLabel.setForeground(new java.awt.Color(255, 255, 0));
        playerHealthLabel.setText("Health");

        playerManaLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        playerManaLabel.setForeground(new java.awt.Color(255, 255, 0));
        playerManaLabel.setText("Mana");

        playerAbilityPowerLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        playerAbilityPowerLabel.setForeground(new java.awt.Color(255, 255, 0));
        playerAbilityPowerLabel.setText("AbilityPower");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(playerNameLabel))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(playerAttackPowerLabel)
                            .addComponent(playerHealthLabel)
                            .addComponent(playerManaLabel)
                            .addComponent(playerAbilityPowerLabel))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(playerNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(playerHealthLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerAttackPowerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerManaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerAbilityPowerLabel)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 3));
        jPanel3.setForeground(new java.awt.Color(255, 255, 0));

        attackButton.setBackground(new java.awt.Color(255, 255, 0));
        attackButton.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        attackButton.setForeground(new java.awt.Color(51, 51, 51));
        attackButton.setText("Attack");

        abilityButton.setBackground(new java.awt.Color(51, 51, 51));
        abilityButton.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        abilityButton.setForeground(new java.awt.Color(255, 255, 0));
        abilityButton.setText("Ability");

        defenceButton.setBackground(new java.awt.Color(255, 255, 0));
        defenceButton.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        defenceButton.setForeground(new java.awt.Color(51, 51, 51));
        defenceButton.setText("Defence");
        defenceButton.addActionListener(this::defenceButtonActionPerformed);

        abilitySelectionPanel.setBackground(new java.awt.Color(51, 51, 51));
        abilitySelectionPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Player Abilities");

        useAbility0.setBackground(new java.awt.Color(255, 255, 0));
        useAbility0.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        useAbility0.setForeground(new java.awt.Color(51, 51, 51));
        useAbility0.setText("Ability0");

        useAbility1.setBackground(new java.awt.Color(255, 255, 0));
        useAbility1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        useAbility1.setForeground(new java.awt.Color(51, 51, 51));
        useAbility1.setText("Ability1");

        useAbility2.setBackground(new java.awt.Color(255, 255, 0));
        useAbility2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        useAbility2.setForeground(new java.awt.Color(51, 51, 51));
        useAbility2.setText("Ability2");

        useAbility3.setBackground(new java.awt.Color(255, 255, 0));
        useAbility3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        useAbility3.setForeground(new java.awt.Color(51, 51, 51));
        useAbility3.setText("Ability3");
        useAbility3.addActionListener(this::useAbility3ActionPerformed);

        useAbility4.setBackground(new java.awt.Color(255, 255, 0));
        useAbility4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        useAbility4.setForeground(new java.awt.Color(51, 51, 51));
        useAbility4.setText("Ability4");
        useAbility4.setToolTipText("");

        useAbility5.setBackground(new java.awt.Color(255, 255, 0));
        useAbility5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        useAbility5.setForeground(new java.awt.Color(51, 51, 51));
        useAbility5.setText("Ability5");
        useAbility5.setToolTipText("");

        javax.swing.GroupLayout abilitySelectionPanelLayout = new javax.swing.GroupLayout(abilitySelectionPanel);
        abilitySelectionPanel.setLayout(abilitySelectionPanelLayout);
        abilitySelectionPanelLayout.setHorizontalGroup(
            abilitySelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abilitySelectionPanelLayout.createSequentialGroup()
                .addGroup(abilitySelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(abilitySelectionPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4))
                    .addGroup(abilitySelectionPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(useAbility0)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(useAbility1))
                    .addGroup(abilitySelectionPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(useAbility2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(useAbility3))
                    .addGroup(abilitySelectionPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(useAbility4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(useAbility5)))
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
                .addGroup(abilitySelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(useAbility4)
                    .addComponent(useAbility5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(attackButton)
                    .addComponent(abilityButton)
                    .addComponent(defenceButton))
                .addGap(18, 18, 18)
                .addComponent(abilitySelectionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(attackButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(abilityButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(defenceButton))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(abilitySelectionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 3));
        jPanel4.setForeground(new java.awt.Color(255, 255, 0));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("ICON");

        logLabel.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        logLabel.setForeground(new java.awt.Color(255, 255, 0));
        logLabel.setText("a");

        turnLabel.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        turnLabel.setForeground(new java.awt.Color(255, 255, 0));
        turnLabel.setText("Turn");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(turnLabel)
                .addGap(133, 133, 133))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(logLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(turnLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void defenceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defenceButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_defenceButtonActionPerformed

    private void useAbility3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useAbility3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_useAbility3ActionPerformed

    
    private void nextPlayer(){
        if(players.size() <= 0) return;
        currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
    }
    
    private void nextTurn(){
        
        state = EntityType.values()[(state.ordinal() + 1) % 2];
        
        if(state == EntityType.Player){
            
            nextPlayer();
            currentPlayer = players.get(currentPlayerIndex);
        }
        
        stateManager();
    }

    
    private void playerTurnEnd(){
        currentPlayer.endTurnEffects();
        currentPlayer.addMana();
        
        turnCount++;
        
        nextTurn();
        stateManager();
    }
    
    private void enemyTurn(){
        if(enemy.checkStatus()){

            logLabel.setText(enemy.getEntityName() + "is stunned");
            enemy.endTurnEffects();
            return;
        }
        
        enemy.attack(currentPlayer); 
        logLabel.setText(enemy.getEntityName() + " attacked " + currentPlayer.getEntityName() + ". Dealt " + enemy.attackPower +  " damage.\n Current health: " + currentPlayer.HP);
        enemy.endTurnEffects();
    }

    
    private void stateManager(){
        
        if (enemy.isDead()){
            callback.combatWin();
            callback.setGUIState(GUIState.LOBBY, this.getLocation());
            return;
        }
        
        
        switch(state){
            
            case EntityType.Player -> {
                if(currentPlayer.isDead()){
                    
                    if(alivePlayerCount <= 1){
                        
                        callback.setGUIState(GUIState.GAME_OVER, this.getLocation());
                    }
                    else{
                        alivePlayerCount--;
                        nextPlayer();
                        
                        stateManager();
                    }
                    
                }
                
                
            }
            case EntityType.Enemy -> {

                enemyTurn();
                nextTurn();
            }
            
        }
        updateLabels();
    }
    
    
    private void abilityButtonUsed(int index){
        
        Ability usedAbility = currentPlayer.getAbility(index);
        
        
        if(!currentPlayer.isManaEnough(usedAbility)){
            JOptionPane.showMessageDialog(this, "Player's mana is not enough to perform ability", "Unsufficent Mana!" , JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        abilityButton.setFocusPainted(false);
        

        players.get(currentPlayerIndex).useAbility(usedAbility, enemy);
        
        abilitySelectionPanel.setVisible(false);
        
        abilityButton.setBackground(new java.awt.Color(51, 51, 51));
        abilityButton.setForeground(java.awt.Color.YELLOW); 
        
        playerTurnEnd();
    }
    
    
    private void actionListener(){
        
        if(EntityType.Player == state){
            //==================================================================
            // Button Listeners
            //==================================================================
            abilityButton.addActionListener((ActionEvent e) -> {
                abilityButton.setFocusPainted(false);
                abilitySelectionPanel.setVisible(true);
                abilityButton.setBackground(new java.awt.Color(255, 255, 0));
                abilityButton.setForeground(new java.awt.Color(0, 0, 0));              
            });

            attackButton.addActionListener((ActionEvent e) -> {
                attackButton.setFocusPainted(false); 
                players.get(currentPlayerIndex).attack(enemy);
                playerTurnEnd();
            });

            defenceButton.addActionListener((ActionEvent e) -> {
                defenceButton.setFocusPainted(false); 
                
                System.out.println("DEFEND");
                
                currentPlayer.addStatus(Status.TemporaryHealth, 5, currentPlayer);
                currentPlayer.addMana(4);
                
                playerTurnEnd();
            });
            //==================================================================
            // Ability Listeners
            //==================================================================
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
            
            useAbility5.addActionListener((ActionEvent e) -> {

                abilityButtonUsed(5);
            });
            
       }
    }

    private void updateLabels(){
        abilitySelectionPanel.setVisible(false);
        
        playerNameLabel.setText(currentPlayer.getEntityName());

        javax.swing.JButton[] abilityButtons = {useAbility0, useAbility1, useAbility2, useAbility3, useAbility4, useAbility5};
        
        for(int i = 0; i < abilityButtons.length; i++){

            if(i < currentPlayer.abilityList.length){ //should do it with getter
                abilityButtons[i].setVisible(true);
                abilityButtons[i].setText(currentPlayer.getAbility(i).getName());
            } else {
                abilityButtons[i].setVisible(false);
            }
        }

        enemyAttackPowerLabel.setText   ("AttackPower: "    + enemy.attackPower);
        enemyHealthLabel.setText        ("Health: "         + enemy.HP + " / " + enemy.maxHP);
        
        playerAbilityPowerLabel.setText ("AbilityPower: "   + currentPlayer.abilityPower);
        playerAttackPowerLabel.setText  ("AttackPower: "    + currentPlayer.attackPower);
        playerHealthLabel.setText       ("Health: "         + currentPlayer.HP + " / " + currentPlayer.maxHP);
        playerManaLabel.setText         ("Mana: "           + currentPlayer.mana);
        
        
        turnLabel.setText("Turn:" + turnCount);
    }

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new CombatGUI(callback, players, enemy).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abilityButton;
    private javax.swing.JPanel abilitySelectionPanel;
    private javax.swing.JButton attackButton;
    private javax.swing.JButton defenceButton;
    private javax.swing.JLabel enemyAttackPowerLabel;
    private javax.swing.JLabel enemyHealthLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel logLabel;
    private javax.swing.JLabel playerAbilityPowerLabel;
    private javax.swing.JLabel playerAttackPowerLabel;
    private javax.swing.JLabel playerHealthLabel;
    private javax.swing.JLabel playerManaLabel;
    private javax.swing.JLabel playerNameLabel;
    private javax.swing.JLabel turnLabel;
    private javax.swing.JButton useAbility0;
    private javax.swing.JButton useAbility1;
    private javax.swing.JButton useAbility2;
    private javax.swing.JButton useAbility3;
    private javax.swing.JButton useAbility4;
    private javax.swing.JButton useAbility5;
    // End of variables declaration//GEN-END:variables
}
