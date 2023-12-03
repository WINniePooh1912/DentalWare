package Interfaces;

import dentalware.Assistant;
import dentalware.Doctor;
import dentalware.User;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class frmGeneralWelcome extends javax.swing.JFrame {
    private Assistant assis = new Assistant();
    private Doctor doctors = new Doctor();
    private User admin = new User("Francisco Robles", 34, 'M', "Paseos del sol #24", "33 1625 8596", "admin", "98765", 0);
    // Queue queue = new Queue();
    public frmGeneralWelcome() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        ImageIcon icon = new ImageIcon("src/images/bgDesktop.jpg");
        Image img = icon.getImage();
        desktopPane = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g) {
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        MenuBar = new javax.swing.JMenuBar();
        menuLogIn = new javax.swing.JMenu();
        mItemLogIn = new javax.swing.JMenuItem();
        menuAgenda = new javax.swing.JMenu();
        mItemAgenda = new javax.swing.JMenuItem();
        menuAboutUs = new javax.swing.JMenu();
        mItemAboutUs = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome");

        desktopPane.setBackground(new java.awt.Color(222, 212, 210));

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1318, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
        );

        MenuBar.setBackground(new java.awt.Color(222, 212, 210));

        menuLogIn.setText("Log in");

        mItemLogIn.setText("Log in");
        mItemLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemLogInActionPerformed(evt);
            }
        });
        menuLogIn.add(mItemLogIn);

        MenuBar.add(menuLogIn);

        menuAgenda.setText("Agenda");

        mItemAgenda.setText("Agenda");
        mItemAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemAgendaActionPerformed(evt);
            }
        });
        menuAgenda.add(mItemAgenda);

        MenuBar.add(menuAgenda);

        menuAboutUs.setText("About Us");

        mItemAboutUs.setText("About us");
        menuAboutUs.add(mItemAboutUs);

        MenuBar.add(menuAboutUs);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopPane)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mItemAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemAgendaActionPerformed
        frmAgenda agenda = new frmAgenda(this);
        this.setVisible(false);
        agenda.setVisible(true);
    }//GEN-LAST:event_mItemAgendaActionPerformed

    private void mItemLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemLogInActionPerformed
        frmInternalLogIn logIn = new frmInternalLogIn(this, assis, doctors, admin);
        desktopPane.add(logIn);
        logIn.show();
    }//GEN-LAST:event_mItemLogInActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem mItemAboutUs;
    private javax.swing.JMenuItem mItemAgenda;
    private javax.swing.JMenuItem mItemLogIn;
    private javax.swing.JMenu menuAboutUs;
    private javax.swing.JMenu menuAgenda;
    private javax.swing.JMenu menuLogIn;
    // End of variables declaration//GEN-END:variables
}
