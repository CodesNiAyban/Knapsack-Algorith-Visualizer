package knapsack.gui;

import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import java.util.Random;

public class Knapsack_main11 extends javax.swing.JFrame {
    //Global variables
    int V[] = {0,0,0,0,0};
    int W[] = {0,0,0,0,0};
    int capacity = 7;
    int item = V.length;
    int temp = V.length;
    int x = 1, y =0;
    int table[][] = new int[item + 1][capacity + 1];
    int maxValue;
    int codeNavigation=0, codeNavigation2=0;
    int colArrow1, rowArrow1, colArrow2, rowArrow2, currValue;
    boolean fix = false, bestvalue = false;

    public Knapsack_main11() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        Header = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        Code = new javax.swing.JTextArea();
        Descriptor = new javax.swing.JLabel();
        item1 = new javax.swing.JLabel();
        item2 = new javax.swing.JLabel();
        item3 = new javax.swing.JLabel();
        item4 = new javax.swing.JLabel();
        item5 = new javax.swing.JLabel();
        Skip = new javax.swing.JButton();
        Navigate = new javax.swing.JButton();
        Randomize = new javax.swing.JButton();
        restart = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();

        jLabel8.setText("jLabel8");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Header.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Header.setText("KNAPSACK PROBLEM VISUALIZER");

        Table.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "0", "1", "2", "3", "4", "5", "6", "7"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.setAutoscrolls(false);
        Table.setColumnSelectionAllowed(true);
        Table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Table.setEditingColumn(10);
        Table.setEditingRow(10);
        Table.setEnabled(false);
        Table.setRowHeight(32);
        Table.setRowSelectionAllowed(false);
        Table.setShowGrid(true);
        jScrollPane1.setViewportView(Table);

        Code.setColumns(20);
        Code.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Code.setRows(5);
        Code.setText(" for (int row = 1; row <= x; row++) {\n            for (int column = 0; column <= y; column++) {\n                table[row][column] = table[row - 1][column];\n\n                if ((column >= W[row-1]) && (table[row][column] < table[row - 1][column - W[row - 1]] + V[row - 1])) {\n                    table[row][column] = table[row - 1][column - W[row - 1]] + V[row - 1];\n\n                }\n            }\n        }");
        Code.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Code.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        Code.setEnabled(false);
        jScrollPane2.setViewportView(Code);

        Descriptor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Descriptor.setText("STARTING");

        item1.setText("Item 1: Value = 0 Weight = 0");

        item2.setText("Item 2: Value = 0 Weight = 0");

        item3.setText("Item 3: Value = 0 Weight = 0");

        item4.setText("Item 4: Value = 0 Weight = 0");

        item5.setText("Item 5: Value = 0 Weight = 0");

