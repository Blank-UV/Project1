/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtmSimulatorSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pin  extends JFrame implements ActionListener
{
    
    JLabel l1,l2,l3,l4;
    JPasswordField tf1,tf2,tf3;
    JButton b1,b2;
    
    public Pin()
    {
        setFont(new Font("System", Font.BOLD, 22));
        Font f = getFont();
        setTitle("PIN CHANGE");
        
        l1 = new JLabel("CHANGE YOUR PIN");
        l1.setFont(new Font("Raleway", Font.BOLD, 30));
        
        l2 = new JLabel("Current Pin:");
        l2.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l3 = new JLabel("New Pin:");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l4 = new JLabel("Re-Enter New Pin:");
        l4.setFont(new Font("Raleway", Font.BOLD, 17));
        
        b1 = new JButton("SAVE");
        b1.setFont(new Font("Raleway", Font.BOLD, 18));
        b1.setBackground(Color.BLACK);
        
        b1.setForeground(Color.WHITE);
        b2 = new JButton("BACK");
        b2.setFont(new Font("Raleway", Font.BOLD, 18));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        tf1 = new JPasswordField();
        tf1.setFont(new Font("Raleway", Font.BOLD, 18));
        
        tf2 = new JPasswordField();
        tf2.setFont(new Font("Raleway", Font.BOLD, 18));
      
        tf3 = new JPasswordField();
        tf3.setFont(new Font("Raleway", Font.BOLD, 18));
        
        setLayout(null);
        
        l1.setBounds(150,80,300,40);
        add(l1);
        
        l2.setBounds(70,150,200,40);
        add(l2);
        
        tf1.setBounds(250,150,250,30);
        add(tf1);
        
        l3.setBounds(70,220,200,40);
        add(l3);
        
        tf2.setBounds(250,220,250,30);
        add(tf2);
        
        l4.setBounds(70,290,200,40);
        add(l4);
        
        tf3.setBounds(250,290,250,30);
        add(tf3);
        
        b1.setBounds(140,360,150,30);
        add(b1);
        
        b2.setBounds(320,360,150,30);
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
            String c = tf3.getText();
            
            if(ae.getSource() == b1)
            {
                if(tf1.getText().equals(""))
                    JOptionPane.showMessageDialog(null,"Please Enter Current Pin");
                else if(tf2.getText().equals(""))
                    JOptionPane.showMessageDialog(null,"Enter New Pin");
                else if(tf3.getText().equals(""))
                    JOptionPane.showMessageDialog(null,"Re-Enter New Pin");
                else if(tf3.getText().equals(tf2.getText()))
                {
                    Conn c1 = new Conn();
                    String q1 = "update bank set pin = '"+b+"' where pin = '"+a+"' ";
                    String q2 = "update login set pin = '"+b+"' where pin = '"+a+"' ";
                    String q3 = "update signup3 set pin = '"+b+"' where pin = '"+a+"' ";
                    
                    c1.stmt.executeUpdate(q1);
                    c1.stmt.executeUpdate(q2);
                    c1.stmt.executeUpdate(q3);
                    
                    JOptionPane.showMessageDialog(null,"PIN Changed Successfully");
                    
                    new Transaction().setVisible(true);
                    setVisible(false);
                }
                else
                    JOptionPane.showMessageDialog(null,"Pin Entered does not match");
                
                
            }  
            else if(ae.getSource() == b2)
            {
                new Transaction().setVisible(true);
                setVisible(false);                
            }
              
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            System.out.println("Error : "+ex);
        }
    }
    public static void main(String args[])
    {
        new Pin().setVisible(true);
    }
    
}
