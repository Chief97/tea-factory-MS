/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package production.management;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
public class TeaProduciton extends javax.swing.JFrame {

    Connection con=null;
    ResultSet rs=null;
    PreparedStatement ps=null;
  
    
    /**
     * Creates new form TeaProduciton
     */
    public TeaProduciton() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        manuDate = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        manu_Table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lUsed = new javax.swing.JTextField();
        totWeight = new javax.swing.JTextField();
        submitManu = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        manID = new javax.swing.JTextField();
        DeleteProd = new javax.swing.JButton();
        updateProd = new javax.swing.JButton();
        tOut = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setMinimumSize(new java.awt.Dimension(100, 50));

        jPanel1.setMinimumSize(new java.awt.Dimension(60, 40));

        jLabel1.setText("Date");

        manu_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Date", "Green Tea leaf used", "Turn Out(%)", "Total weight(Kgs)"
            }
        ));
        manu_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manu_TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(manu_Table);

        jLabel2.setText("Green Tea leaf used");

        jLabel3.setText("Turn Out(%)");

        jLabel4.setText("Total weight (Kgs)");

        lUsed.setText("Kgs");
        lUsed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lUsedMouseClicked(evt);
            }
        });
        lUsed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lUsedActionPerformed(evt);
            }
        });
        lUsed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lUsedKeyTyped(evt);
            }
        });

        totWeight.setText("Kgs");
        totWeight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                totWeightMouseClicked(evt);
            }
        });
        totWeight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                totWeightKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                totWeightKeyTyped(evt);
            }
        });

        submitManu.setText("Submit");
        submitManu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitManuActionPerformed(evt);
            }
        });

        jLabel5.setText("Manufacture ID");

        manID.setText("Enter ID");
        manID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manIDMouseClicked(evt);
            }
        });

        DeleteProd.setText("Delete");
        DeleteProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteProdActionPerformed(evt);
            }
        });

        updateProd.setText("Update");
        updateProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateProdActionPerformed(evt);
            }
        });

        tOut.setText("00.0");

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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(manID, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(manuDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(lUsed, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tOut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(totWeight, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(updateProd)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(submitManu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(DeleteProd)
                        .addGap(26, 26, 26))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(manID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manuDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lUsed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(tOut, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(totWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateProd)
                    .addComponent(submitManu)
                    .addComponent(DeleteProd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(24, 24, 24))
        );

        jTabbedPane1.addTab("Manufactured", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 493, 539);
    }// </editor-fold>//GEN-END:initComponents
    
    private void viewTable(){
        
        try{
                String sql = "Select * from TProduced";
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                manu_Table.setModel(DbUtils.resultSetToTableModel(rs));
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error in retrieving data");
        }
    }
    private void getSum(){
        float sum = 0;
        float totalW = Float.parseFloat(totWeight.getText());
        float lUse = Float.parseFloat(lUsed.getText());
        sum = 100*(totalW/lUse);
        tOut.setText(Float.toString(sum));
    }
    
    private void submitManuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitManuActionPerformed
        DateFormat formatted = new SimpleDateFormat("YYYY-MM-dd");
        int manuID = Integer.parseInt(manID.getText());
        String Sdate = formatted.format(manuDate.getDate());
        //Date Sdate = (Date) teaSuppDate.getDate();
        double leaves = Double.parseDouble(lUsed.getText());
        int percent = Integer.parseInt(tOut.getText());
        double tWeight = Double.parseDouble(totWeight.getText());
        int rowno = manu_Table.getSelectedRow();
            //DBconnect conn = new DBconnect();
            System.out.println(manuID);
            System.out.println(leaves);
            System.out.println(percent);
            System.out.println(Sdate);
            System.out.println(tWeight);
            
            
            
        try{
            String sql = "insert into tProduced(ManufID,DateM,Used,TOut,TWeigh) values('"+manuID+"','"+Sdate+"','"+leaves+"','"+percent+"','"+tWeight+"')";
                    
            ps=con.prepareStatement(sql);
            ps.execute();
            
            JOptionPane.showMessageDialog(null,"Data Added");
            viewTable();
            
            manID.setText("Enter ID");
            lUsed.setText("Kgs");
            manuDate.setDate(null);
            tOut.setText("%");
            totWeight.setText("Kgs");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            System.out.println("error in submit "+ e);
        }
        


        // TODO add your handling code here:
    }//GEN-LAST:event_submitManuActionPerformed

    private void lUsedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lUsedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lUsedActionPerformed

    private void updateProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateProdActionPerformed
       DateFormat formatted = new SimpleDateFormat("YYYY-MM-dd");
       int manuID = Integer.parseInt(manID.getText());
       String Sdate = formatted.format(manuDate.getDate());
        //Date Sdate = (Date) teaSuppDate.getDate();
       double leaves = Double.parseDouble(lUsed.getText());
       int percent = Integer.parseInt(tOut.getText());
       double tWeight = Double.parseDouble(totWeight.getText());
       int rowno = manu_Table.getSelectedRow();
            //DBconnect conn = new DBconnect();
         System.out.println(manuID);
            System.out.println(leaves);
            System.out.println(percent);
            System.out.println(Sdate);
            System.out.println(tWeight);
            
           
            
        try{
            String sql = "update tProduced set DateM = '"+Sdate+"',Used ='"+leaves+"',TOut = '"+percent+"',TWeigh = '"+tWeight+"' where ManufID ='"+manuID+"'";
                    
            ps=con.prepareStatement(sql);
            ps.execute();
            
            JOptionPane.showMessageDialog(null,"Data Updated");
            viewTable();
            
            manID.setText("Enter ID");
            lUsed.setText("Kgs");
            manuDate.setDate(null);
            tOut.setText("%");
            submitManu.setVisible(true);
            totWeight.setText("Kgs");
            manID.enable();
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            System.out.println("error in Update "+ e);
        }
        


        // TODO add your handling code here:
    }//GEN-LAST:event_updateProdActionPerformed

    private void DeleteProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteProdActionPerformed

       //DateFormat formatted = new SimpleDateFormat("YYYY-MM-dd");
       int manuID = Integer.parseInt(manID.getText());
      // String Sdate = formatted.format(manuDate.getDate());
        //Date Sdate = (Date) teaSuppDate.getDate();
       //double leaves = Double.parseDouble(lUsed.getText());
       //int percent = Integer.parseInt(TOut.getText());
       //double tWeight = Double.parseDouble(totWeight.getText());
       int rowno = manu_Table.getSelectedRow();
            //DBconnect conn = new DBconnect();
          System.out.println(manuID);
          /*System.out.println(leaves);
            System.out.println(percent);
            System.out.println(Sdate);
            System.out.println(tWeight);
          */  
           
            
        try{
            String sql = "delete from tProduced where ManufID ='"+manuID+"'";
                    
            ps=con.prepareStatement(sql);
            ps.execute();
            
            JOptionPane.showMessageDialog(null,"Data Deleted");
            viewTable();
            
            manID.setText("Enter ID");
            lUsed.setText("Kgs");
            manuDate.setDate(null);
            tOut.setText("%");
            submitManu.setVisible(true);
            totWeight.setText("Kgs");
            manID.enable();
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            System.out.println("error in Delete "+ e);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteProdActionPerformed

    private void manu_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manu_TableMouseClicked
           int rowNo = manu_Table.getSelectedRow();
           
           manID.setText(manu_Table.getValueAt(rowNo,0).toString());
           
           submitManu.setVisible(false);
           manID.disable();
        // TODO add your handling code here:
    }//GEN-LAST:event_manu_TableMouseClicked

    private void manIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manIDMouseClicked
        manID.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_manIDMouseClicked

    private void lUsedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lUsedMouseClicked
        lUsed.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_lUsedMouseClicked

    private void totWeightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_totWeightMouseClicked
        totWeight.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_totWeightMouseClicked

    private void lUsedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lUsedKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACKSPACE || c==KeyEvent.VK_DELETE)){
        getToolkit().beep();
        evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_lUsedKeyTyped

    private void totWeightKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totWeightKeyTyped
        /*char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACKSPACE || c==KeyEvent.VK_DELETE)){
        getToolkit().beep();
        evt.consume();
        }
        */
        
        // TODO add your handling code here:
    }//GEN-LAST:event_totWeightKeyTyped

    private void totWeightKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totWeightKeyReleased
        getSum();
        // TODO add your handling code here:
    }//GEN-LAST:event_totWeightKeyReleased

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
            java.util.logging.Logger.getLogger(TeaProduciton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeaProduciton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeaProduciton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeaProduciton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeaProduciton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteProd;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField lUsed;
    private javax.swing.JTextField manID;
    private com.toedter.calendar.JDateChooser manuDate;
    private javax.swing.JTable manu_Table;
    private javax.swing.JButton submitManu;
    private javax.swing.JLabel tOut;
    private javax.swing.JTextField totWeight;
    private javax.swing.JButton updateProd;
    // End of variables declaration//GEN-END:variables
}