        Skip.setText("FINISH");
        Skip.setEnabled(false);
        Skip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SkipActionPerformed(evt);
            }
        });

        Navigate.setText(">");
        Navigate.setEnabled(false);
        Navigate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NavigateActionPerformed(evt);
            }
        });

        Randomize.setText("RANDOMIZE");
        Randomize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RandomizeActionPerformed(evt);
            }
        });

        restart.setText("RESTART");
        restart.setEnabled(false);
        restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Capacity = 7");

        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Descriptor)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(item1)
                                    .addComponent(item2)
                                    .addComponent(item3)
                                    .addComponent(item4)
                                    .addComponent(item5))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 916, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Randomize, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(restart, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Navigate, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Skip, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(25, 25, 25))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Header)
                .addGap(268, 268, 268))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Header)
                        .addGap(69, 69, 69)
                        .addComponent(item1)
                        .addGap(18, 18, 18)
                        .addComponent(item2)
                        .addGap(18, 18, 18)
                        .addComponent(item3)
                        .addGap(18, 18, 18)
                        .addComponent(item4)
                        .addGap(18, 18, 18)
                        .addComponent(item5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(Descriptor)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel1)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Navigate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Skip, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(restart, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Randomize, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SkipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SkipActionPerformed
//SKIP BUTTON
        DefaultTableModel model = (DefaultTableModel)Table.getModel();
        y = capacity;
        x = item;
        Skip.setEnabled(false);
        Randomize.setEnabled(false);
        Navigate.setEnabled(false);
        restart.setEnabled(true);
        Descriptor.setText("PROCESS FINISHED! ITEMS CHECKED ARE SELECTED");
        
        for (int row = 1; row <= item; row++) {
            for (int column = 0; column <= capacity; column++) {
                table[row][column] = table[row - 1][column];

                if ((column >= W[row-1]) && (table[row][column] < table[row - 1][column - W[row - 1]] + V[row - 1])) {
                    table[row][column] = table[row - 1][column - W[row - 1]] + V[row - 1];
                }
                model.setValueAt(table[row][column] ,row-1 , column);
            }
  
        }
        maxValue = table[item][capacity];
        

        while (item != 0) {
            if (table[item][capacity] != table[item-1][capacity]) {             
                if(item == 1){
                                  
                item1.setText("✓Item 1: Value = " + V[0] + " Weight = " + W[0]);
                      
                }else  if(item == 2){
                                   
                item2.setText("✓Item 2: Value = " + V[1] + " Weight = " + W[1]);
                
                }else  if(item == 3){
                                
                item3.setText("✓Item 3: Value = " + V[2] + " Weight = " + W[3]);
                
                }else  if(item == 4){
                    
                item4.setText("✓Item 4: Value = " + V[3] + " Weight = " + W[4]);
                
                }else{
                    
                Code.setText("Total Max Value:" + maxValue );
                item5.setText("✓Item 5: Value = " + V[4] + " Weight = " + W[4]);
                
                }
                capacity = capacity - W[item-1];
                
            }else if (table[item][capacity] == table[item-1][capacity]){
                if(item == 1){
                    
                item1.setText("✘Item 1: Value = " + V[0] + " Weight = " + W[0]);
                                     
                }else  if(item == 2){
               
                item2.setText("✘Item 2: Value = " + V[1] + " Weight = " + W[1]);
                
                }else  if(item == 3){
               
                item3.setText("✘Item 3: Value = " + V[2] + " Weight = " + W[3]);
                
                }else  if(item == 4){
               
                item4.setText("✘Item 4: Value = " + V[3] + " Weight = " + W[4]);
                
                }else{
                
                item5.setText("✘Item 5: Value = " + V[4] + " Weight = " + W[4]);
                
                }
            }
            item--;
        }
       Code.setText("Total Max Value:" + maxValue );
//SKIP BUTTON
    }//GEN-LAST:event_SkipActionPerformed

    private void RandomizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RandomizeActionPerformed
//RANDOMIZE BUTTON     
      Random randomGenerator = new Random();
      Navigate.setEnabled(true);
      Skip.setEnabled(true);
      restart.setEnabled(false);
      
      for (int row=0; row<item; row++) //Sets whole table to zero
        for (int column=0; column<=capacity; column++) {
            table[row][column] = 0;
      }

      for(int i = 0;i < item;i++){
      V[i] = randomGenerator.nextInt(50) + 1;
      W[i] = randomGenerator.nextInt(4) + 1;
      }
      item1.setText("Item 1: Value = " + V[0] + " Weight = " + W[0]);
      item2.setText("Item 2: Value = " + V[1] + " Weight = " + W[1]);
      item3.setText("Item 3: Value = " + V[2] + " Weight = " + W[2]);
      item4.setText("Item 4: Value = " + V[3] + " Weight = " + W[3]);
      item5.setText("Item 5: Value = " + V[4] + " Weight = " + W[4]);
//RANDOMIZE BUTTON    
    }//GEN-LAST:event_RandomizeActionPerformed

    private void NavigateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NavigateActionPerformed
