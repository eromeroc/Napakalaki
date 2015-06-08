/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Model.Treasure;

/**
 *
 * @author sagrario
 */
public class TreasureView extends javax.swing.JPanel {

    private Treasure treasureModel;
    private boolean select=false;
    /**
     * Creates new form TreasureView
     */
    public TreasureView() {
        initComponents();
    }

    

    public boolean isSelected(){
        return select;
    }
    
    public void setTreasure(Treasure t) {
        treasureModel = t;
        name.setText(treasureModel.getName().toUpperCase());
        max.setText("Bonus max: " + Integer.toString(treasureModel.getMaxBonus()));
        min.setText("Bonus min: " + Integer.toString(treasureModel.getMinBonus()));
        coins.setText(Integer.toString(treasureModel.getGoldCoins()) + " monedas");
        type.setText("Tipo: " + treasureModel.getType().toString());
        
        repaint();    
    }
  
    public Treasure getTreasure(){
        return treasureModel;
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        max = new javax.swing.JLabel();
        coins = new javax.swing.JLabel();
        type = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        name.setText("Name");

        min.setText("BonusMin");

        max.setText("BonusMax");

        coins.setText("Coins");

        type.setText("Type");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(type)
                    .addComponent(min)
                    .addComponent(name)
                    .addComponent(max)
                    .addComponent(coins))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(min)
                .addGap(11, 11, 11)
                .addComponent(max, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(coins)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(type)
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        if(select){
            select = false;
            setOpaque(false);
        }
        else{
            select = true;
            setOpaque(true);
        }
        repaint();
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel coins;
    private javax.swing.JLabel max;
    private javax.swing.JLabel min;
    private javax.swing.JLabel name;
    private javax.swing.JLabel type;
    // End of variables declaration//GEN-END:variables

    
}
