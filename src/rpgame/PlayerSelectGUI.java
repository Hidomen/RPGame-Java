package rpgame;


public class PlayerSelectGUI extends javax.swing.JFrame{
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PlayerSelectGUI.class.getName());

    private int addedPlayerCount;
    private static int playerCount;
    private static GUICallback callback;
    
    
    private PlayerClass selectedClass;
    
    public PlayerSelectGUI(GUICallback callback, int playerCount) {
        
        this.callback = callback;
        this.playerCount = playerCount;
        
        addedPlayerCount = 0;
        
        initComponents();
        
        //game = new Game(playerCount);
        mageButton.setFocusPainted(false); 
        
        InfoPanel.setVisible(false);        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
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
        ability4_name = new javax.swing.JLabel();
        ability4_desc = new javax.swing.JLabel();
        ability5_name = new javax.swing.JLabel();
        ability5_desc = new javax.swing.JLabel();
        ability6_name = new javax.swing.JLabel();
        ability6_desc = new javax.swing.JLabel();
        addPlayerButton = new javax.swing.JButton();
        continueButton = new javax.swing.JButton();
        playerNameField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setMaximumSize(new java.awt.Dimension(990, 735));
        setMinimumSize(new java.awt.Dimension(990, 735));
        setPreferredSize(new java.awt.Dimension(990, 735));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setMaximumSize(new java.awt.Dimension(1000, 700));
        jPanel2.setMinimumSize(new java.awt.Dimension(1000, 700));
        jPanel2.setName(""); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 700));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        mageButton.setBackground(new java.awt.Color(51, 51, 51));
        mageButton.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        mageButton.setForeground(new java.awt.Color(255, 255, 0));
        mageButton.setText("Mage");
        mageButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));
        mageButton.setMaximumSize(new java.awt.Dimension(92, 28));
        mageButton.setMinimumSize(new java.awt.Dimension(92, 28));
        mageButton.setPreferredSize(new java.awt.Dimension(92, 28));
        mageButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mageButtonMouseEntered(evt);
            }
        });
        mageButton.addActionListener(this::mageButtonActionPerformed);

        archerButton.setBackground(new java.awt.Color(51, 51, 51));
        archerButton.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        archerButton.setForeground(new java.awt.Color(255, 255, 0));
        archerButton.setText("Archer");
        archerButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));
        archerButton.setMaximumSize(new java.awt.Dimension(92, 28));
        archerButton.setMinimumSize(new java.awt.Dimension(92, 28));
        archerButton.setPreferredSize(new java.awt.Dimension(92, 28));
        archerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                archerButtonMouseEntered(evt);
            }
        });
        archerButton.addActionListener(this::archerButtonActionPerformed);

        healerButton.setBackground(new java.awt.Color(51, 51, 51));
        healerButton.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        healerButton.setForeground(new java.awt.Color(255, 255, 0));
        healerButton.setText("Healer");
        healerButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));
        healerButton.setMaximumSize(new java.awt.Dimension(92, 28));
        healerButton.setMinimumSize(new java.awt.Dimension(92, 28));
        healerButton.setPreferredSize(new java.awt.Dimension(92, 28));
        healerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                healerButtonMouseEntered(evt);
            }
        });
        healerButton.addActionListener(this::healerButtonActionPerformed);

        warriorButton.setBackground(new java.awt.Color(51, 51, 51));
        warriorButton.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        warriorButton.setForeground(new java.awt.Color(255, 255, 0));
        warriorButton.setText("Warrior");
        warriorButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));
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
                    .addComponent(mageButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(mageButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(archerButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(healerButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(warriorButton)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Pick your Class");

        InfoPanel.setBackground(new java.awt.Color(51, 51, 51));
        InfoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 5));
        InfoPanel.setForeground(new java.awt.Color(255, 255, 0));
        InfoPanel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        InfoPanel.setMaximumSize(new java.awt.Dimension(523, 580));
        InfoPanel.setMinimumSize(new java.awt.Dimension(523, 580));
        InfoPanel.setPreferredSize(new java.awt.Dimension(503, 580));

        classIndicator.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        classIndicator.setForeground(new java.awt.Color(255, 255, 0));
        classIndicator.setText("No Class Hovered");

        ability1_name.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        ability1_name.setForeground(new java.awt.Color(255, 255, 0));
        ability1_name.setText("Ability1_name");
        ability1_name.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        ability2_name.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        ability2_name.setForeground(new java.awt.Color(255, 255, 0));
        ability2_name.setText("Ability2_name");
        ability2_name.setFocusable(false);
        ability2_name.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        ability3_name.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        ability3_name.setForeground(new java.awt.Color(255, 255, 0));
        ability3_name.setText("Ability3_name");

        ability1_desc.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ability1_desc.setForeground(new java.awt.Color(255, 255, 0));
        ability1_desc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ability1_desc.setText("Ability1_desc");
        ability1_desc.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        ability2_desc.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ability2_desc.setForeground(new java.awt.Color(255, 255, 0));
        ability2_desc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ability2_desc.setText("Ability2_desc");
        ability2_desc.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        ability3_desc.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ability3_desc.setForeground(new java.awt.Color(255, 255, 0));
        ability3_desc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ability3_desc.setText("Ability3_desc");

        healthLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        healthLabel.setForeground(new java.awt.Color(255, 255, 0));
        healthLabel.setText("Health:");

        attackLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        attackLabel.setForeground(new java.awt.Color(255, 255, 0));
        attackLabel.setText("Attack:");

        manaLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        manaLabel.setForeground(new java.awt.Color(255, 255, 0));
        manaLabel.setText("Mana:");

        abilityPowerLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        abilityPowerLabel.setForeground(new java.awt.Color(255, 255, 0));
        abilityPowerLabel.setText("AbilityPower:");

        ability4_name.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        ability4_name.setForeground(new java.awt.Color(255, 255, 0));
        ability4_name.setText("Ability4_name");

        ability4_desc.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ability4_desc.setForeground(new java.awt.Color(255, 255, 0));
        ability4_desc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ability4_desc.setText("Ability4_desc");

        ability5_name.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        ability5_name.setForeground(new java.awt.Color(255, 255, 0));
        ability5_name.setText("Ability5_name");

        ability5_desc.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ability5_desc.setForeground(new java.awt.Color(255, 255, 0));
        ability5_desc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ability5_desc.setText("Ability5_desc");

        ability6_name.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        ability6_name.setForeground(new java.awt.Color(255, 255, 0));
        ability6_name.setText("Ability6_name");

        ability6_desc.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ability6_desc.setForeground(new java.awt.Color(255, 255, 0));
        ability6_desc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ability6_desc.setText("Ability6_desc");

        javax.swing.GroupLayout InfoPanelLayout = new javax.swing.GroupLayout(InfoPanel);
        InfoPanel.setLayout(InfoPanelLayout);
        InfoPanelLayout.setHorizontalGroup(
            InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ability6_name)
                    .addComponent(ability5_name)
                    .addComponent(ability4_name)
                    .addComponent(ability1_name)
                    .addComponent(ability2_name)
                    .addComponent(classIndicator)
                    .addComponent(ability3_name)
                    .addGroup(InfoPanelLayout.createSequentialGroup()
                        .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(attackLabel)
                            .addComponent(healthLabel))
                        .addGap(141, 141, 141)
                        .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(abilityPowerLabel)
                            .addComponent(manaLabel)))
                    .addGroup(InfoPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ability6_desc)
                            .addComponent(ability5_desc)
                            .addComponent(ability4_desc)
                            .addComponent(ability1_desc)
                            .addComponent(ability2_desc)
                            .addComponent(ability3_desc))))
                .addContainerGap(170, Short.MAX_VALUE))
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
                .addGap(30, 30, 30)
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
                .addGap(18, 18, 18)
                .addComponent(ability4_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ability4_desc)
                .addGap(18, 18, 18)
                .addComponent(ability5_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ability5_desc)
                .addGap(18, 18, 18)
                .addComponent(ability6_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ability6_desc)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        classIndicator.getAccessibleContext().setAccessibleName("ClassIndicator");
        healthLabel.getAccessibleContext().setAccessibleName("Health");
        attackLabel.getAccessibleContext().setAccessibleName("Attack");
        manaLabel.getAccessibleContext().setAccessibleName("Mana");
        abilityPowerLabel.getAccessibleContext().setAccessibleName("AbilityPower");

        addPlayerButton.setBackground(new java.awt.Color(255, 255, 0));
        addPlayerButton.setFont(new java.awt.Font("Arial", 3, 20)); // NOI18N
        addPlayerButton.setForeground(new java.awt.Color(51, 51, 51));
        addPlayerButton.setText("Add Player");
        addPlayerButton.addActionListener(this::addPlayerButtonActionPerformed);

        continueButton.setBackground(new java.awt.Color(255, 255, 0));
        continueButton.setFont(new java.awt.Font("Arial", 3, 20)); // NOI18N
        continueButton.setForeground(new java.awt.Color(51, 51, 51));
        continueButton.setText("Continue");
        continueButton.setToolTipText("");
        continueButton.addActionListener(this::continueButtonActionPerformed);

        playerNameField.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        playerNameField.setText("name");
        playerNameField.addActionListener(this::playerNameFieldActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(continueButton)
                    .addComponent(addPlayerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerNameField))
                .addContainerGap(806, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, Short.MAX_VALUE)
                    .addComponent(InfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(339, 339, 339)
                .addComponent(playerNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(addPlayerButton)
                .addGap(18, 18, 18)
                .addComponent(continueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(InfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(79, 365, Short.MAX_VALUE)))
                    .addContainerGap()))
        );

        InfoPanel.getAccessibleContext().setAccessibleName("InfoPanel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mageButtonActionPerformed
        
        selectedClass = new Mage();
        highlightSelected(mageButton);
    }//GEN-LAST:event_mageButtonActionPerformed

    private void archerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archerButtonActionPerformed
        
        selectedClass = new Archer();
        highlightSelected(archerButton);
    }//GEN-LAST:event_archerButtonActionPerformed

    private void healerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healerButtonActionPerformed
        
        selectedClass = new Healer();
        highlightSelected(healerButton);
    }//GEN-LAST:event_healerButtonActionPerformed

    private void warriorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warriorButtonActionPerformed
        
        selectedClass = new Warrior();
        highlightSelected(warriorButton);
    }//GEN-LAST:event_warriorButtonActionPerformed

    private void highlightSelected(javax.swing.JButton selected) {
        javax.swing.JButton[] buttons = {mageButton, archerButton, healerButton, warriorButton};
    
        for (javax.swing.JButton b : buttons) {
            b.setBackground(new java.awt.Color(51, 51, 51));
            b.setForeground(new java.awt.Color(255, 255, 0));
            b.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));
            b.setFocusPainted(false); 
        }
    
        selected.setBackground(new java.awt.Color(255, 255, 0));
        selected.setForeground(new java.awt.Color(0, 0, 0));
        selected.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 4));
    }
    
    private void infoPanel(PlayerClass hoveredClass){
        
        if(!InfoPanel.isVisible()) InfoPanel.setVisible(true);
        
        classIndicator.setText(hoveredClass.className.toString());

        Ability infoPanelAbilityLister; //used for list ability features
        
        javax.swing.JLabel[][] abilityLabels = {
            {ability1_name, ability1_desc},
            {ability2_name, ability2_desc},
            {ability3_name, ability3_desc},
            {ability4_name, ability4_desc},
            {ability5_name, ability5_desc},
            {ability6_name, ability6_desc},
        };
        
        for(int i = 0; i < abilityLabels.length; i++){
            
            infoPanelAbilityLister = hoveredClass.getAbility(i);
            
            if(infoPanelAbilityLister != null){
            
                abilityLabels[i][0].setVisible(true);
                abilityLabels[i][1].setVisible(true);
                
                abilityLabels[i][0].setText(infoPanelAbilityLister.getName());
                abilityLabels[i][1].setText(infoPanelAbilityLister.getDescription());
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
        
        if(null == selectedClass){
            
            System.err.println("None of Classes Selected");
            return;
        }
        String namePlayer = playerNameField.getText().trim();
        if (namePlayer.equals("name") || namePlayer.isEmpty() || namePlayer == null ) {
            System.err.println("PLAYER NAME IS INVALID");
            return;
        }
        selectedClass.setEntityName(namePlayer);
        callback.addPlayer(selectedClass);
        addedPlayerCount++;
        
        addPlayerButton.setFocusPainted(false);
    }//GEN-LAST:event_addPlayerButtonActionPerformed

    private void continueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueButtonActionPerformed
        continueButton.setFocusPainted(false);
        
        if(addedPlayerCount < playerCount){
            
            System.err.println("INSUFFICIENT PLAYER ADDED"); //popup
            return;
        }

        
        callback.setGUIState(GUIState.START_GAME);
    }//GEN-LAST:event_continueButtonActionPerformed

    private void playerNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerNameFieldActionPerformed
        
        
        
    }//GEN-LAST:event_playerNameFieldActionPerformed


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
        java.awt.EventQueue.invokeLater(() -> new PlayerSelectGUI(callback, playerCount).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel InfoPanel;
    private javax.swing.JLabel ability1_desc;
    private javax.swing.JLabel ability1_name;
    private javax.swing.JLabel ability2_desc;
    private javax.swing.JLabel ability2_name;
    private javax.swing.JLabel ability3_desc;
    private javax.swing.JLabel ability3_name;
    private javax.swing.JLabel ability4_desc;
    private javax.swing.JLabel ability4_name;
    private javax.swing.JLabel ability5_desc;
    private javax.swing.JLabel ability5_name;
    private javax.swing.JLabel ability6_desc;
    private javax.swing.JLabel ability6_name;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton mageButton;
    private javax.swing.JLabel manaLabel;
    private javax.swing.JTextField playerNameField;
    private javax.swing.JButton warriorButton;
    // End of variables declaration//GEN-END:variables
}