//NEXT BUTTON
        DefaultTableModel model = (DefaultTableModel)Table.getModel();
        Randomize.setEnabled(false);
        restart.setEnabled(true);
        if(fix == true){
        model.setValueAt(table[rowArrow1][colArrow1],rowArrow1-1 , colArrow1);
        fix = false;
        }
        if(bestvalue == true){
        model.setValueAt(table[rowArrow2][colArrow2],rowArrow2-1  , colArrow2);
        bestvalue = false;
        }
        if(x != temp+1){
          restart.setEnabled(true);  
          if(codeNavigation == -3){
            model.setValueAt(table[rowArrow1][colArrow1],rowArrow1-1, colArrow1);
            Descriptor.setText("Condition finished.");
            Code.setText(" for (int row = 1; row <= x; row++) { \n" +
            "            for (int column = 0; column <= y; column++) {\n" +
            "                table[row][column] = table[row - 1][column];\n" +
            "\n" +
            "                if ((column >= W[row-1]) && (table[row][column] < table[row - 1][column - W[row - 1]] + V[row - 1])) {\n" +
            "                    table[row][column] = table[row - 1][column - W[row - 1]] + V[row - 1];\n" +
            "\n" +
            "                } <======\n" +
            "            }\n" +
            "        } ");
            codeNavigation++;
        }else if(codeNavigation == -2){
            model.setValueAt(table[rowArrow1][colArrow1],rowArrow1-1, colArrow1);
            Descriptor.setText("Executing column loop.");
            Code.setText(" for (int row = 1; row <= x; row++) { \n" +
            "            for (int column = 0; column <= y; column++) {\n" +
            "                table[row][column] = table[row - 1][column];\n" +
            "\n" +
            "                if ((column >= W[row-1]) && (table[row][column] < table[row - 1][column - W[row - 1]] + V[row - 1])) {\n" +
            "                    table[row][column] = table[row - 1][column - W[row - 1]] + V[row - 1];\n" +
            "\n" +
            "                }\n" +
            "            } <======\n" +
            "        } ");
            codeNavigation++;
            if(y != 0){
            codeNavigation++;
            codeNavigation++;
            }
        }else if(codeNavigation == -1){
            Descriptor.setText("Executing row loop.");
            Code.setText(" for (int row = 1; row <= x; row++) { \n" +
            "            for (int column = 0; column <= y; column++) {\n" +
            "                table[row][column] = table[row - 1][column];\n" +
            "\n" +
            "                if ((column >= W[row-1]) && (table[row][column] < table[row - 1][column - W[row - 1]] + V[row - 1])) {\n" +
            "                    table[row][column] = table[row - 1][column - W[row - 1]] + V[row - 1];\n" +
            "\n" +
            "                }\n" +
            "            }\n" +
            "        } <======");
            codeNavigation++;
        }else if(codeNavigation == 0){
            Descriptor.setText("Executing row loop.");
            Code.setText(" for (int row = 1; row <= x; row++) { <======\n" +
            "            for (int column = 0; column <= y; column++) {\n" +
            "                table[row][column] = table[row - 1][column];\n" +
            "\n" +
            "                if ((column >= W[row-1]) && (table[row][column] < table[row - 1][column - W[row - 1]] + V[row - 1])) {\n" +
            "                    table[row][column] = table[row - 1][column - W[row - 1]] + V[row - 1];\n" +
            "\n" +
            "                }\n" +
            "            }\n" +
            "        }");
            codeNavigation++;
        }else  if(codeNavigation == 1){
            Descriptor.setText("Executing column loop.");
            Code.setText(" for (int row = 1; row <= x; row++) { \n" +
            "            for (int column = 0; column <= y; column++) { <======\n" +
            "                table[row][column] = table[row - 1][column];\n" +
            "\n" +
            "                if ((column >= W[row-1]) && (table[row][column] < table[row - 1][column - W[row - 1]] + V[row - 1])) {\n" +
            "                    table[row][column] = table[row - 1][column - W[row - 1]] + V[row - 1];\n" +
            "\n" +
            "                }\n" +
            "            }\n" +
            "        }");
            codeNavigation++;
        }else  if(codeNavigation == 2){
            Descriptor.setText("Setting current table value to value above.");
            Code.setText(" for (int row = 1; row <= x; row++) { \n" +
            "            for (int column = 0; column <= y; column++) { \n" +
            "                table[row][column] = table[row - 1][column]; <======\n" +
            "\n" +
            "                if ((column >= W[row-1]) && (table[row][column] < table[row - 1][column - W[row - 1]] + V[row - 1])) {\n" +
            "                    table[row][column] = table[row - 1][column - W[row - 1]] + V[row - 1];\n" +
            "\n" +
            "                }\n" +
            "            }\n" +
            "        }");
           
            if(x==1){
               model.setValueAt(table[rowArrow1][colArrow1] , 0, colArrow1);
               model.setValueAt(0 + " ←",0, y);
            }else if(x>1){
               model.setValueAt(table[x-1][y] + " ←",x-1, y);
               //model.setValueAt(table[x-2][y] + "↓ ",x-2, y);
               model.setValueAt(table[x-1][y] + "↓ ",x-2, y);
            }
            codeNavigation++;
        }else  if(codeNavigation == 3){
//             if(x==1){
//               //model.setValueAt(0,0, y);
//            }else if(x>1){
//               //model.setValueAt(table[x][y],x-2, y);
//               //model.setValueAt(table[x-1][y],x-1, y);
//            }
            Descriptor.setText("Finding if item weight fits the capacity & if the sum of item above minus the current weight to capacity and current value is the best value.");
            Code.setText("for (int row = 1; row <= x; row++) {\n" + "           for (int column = 0; column <= y; column++) {\n" + "               table[row][column] = table[row - 1][column];\n" + "\n" + "               if ((column >= W[row-1]) && (table[row][column] < table[row - 1][column - W[row - 1]] + V[row - 1])) { <======\n" + "                   table[row][column] = table[row - 1][column - W[row - 1]] + V[row - 1];\n" + "\n" + "               }\n" + "           }\n" + "       }");
            codeNavigation++;
        }else  if(codeNavigation == 4){
            codeNavigation++;
        }
        }
        if(x <=  item && codeNavigation == 5){
        
        for (int row = 1; row <= x; row++) {
            for (int column = 0; column <= y; column++) {
                model.setValueAt(table[row][column] ,row-1 , column);
            }
        } 
//      Code.setText("Empty");
        for (int row = 1; row <= x; row++) {
            for (int column = 0; column <= y; column++) {
                table[row][column] = table[row - 1][column];

                if ((column >= W[row-1]) && (table[row][column] < table[row - 1][column - W[row - 1]] + V[row - 1])) {
                    table[row][column] = table[row - 1][column - W[row - 1]] + V[row - 1];
                    if(row==1){
                    Descriptor.setText("Item " + row + " with Weight " + W[row-1] + ". fits to capacity " + column + " set value to value of current item = " + table[row][column]);
                    Code.setText("for (int row = 1; row <= x; row++) {\n" + "           for (int column = 0; column <= y; column++) {\n" + "               table[row][column] = table[row - 1][column];\n" + "\n" + "               if ((column >= W[row-1]) && (table[row][column] < table[row - 1][column - W[row - 1]] + V[row - 1])) {\n" + "                   table[row][column] = table[row - 1][column - W[row - 1]] + V[row - 1]; <======\n" + "\n" + "               }\n" + "           }\n" + "       }");
                    codeNavigation = -3;
                    bestvalue = false;
                    }else if(row!=0 && table[row - 1][column - W[row - 1]] == 0){
                    Descriptor.setText("Item " + row + " with Weight " + W[row-1] + ". fits to capacity " + column + " set value to value of current item = " + table[row][column]);
                    Code.setText("for (int row = 1; row <= x; row++) {\n" + "           for (int column = 0; column <= y; column++) {\n" + "               table[row][column] = table[row - 1][column];\n" + "\n" + "               if ((column >= W[row-1]) && (table[row][column] < table[row - 1][column - W[row - 1]] + V[row - 1])) {\n" + "                   table[row][column] = table[row - 1][column - W[row - 1]] + V[row - 1]; <======\n" + "\n" + "               }\n" + "           }\n" + "       }");
                    codeNavigation = -3;
                    bestvalue = false;
                    }else{
                    Descriptor.setText("Item fits, to find best value, go back to item " + (row-1) + " and subtract current weight to current capacity to get " +  table[row - 1][column - W[row - 1]]+ " then add curent value");
                    Code.setText("for (int row = 1; row <= x; row++) {\n" + "           for (int column = 0; column <= y; column++) {\n" + "               table[row][column] = table[row - 1][column];\n" + "\n" + "               if ((column >= W[row-1]) && (table[row][column] < table[row - 1][column - W[row - 1]] + V[row - 1])) {\n" + "                   table[row][column] = table[row - 1][column - W[row - 1]] + V[row - 1]; <======\n" + "\n" + "               }\n" + "           }\n" + "       }");
                    if(column == y){
                    colArrow2 = column - W[row - 1];
                    rowArrow2 = row - 1;
                    bestvalue = true;
                    currValue = V[row-1];
                    codeNavigation = -3;
                    }
                    }
                }else{
                    if(row==1){
                    Descriptor.setText("Item " + row + " with Weight " + W[row-1] + ". Does not fit to capacity " + column + " set value to " + table[row][column]);
                     Code.setText("for (int row = 1; row <= x; row++) {\n" + "           for (int column = 0; column <= y; column++) {\n" + "               table[row][column] = table[row - 1][column];\n" + "\n" + "               if ((column >= W[row-1]) && (table[row][column] < table[row - 1][column - W[row - 1]] + V[row - 1])) {\n" + "                   table[row][column] = table[row - 1][column - W[row - 1]] + V[row - 1];\n" + "\n" + "               } <======\n" + "           }\n" + "       }");
                    codeNavigation = -2;
                    bestvalue = false;
                    }else{
                    Descriptor.setText("Item does not fit or/and best value is above = " + table[row][column]);
                     Code.setText("for (int row = 1; row <= x; row++) {\n" + "           for (int column = 0; column <= y; column++) {\n" + "               table[row][column] = table[row - 1][column];\n" + "\n" + "               if ((column >= W[row-1]) && (table[row][column] < table[row - 1][column - W[row - 1]] + V[row - 1])) {\n" + "                   table[row][column] = table[row - 1][column - W[row - 1]] + V[row - 1];\n" + "\n" + "               } <======\n" + "           }\n" + "       }");
                    codeNavigation = -2;
                    bestvalue = false;
                    }
                }
                model.setValueAt(table[row][column] ,row-1 , column);
                colArrow1 = column;
                rowArrow1 = row;
            }
        }
        model.setValueAt(table[rowArrow1][colArrow1] + " ←" ,rowArrow1-1 , colArrow1);
        if(bestvalue == true){
        model.setValueAt(table[rowArrow2][colArrow2] + " ←" ,rowArrow2-1  , colArrow2);
        model.setValueAt(currValue + " + "+ table[rowArrow2][colArrow2] + " ←" ,rowArrow1-1 , colArrow1);
        }
        y++;
        if(y > capacity){
            x++; 
            y = 0;
            codeNavigation = -2;
            model.setValueAt(table[rowArrow1][colArrow1] + " ←",rowArrow1-1 , colArrow1); 
            fix = true;
            if(bestvalue == true){
            model.setValueAt(table[rowArrow2][colArrow2] + " ←" ,rowArrow2-1  , colArrow2);
            model.setValueAt(currValue + " + "+ table[rowArrow2][colArrow2] + " ←" ,rowArrow1-1 , colArrow1);
        }
        }
         maxValue = table[item][capacity];
         
        }else if (x > item){
         if(codeNavigation2 == -3){
            Descriptor.setText("Condition done.");
            Code.setText("while (item != 0) {\n" + "          if (table[item][capacity] != table[item-1][capacity]) {\n" + "              capacity = capacity - W[item-1];\n" + "          } <=====\n" + "          item--;\n" + "      }");
            codeNavigation2++;
        }else if(codeNavigation2 == -2){
            Descriptor.setText("Moving to item above.");
            Code.setText("while (item != 0) {\n" + "          if (table[item][capacity] != table[item-1][capacity]) {\n" + "              capacity = capacity - W[item-1];\n" + "          }\n" + "          item--; <=====\n" + "      }");
            codeNavigation2++;
        }else if(codeNavigation2 == -1){
            Descriptor.setText("Executing while loop.");
            Code.setText("while (item != 0) {\n" + "          if (table[item][capacity] != table[item-1][capacity]) {\n" + "              capacity = capacity - W[item-1];\n" + "          }\n" + "          item--;\n" + "      } <=====");
            codeNavigation2++;
            codeNavigation2++;
        }else if(codeNavigation2 == 0){
            Descriptor.setText("Now finding the included items.");
            Code.setText("while (item != 0) {\n" + "          if (table[item][capacity] != table[item-1][capacity]) {\n" + "              capacity = capacity - W[item-1];\n" + "          }\n" + "          item--;\n" + "      }");
            codeNavigation2++;
        }else  if(codeNavigation2 == 1){
            Descriptor.setText("Executing while loop.");
            Code.setText("while (item != 0) { <=====\n" + "          if (table[item][capacity] != table[item-1][capacity]) {\n" + "              capacity = capacity - W[item-1];\n" + "          }\n" + "          item--;\n" + "      }");
            codeNavigation2++;
        }else  if(codeNavigation2 == 2){
         model.setValueAt(table[item][capacity] + " ←",item-1 , capacity);
         if(item != 1){
         model.setValueAt(table[item-1][capacity] + " ←",item-2 , capacity);
         }
         Descriptor.setText("Checking if current item value is equal or not equal to value above.");
            Code.setText("while (item != 0) {\n" + "          if (table[item][capacity] != table[item-1][capacity]) { <=====\n" + "              capacity = capacity - W[item-1];\n" + "          }\n" + "          item--;\n" + "      }");
            codeNavigation2++;
        }else  if(codeNavigation2 == 3){
            codeNavigation2++;
        }
        if(codeNavigation2 == 4){
         if(item >= 0) {
            if (table[item][capacity] != table[item-1][capacity]) {
                switch (item) {
                    case 1 -> {
                        Descriptor.setText("Item 1 is not equal to 0, item 1 is included, deducting item weight");
                        Code.setText("while (item != 0) {\n" + "          if (table[item][capacity] != table[item-1][capacity]) {\n" + "              capacity = capacity - W[item-1]; <=====\n" + "          }\n" + "          item--;\n" + "      }");
                        item1.setText("✓Item 1: Value = " + V[0] + " Weight = " + W[0]);
                        codeNavigation2 = -3;
                    }
                    case 2 -> {
                        Descriptor.setText("Item 2 is not equal to Item 1, item 2 is included, deducting item weight");
                        Code.setText("while (item != 0) {\n" + "          if (table[item][capacity] != table[item-1][capacity]) {\n" + "              capacity = capacity - W[item-1]; <=====\n" + "          }\n" + "          item--;\n" + "      }");
                        item2.setText("✓Item 2: Value = " + V[1] + " Weight = " + W[1]);
                        codeNavigation2 = -3;
                    }
                    case 3 -> {
                        Descriptor.setText("Item 3 is not equal to Item 2, item 3 is included, deducting item weight");
                        Code.setText("while (item != 0) {\n" + "          if (table[item][capacity] != table[item-1][capacity]) {\n" + "              capacity = capacity - W[item-1]; <=====\n" + "          }\n" + "          item--;\n" + "      }");
                        item3.setText("✓Item 3: Value = " + V[2] + " Weight = " + W[3]);
                        codeNavigation2 = -3;
                    }
                    case 4 -> {
                        Descriptor.setText("Item 4 is not equal to Item 3, item 4 is included, deducting item weight");
                        Code.setText("while (item != 0) {\n" + "          if (table[item][capacity] != table[item-1][capacity]) {\n" + "              capacity = capacity - W[item-1]; <=====\n" + "          }\n" + "          item--;\n" + "      }");
                        item4.setText("✓Item 4: Value = " + V[3] + " Weight = " + W[4]);
                        codeNavigation2 = -3;
                    }
                    default -> {
                        Descriptor.setText("Item 5 is not equal to Item 4, item 5 is included, deducting item weight");
                        Code.setText("while (item != 0) {\n" + "          if (table[item][capacity] != table[item-1][capacity]) {\n" + "              capacity = capacity - W[item-1]; <=====\n" + "          }\n" + "          item--;\n" + "      }");
                        item5.setText("✓Item 5: Value = " + V[4] + " Weight = " + W[4]);
                        codeNavigation2 = -3;
                    }
                }
                capacity = capacity - W[item-1];
            }
            else if (table[item][capacity] == table[item-1][capacity]){
               
                    switch (item) {
                    case 1 -> {
                        Descriptor.setText("Item 1 is equal to 0, item 1 is not included");
                        Code.setText("while (item != 0) {\n" + "          if (table[item][capacity] != table[item-1][capacity]) {\n" + "              capacity = capacity - W[item-1];\n" + "          }<=====\n" + "          item--;\n" + "      }");
                        item1.setText("✘Item 1: Value = " + V[0] + " Weight = " + W[0]);
                        codeNavigation2 = -2;
                    }
                    case 2 -> {
                        Descriptor.setText("Item 2 is equal to Item 1, item 2 is not included");
                        Code.setText("while (item != 0) {\n" + "          if (table[item][capacity] != table[item-1][capacity]) {\n" + "              capacity = capacity - W[item-1];\n" + "          }<=====\n" + "          item--;\n" + "      }");
                        item2.setText("✘Item 2: Value = " + V[1] + " Weight = " + W[1]);
                        codeNavigation2 = -2;
                    }
                    case 3 -> {
                        Descriptor.setText("Item 3 is equal to Item 2, item 3 is not included");
                        Code.setText("while (item != 0) {\n" + "          if (table[item][capacity] != table[item-1][capacity]) {\n" + "              capacity = capacity - W[item-1];\n" + "          }<=====\n" + "          item--;\n" + "      }");
                        item3.setText("✘Item 3: Value = " + V[2] + " Weight = " + W[3]);
                        codeNavigation2 = -2;
                    }
                    case 4 -> {
                        Descriptor.setText("Item 4 is equal to Item 3, item 4 is not included");
                        Code.setText("while (item != 0) {\n" + "          if (table[item][capacity] != table[item-1][capacity]) {\n" + "              capacity = capacity - W[item-1];\n" + "          }<=====\n" + "          item--;\n" + "      }");
                        item4.setText("✘Item 4: Value = " + V[3] + " Weight = " + W[4]);
                        codeNavigation2 = -2;
                    }
                    default -> {
                        Descriptor.setText("Item 5 is equal to Item 4, item 5 is not included");
                        Code.setText("while (item != 0) {\n" + "          if (table[item][capacity] != table[item-1][capacity]) {\n" + "              capacity = capacity - W[item-1];\n" + "          }<=====\n" + "          item--;\n" + "      }");
                        item5.setText("✘Item 5: Value = " + V[4] + " Weight = " + W[4]);
                        codeNavigation2 = -2;
                    }
                }
                
            }
         }item--;
        }      
            if(item <= 0){
             item = V.length;
             x = 1;
             y = 0;
             capacity = 7;

                for (int row = 1; row <= item; row++) {
                    for (int column = 0; column <= capacity; column++) {
                        table[row][column] = table[row - 1][column];

                        if ((column >= W[row-1]) && (table[row][column] < table[row - 1][column - W[row - 1]] + V[row - 1])) {
                            table[row][column] = table[row - 1][column - W[row - 1]] + V[row - 1];
                        }

                        model.setValueAt(table[row][column] ,row-1 , column);
                    }

                }
             Descriptor.setText("PROCESS FINISHED! ITEMS CHECKED ARE SELECTED");
             Code.setText("Total Max Value:" + maxValue );
             Navigate.setEnabled(false);
             Skip.setEnabled(false);
            }
        }
