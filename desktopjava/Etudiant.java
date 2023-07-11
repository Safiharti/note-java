/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package desktopjava;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
/**
 *
 * @author SafidyH
 */
public class Etudiant extends javax.swing.JPanel {

    Connections conn;
    public Etudiant() throws ClassNotFoundException {
        initComponents();
        this.conn = new Connections();
        liste_etudiant();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLayeredPane3 = new javax.swing.JLayeredPane();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        jLayeredPane5 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLayeredPane6 = new javax.swing.JLayeredPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        numero = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton5.setText("Rechercher");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLayeredPane4.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jButton5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(search, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane4Layout = new javax.swing.GroupLayout(jLayeredPane4);
        jLayeredPane4.setLayout(jLayeredPane4Layout);
        jLayeredPane4Layout.setHorizontalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane4Layout.setVerticalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane5.setLayout(new java.awt.FlowLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LISTE D'ETUDIANTS");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton2.setText("Supprimer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Ajouter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Modifier");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap())
        );

        jLayeredPane1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2});

        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        jLayeredPane1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2, jButton3});

        jLayeredPane2.setLayout(new java.awt.GridBagLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setLabelFor(this);
        jLabel2.setText("N°Inscription  :");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 6, 0, 0);
        jLayeredPane2.add(jLabel2, gridBagConstraints);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Nom                :");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 6, 0, 0);
        jLayeredPane2.add(jLabel3, gridBagConstraints);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Adresse           :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 19;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 6, 0, 0);
        jLayeredPane2.add(jLabel4, gridBagConstraints);

        numero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 42;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 48, 0, 0);
        jLayeredPane2.add(numero, gridBagConstraints);

        name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 111;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 48, 0, 6);
        jLayeredPane2.add(name, gridBagConstraints);

        address.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 111;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 48, 6, 6);
        jLayeredPane2.add(address, gridBagConstraints);

        jLayeredPane6.setLayer(jLayeredPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(jLayeredPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane6Layout = new javax.swing.GroupLayout(jLayeredPane6);
        jLayeredPane6.setLayout(jLayeredPane6Layout);
        jLayeredPane6Layout.setHorizontalGroup(
            jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jLayeredPane6Layout.setVerticalGroup(
            jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton4.setText("Actualiser");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLayeredPane3.setLayer(jLayeredPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLayeredPane5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLayeredPane6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLayeredPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(134, 134, 134)))
                .addComponent(jLayeredPane4)
                .addContainerGap())
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addComponent(jLayeredPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane3)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane3)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String num,nom,add;
        num=numero.getText();
        nom=name.getText();
        add=address.getText();
        try{
            PreparedStatement pre=conn.start().prepareStatement("INSERT INTO etudiant VALUES (?,?,?)");
            pre.setString(1,num);
            pre.setString(2,nom);
            pre.setString(3,add);
            pre.executeUpdate();
            JOptionPane.showConfirmDialog(jLayeredPane1,"Etudiant enregistré", "Information", JOptionPane.CLOSED_OPTION,JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException e)
        {
            JOptionPane.showConfirmDialog(jLayeredPane1,e.getMessage(), "Erreur", JOptionPane.OK_OPTION,JOptionPane.ERROR_MESSAGE);
        }finally{initial();}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        int selectRow=jTable1.getSelectedRow();
        DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
        numero.setText(model.getValueAt(selectRow,0).toString());
        name.setText(model.getValueAt(selectRow,1).toString());
        address.setText(model.getValueAt(selectRow,2).toString());
        numero.setEditable(false);
    }//GEN-LAST:event_jTable1MouseReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String num=numero.getText();
        String nom=name.getText();
        String add=address.getText();
        try{
            Statement pre=conn.start().createStatement();
            if(JOptionPane.showConfirmDialog(jLayeredPane1,"Vous voulez vraiment modifier cet etudiant", "Information", JOptionPane.OK_OPTION,JOptionPane.INFORMATION_MESSAGE)==JOptionPane.YES_OPTION)
            {
                pre.executeUpdate("UPDATE etudiant SET Nom='"+nom+"',Adresse='"+add+"' WHERE n°Inscription="+num);initial();
            }
        }catch(SQLException e)
        {
            JOptionPane.showConfirmDialog(jLayeredPane1,e.getMessage(), "Erreur", JOptionPane.CLOSED_OPTION,JOptionPane.ERROR_MESSAGE);
        }finally{liste_etudiant();}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String num=numero.getText();
        try{
            Statement pre=conn.start().createStatement();
            if(JOptionPane.showConfirmDialog(jLayeredPane1,"Vous voulez vraiment supprimer cet etudiant", "Information", JOptionPane.OK_OPTION,JOptionPane.INFORMATION_MESSAGE)==JOptionPane.YES_OPTION)
            {
                pre.executeUpdate("DELETE FROM etudiant WHERE n°Inscription="+num);
            }
        }catch(SQLException e)
        {
            JOptionPane.showConfirmDialog(jLayeredPane1,e.getMessage(), "Erreur", JOptionPane.CLOSED_OPTION,JOptionPane.ERROR_MESSAGE);
        }finally{initial();}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        initial();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String recherche=search.getText();
        DefaultTableModel model1=new DefaultTableModel();
        model1.addColumn("N°INSCRIPTION");
        model1.addColumn("NOM");
        model1.addColumn("ADRESSE");
        jTable1.setModel(model1);
        try
        {
            Statement st=conn.start().createStatement();
            ResultSet res=st.executeQuery("SELECT * FROM etudiant WHERE n°Inscription='"+recherche+"' OR Nom LIKE '%"+recherche+"%'");
            while(res.next())
            {
                model1.addRow(new Object[]{
                    res.getString(1),
                    res.getString(2),
                    res.getString(3)
                });
            }
        }catch(SQLException e)
        {
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JLayeredPane jLayeredPane5;
    private javax.swing.JLayeredPane jLayeredPane6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField numero;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables

    private void liste_etudiant()
    {
        DefaultTableModel model1=new DefaultTableModel();
        model1.addColumn("N°INSCRIPTION");
        model1.addColumn("NOM");
        model1.addColumn("ADRESSE");
        jTable1.setModel(model1);
        try
        {
            Statement st=conn.start().createStatement();
            ResultSet res=st.executeQuery("SELECT * FROM etudiant");
            while(res.next())
            {
                model1.addRow(new Object[]{
                    res.getString(1),
                    res.getString(2),
                    res.getString(3)
                });
            }
        }catch(SQLException e)
        {
            System.err.println(e.getMessage());
        }
    }

    private void initial() {
        liste_etudiant();
        numero.setEditable(true);
        numero.setText("");
        name.setText("");
        address.setText("");
        search.setText("");
    }
}

