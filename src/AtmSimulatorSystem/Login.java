/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtmSimulatorSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    JLabel l1,l2,l3;
    JTextField tf1;
    JPasswordField pf1;
    JButton b1,b2,b3;
    JPanel panel;
            
    public Login()
    {
        setFont(new Font("System",Font.BOLD,22));
        Font font = getFont();
        setTitle("AUTOMATED TELLER MACHINE");
        
        panel = new JPanel();
        panel.setSize(550,550);
        panel.setLayout(null);
        add(panel);
        panel.setBackground(Color.WHITE);
        
        l1 = new JLabel("WELCOME TO ATM");
        l1.setFont(new Font("Osward", Font.BOLD, 38));
        
        l2 = new JLabel("CARD NO:");
        l2.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l3 = new JLabel("PIN:");
        l3.setFont(new Font("Raleway" , Font.BOLD, 20));
        
        tf1 = new JTextField(15);
        pf1 = new JPasswordField(15);
        
        b1 = new JButton("SIGN IN");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2 = new JButton("CLEAR");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        b3 = new JButton("SIGN UP");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
                
        l1.setBounds(87,50,450,200);
        panel.add(l1);
        
        l2.setBounds(105,150,375,200);
        panel.add(l2);
        
        l3.setBounds(105,225,375,200);
        panel.add(l3);
        
        tf1.setFont(new Font("Aerial", Font.BOLD, 14));
        tf1.setBounds(223,235,200,25);
        panel.add(tf1);
        
        pf1.setFont(new Font("Aerial", Font.BOLD, 14));
        pf1.setBounds(223,310,200,25);
        panel.add(pf1);
        
        b1.setFont(new Font("Aerial", Font.BOLD, 14));
        b1.setBounds(223,350,100,25);
        panel.add(b1);
        
        b2.setFont(new Font("Aerial", Font.BOLD, 14));
        b2.setBounds(330,350,93,25);
        panel.add(b2);
        
        b3.setFont(new Font("Aerial", Font.BOLD, 14));
        b3.setBounds(223,380,200,25);
        panel.add(b3);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);
          
        int windowWidth = 550;
        int windowHeight = 550;
        setSize(windowWidth,windowHeight);
        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowOpened(WindowEvent e) {
                
               // JOptionPane.showMessageDialog(null,"WELCOME");// ARE YOU A NEW USER YES THENDIRECT SIGN UP NO THEN LOGIN (=_=) WORK LATER
            }

            public void windowClosing(WindowEvent e) {
                if (JOptionPane.showConfirmDialog(null, "Are you sure ?") == JOptionPane.YES_OPTION) {
                setVisible(false);
                dispose();
                }
            }
        });
        //setLayout(new BorderLayout());
        setVisible(true);
        setResizable(false);
        //setMinimumSize(new Dimension(550,550));
        //setMaximumSize(new Dimension(550,550));
    }
    /*
    private void titleAlign() {
    
        setFont(new Font("System",Font.BOLD,22));
        Font font = getFont();
        String currentTitle = "AUTOMATED TELLER MACHINE";
        FontMetrics fm = getFontMetrics(font);
        int frameWidth = getWidth();
        System.out.println("Frame Width = " + frameWidth);
        int titleWidth = fm.stringWidth(currentTitle);
        int spaceWidth = fm.stringWidth(" ");
        System.out.println("Title Width = " + titleWidth);
        int z = (frameWidth / 2) - (titleWidth / 2);
        int fin = z/spaceWidth;
        
        System.out.println("sW = " + spaceWidth);
        System.out.println("z = " + z);
        System.out.println("fin = " + fin);
        String pad = "";
        for(int i=0;i<fin;i++)
            pad += " ";
        setTitle(pad + currentTitle);
    }
    */
    public void actionPerformed(ActionEvent ae)
    {
        try{
            Conn c1 = new Conn();
            String a = tf1.getText();
            String b = pf1.getText();
            String q = "select * from login where cardno = '"+a+"' and pin ='"+b+"'";
            ResultSet rs = c1.stmt.executeQuery(q);
            
            if(ae.getSource() == b1){
                if(rs.next())
                {
                    new Transaction().setVisible(true);
                    setVisible(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or Password");          
                }
            }
            else if(ae.getSource() == b2)
            {
                tf1.setText("");
                pf1.setText("");
                
            }
            else if(ae.getSource() == b3)
            {
                new SignUp().setVisible(true);
                setVisible(false);
            }
                
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.err.print("error: " +e);
                    
                    
        }
    }
    
    public static void main(String[] args)
    {
        //Login login = new Login();
    }
    
}