//NEXT BUTTON            
    }//GEN-LAST:event_NavigateActionPerformed

    private void restartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartActionPerformed
//RESTART BUTTON    
    DefaultTableModel model = (DefaultTableModel)Table.getModel();
    item = V.length;
    temp = V.length;
    x = 1; 
    y = 0;
    maxValue = 0;
    codeNavigation = 0; 
    codeNavigation2 = 0;
    colArrow1 = 0; 
    rowArrow1 = 0; 
    colArrow2 = 0; 
    rowArrow2 = 0; 
    currValue = 0;
    fix = false; 
    bestvalue = false;
    capacity = 7;
    Navigate.setEnabled(true);
    restart.setEnabled(false);
    Skip.setEnabled(true);
       for (int row = 1; row <= item; row++) {
            for (int column = 0; column <= capacity; column++) {
                model.setValueAt(" " ,row-1 , column);
            }
        } 
    Code.setText(" for (int row = 1; row <= x; row++) {\n" +
    "            for (int column = 0; column <= y; column++) {\n" +
    "                table[row][column] = table[row - 1][column];\n" +
    "\n" +
    "                if ((column >= W[row-1]) && (table[row][column] < table[row - 1][column - W[row - 1]] + V[row - 1])) {\n" +
    "                    table[row][column] = table[row - 1][column - W[row - 1]] + V[row - 1];\n" +
    "\n" +
    "                }\n" +
    "            }\n" +
    "        }");
    Descriptor.setText("STARTING");
    item1.setText("Item 1: Value = " + V[0] + " Weight = " + W[0]);
    item2.setText("Item 2: Value = " + V[1] + " Weight = " + W[1]);
    item3.setText("Item 3: Value = " + V[2] + " Weight = " + W[2]);
    item4.setText("Item 4: Value = " + V[3] + " Weight = " + W[3]);
    item5.setText("Item 5: Value = " + V[4] + " Weight = " + W[4]);
