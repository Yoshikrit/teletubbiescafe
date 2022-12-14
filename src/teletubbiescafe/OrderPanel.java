/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teletubbiescafe;
/**
 *
 * @author acer
 */
import javax.swing.JPanel;
public class OrderPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrderPanel
     */
    public OrderPanel() {
        initComponents();
    }
    
    JPanel loginPage;
    public OrderPanel(JPanel loginPage) {
        initComponents();
        this.loginPage = loginPage;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ordertopPanel = new javax.swing.JPanel();
        ordermaintext = new javax.swing.JLabel();
        orderfirstnametext = new javax.swing.JLabel();
        orderlastnametext = new javax.swing.JLabel();
        logouttext = new javax.swing.JLabel();
        ordermainPanel = new javax.swing.JPanel();
        scrollPane1 = new java.awt.ScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1920, 1080));

        ordertopPanel.setBackground(new java.awt.Color(255, 0, 51));

        ordermaintext.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        ordermaintext.setForeground(new java.awt.Color(255, 255, 255));
        ordermaintext.setText("Teletubbie's Cafe");

        orderfirstnametext.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        orderfirstnametext.setForeground(new java.awt.Color(255, 255, 255));
        orderfirstnametext.setText("ทักษิณ");

        orderlastnametext.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        orderlastnametext.setForeground(new java.awt.Color(255, 255, 255));
        orderlastnametext.setText("ชินวัตร");

        logouttext.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        logouttext.setForeground(new java.awt.Color(255, 255, 255));
        logouttext.setText("Log Out");
        logouttext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logouttextMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ordertopPanelLayout = new javax.swing.GroupLayout(ordertopPanel);
        ordertopPanel.setLayout(ordertopPanelLayout);
        ordertopPanelLayout.setHorizontalGroup(
            ordertopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ordertopPanelLayout.createSequentialGroup()
                .addGroup(ordertopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ordertopPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logouttext))
                    .addGroup(ordertopPanelLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(ordermaintext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 929, Short.MAX_VALUE)
                        .addComponent(orderfirstnametext)
                        .addGap(41, 41, 41)
                        .addComponent(orderlastnametext)))
                .addGap(49, 49, 49))
        );
        ordertopPanelLayout.setVerticalGroup(
            ordertopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordertopPanelLayout.createSequentialGroup()
                .addGroup(ordertopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ordertopPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ordertopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(orderfirstnametext)
                            .addComponent(orderlastnametext))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(ordertopPanelLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(ordermaintext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)))
                .addComponent(logouttext)
                .addGap(44, 44, 44))
        );

        ordermainPanel.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        scrollPane1.add(jScrollPane1);

        javax.swing.GroupLayout ordermainPanelLayout = new javax.swing.GroupLayout(ordermainPanel);
        ordermainPanel.setLayout(ordermainPanelLayout);
        ordermainPanelLayout.setHorizontalGroup(
            ordermainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordermainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ordermainPanelLayout.setVerticalGroup(
            ordermainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordermainPanelLayout.createSequentialGroup()
                .addComponent(scrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ordertopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ordermainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ordertopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ordermainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void logouttextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logouttextMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        loginPage.setVisible(true);
    }//GEN-LAST:event_logouttextMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel logouttext;
    private javax.swing.JLabel orderfirstnametext;
    private javax.swing.JLabel orderlastnametext;
    private javax.swing.JPanel ordermainPanel;
    private javax.swing.JLabel ordermaintext;
    private javax.swing.JPanel ordertopPanel;
    private java.awt.ScrollPane scrollPane1;
    // End of variables declaration//GEN-END:variables
}
