/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtmSimulatorSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
/**
 *
 * @author usake
 */
public class FastCash extends JFrame implements ActionListener {
    
    JLabel l1,l2;
    JButton b1,b2,b3,b4,b5,b6,b7;
    JTextField tf1;
    public FastCash()
    {
        setFont(new Font("System",Font.BOLD, 22));
        Font f = getFont();
        setTitle("FAST CASH");
        
        l1 = new JLabel("SELECT WITHDRAWAL AMOUNT");
        l1.setFont(new Font("Raleway", Font.BOLD, 25));
        
        l2 = new JLabel("Enter PIN:");
        l2.setFont(new Font("Raleway", Font.BOLD,14));
        
        tf1 = new JTextField();
        tf1.setFont(new Font("Raleway", Font.BOLD, 14));
        
        b1 = new JButton("100");
        b1.setFont(new Font("Raleway", Font.BOLD, 18));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2 = new JButton("500");
        b2.setFont(new Font("Raleway", Font.BOLD, 18));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        b3 = new JButton("1000");
        b3.setFont(new Font("Raleway", Font.BOLD, 18));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        
        b4 = new JButton("2000");
        b4.setFont(new Font("Raleway", Font.BOLD, 18));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        
        b5 = new JButton("5000");
        b5.setFont(new Font("Raleway", Font.BOLD, 18));
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        
        b6 = new JButton("10000");
        b6.setFont(new Font("Raleway", Font.BOLD, 18));
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.WHITE);
        