//RESTART BUTTON    
    }//GEN-LAST:event_restartActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
//RESET BUTTON
    DefaultTableModel model = (DefaultTableModel)Table.getModel();
    item = V.length;
    temp = V.length;
    x = 1; 
    y = 0;
    maxValue = 0;
    codeNavigation = 0; 
    codeNavigation2 = 0;
    colArrow1 = 0; 
    rowArrow1 = 0; 
    colArrow2 = 0; 
    rowArrow2 = 0; 
    currValue = 0;
    fix = false; 
    bestvalue = false;

    capacity = 7;
    capacity = 7;
    Navigate.setEnabled(false);
    restart.setEnabled(false);
    Randomize.setEnabled(true);
    Skip.setEnabled(false);
     for(int i = 0;i < item;i++){
      V[i] = 0;
      W[i] = 0;
     }
     for (int row = 1; row <= item; row++) {
            for (int column = 0; column <= capacity; column++) {
                model.setValueAt(" " ,row-1 , column);
            }
        } 
    Code.setText(" for (int row = 1; row <= x; row++) {\n" +
    "            for (int column = 0; column <= y; column++) {\n" +
    "                table[row][column] = table[row - 1][column];\n" +
    "\n" +
    "                if ((column >= W[row-1]) && (table[row][column] < table[row - 1][column - W[row - 1]] + V[row - 1])) {\n" +
    "                    table[row][column] = table[row - 1][column - W[row - 1]] + V[row - 1];\n" +
    "\n" +
    "                }\n" +
    "            }\n" +
    "        }");
    Descriptor.setText("STARTING");
    item1.setText("Item 1: Value = " + V[0] + " Weight = " + W[0]);
    item2.setText("Item 2: Value = " + V[1] + " Weight = " + W[1]);
    item3.setText("Item 3: Value = " + V[2] + " Weight = " + W[2]);
    item4.setText("Item 4: Value = " + V[3] + " Weight = " + W[3]);
    item5.setText("Item 5: Value = " + V[4] + " Weight = " + W[4]);
//RESET BUTTON
    }//GEN-LAST:event_resetActionPerformed

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Knapsack_main11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Knapsack_main11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Knapsack_main11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Knapsack_main11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Knapsack_main11().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Code;
    private javax.swing.JLabel Descriptor;
    private javax.swing.JLabel Header;
    private javax.swing.JButton Navigate;
    private javax.swing.JButton Randomize;
    private javax.swing.JButton Skip;
    private javax.swing.JTable Table;
    private javax.swing.JLabel item1;
    private javax.swing.JLabel item2;
    private javax.swing.JLabel item3;
    private javax.swing.JLabel item4;
    private javax.swing.JLabel item5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton reset;
    private javax.swing.JButton restart;
    // End of variables declaration//GEN-END:variables

    private void add(Color red) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
