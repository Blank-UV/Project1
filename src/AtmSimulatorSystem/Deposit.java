/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtmSimulatorSystem;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Deposit extends JFrame implements ActionListener{
    
    JLabel l1,l2,l3;
    JButton b1,b2,b3;
    JTextField tf1,tf2;
    
    public Deposit()
    {
        setFont(new Font("System", Font.BOLD, 22));
        Font f = getFont();
        setTitle("DEPOSIT");
        
        l1 = new JLabel("ENTER AMOUNT YOU WANT");
        l1.setFont(new Font("Raleway",Font.BOLD,35));
        
        l2 = new JLabel("TO DEPOSIT");
        l2.setFont(new Font("Raleway",Font.BOLD,35));
        
        l3 = new JLabel("Enter Pin:");
        l3.setFont(new Font("Raleway",Font.BOLD,14));
        
        b1 = new JButton("DEPOSIT");
        b1.setFont(new Font("Raleway",Font.BOLD,18));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2 = new JButton("BACK");
        b2.setFont(new Font("Raleway",Font.BOLD,18));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        b3 = new JButton("EXIT");
        b3.setFont(new Font("Raleway",Font.BOLD,18));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        tf1 = new JTextField();
        tf1.setFont(new Font("Raleway", Font.BOLD, 22));
        
        tf2 = new JTextField();
        tf2.setFont(new Font("Raleway", Font.BOLD, 14));
        
        setLayout(null);
        
        l1.setBounds(60,130,500,30);
        add(l1);
        
        l2.setBounds(200,180,500,60);
        add(l2);
        
        tf1.setBounds(160,270,300,50);
        add(tf1);
        tf1.setHorizontalAlignment(JTextField.CENTER);
        
        l3.setBounds(460,10,80,30);
        add(l3);
        
        tf2.setBounds(540,10,40,30);
        add(tf2);
        
        b1.setBounds(160,350,137,50);
        add(b1);
        
        b2.setBounds(320,350,137,50);
        add(b2);
        
        b3.setBounds(220,420,200,50);
        add(b3); 
  
        getContentPane().setBackground(Color.WHITE);
        
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowOpened(WindowEvent e) {
            }

            public void windowClosing(WindowEvent e) {
                if (JOptionPane.showConfirmDialog(null, "Are you sure ?") == JOptionPane.YES_OPTION) {
                setVisible(false);
                System.exit(0);
                }
            }
        });               
        setSize(600,600);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);         
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        try
        {
            String a = tf1.getText();
            String b = tf2.getText();
            
            if(ae.getSource() == b1)
            {
                if(tf1.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Please Enter the Amount you want to deposit");
                }
                else if(tf2.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Please Enter the Pin");
                }
                else
                {
                    Conn c1 = new Conn();
                    ResultSet rs = c1.stmt.executeQuery("select * from bank where pin = '"+b+"'");
                    
                        double balance = 0;
                        if(rs.next() == false)
                            JOptionPane.showMessageDialog(null,"Entered PIN is not correct");
                        else
                        {
                            String pin = rs.getString("pin");
                            balance = rs.getDouble("Balance");
                            double d = Double.parseDouble(a);
                            balance += d;
                            String q1 = "update bank set balance = '"+balance+"' where pin = '"+pin+"'";
                            c1.stmt.executeUpdate(q1);
                            JOptionPane.showMessageDialog(null,"Rs. "+a+" Deposited Succesfully");
                            new Transaction().setVisible(true);
                            setVisible(false);
                        }
                    
                                   
                    
                }
            }
            else if(ae.getSource() == b2)
            {
                new Transaction().setVisible(true);
                setVisible(false);
            }
            else if(ae.getSource() == b3)
            {
                System.exit(0);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            System.out.println("Error :" + ex);
        }
    }
    
    public static void main(String args[])
    {
        new Deposit().setVisible(true);
    }
}
