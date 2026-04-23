package rpgame;

import java.awt.event.*;
import java.util.ArrayList;

enum CombatState {PLAYER_TURN, ENEMY_TURN};

public class CombatGUI extends javax.swing.JFrame{
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CombatGUI.class.getName());
    
    
    private static ArrayList<PlayerClass> players;
    private static Enemy enemy;
    

    private int turnCount = 1;
    private CombatState state;

    
    private PlayerClass currentPlayer;  //used for checking things
    private int currentPlayerIndex;     //used if an action affects player
    
    private static GUICallback callback;
    
    public CombatGUI(GUICallback callback, ArrayList<PlayerClass> players, Enemy enemy) {
        
        this.callback = callback;
        this.players = players;
        this.enemy = enemy;
        
        state = CombatState.PLAYER_TURN;
        
        currentPlayerIndex = 0;
        currentPlayer = players.get(0);
        
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
        enemyManaLabel = new javax.swing.JLabel();
        enemyAbilityPowerLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        playerNameLabel = new javax.swing.JLabel();
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
        useAbility5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

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

        enemyManaLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        enemyManaLabel.setForeground(new java.awt.Color(255, 255, 0));
        enemyManaLabel.setText("Mana");

        enemyAbilityPowerLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        enemyAbilityPowerLabel.setForeground(new java.awt.Color(255, 255, 0));
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(playerHealthLabel)
                        .addComponent(playerAttackPowerLabel)
                        .addComponent(playerManaLabel)
                        .addComponent(playerAbilityPowerLabel))
                    .addComponent(playerNameLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(playerNameLabel)
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

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 3));
        jPanel3.setForeground(new java.awt.Color(255, 255, 0));

        turnLabel.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        turnLabel.setForeground(new java.awt.Color(255, 255, 0));
        turnLabel.setText("Turn");

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

        abilitySelectionPanel.setBackground(new java.awt.Color(51, 51, 51));
        abilitySelectionPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Player Abilities");

        useAbility0.setBackground(new java.awt.Color(255, 255, 0));
        useAbility0.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        useAbility0.setForeground(new java.awt.Color(51, 51, 51));
        useAbility0.setText("Ability0");

        useAbility1.setBackground(new java.awt.Color(255, 255, 0));
        useAbility1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        useAbility1.setForeground(new java.awt.Color(51, 51, 51));
        useAbility1.setText("Ability1");

        useAbility2.setBackground(new java.awt.Color(255, 255, 0));
        useAbility2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        useAbility2.setForeground(new java.awt.Color(51, 51, 51));
        useAbility2.setText("Ability2");

        useAbility3.setBackground(new java.awt.Color(255, 255, 0));
        useAbility3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        useAbility3.setForeground(new java.awt.Color(51, 51, 51));
        useAbility3.setText("Ability3");

        useAbility4.setBackground(new java.awt.Color(255, 255, 0));
        useAbility4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        useAbility4.setForeground(new java.awt.Color(51, 51, 51));
        useAbility4.setText("Ability4");
        useAbility4.setToolTipText("");

        useAbility5.setBackground(new java.awt.Color(255, 255, 0));
        useAbility5.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        useAbility5.setForeground(new java.awt.Color(51, 51, 51));
        useAbility5.setText("Ability5");
        useAbility5.setToolTipText("");

        javax.swing.GroupLayout abilitySelectionPanelLayout = new javax.swing.GroupLayout(abilitySelectionPanel);
        abilitySelectionPanel.setLayout(abilitySelectionPanelLayout);
        abilitySelectionPanelLayout.setHorizontalGroup(
            abilitySelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abilitySelectionPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(abilitySelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(abilitySelectionPanelLayout.createSequentialGroup()
                        .addComponent(useAbility4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(useAbility5))
                    .addComponent(jLabel4)
                    .addGroup(abilitySelectionPanelLayout.createSequentialGroup()
                        .addComponent(useAbility0)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(useAbility1))
                    .addGroup(abilitySelectionPanelLayout.createSequentialGroup()
                        .addComponent(useAbility2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(useAbility3)))
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
                .addGap(61, 61, 61))
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
                .addContainerGap(193, Short.MAX_VALUE))
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

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 3));
        jPanel4.setForeground(new java.awt.Color(255, 255, 0));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Log");

        jLabel3.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("PLAYER used ...");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void nextPlayer(){
        if(players.size() <= 0) return;
        currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
    }
    
    private void nextTurn(){
        
        if(state == CombatState.PLAYER_TURN){
            
            nextPlayer();
            currentPlayer = players.get(currentPlayerIndex);
        }
        
        state = CombatState.values()[(state.ordinal() + 1) % 2];
        stateManager();
    }

    private void playerTurnStart(){
        System.out.println("PLAYER TURN"); //debug
                
        
        if(players.get(currentPlayerIndex).checkStatus()){
            System.out.println(currentPlayer.getEntityName() + "IS STUNNED");
            nextTurn();  
        }
        
        // Listen Buttons
    }
    
    private void playerTurnEnd(){
        players.get(currentPlayerIndex).endTurnEffects();
                
        nextTurn();
    }
    
    private void enemyTurn(){
        System.out.println("ENEMY TURN");
                
        if(enemy.checkStatus()){
            System.out.println(enemy.getEntityName() + "IS STUNNED");
            return;
        }
        
        enemy.turn(players, currentPlayerIndex); 
        enemy.endTurnEffects();
    }

    
    private void stateManager(){
        
        if (enemy.isDead()){
            callback.combatWin();
        }
        
        
        
        //animation maybe
        
        switch(state){
            
            case CombatState.PLAYER_TURN -> {
                if(currentPlayer.isDead()){
                    
                    if(players.size() <= 1){
                        callback.gameOver();
                        callback.setGUIState(GUIState.GAME_OVER);
                    }
                    else{
                        players.remove(currentPlayerIndex);
                        stateManager();
                    }
                    
                }
                
                playerTurnStart();
                
                
            }
            case CombatState.ENEMY_TURN -> {

                 
                enemyTurn();
                //enemyTurnFinished
                
                nextTurn();
                stateManager();
            }
            
        }
        
        updateLabels();
    }
    
    
    
    private void abilityButtonUsed(int index){
        
        Ability usedAbility = currentPlayer.getAbility(index);
        
        
        if(!currentPlayer.isManaEnough(usedAbility)){
            System.err.println("Player's mana is not enough to perform ability");
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
        
        if(CombatState.PLAYER_TURN == state){
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

        enemyAbilityPowerLabel.setText  ("AbilityPower: "   + enemy.abilityPower);
        enemyAttackPowerLabel.setText   ("AttackPower: "    + enemy.attackPower);
        enemyHealthLabel.setText        ("Health: "         + enemy.HP + " / " + enemy.maxHP);
        enemyManaLabel.setText          ("Mana: "           + enemy.mana);
        
        playerAbilityPowerLabel.setText ("AbilityPower: "   + currentPlayer.abilityPower);
        playerAttackPowerLabel.setText  ("AttackPower: "    + currentPlayer.attackPower);
        playerHealthLabel.setText       ("Health: "         + currentPlayer.HP + " / " + currentPlayer.maxHP);
        playerManaLabel.setText         ("Mana: "           + currentPlayer.mana);
        
        
        jLabel3.setText("TurnCount: " + turnCount);
        turnLabel.setText("Turn:"); //gonna fixed 
    }

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new CombatGUI(callback, players, enemy).setVisible(true));
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
