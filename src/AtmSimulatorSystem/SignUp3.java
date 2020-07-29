/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtmSimulatorSystem;

import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author usake
 */
public class SignUp3 extends JFrame implements ActionListener{
   
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
    JTextField tf1;
    JRadioButton r1,r2,r3,r4;
    JButton b1,b2;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    
    public SignUp3()
    {
        setFont(new Font("System", Font.BOLD, 22));
        Font f = getFont();
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");
        
        l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        
        l2 = new JLabel("Acount Type:");
        l2.setFont(new Font("Raleway",Font.BOLD,18));
        
        l3 = new JLabel("Card Number:");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        
        l4 = new JLabel("XXXX-XXXX-XXXX-4184");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        
        l5 = new JLabel("(Your 16 digit Card Number)");
        l5.setFont(new Font("Raleway",Font.BOLD,12));
        
        l6 = new JLabel("(It will appear on your ATM Card,Cheque Book and Statements)");
        l6.setFont(new Font("Raleway",Font.BOLD,12));
        
        l7 = new JLabel("PIN:");
        l7.setFont(new Font("Raleway",Font.BOLD,18));
        
        l8 = new JLabel("XXXX");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        
        l9 = new JLabel("(4-Digit Password)");
        l9.setFont(new Font("Raleway",Font.BOLD,12));
        
        l10 = new JLabel("Services Requred:");
        l10.setFont(new Font("Raleway",Font.BOLD,18));
        
        l11 = new JLabel("Form No.:");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        
        r1 = new JRadioButton("Savings Account");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(Color.WHITE);
        
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(Color.WHITE);
        
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBackground(Color.WHITE);
        
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,14));
        r4.setBackground(Color.WHITE);
        
        c1 = new JCheckBox("ATM Card");
        c1.setFont(new Font("Raleway",Font.BOLD,14));
        c1.setBackground(Color.WHITE);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setFont(new Font("Raleway",Font.BOLD,14));
        c2.setBackground(Color.WHITE);
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setFont(new Font("Raleway",Font.BOLD,14));
        c3.setBackground(Color.WHITE);
        
        c4 = new JCheckBox("Email Alerts");
        c4.setFont(new Font("Raleway",Font.BOLD,14));
        c4.setBackground(Color.WHITE);
        
        c5 = new JCheckBox("Cheque Book");
        c5.setFont(new Font("Raleway",Font.BOLD,14));
        c5.setBackground(Color.WHITE);
        
        c6 = new JCheckBox("E-Statement");
        c6.setFont(new Font("Raleway",Font.BOLD,14));
        c6.setBackground(Color.WHITE);
        
        c7 = new JCheckBox("I hereby dectare that all the above entered details are correct to the best of my knowledge.");
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBackground(Color.WHITE);
        
        b1 = new JButton("Submit");
        b1.setFont(new Font("Raleway", Font.BOLD, 14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2 = new JButton("Cancel");
        b2.setFont(new Font("Raleway", Font.BOLD, 14));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        tf1 = new JTextField();
        tf1.setFont(new Font("Raleway", Font.BOLD, 14));
        
        setLayout(null);
        
        l11.setBounds(590,10,100,30);
        add(l11);
             
        tf1.setBounds(690,10,45,30);
        add(tf1);
      
        l1.setBounds(280,30,400,40);
        add(l1);
        
        l2.setBounds(100,80,200,30);
        add(l2);
        
        r1.setBounds(100,130,150,30);
        add(r1);
        
        r2.setBounds(350,130,250,30);
        add(r2);
        
        r3.setBounds(100,170,250,30);
        add(r3);
        
        r4.setBounds(350,170,250,30);
        add(r4);
        
        l3.setBounds(100,220,200,30);
        add(l3);
        
        l4.setBounds(330,220,250,30);
        add(l4);
        
        l5.setBounds(100,250,200,20);
        add(l5);
        
        l6.setBounds(330,250,500,20);
        add(l6);
        
        l7.setBounds(100,300,200,30);
        add(l7);
        
        l8.setBounds(330,300,200,30);
        add(l8);
        
        l9.setBounds(330,330,200,30);
        add(l9);
        
        l10.setBounds(100,380,200,20);
        add(l10);
        
        c1.setBounds(100,420,200,30);
        add(c1);
        
        c2.setBounds(350,420,200,30);
        add(c2);
        
        c3.setBounds(100,450,200,30);
        add(c3);
        
        c4.setBounds(350,450,200,30);
        add(c4);
        
        c5.setBounds(100,480,200,30);
        add(c5);
        
        c6.setBounds(350,480,200,30);
        add(c6);
        
        c7.setBounds(100,540,600,20);
        add(c7);
        
        b1.setBounds(420,590,100,30);
        add(b1);
        
        b2.setBounds(550,590,100,30);
        add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
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
        setSize(750,750);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);  
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        String a = null;
        if(r1.isSelected())
            a = "Savings Account";
        else if(r2.isSelected())
            a = "FixedDeposit Account";
        else if(r3.isSelected())
            a = "Current Account";
        else if(r4.isSelected())
            a = "Recurring Deposit Account";
        
        Random ran = new Random();
        long firstt = (ran.nextLong() % 90000000L) + 5040936000000000L;
        long first1 = Math.abs(firstt);
        
        long ftemp = (ran.nextLong() % 9000L) + 1000L;
        long first2 = Math.abs(ftemp);
        
        String b = "";
        if(c1.isSelected())
            b = b + " ATM Card";
        if(c2.isSelected())
            b = b + " Internet Banking";
        if(c3.isSelected())
            b = b + " Mobile Banking";
        if(c4.isSelected())
            b = b + " Email Alerts";
        if(c5.isSelected())
            b = b + " Cheque Book";
        if(c6.isSelected())
            b = b + " E-Statement";
        
        String c = tf1.getText();
        
        try{
            
            if(ae.getSource() == b1){
                if(b.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill in the blanks");
                }
                else
                {
                    Conn c1 = new Conn();
                    String q1 = "insert into signup3 values('"+a+"','"+first1+"','"+first2+"','"+b+"','"+c+"')";
                    String q2 = "insert into login values('"+first1+"','"+first2+"')";
                    String q3 = "insert into bank values('"+first1+"','"+first2+"', null)";
                    c1.stmt.executeUpdate(q1);
                    c1.stmt.executeUpdate(q2);
                    c1.stmt.executeUpdate(q3);
                    JOptionPane.showMessageDialog(null,"Card Number: " + first1 + "\n Pin:" + first2);
                    
                    new Deposit().setVisible(true);
                    setVisible(false);
                }
            }  
            else if(ae.getSource() == b2)
            {
                if (JOptionPane.showConfirmDialog(null, "Are you sure ?") == JOptionPane.YES_OPTION) {
                    setVisible(false);
                    new Login().setVisible(true);
                }
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public static void main(String args[])
    {
        new SignUp3();
    }
    
}
