/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Model.BadConsequenceTypeTreasures;
import Model.Treasure;
import Model.TreasureKind;
import java.util.ArrayList;
import javax.swing.JPanel;
/**
 *
 * @author sagrario
 */
public class BadConsequenceTypeTreasureView extends javax.swing.JPanel {
    BadConsequenceTypeTreasures bcTypeModel;
    /**
     * Creates new form BadConsequenceTypeTreasureView
     */
    public BadConsequenceTypeTreasureView() {
        initComponents();
    }

    public void setBadConsequenceTypeTreasuresModel(BadConsequenceTypeTreasures bc){
        bcTypeModel = bc;
        
        text.setText(bcTypeModel.getText());
        levels.setText(Integer.toString(bcTypeModel.getLevels()));
        
        visibleTreasures.setText(bcTypeModel.arrayToString(bcTypeModel.getSpecificVisibleTreasures()));
        hiddenTreasures.setText(bcTypeModel.arrayToString(bcTypeModel.getSpecificHiddenTreasures()));
        
        repaint();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text = new javax.swing.JLabel();
        levels = new javax.swing.JLabel();
        visibleTreasures = new javax.swing.JLabel();
        hiddenTreasures = new javax.swing.JLabel();

        levels.setText("Niveles que pierdes:");

        visibleTreasures.setText("Tesoros visibles que pierdes:");

        hiddenTreasures.setText("Tesoros ocultos que pierdes:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(visibleTreasures)
                            .addComponent(levels)
                            .addComponent(hiddenTreasures))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(levels)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(visibleTreasures)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hiddenTreasures)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hiddenTreasures;
    private javax.swing.JLabel levels;
    private javax.swing.JLabel text;
    private javax.swing.JLabel visibleTreasures;
    // End of variables declaration//GEN-END:variables
}
