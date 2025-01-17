/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package TM470Project.ui;

import TM470Project.Entry;
import TM470Project.EntryType;
import TM470Project.TM470ProjectRunner;

import javax.persistence.NonUniqueResultException;
import javax.swing.*;

import java.util.Objects;

import static TM470Project.ui.MainFrame.*;

/**
 * Class representing the window panel for editing and existing EntryType
 * @author Joao
 * v4 23/07/2023
 */
public class EditTypePanel extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public EditTypePanel() {
        initComponents();
    }

    /**
     * Updates input fields in EditTypePanel with predefined values from the selected type.
     */
    public void updateFields(){
        //a mock type for reduced excess calls
        EntryType mockType = getWindow().getEntryTypeSelectionPanel().getSelectedType();

        nameField.setText(getWindow().getEntryTypeSelectionPanel().getSelectedType().getName());
        kcalField.setText((String.valueOf(mockType.getKcal())));
        unitComboBox.setSelectedItem(mockType.getMetric());
    }

    /**
     * This method is called from within the constructor to updateListing the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        returnButton = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        unitLabel = new javax.swing.JLabel();
        kcalLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        kcalField = new javax.swing.JTextField();
        unitComboBox = new javax.swing.JComboBox<>();
        confirmButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        returnButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        returnButton.setText("<");
        returnButton.setToolTipText("Return to the previous screen.");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        nameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nameLabel.setText("Name");

        unitLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        unitLabel.setText("Unit of measure");

        kcalLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        kcalLabel.setText("kcal per unit");

        nameField.setText("<<getName>>");
        nameField.setToolTipText("The name for the entry type. Cannot be edited.");

        kcalField.setText("<<getKcal>>");
        kcalField.setToolTipText("The kilocalorie value per 1 unit of exercise.");

        unitComboBox.setEditable(true);
        unitComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "metres", "kilometres", "yards", "miles", "seconds", "minutes", "reps", "sets" }));
        unitComboBox.setToolTipText("The metric by which to measure your entry type.");

        confirmButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        confirmButton.setText("Confirm");
        confirmButton.setToolTipText("Finalize your entry.");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        titleLabel.setText("Edit Type");

        deleteButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(returnButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(titleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nameField))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(unitLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(unitComboBox, 0, 96, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(kcalLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kcalField))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(confirmButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(returnButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unitLabel)
                    .addComponent(unitComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kcalLabel)
                    .addComponent(kcalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(confirmButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Method for saving Type and returning to the Entry Type Selection Panel
     * @param evt internal ActionEvent listener for the methods, used by generated code
     */
    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        System.out.println("Confirm button pressed.");

        //mock type name used to reduce method calls
        String mockTypeName = getWindow().getEntryTypeSelectionPanel().getSelectedType().getName();
        String kcal = kcalField.getText().trim();

        // check that all fields are filled out
        if(kcal.isEmpty()){
            JOptionPane.showMessageDialog(null,"Error: input fields may have been left blank.");
            return;
        }

        //check that kcal is a valid numerical input
        double kcalDouble;
        try{
            kcalDouble = Double.parseDouble(kcal);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Error: input for calorie value must be a number.");
            System.out.println("kcal is not a number.");
            return;
        }
        System.out.println("kcal is a number.");

        try{
            EntryType entryType = TM470ProjectRunner.getController().findEntryTypeByName(mockTypeName);
            if(entryType != null) {
                System.out.println("EntryType updated. \n" + "Old details: " + entryType);

                //change entry type variables
                entryType.setName(nameField.getText());
                entryType.setMetric(unitComboBox.getItemAt(unitComboBox.getSelectedIndex()));
                entryType.setKcal(kcalDouble);

                //update entry type in database
                TM470ProjectRunner.getController().saveEntryType(entryType);
                System.out.println("New details: " + entryType);

                //update listings
                getWindow().getCreateEntryPanel().populateTypeComboBox();
                getWindow().getEditEntryPanel().populateTypeComboBox();
                getWindow().getEntryTypeSelectionPanel().updateListing();

                //change screen
                getWindow().changeScreen("TYPE SELECTION");
            }
        }
        catch(NonUniqueResultException nonUniqueResultException){
            JOptionPane.showMessageDialog(null, "Error: non unique item name.");
            System.out.println("Error: non unique item name.");
        }

    }//GEN-LAST:event_confirmButtonActionPerformed

    /**
     * Method for returning to the Entry Type Selection Panel
     * @param evt internal ActionEvent listener for the methods, used by generated code
     */
    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        // return to EntryTypeSelectionPanel
        getWindow().changeScreen("TYPE SELECTION");
    }//GEN-LAST:event_returnButtonActionPerformed

    /**
     * Method for deleting the selected Type and returning to the Entry Type Selection Panel
     * @param evt internal ActionEvent listener for the methods, used by generated code
     */
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        System.out.println("Delete button pressed");

        String entryTypeName = getWindow().getEntryTypeSelectionPanel().getSelectedType().getName();
        EntryType entryType = TM470ProjectRunner.getController().findEntryTypeByName(entryTypeName);

        //ask user to confirm deleting the selected Entry Type
        if(JOptionPane.showConfirmDialog(null, "Are you sure you want to delete '"
                + entryTypeName + "'?", "WARNING", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            System.out.println("First option window opened (Confirm deletion).");

            //check that the EntryType if the entry type has associated entries
            try {
                if (entryType.getEntries() != null) {
                    //if EntryType has Entries, ask to confirm deletion of Entries
                    if (JOptionPane.showConfirmDialog(null,
                            """
                                    This type has entries associated with it.
                                    Deleting it will delete all entries using it.
                                    Continue?""", "WARNING", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                        System.out.println("Second option window opened (Entry type has entries).");
                        Entry entry;
                        for (int i = 0; i < entryType.getEntries().size(); i++) {
                            //delete all entries with the entry type
                            entry = entryType.getEntries().get(i);
                            TM470ProjectRunner.getController().deleteEntry(entry);
                            System.out.println("entry " + entry.getId() + " deleted.");
                        }
                        //update list of Entries in UI
                        getWindow().getEntrySelectionPanel().updateListing();
                    }
                }
            }
            catch (NullPointerException nullPointerException){
                //in the case that the selected EntryType has no associated entries, nothing else needs to be done
            }
            finally {
                //delete entry type
                TM470ProjectRunner.getController().deleteEntryType(entryType);
                //update listings
                getWindow().getCreateEntryPanel().populateTypeComboBox();
                getWindow().getEditEntryPanel().populateTypeComboBox();
                getWindow().getEntryTypeSelectionPanel().updateListing();
                //change window
                getWindow().changeScreen("TYPE SELECTION");
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField kcalField;
    private javax.swing.JLabel kcalLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton returnButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JComboBox<String> unitComboBox;
    private javax.swing.JLabel unitLabel;
    // End of variables declaration//GEN-END:variables

}
