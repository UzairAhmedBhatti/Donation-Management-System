/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dms;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Uzair
 */
public class EditVolunteerForm extends javax.swing.JFrame {

    /**
     * Creates new form EditVolunteerForm
     */
    public EditVolunteerForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ADDTeamMember = new javax.swing.JButton();
        REMOVETeamMember = new javax.swing.JButton();
        REPLACETeamMember = new javax.swing.JButton();
        ViewAllVolunteers = new javax.swing.JButton();
        GoBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TeamID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Volunteertable = new javax.swing.JTable();
        Clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Edit Volunteer");

        ADDTeamMember.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ADDTeamMember.setText("Add Volunteer");
        ADDTeamMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDTeamMemberActionPerformed(evt);
            }
        });

        REMOVETeamMember.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        REMOVETeamMember.setText("Remove Volunteer");
        REMOVETeamMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REMOVETeamMemberActionPerformed(evt);
            }
        });

        REPLACETeamMember.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        REPLACETeamMember.setText("Replace Volunteer");
        REPLACETeamMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REPLACETeamMemberActionPerformed(evt);
            }
        });

        ViewAllVolunteers.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ViewAllVolunteers.setText("View All Volunteers");
        ViewAllVolunteers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewAllVolunteersActionPerformed(evt);
            }
        });

        GoBack.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        GoBack.setText("Continue");
        GoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoBackActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("teamID");

        Volunteertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "volunteerID", "volunteerName", "position", "teamID"
            }
        ));
        jScrollPane1.setViewportView(Volunteertable);

        Clear.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Clear.setText("Clear Table");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(24, 24, 24)
                                .addComponent(TeamID, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(REPLACETeamMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ADDTeamMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(REMOVETeamMember, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ViewAllVolunteers, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(137, 137, 137)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(GoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Clear))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TeamID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(216, 216, 216)
                        .addComponent(ViewAllVolunteers)
                        .addGap(18, 18, 18)
                        .addComponent(REMOVETeamMember)
                        .addGap(18, 18, 18)
                        .addComponent(REPLACETeamMember)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ADDTeamMember)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void REMOVETeamMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REMOVETeamMemberActionPerformed
        // TODO add your handling code here:
        int teamid = Integer.valueOf(TeamID.getText());
        this.setVisible(false);
        new RemoveVolunteerForm(teamid).setVisible(true);
    }//GEN-LAST:event_REMOVETeamMemberActionPerformed

    private void ADDTeamMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDTeamMemberActionPerformed
        // TODO add your handling code here:
        int teamid = Integer.valueOf(TeamID.getText());
        this.setVisible(false);
        new AddVolunteerForm(teamid).setVisible(true);
    }//GEN-LAST:event_ADDTeamMemberActionPerformed

    private void GoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoBackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        HomePage HP= new HomePage();
        HP.setVisible(true);
    }//GEN-LAST:event_GoBackActionPerformed

    private void REPLACETeamMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REPLACETeamMemberActionPerformed
        // TODO add your handling code here:
        int teamid = Integer.valueOf(TeamID.getText());
        this.setVisible(false);
        new ReplaceVolunteerForm(teamid).setVisible(true);
    }//GEN-LAST:event_REPLACETeamMemberActionPerformed

    private void ViewAllVolunteersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewAllVolunteersActionPerformed
        // TODO add your handling code here:
    if(TeamID.getText().isEmpty()){
         System.out.println("hello");
    }
    else{
       
        int teamid = Integer.valueOf(TeamID.getText());
         Object[] row = new Object[4];
        DefaultTableModel model= (DefaultTableModel)Volunteertable.getModel();
        Volunteerlist vlist=new Volunteerlist();
        vlist.getdata();
       
            for(int i=0;i<vlist.getV().size();i++)
        {
            
            if(vlist.getV().get(i).getTeamID()==teamid)
            {
                
                row[0]=vlist.getV().get(i).getVolunteerID();
                row[1]=vlist.getV().get(i).getVolunteerName();
                row[2]=vlist.getV().get(i).getPosition();
               row[3]=vlist.getV().get(i).teamID;
               model.addRow(row);
            }
        }
        
            
    }
     
        
       
//        this.setVisible(false);
//        VolunteersTable VT= new VolunteersTable();
//        VT.setVisible(true);
    }//GEN-LAST:event_ViewAllVolunteersActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
         Volunteertable.setModel(new DefaultTableModel(null,new String[]{"volunteerID","volunteerName","position","teamID"}));
    }//GEN-LAST:event_ClearActionPerformed

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
            java.util.logging.Logger.getLogger(EditVolunteerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditVolunteerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditVolunteerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditVolunteerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditVolunteerForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDTeamMember;
    private javax.swing.JButton Clear;
    private javax.swing.JButton GoBack;
    private javax.swing.JButton REMOVETeamMember;
    private javax.swing.JButton REPLACETeamMember;
    private javax.swing.JTextField TeamID;
    private javax.swing.JButton ViewAllVolunteers;
    private javax.swing.JTable Volunteertable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}