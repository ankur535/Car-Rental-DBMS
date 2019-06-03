/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car_rental;

import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JFrame;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.lang.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.sql.Connection;

/**
 *
 * @author ankur
 */
public class car_page extends javax.swing.JFrame {

    public Connection cn;
public Statement st;

    public car_page() {
        initComponents();
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/car_rental ","root","07121998");
             st = cn.createStatement();
             
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Not Connected");
        }
        
        
        ImageIcon myimage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("mc1.jpg")));
        Image img1 = myimage.getImage();
        Image img2 = img1.getScaledInstance(jLabel2.getWidth(),jLabel2.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(img2);
        jLabel2.setIcon(i);
        
        ImageIcon myimage1= new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("jxj.jpg")));
        Image img3 = myimage1.getImage();
        Image img4 = img3.getScaledInstance(jLabel20.getWidth(),jLabel20.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon i1 = new ImageIcon(img4);
        jLabel20.setIcon(i1);
        
        ImageIcon myimage2 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("gle.jpg")));
        Image img5 = myimage2.getImage();
        Image img6 = img5.getScaledInstance(jLabel31.getWidth(),jLabel31.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon i2 = new ImageIcon(img6);
        jLabel31.setIcon(i2);
        
        ImageIcon myimage3 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("je.jpg")));
        Image img7 = myimage3.getImage();
        Image img8 = img7.getScaledInstance(jLabel37.getWidth(),jLabel37.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(img8);
        jLabel37.setIcon(i3);
        
        
        try{
            String sql = "Select * from car where car_id = 101 and loc_id =200";
            ResultSet rs = st.executeQuery(sql);
            
            if(rs.next())
            {
                 String j7 = rs.getString("make");
                 String j8 = rs.getString("model");
                 String j12 = rs.getString("mileage");
                 String j13 = rs.getString("reg_no");
                 String j11= rs.getString("cat_name");
                 
                 jLabel7.setText(j7);
                 jLabel8.setText(j8);
                 jLabel9.setText(j12+" Km/L");
                 jLabel10.setText(j13);
                 jLabel11.setText(j11);
           
            }
            else{
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(login_page.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try{
            String sql1 = "Select * from car where car_id = 102 and loc_id =200";
            ResultSet rs1 = st.executeQuery(sql1);
            
            if(rs1.next())
            {
                 String j28 = rs1.getString("make");
                 String j29 = rs1.getString("model");
                 String j14 = rs1.getString("mileage");
                 String j15 = rs1.getString("reg_no");
                 String j30= rs1.getString("cat_name");
                 
                 jLabel28.setText(j28);
                 jLabel29.setText(j29);
                 jLabel14.setText(j14+" Km/L");
                 jLabel15.setText(j15);
                 jLabel30.setText(j30);
           
            }
            else{
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(login_page.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         try{
            String sql2 = "Select * from car where car_id = 103 and loc_id =200";
            ResultSet rs2 = st.executeQuery(sql2);
            
            if(rs2.next())
            {
                 String j25 = rs2.getString("make");
                 String j24 = rs2.getString("model");
                 String j16 = rs2.getString("mileage");
                 String j17 = rs2.getString("reg_no");
                 String j22= rs2.getString("cat_name");
                 
                 jLabel25.setText(j25);
                 jLabel24.setText(j24);
                 jLabel16.setText(j16+" Km/L");
                 jLabel17.setText(j17);
                 jLabel22.setText(j22);
           
            }
            else{
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(login_page.class.getName()).log(Level.SEVERE, null, ex);
        }
         
          try{
            String sql3 = "Select * from car where car_id = 104 and loc_id =200";
            ResultSet rs3 = st.executeQuery(sql3);
            
            if(rs3.next())
            {
                 String j34 = rs3.getString("make");
                 String j35 = rs3.getString("model");
                 String j18 = rs3.getString("mileage");
                 String j19 = rs3.getString("reg_no");
                 String j36= rs3.getString("cat_name");
                 
                 jLabel34.setText(j34);
                 jLabel35.setText(j35);
                 jLabel18.setText(j18+" Km/L");
                 jLabel19.setText(j19);
                 jLabel36.setText(j36);
           
            }
            else{
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(login_page.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1920, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("4Wheels.com");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1580, -10, 340, 120);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 110, 1920, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("JayaNagar");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(560, 20, 240, 80);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 160, 430, 290);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(520, 160, 120, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel8);
        jLabel8.setBounds(570, 160, 140, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel9);
        jLabel9.setBounds(600, 230, 80, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel10);
        jLabel10.setBounds(600, 300, 100, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel11);
        jLabel11.setBounds(520, 350, 180, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Mileage:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(520, 220, 100, 50);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Reg No.:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(520, 290, 80, 40);
        getContentPane().add(jLabel20);
        jLabel20.setBounds(1080, 160, 430, 290);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Mileage:");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(540, 660, 100, 50);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel22);
        jLabel22.setBounds(540, 790, 180, 30);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Reg No.:");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(540, 730, 80, 40);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel24);
        jLabel24.setBounds(620, 600, 120, 30);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel25);
        jLabel25.setBounds(540, 600, 120, 30);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Reg No.:");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(1550, 310, 80, 40);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Mileage:");
        getContentPane().add(jLabel27);
        jLabel27.setBounds(1550, 240, 100, 50);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel28);
        jLabel28.setBounds(1550, 180, 120, 30);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel29);
        jLabel29.setBounds(1630, 180, 120, 30);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel30);
        jLabel30.setBounds(1550, 370, 180, 30);
        getContentPane().add(jLabel31);
        jLabel31.setBounds(90, 590, 430, 290);

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Reg No.:");
        getContentPane().add(jLabel32);
        jLabel32.setBounds(1540, 750, 80, 40);

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Mileage:");
        getContentPane().add(jLabel33);
        jLabel33.setBounds(1540, 680, 100, 50);

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel34);
        jLabel34.setBounds(1540, 620, 120, 30);

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel35);
        jLabel35.setBounds(1610, 620, 120, 30);

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel36);
        jLabel36.setBounds(1540, 810, 180, 30);
        getContentPane().add(jLabel37);
        jLabel37.setBounds(1100, 590, 430, 290);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel14);
        jLabel14.setBounds(1630, 250, 80, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel15);
        jLabel15.setBounds(1630, 320, 100, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel16);
        jLabel16.setBounds(610, 670, 80, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel17);
        jLabel17.setBounds(610, 740, 100, 30);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel18);
        jLabel18.setBounds(1610, 690, 80, 30);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel19);
        jLabel19.setBounds(1610, 760, 100, 30);

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7.setText("Back");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(50, 40, 130, 50);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(830, 20, 160, 90);

        jButton2.setBackground(new java.awt.Color(102, 255, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Book");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(260, 490, 110, 40);

        jButton3.setBackground(new java.awt.Color(102, 255, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Book");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(1230, 490, 110, 40);

        jButton4.setBackground(new java.awt.Color(102, 255, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Book");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(240, 920, 110, 40);

        jButton5.setBackground(new java.awt.Color(102, 255, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("Book");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(1250, 910, 110, 40);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\ankur\\OneDrive\\Pictures\\Project\\simple-gray-abstract-background-wi-1920x1080.jpg")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, -20, 1920, 1120);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        location_page fp = new location_page();
        fp.setVisible(true);
        fp.pack();
        fp.setLocationRelativeTo(null);
        fp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        
        String q1 = "Select availability from car where car_id = 101";
        try {
            ResultSet rs1 = st.executeQuery(q1);
            if(rs1.next())
            {
                int avail = rs1.getInt("availability");
                if(avail>0)
                {
                    Book_page fp = new Book_page(101);
        fp.setVisible(true);
        fp.pack();
        fp.setLocationRelativeTo(null);
        fp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
                
                }
                else{
                    JOptionPane.showMessageDialog(null,"This Car is not available. Book Another car");
                }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(car_page.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        String q1 = "Select availability from car where car_id = 102";
        try {
            ResultSet rs1 = st.executeQuery(q1);
            if(rs1.next())
            {
                int avail = rs1.getInt("availability");
                if(avail>0)
                {
                    Book_page fp = new Book_page(102);
        fp.setVisible(true);
        fp.pack();
        fp.setLocationRelativeTo(null);
        fp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
                
                }
                else{
                    JOptionPane.showMessageDialog(null,"This Car is not available. Book Another car");
                }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(car_page.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
         String q1 = "Select availability from car where car_id = 103";
        try {
            ResultSet rs1 = st.executeQuery(q1);
            if(rs1.next())
            {
                int avail = rs1.getInt("availability");
                if(avail>0)
                {
                    Book_page fp = new Book_page(103);
        fp.setVisible(true);
        fp.pack();
        fp.setLocationRelativeTo(null);
        fp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
                
                }
                else{
                    JOptionPane.showMessageDialog(null,"This Car is not available. Book Another car");
                }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(car_page.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        String q1 = "Select availability from car where car_id = 104";
        try {
            ResultSet rs1 = st.executeQuery(q1);
            if(rs1.next())
            {
                int avail = rs1.getInt("availability");
                if(avail>0)
                {
                    Book_page fp = new Book_page(104);
        fp.setVisible(true);
        fp.pack();
        fp.setLocationRelativeTo(null);
        fp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
                
                }
                else{
                    JOptionPane.showMessageDialog(null,"This Car is not available. Book Another car");
                }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(car_page.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(car_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(car_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(car_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(car_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new car_page().setVisible(true);
                
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
