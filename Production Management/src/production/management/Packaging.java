/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package production.management;

import javax.swing.JOptionPane;
import classes.DBconnect;
import com.sun.glass.events.KeyEvent;
import java.text.SimpleDateFormat;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author sggra
 */
public class Packaging extends javax.swing.JFrame {

    Connection con=null;
    ResultSet rs=null;
    PreparedStatement ps=null;
    
    /**
     * Creates new form Packaging
     */
    public Packaging() {
        initComponents();
        
        con=DBconnect.getConnection();
        viewTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sizeMat = new javax.swing.JTextField();
        nWeight = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        gWeight = new javax.swing.JTextField();
        submitMat = new javax.swing.JButton();
        updateMat = new javax.swing.JButton();
        deleteMat = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        mat_Table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Package Name");

        pName.setText("Enter Name");
        pName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pNameMouseClicked(evt);
            }
        });

        jLabel2.setText("Size");

        jLabel3.setText("Net Weight");

        sizeMat.setText("Lenght * Breadth");
        sizeMat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sizeMatMouseClicked(evt);
            }
        });
        sizeMat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sizeMatKeyTyped(evt);
            }
        });

        nWeight.setText("Kgs");
        nWeight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nWeightMouseClicked(evt);
            }
        });
        nWeight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nWeightKeyTyped(evt);
            }
        });

        jLabel4.setText("Gross weight");

        gWeight.setText("Kgs");
        gWeight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gWeightMouseClicked(evt);
            }
        });
        gWeight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                gWeightKeyTyped(evt);
            }
        });

        submitMat.setText("Submit");
        submitMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitMatActionPerformed(evt);
            }
        });

        updateMat.setText("Update");
        updateMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateMatActionPerformed(evt);
            }
        });

        deleteMat.setText("Delete");
        deleteMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMatActionPerformed(evt);
            }
        });

        mat_Table.setModel(new javax.swing.table.DefaultTableModel(
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
        mat_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mat_TableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(mat_Table);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                                .addGap(209, 209, 209))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pName, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sizeMat, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(deleteMat)
                        .addGap(101, 101, 101)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(submitMat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateMat)
                        .addGap(48, 48, 48))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sizeMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(gWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteMat)
                    .addComponent(submitMat)
                    .addComponent(updateMat))
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addGap(33, 33, 33))
        );

        jTabbedPane1.addTab("Material", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void viewTable(){
        
        try{
                String sql = "Select * from Material";
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                mat_Table.setModel(DbUtils.resultSetToTableModel(rs));
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error in retrieving data");
        }
    }
    
    private void submitMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitMatActionPerformed
        String pNam = pName.getText();
        String size = sizeMat.getText();
        String netW = nWeight.getText();
        String grossW = gWeight.getText();
        
       try{
           String sql = "insert into Material(Pname,Size,NetWeight,GrossWeight) values('"+pNam+"','"+size+"','"+netW+"','"+grossW+"')";
                   //"Insert into Material(Pname,Size,NetWeight,GrossWeight) values('"++"','"++"','"++"','"++"')";
           ps = con.prepareStatement(sql);
           ps.execute();
           
           JOptionPane.showMessageDialog(null,"Data Added");
           viewTable();
           
           pName.setText("Enter Name");
           sizeMat.setText("Lenght X Breadth");
           nWeight.setText("Kgs");
           gWeight.setText("Kgs");
           
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
           System.out.println("error in submit "+ e);
       }
        // TODO add your handling code here:
    }//GEN-LAST:event_submitMatActionPerformed

    private void updateMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateMatActionPerformed
        String pNam = pName.getText();
        String size = sizeMat.getText();
        String netW = nWeight.getText();
        String grossW = gWeight.getText();
        
       try{
           String sql = "update Material(Pname,Size,NetWeight,GrossWeight) values('"+pNam+"','"+size+"','"+netW+"','"+grossW+"')";
                   //"Insert into Material(Pname,Size,NetWeight,GrossWeight) values('"++"','"++"','"++"','"++"')";
           ps = con.prepareStatement(sql);
           ps.execute();
           
           JOptionPane.showMessageDialog(null,"Data Updated");
           viewTable();
           
           pName.setText("Enter Name");
           sizeMat.setText("Lenght X Breadth");
           nWeight.setText("Kgs");
           gWeight.setText("Kgs");
           submitMat.setVisible(true);
           pName.enable();
           
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
           System.out.println("error in Update "+ e);
       }
        // TODO add your handling code here:
    }//GEN-LAST:event_updateMatActionPerformed

    private void deleteMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMatActionPerformed
        String pNam = pName.getText();
        //String size = sizeMat.getText();
        //String netW = nWeight.getText();
        //String grossW = gWeight.getText();
        
       try{
           String sql = "delete from Material where Pname='"+pNam+"' ";
                   //"Insert into Material(Pname,Size,NetWeight,GrossWeight) values('"++"','"++"','"++"','"++"')";
           ps = con.prepareStatement(sql);
           ps.execute();
           
           JOptionPane.showMessageDialog(null,"Data Deleted");
           viewTable();
           
           pName.setText("Enter Name");
           sizeMat.setText("Lenght X Breadth");
           nWeight.setText("Kgs");
           gWeight.setText("Kgs");
           submitMat.setVisible(true);
           pName.enable();
           
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
           System.out.println("error in Delete "+ e);
       }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteMatActionPerformed

    private void nWeightKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nWeightKeyTyped
      
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACKSPACE || c==KeyEvent.VK_DELETE)){
        getToolkit().beep();
        evt.consume();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_nWeightKeyTyped

    private void gWeightKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gWeightKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACKSPACE || c==KeyEvent.VK_DELETE)){
        getToolkit().beep();
        evt.consume();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_gWeightKeyTyped

    private void pNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pNameMouseClicked
        pName.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_pNameMouseClicked

    private void sizeMatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sizeMatKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_sizeMatKeyTyped

    private void sizeMatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sizeMatMouseClicked
        sizeMat.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_sizeMatMouseClicked

    private void nWeightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nWeightMouseClicked
        nWeight.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_nWeightMouseClicked

    private void gWeightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gWeightMouseClicked
        gWeight.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_gWeightMouseClicked

    private void mat_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mat_TableMouseClicked
        int rowNo = mat_Table.getSelectedRow();
        
        pName.setText(mat_Table.getValueAt(rowNo,0).toString());
        submitMat.setVisible(false);
        pName.disable();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_mat_TableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         FunctionUIn fui = new FunctionUIn();
        fui.setVisible(true);
        setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Packaging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Packaging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Packaging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Packaging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Packaging().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteMat;
    private javax.swing.JTextField gWeight;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable mat_Table;
    private javax.swing.JTextField nWeight;
    private javax.swing.JTextField pName;
    private javax.swing.JTextField sizeMat;
    private javax.swing.JButton submitMat;
    private javax.swing.JButton updateMat;
    // End of variables declaration//GEN-END:variables
}