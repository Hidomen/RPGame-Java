package rpgame;

import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class CombatGUI extends javax.swing.JFrame{
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CombatGUI.class.getName());
    
    private static ArrayList<PlayerClass> players;
    private static Enemy enemy;

    private int turnCount = 1;
    private EntityType turn = EntityType.Player;
    
    private PlayerClass currentPlayer;
    private int currentPlayerIndex = 0;
    
    private int alivePlayerCount;
    
    private static GUICallback callback;

    private int waitTimeAsMiliSec = 1000;
    
    public CombatGUI(GUICallback callback, ArrayList<PlayerClass> players, Enemy enemy) {
        
        this.callback = callback;
        this.players = players;
        this.enemy = enemy;
        
        
        currentPlayer = players.get(0);
        alivePlayerCount = players.size();
        
        initComponents();
        
        abilitySelectionPanel.setBackground(Config.COLOR_BLACK);
        getContentPane().setBackground(Config.COLOR_BLACK);
        
        
        actionListener();
        
        attackButton.setFocusPainted(false); 
        updateLabels();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        enemyNameLabel = new javax.swing.JLabel();
        enemyHealthLabel = new javax.swing.JLabel();
        enemyAttackPowerLabel = new javax.swing.JLabel();
        enemyHealthBar = new javax.swing.JProgressBar();
        jPanel2 = new javax.swing.JPanel();
        playerNameLabel = new javax.swing.JLabel();
        playerAttackPowerLabel = new javax.swing.JLabel();
        playerHealthLabel = new javax.swing.JLabel();
        playerManaLabel = new javax.swing.JLabel();
        playerAbilityPowerLabel = new javax.swing.JLabel();
        playerHealthBar = new javax.swing.JProgressBar();
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
        turnLabel = new javax.swing.JLabel();
        logScroll = new javax.swing.JScrollPane();
        logTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setPreferredSize(Config.WINDOW_DIMENSION);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(Config.COLOR_BLACK);
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(Config.COLOR_YELLOW, 3));
        jPanel1.setForeground(Config.COLOR_YELLOW);

        enemyNameLabel.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        enemyNameLabel.setForeground(Config.COLOR_YELLOW);
        enemyNameLabel.setText("Enemy Name");

        enemyHealthLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        enemyHealthLabel.setForeground(Config.COLOR_YELLOW);
        enemyHealthLabel.setText("HP");

        enemyAttackPowerLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        enemyAttackPowerLabel.setForeground(Config.COLOR_YELLOW);
        enemyAttackPowerLabel.setText("AttackPower");

        enemyHealthBar.setBackground(Config.COLOR_BLACK);
        enemyHealthBar.setForeground(Config.COLOR_YELLOW);
        enemyHealthBar.setMaximum(Config.MaxHPLimits[1]);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enemyNameLabel)
                    .addComponent(enemyAttackPowerLabel)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(enemyHealthLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(enemyHealthBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(enemyNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(enemyHealthLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(enemyHealthBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enemyAttackPowerLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.ipady = 68;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jPanel1, gridBagConstraints);

        jPanel2.setBackground(Config.COLOR_BLACK);
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(Config.COLOR_YELLOW, 3));
        jPanel2.setForeground(Config.COLOR_YELLOW);

        playerNameLabel.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        playerNameLabel.setForeground(Config.COLOR_YELLOW);
        playerNameLabel.setText("Player Name");

        playerAttackPowerLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        playerAttackPowerLabel.setForeground(Config.COLOR_YELLOW);
        playerAttackPowerLabel.setText("AttackPower");

        playerHealthLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        playerHealthLabel.setForeground(Config.COLOR_YELLOW);
        playerHealthLabel.setText("HP");

        playerManaLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        playerManaLabel.setForeground(Config.COLOR_YELLOW);
        playerManaLabel.setText("Mana");

        playerAbilityPowerLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        playerAbilityPowerLabel.setForeground(Config.COLOR_YELLOW);
        playerAbilityPowerLabel.setText("AbilityPower");

        playerHealthBar.setBackground(Config.COLOR_BLACK);
        playerHealthBar.setForeground(Config.COLOR_YELLOW);
        playerHealthBar.setMaximum(Config.MaxHPLimits[1]);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerNameLabel)
                    .addComponent(playerAttackPowerLabel)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(playerHealthLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(playerHealthBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(playerManaLabel)
                    .addComponent(playerAbilityPowerLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(playerNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerHealthLabel)
                    .addComponent(playerHealthBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerAttackPowerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerManaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerAbilityPowerLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jPanel2, gridBagConstraints);

        jPanel3.setBackground(Config.COLOR_BLACK);
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(Config.COLOR_YELLOW, 3));
        jPanel3.setForeground(Config.COLOR_YELLOW);
        jPanel3.setLayout(new java.awt.GridBagLayout());

        attackButton.setBackground(Config.COLOR_YELLOW);
        attackButton.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        attackButton.setForeground(new java.awt.Color(51, 51, 51));
        attackButton.setText("Attack");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 0, 0);
        jPanel3.add(attackButton, gridBagConstraints);

        abilityButton.setBackground(Config.COLOR_BLACK);
        abilityButton.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        abilityButton.setForeground(Config.COLOR_YELLOW);
        abilityButton.setText("Ability");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 7, 0, 0);
        jPanel3.add(abilityButton, gridBagConstraints);

        defenceButton.setBackground(Config.COLOR_YELLOW);
        defenceButton.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        defenceButton.setForeground(new java.awt.Color(51, 51, 51));
        defenceButton.setText("Defence");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 7, 0, 0);
        jPanel3.add(defenceButton, gridBagConstraints);

        abilitySelectionPanel.setBackground(Config.COLOR_DARK_BLACK);
        abilitySelectionPanel.setBorder(javax.swing.BorderFactory.createLineBorder(Config.COLOR_YELLOW, 2));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel4.setForeground(Config.COLOR_YELLOW);
        jLabel4.setText("Player Abilities");

        useAbility0.setBackground(Config.COLOR_YELLOW);
        useAbility0.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        useAbility0.setForeground(new java.awt.Color(51, 51, 51));
        useAbility0.setText("Ability0");

        useAbility1.setBackground(Config.COLOR_YELLOW);
        useAbility1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        useAbility1.setForeground(new java.awt.Color(51, 51, 51));
        useAbility1.setText("Ability1");

        useAbility2.setBackground(Config.COLOR_YELLOW);
        useAbility2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        useAbility2.setForeground(new java.awt.Color(51, 51, 51));
        useAbility2.setText("Ability2");

        useAbility3.setBackground(Config.COLOR_YELLOW);
        useAbility3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        useAbility3.setForeground(new java.awt.Color(51, 51, 51));
        useAbility3.setText("Ability3");

        useAbility4.setBackground(Config.COLOR_YELLOW);
        useAbility4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        useAbility4.setForeground(new java.awt.Color(51, 51, 51));
        useAbility4.setText("Ability4");
        useAbility4.setToolTipText("");

        useAbility5.setBackground(Config.COLOR_YELLOW);
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

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 18, 31, 52);
        jPanel3.add(abilitySelectionPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.ipadx = 45;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jPanel3, gridBagConstraints);

        jPanel4.setBackground(Config.COLOR_BLACK);
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(Config.COLOR_YELLOW, 3));
        jPanel4.setForeground(Config.COLOR_YELLOW);
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel5.setForeground(Config.COLOR_YELLOW);
        jLabel5.setText("¤");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel4.add(jLabel5, gridBagConstraints);

        turnLabel.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        turnLabel.setForeground(Config.COLOR_YELLOW);
        turnLabel.setText("Turn");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.ipadx = 60;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel4.add(turnLabel, gridBagConstraints);

        logTextArea.setBackground(Config.COLOR_BLACK);
        logTextArea.setColumns(20);
        logTextArea.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        logTextArea.setForeground(Config.COLOR_YELLOW);
        logTextArea.setLineWrap(true);
        logTextArea.setRows(3);
        logTextArea.setTabSize(15);
        logTextArea.setWrapStyleWord(true);
        logTextArea.setFocusable(false);
        logScroll.setViewportView(logTextArea);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 19, 6, 19);
        jPanel4.add(logScroll, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 52;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jPanel4, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void updateLog(Entity attacker, Entity attacked, int damage){
        logTextArea.setText(attacker.getEntityName() + " ATTACKED " + attacked.getEntityName() + " dealt " + damage + " damage. REMAINING: " + attacked.HP);
    }
    
    private void updateLog(String s){
        logTextArea.setText(s);
    }
       
    private void nextPlayer(){
        if(players.size() <= 0) return;
        currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
    }
    
    private void nextTurn(){
        
        turn = EntityType.values()[(turn.ordinal() + 1) % 2];
        
        if(turn == EntityType.Player){
            
            nextPlayer();
            currentPlayer = players.get(currentPlayerIndex);
        }

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

            updateLog(enemy.getEntityName() + "is stunned.");
            enemy.endTurnEffects();
            return;
        }
        
        enemy.attack(currentPlayer); 
        
        updateLabels();
        updateLog(enemy, currentPlayer, enemy.attackPower);
        
        enemy.endTurnEffects();
        
        nextTurn();
        stateManager();
    }

    private void updateButtons(){
        boolean isActive = (EntityType.Player == turn);
        
        
        attackButton.setEnabled(isActive);
        abilityButton.setEnabled(isActive);
        defenceButton.setEnabled(isActive);
    }
    
    private void stateManager(){
        
        if (enemy.isDead()){
            callback.combatWin();
            callback.setGUIState(GUIState.LOBBY, this.getLocation());
            return;
        }
        
        updateButtons();
        
        switch(turn){
            
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
                
                
                Timer timer = new Timer(waitTimeAsMiliSec, e -> {
                    
                    enemyTurn();
                
                    
                    ((Timer)e.getSource()).stop();
                });
        
                timer.setRepeats(false);
                timer.start();
                
                
            }
            
        }
        updateLabels();
    }
    
    
    private void abilityButtonUsed(int index){
        try
        {
            Ability usedAbility = currentPlayer.getAbility(index);

            if(!currentPlayer.isManaEnough(usedAbility)){
                throw new InsufficientManaException(this, currentPlayer.mana , usedAbility.getCost());
            }

            abilityButton.setFocusPainted(false);


            currentPlayer.useAbility(usedAbility, enemy);
            updateLog(currentPlayer.getEntityName() + " used " + usedAbility.getName());

            abilitySelectionPanel.setVisible(false);

            abilityButton.setBackground(Config.COLOR_BLACK);
            abilityButton.setForeground(java.awt.Color.YELLOW); 

            playerTurnEnd();            
        } catch (InsufficientManaException e)
        {
            e.message();
        }
        

    }
    
    
    private void actionListener(){
        //==================================================================
        // Button Listeners
        //==================================================================
        abilityButton.addActionListener((ActionEvent e) -> {
            abilityButton.setFocusPainted(false);
            abilitySelectionPanel.setVisible(true);
            abilityButton.setBackground(Config.COLOR_YELLOW);
            abilityButton.setForeground(Config.COLOR_BLACK);   

        });

        attackButton.addActionListener((ActionEvent e) -> {
            attackButton.setFocusPainted(false); 

            players.get(currentPlayerIndex).attack(enemy);
            updateLog(currentPlayer, enemy, currentPlayer.attackPower);

            playerTurnEnd();
        });

        defenceButton.addActionListener((ActionEvent e) -> {
            defenceButton.setFocusPainted(false); 

            currentPlayer.addStatus(Status.TemporaryHealth, 5, currentPlayer);
            currentPlayer.addMana(4);
            updateLog(currentPlayer.getEntityName() + " used defence");

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

    
    private void updateLabels(){
        
        updateButtons();
        
        
        
        abilitySelectionPanel.setVisible(false);
        
        playerNameLabel.setText(currentPlayer.getEntityName());
        enemyNameLabel.setText(enemy.getEntityName());

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
        enemyHealthLabel.setText        ("HP: "         + enemy.HP);
        
        playerAbilityPowerLabel.setText ("AbilityPower: "   + currentPlayer.abilityPower);
        playerAttackPowerLabel.setText  ("AttackPower: "    + currentPlayer.attackPower);
        playerHealthLabel.setText       ("HP: "         + currentPlayer.HP);
        playerManaLabel.setText         ("Mana: "           + currentPlayer.mana);
        
        playerHealthBar.setMaximum(currentPlayer.maxHP);
        playerHealthBar.setValue(currentPlayer.HP);
        
        enemyHealthBar.setMaximum(enemy.maxHP);
        enemyHealthBar.setValue(enemy.HP);
        
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
    private javax.swing.JProgressBar enemyHealthBar;
    private javax.swing.JLabel enemyHealthLabel;
    private javax.swing.JLabel enemyNameLabel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane logScroll;
    private javax.swing.JTextArea logTextArea;
    private javax.swing.JLabel playerAbilityPowerLabel;
    private javax.swing.JLabel playerAttackPowerLabel;
    private javax.swing.JProgressBar playerHealthBar;
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
