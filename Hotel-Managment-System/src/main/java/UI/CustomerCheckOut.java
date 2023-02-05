
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import java.sql.*;
import DatabaseLogic.*;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pawel
 */
public class CustomerCheckOut extends javax.swing.JFrame {

    /**
     * Creates new form CustomerCheckOut
     */
    public CustomerCheckOut() {
        initComponents();
        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
        jTextField4.setEditable(false);
        jTextField5.setEditable(false);
        jTextField6.setEditable(false);
        jTextField7.setEditable(false);
        jTextField8.setEditable(false);
        jTextField9.setEditable(false);
        jTextField10.setEditable(false);
    }
    int id=0;
    String Query;
    String roomType;
    String bed;
    String roomNumber;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(880, 500));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 155, 210));
        jLabel1.setText("Customer Check Out");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(26, 6, 530, 45);

        jLabel2.setForeground(new java.awt.Color(0, 155, 210));
        jLabel2.setText("Search room");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 70, 79, 20);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(160, 70, 250, 22);

        jButton1.setBackground(new java.awt.Color(0, 176, 240));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(430, 70, 72, 23);

        jLabel3.setForeground(new java.awt.Color(0, 155, 210));
        jLabel3.setText("Customer Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 140, 87, 16);

        jLabel4.setForeground(new java.awt.Color(0, 155, 210));
        jLabel4.setText("Check In Date");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(33, 270, 90, 16);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(150, 270, 250, 22);

        jLabel5.setForeground(new java.awt.Color(0, 155, 210));
        jLabel5.setText("Check Out Date");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(33, 320, 90, 20);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(150, 320, 250, 22);

        jLabel6.setForeground(new java.awt.Color(0, 155, 210));
        jLabel6.setText("Mobile Number");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(460, 140, 84, 16);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(570, 140, 250, 22);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(6, 296, 0, 0);

        jLabel8.setForeground(new java.awt.Color(0, 155, 210));
        jLabel8.setText("Price per Day");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(490, 270, 100, 16);

        jLabel9.setForeground(new java.awt.Color(0, 155, 210));
        jLabel9.setText("Numbers of days stayed");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(440, 310, 127, 16);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(570, 180, 250, 22);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(580, 270, 250, 22);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(580, 310, 250, 22);

        jLabel10.setForeground(new java.awt.Color(0, 155, 210));
        jLabel10.setText("Total Amount to be Paid");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(440, 350, 150, 20);
        getContentPane().add(jTextField9);
        jTextField9.setBounds(580, 350, 250, 22);

        jButton2.setBackground(new java.awt.Color(0, 176, 240));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Check Out");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(120, 400, 670, 40);

        jButton3.setBackground(new java.awt.Color(165, 165, 165));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Clear");
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(510, 70, 72, 23);

        jLabel11.setForeground(new java.awt.Color(0, 155, 210));
        jLabel11.setText("Customer Surname");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(50, 180, 102, 16);
        getContentPane().add(jTextField10);
        jTextField10.setBounds(160, 180, 250, 22);

        jLabel12.setForeground(new java.awt.Color(0, 155, 210));
        jLabel12.setText("Email");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(460, 180, 60, 16);

        jPanel1.setBackground(new java.awt.Color(161, 226, 249));
        jPanel1.setLayout(null);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(160, 140, 250, 22);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1170, 540);

        setBounds(412, 198, 878, 500);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

    }//GEN-LAST:event_formComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String roomNumber=jTextField1.getText();
        try
        {
            ResultSet rs =Select.getData("select * from customer where roomNumber='"+roomNumber+"' and checkOut is NULL");
            if(rs.next())
            {
                jTextField1.setEditable(false);
                id=rs.getInt(1);
                jTextField2.setText(rs.getString(2));
                jTextField3.setText(rs.getString(9));
                jTextField5.setText(rs.getString(4));
                jTextField6.setText(rs.getString(6));
                jTextField10.setText(rs.getString(3));
                jTextField7.setText(rs.getString(13));
                SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
                Calendar cal = Calendar.getInstance();
                jTextField4.setText(myFormat.format(cal.getTime()));
                
                String dateBeforeString=rs.getString(9);
                java.util.Date dateBefore=myFormat.parse(dateBeforeString);
                String dateAfterString = myFormat.format(cal.getTime());
                java.util.Date dateAfter= myFormat.parse(dateAfterString);
                long difference = dateAfter.getTime() - dateBefore.getTime();
                int numberOfDaysStayed=(int)(difference/(1000*60*60*24));
                if(numberOfDaysStayed==0)
                    numberOfDaysStayed=1;                 
                jTextField8.setText(Integer.toString(numberOfDaysStayed));
                float price=Float.parseFloat(jTextField7.getText());
                jTextField9.setText(String.valueOf(numberOfDaysStayed*price));
                
                
                roomType=rs.getString(12);
                bed = rs.getString(11);
                
                                                                
            }
            else
                JOptionPane.showMessageDialog(null, "Room number not Booked or Room number does not exist");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new CustomerCheckOut().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String name=jTextField2.getText();
        String surname =jTextField10.getText();
        String mobileNumber = jTextField5.getText();
        String email = jTextField6.getText();
        String checkOut = jTextField4.getText();
        String numberOfDaysStayed=jTextField8.getText();
        String totalAmount = jTextField9.getText();
        
        roomNumber = jTextField1.getText();
        Query = "update customer set daysStayed='"+numberOfDaysStayed+"',totalPrice='"+totalAmount+"',checkOut='"+checkOut+"' where id='"+id+"'";
        DBUpdater.setData(Query, "");
        Query= "update room set status='Not Booked' where roomNumber='"+roomNumber+"'";
        DBUpdater.setData(Query, "");
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        // TODO add your handling code here:
        this.dispose();
        
    }//GEN-LAST:event_formWindowLostFocus


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}