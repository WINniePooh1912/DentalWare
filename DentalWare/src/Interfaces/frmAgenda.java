package Interfaces;

import Agenda.*;
//import dentalware.Queue;
import java.awt.Color;

public class frmAgenda extends javax.swing.JFrame {

    frmGeneralWelcome generalMenu;
    //Queue queue;
    
    public frmAgenda(frmGeneralWelcome generalMenu) {
        initComponents();
        this.generalMenu = generalMenu;
        // this.queue = queue;
        
        Color colorbg = new Color(222, 212, 210);
        getContentPane().setBackground(colorbg);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCalendarCustom1 = new Agenda.pnlCalendarCustom();
        btMenu = new javax.swing.JButton();
        btSearch = new javax.swing.JButton();
        tfSearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda");

        btMenu.setBackground(new java.awt.Color(34, 111, 138));
        btMenu.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btMenu.setForeground(new java.awt.Color(255, 255, 255));
        btMenu.setText("Menu");
        btMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuActionPerformed(evt);
            }
        });

        btSearch.setBackground(new java.awt.Color(222, 212, 210));
        btSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconSearch.png"))); // NOI18N
        btSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tfSearch.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tfSearch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(34, 111, 138), 2, true));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlCalendarCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(tfSearch)
                                .addGap(18, 18, 18)
                                .addComponent(btSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 20, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(pnlCalendarCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(btMenu)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuActionPerformed
        generalMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btMenuActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btMenu;
    private javax.swing.JButton btSearch;
    private Agenda.pnlCalendarCustom pnlCalendarCustom1;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables
}
