/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TM470Project.ui;

import java.awt.CardLayout;
import javax.swing.*;

/**
 *
 * @author Joao
 */
public class MainFrame extends javax.swing.JFrame {
    /* declare JFrame object */
    private static MainFrame mainFrame;

    /* declaration of panel objects */
    private final CalendarPanel calendarPanel = new CalendarPanel();
    private final CreateEntryPanel createEntryPanel = new CreateEntryPanel();
    private final CreateTypePanel createTypePanel = new CreateTypePanel();
    private final DataViewPanel dataViewPanel = new DataViewPanel();
    private final EditEntryPanel editEntryPanel = new EditEntryPanel();
    private final EditTypePanel editTypePanel = new EditTypePanel();
    private final EntrySelectionPanel entrySelectionPanel = new EntrySelectionPanel();
    private final EntryTypeSelectionPanel entryTypeSelectionPanel = new EntryTypeSelectionPanel();
    private final MainPanel mainPanel = new MainPanel();
    private final SettingsPanel settingsPanel = new SettingsPanel();

    /* declare cardPanel object which holds different panels */
    private final CardLayout cardLayout = new CardLayout();
    private final JPanel cardPanel = new JPanel(cardLayout);
    
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        //generated code for initialization
        initComponents();

        //run initialization methods for each panel
        setUpFrame();
        changeScreen("MAIN");
    }

    /**
     * @param screen the reference to the screen to be changed into
     */
    public void changeScreen(String screen){
        ((CardLayout) cardPanel.getLayout()).show(cardPanel, screen);

    }

    /**
     * adds panels to the card panel collection
     */
    public void setUpFrame(){
        cardPanel.add(calendarPanel, "CALENDAR");
        cardPanel.add(createEntryPanel, "CREATE ENTRY");
        cardPanel.add(createTypePanel, "CREATE TYPE");
        cardPanel.add(dataViewPanel, "VIEW DATA");
        cardPanel.add(editEntryPanel, "EDIT ENTRY");
        cardPanel.add(editTypePanel, "EDIT TYPE");
        cardPanel.add(entrySelectionPanel, "ENTRY SELECTION");
        cardPanel.add(entryTypeSelectionPanel, "TYPE SELECTION");
        cardPanel.add(mainPanel, "MAIN");
        cardPanel.add(settingsPanel, "SETTINGS");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void run() {
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                mainFrame = new MainFrame();
                mainFrame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    //getters for MainFrame class
    public static MainFrame getMainFrame(){ return mainFrame;}
}
