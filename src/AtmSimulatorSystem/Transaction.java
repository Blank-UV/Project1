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
public class Transaction extends JFrame implements ActionListener {
    
    JLabel l1;
    JButton b1,b2,b3,b4,b5,b6,b7;
    public Transaction()
    {
        setFont(new Font("System",Font.BOLD, 22));
        Font f = getFont();
        setTitle("TRANSACTION");
        
        l1 = new JLabel("Please Select Your Transaction");
        l1.setFont(new Font("Raleway", Font.BOLD, 25));
        
        b1 = new JButton("Deposit");
        b1.setFont(new Font("Raleway", Font.BOLD, 18));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2 = new JButton("Cash Withdrawl");
        b2.setFont(new Font("Raleway", Font.BOLD, 18));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        b3 = new JButton("Fast Cash");
        b3.setFont(new Font("Raleway", Font.BOLD, 18));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        
        b4 = new JButton("Mini Statement");
        b4.setFont(new Font("Raleway", Font.BOLD, 18));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        
        b5 = new JButton("Pin Change");
        b5.setFont(new Font("Raleway", Font.BOLD, 18));
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        
        b6 = new JButton("Balance Enquiry");
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
        if(ae.getSource() == b1)
        {
            new Deposit().setVisible(true);
            setVisible(false);
        }
        else if(ae.getSource() == b2)
        {
            new Withdrawal().setVisible(true);
            setVisible(false);
        } 
        else if(ae.getSource() == b3)
        {
            new FastCash().setVisible(true);
            setVisible(false);
        } 
        else if(ae.getSource() == b4)
        {
            new Login().setVisible(true);
            setVisible(false);
        } 
        else if(ae.getSource() == b5)
        {
            new Pin().setVisible(true);
            setVisible(false);
        } 
        else if(ae.getSource() == b6)
        {
            String pinn = JOptionPane.showInputDialog("Enter Pin");
            Conn c1 = new Conn();
            try{
                ResultSet rs = c1.stmt.executeQuery("Select balance from bank order by pin = '"+pinn+"' desc limit 1");
                
                if(rs.next())
                {
                    String balance = rs.getString("balance");
                    JOptionPane.showMessageDialog(null, "Your Account Balance is " + balance);
                }
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
        else if(ae.getSource() == b7)
        {
            if(JOptionPane.showConfirmDialog(null, "Are You Sure ?") == JOptionPane.YES_OPTION)
            {
                setVisible(false);               
                System.exit(0);
            }
        } 
    }
    
    public static void main(String args[])
    {
        new Transaction().setVisible(true);
    }
}