        b7 = new JButton("Exit");
        b7.setFont(new Font("Raleway", Font.BOLD, 18));
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.WHITE);
        
        
        setLayout(null);
        
        l1.setBounds(120,70,400,40);
        add(l1);
        
        l2.setBounds(460,10,80,30);
        add(l2);
        
        tf1.setBounds(540,10,40,30);
        add(tf1);
        
        b1.setBounds(60,180,200,40);
        add(b1);
        
        b2.setBounds(330,180,200,40);
        add(b2);
        
        b3.setBounds(60,280,200,40);
        add(b3);
        
        b4.setBounds(330,280,200,40);
        add(b4);
        
        b5.setBounds(60,380,200,40);
        add(b5);
        
        b6.setBounds(330,380,200,40);
        add(b6);
        
        b7.setBounds(195,480,200,40);
        add(b7);
        
        b1.addActionListener(this);        
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        
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
        String a = tf1.getText();
        
        double balance = 0L;
        try
        {
            if(ae.getSource() == b7)
            {
                if(JOptionPane.showConfirmDialog(null, "Are You Sure ?") == JOptionPane.YES_OPTION)
                {
                    setVisible(false);               
                    System.exit(0);
                }
            } 
            if(a.equals(""))
                JOptionPane.showMessageDialog(null, "Please Enter the PIN");
        
            else if(ae.getSource() == b1)
            {
                Conn c1 = new Conn();
                    
                
                ResultSet rs = c1.stmt.executeQuery("select * from bank where pin = '"+a+"'");
                   
                    if(rs.next())
                    {
                        String pin = rs.getString("pin");
                        balance = rs.getDouble("Balance");
                        if(balance < 100)
                            JOptionPane.showMessageDialog(null,"Your do not have sufficient balance");
                        else
                        {
                            balance -= 100;
                            String q1 = "update bank set balance = '"+balance+"' where pin = '"+pin+"'";
                            c1.stmt.executeUpdate(q1);
                            JOptionPane.showMessageDialog(null,"Rs. "+100+" Deposited Succesfully");
                        }
                    
                        new Transaction().setVisible(true);
                        setVisible(false);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Entered PIN is not correct");
                    }
            }
            
            else if(ae.getSource() == b2)
            {
                Conn c1 = new Conn();
                ResultSet rs = c1.stmt.executeQuery("select * from bank where pin = '"+a+"'");
                   
                    if(rs.next())
                    {
                        String pin = rs.getString("pin");
                        balance = rs.getDouble("Balance");
                        if(balance < 100)
                            JOptionPane.showMessageDialog(null,"Your do not have sufficient balance");
                        else
                        {
                            balance -= 200;
                            String q1 = "update bank set balance = '"+balance+"' where pin = '"+pin+"'";
                            c1.stmt.executeUpdate(q1);
                            JOptionPane.showMessageDialog(null,"Rs. "+200+" Deposited Succesfully");
                        }
                    
                    new Transaction().setVisible(true);
                    setVisible(false);
                    }
                    else
                        JOptionPane.showMessageDialog(null,"Entered PIN is not correct");               
            } 
            else if(ae.getSource() == b3)
            {
                Conn c1 = new Conn();
                
                    ResultSet rs = c1.stmt.executeQuery("select * from bank where pin = '"+a+"'");
                   
                    if(rs.next())
                    {
                        String pin = rs.getString("pin");
                        balance = rs.getDouble("Balance");
                        if(balance < 100)
                            JOptionPane.showMessageDialog(null,"Your do not have sufficient balance");
                        else
                        {
                            balance -= 500;
                            String q1 = "update bank set balance = '"+balance+"' where pin = '"+pin+"'";
                            c1.stmt.executeUpdate(q1);
                            JOptionPane.showMessageDialog(null,"Rs. "+500+" Deposited Succesfully");
                        }
                        new Transaction().setVisible(true);
                        setVisible(false);
                    }
                    else
                        JOptionPane.showMessageDialog(null,"Entered PIN is not correct");                
            } 
            else if(ae.getSource() == b4)
            {
                Conn c1 = new Conn();
                    ResultSet rs = c1.stmt.executeQuery("select * from bank where pin = '"+a+"'");
                   
                    if(rs.next())
                    {
                        String pin = rs.getString("pin");
                        balance = rs.getDouble("Balance");
                        if(balance < 100)
                            JOptionPane.showMessageDialog(null,"Your do not have sufficient balance");
                        else
                        {
                            balance -= 1000;
                            String q1 = "update bank set balance = '"+balance+"' where pin = '"+pin+"'";
                            c1.stmt.executeUpdate(q1);
                            JOptionPane.showMessageDialog(null,"Rs. "+1000+" Deposited Succesfully");
                        }
                        new Transaction().setVisible(true);
                        setVisible(false);
                    }
                    else
                        JOptionPane.showMessageDialog(null,"Entered PIN is not correct");
            } 
            else if(ae.getSource() == b5)
            {
               Conn c1 = new Conn();
                ResultSet rs = c1.stmt.executeQuery("select * from bank where pin = '"+a+"'");
                   
                    if(rs.next())
                    {
                        String pin = rs.getString("pin");
                        balance = rs.getDouble("Balance");
                        if(balance < 100)
                            JOptionPane.showMessageDialog(null,"Your do not have sufficient balance");
                        else
                        {
                            balance -= 5000;
                            String q1 = "update bank set balance = '"+balance+"' where pin = '"+pin+"'";
                            c1.stmt.executeUpdate(q1);
                            JOptionPane.showMessageDialog(null,"Rs. "+5000+" Deposited Succesfully");
                        }
                    
                        new Transaction().setVisible(true);
                        setVisible(false);
                    }
                    else
                        JOptionPane.showMessageDialog(null,"Entered PIN is not correct");
                    
            } 
            else if(ae.getSource() == b6)
            {
                Conn c1 = new Conn();
                ResultSet rs = c1.stmt.executeQuery("select * from bank where pin = '"+a+"'");
                   
                    if(rs.next())
                    {
                        String pin = rs.getString("pin");
                        balance = rs.getDouble("Balance");
                        if(balance < 100)
                            JOptionPane.showMessageDialog(null,"Your do not have sufficient balance");
                        else
                        {
                            balance -= 10000;
                            String q1 = "update bank set balance = '"+balance+"' where pin = '"+pin+"'";
                            c1.stmt.executeUpdate(q1);
                            JOptionPane.showMessageDialog(null,"Rs. "+10000+" Deposited Succesfully");
                        }
                        new Transaction().setVisible(true);
                        setVisible(false);
                    }
                    else
                        JOptionPane.showMessageDialog(null,"Entered PIN is not correct");
                    
                
            }
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
    public static void main(String args[])
    {
        new FastCash().setVisible(true);
    }
}
