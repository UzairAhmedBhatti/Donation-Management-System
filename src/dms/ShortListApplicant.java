/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dms;

import dms.Donorlist;
import dms.Projectlist;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ali
 */
public class ShortListApplicant extends javax.swing.JFrame {

    /**
     * Creates new form ShortListApplicant
     */
    public ShortListApplicant() {
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
        SubjectID = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Subjectid = new javax.swing.JTextField();
        Projectid = new javax.swing.JLabel();
        ProjectID = new javax.swing.JTextField();
        Shortlist = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        SubjectTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        ProjectTable = new javax.swing.JTable();
        View = new javax.swing.JButton();
        Continue = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Output = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        SubjectID.setForeground(new java.awt.Color(255, 255, 255));
        SubjectID.setText("Subject ID");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Short List Applicant");

        Projectid.setForeground(new java.awt.Color(255, 255, 255));
        Projectid.setText("Project ID");

        Shortlist.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Shortlist.setText("Short List");
        Shortlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShortlistActionPerformed(evt);
            }
        });

        SubjectTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "subjectID", "subjectName"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(SubjectTable);

        ProjectTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "projectID", "projectName"
            }
        ));
        jScrollPane2.setViewportView(ProjectTable);

        View.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        View.setText("View");
        View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewActionPerformed(evt);
            }
        });

        Continue.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Continue.setText("Continue");
        Continue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueActionPerformed(evt);
            }
        });

        Output.setColumns(20);
        Output.setRows(5);
        jScrollPane3.setViewportView(Output);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Continue)
                            .addComponent(View)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SubjectID)
                            .addComponent(Projectid))
                        .addGap(95, 95, 95)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Shortlist)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Subjectid, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                .addComponent(ProjectID)))
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SubjectID)
                            .addComponent(Subjectid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Projectid)
                            .addComponent(ProjectID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Shortlist))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(View)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                        .addComponent(Continue))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewActionPerformed
        // TODO add your handling code here:
        Projectlist plist=new Projectlist();
        plist.getdata();
        Object[] row = new Object[2];
        DefaultTableModel model= (DefaultTableModel)ProjectTable.getModel();
       
        for(int i=0;i<plist.p.size();i++)
        {
            //System.out.println(plist.p.get(i).getTeamID());
            
                row[0]=plist.p.get(i).projectID;
                row[1]=plist.p.get(i).projectName;
                model.addRow(row);
                
                
            
            
        }
        Subjectlist slist=new Subjectlist();
        slist.getdata();
        Object[] row1 = new Object[2];
        DefaultTableModel model1= (DefaultTableModel)SubjectTable.getModel();
        
        
        for(int i=0;i<slist.S.size();i++)
        {
                System.out.println(slist.S.get(i).subjectID);
                row1[0]=slist.S.get(i).subjectID;
                row1[1]=slist.S.get(i).subjectName;
                model1.addRow(row1);
                
                
           
            
        }
    }//GEN-LAST:event_ViewActionPerformed

    private void ShortlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShortlistActionPerformed
        // TODO add your handling code here:
        int subjectid = Integer.valueOf(Subjectid.getText());
        int projectid = Integer.valueOf(ProjectID.getText());
        Subjectlist slist = new Subjectlist();
        slist.getdata();
        for(int i =0;i<slist.S.size();i++){
            
            if(slist.S.get(i).getSubjectID()== subjectid){
                 
                if(slist.S.get(i).getSubjectIncome()<5000){
                    
                    Funddistribution f= new Funddistribution(projectid,subjectid);
                    Funddistributionlist fd=new Funddistributionlist();
                    fd.getdata();
                    if(fd.search(projectid,subjectid)==false)
                    {
                       fd.comit(f);
                       Output.setText("ShortListed Succesfully");
                    }
                    else
                    {
                        Output.setText("Already Shortlisted Succesfully");
                    }
                    
                    
                }
                else{
                Output.setText("ShortListed Unsuccesfully");
            }
            }
            
        }
       
       
        
        
        
        
        ProjectID.setText("");
        Subjectid.setText("");
    }//GEN-LAST:event_ShortlistActionPerformed

    private void ContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new HomePage().setVisible(true);
    }//GEN-LAST:event_ContinueActionPerformed

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
            java.util.logging.Logger.getLogger(ShortListApplicant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShortListApplicant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShortListApplicant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShortListApplicant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShortListApplicant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Continue;
    private javax.swing.JTextArea Output;
    private javax.swing.JTextField ProjectID;
    private javax.swing.JTable ProjectTable;
    private javax.swing.JLabel Projectid;
    private javax.swing.JButton Shortlist;
    private javax.swing.JLabel SubjectID;
    private javax.swing.JTable SubjectTable;
    private javax.swing.JTextField Subjectid;
    private javax.swing.JButton View;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
