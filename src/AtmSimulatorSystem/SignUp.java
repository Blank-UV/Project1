/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtmSimulatorSystem;
import java.sql.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SignUp extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
    JComboBox c1,c2,c3;
    JRadioButton r1,r2,r3,r4,r5;
    JButton b1;
    JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7;
    
    Random ran = new Random();
    long first1 = (ran.nextLong() % 9000L) + 1000L; // Generate tandom values from 1000L to 10000L(10000 Not Included
    long first = Math.abs(first1);
    
    public SignUp(){
        
        setTitle("NEW ACCOUNT APPLICATION FORM");
        
        l1 = new JLabel("APPLICATION FORM NO. " + first);
        l1.setFont(new Font("Raleway", Font.BOLD, 35));
        
        l2 = new JLabel("Page 1: Personal Details");
        l2.setFont(new Font("Raleway", Font.BOLD, 26));
        
        l3 = new JLabel("Name:");
        l3.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l4 = new JLabel("Father's Name:");
        l4.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l5 = new JLabel("Date Of Birth:");
        l5.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l6 = new JLabel("Gender:");
        l6.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l7 = new JLabel("Email Address:");
        l7.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l8 = new JLabel("Marital Status:");
        l8.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l9 = new JLabel("Address:");
        l9.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l10 = new JLabel("City:");
        l10.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l11= new JLabel("Pin Code:");
        l11.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l12= new JLabel("State:");
        l12.setFont(new Font("Raleway", Font.BOLD, 20));
       
        l13= new JLabel("Date:");
        l13.setFont(new Font("Raleway", Font.BOLD, 16));
        
        l14= new JLabel("Month:");
        l14.setFont(new Font("Raleway", Font.BOLD, 16));
        
        l15 = new JLabel("Year:");
        l15.setFont(new Font("Raleway", Font.BOLD, 16));
        
        tf1 = new JTextField();
        tf1.setFont(new Font("Raleway", Font.BOLD, 14));
        
        tf2 = new JTextField();
        tf2.setFont(new Font("Raleway", Font.BOLD, 14));
        
        tf3 = new JTextField();
        tf3.setFont(new Font("Raleway", Font.BOLD, 14));
        
        tf4 = new JTextField();
        tf4.setFont(new Font("Raleway", Font.BOLD, 14));
        
        tf5 = new JTextField();
        tf5.setFont(new Font("Raleway", Font.BOLD, 14));
        
        tf6 = new JTextField();
        tf6.setFont(new Font("Raleway", Font.BOLD, 14));
        
        tf7 = new JTextField();
        tf7.setFont(new Font("Raleway", Font.BOLD, 14));
        
        b1 = new JButton("Next");
        b1.setFont(new Font("Raleway", Font.BOLD, 14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(Color.WHITE);
        
        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(Color.WHITE);
        
        r3 = new JRadioButton("Married");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(Color.WHITE);
       
        r4 = new JRadioButton("Unmarried");
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBackground(Color.WHITE);
        
        r5 = new JRadioButton("Other");
        r5.setFont(new Font("Raleway", Font.BOLD, 14));
        r5.setBackground(Color.WHITE);
        
        String date[] = {"1","2","3","4","5","6","7","8","9"};
        c1 = new JComboBox(date);
        c1.setBackground(Color.WHITE);
        
        String month[] = {"January","Febuary","March","April","May","June","July","August","September","October","November","December"};
        c2 = new JComboBox(month);
        c2.setBackground(Color.WHITE);
        
        String year[] = {"1997","1998","1999","2000","2001","2002","2003","2004","2005","2006"};
        c3 = new JComboBox(year);
        c3.setBackground(Color.WHITE);

        setLayout(null);
        
        l1.setBounds(120,20,600,40);
        add(l1);
        
        l2.setBounds(220,70,600,30);
        add(l2);
        
        l3.setBounds(80,140,100,30);
        add(l3);
        
        tf1.setBounds(250,140,400,30);
        add(tf1);
        
        l4.setBounds(80,190,200,30);
        add(l4);
        
        tf2.setBounds(250,190,400,30);
        add(tf2);
        
        l5.setBounds(80,240,200,30);
        add(l5);
        
        l13.setBounds(250,240,50,30);
        add(l13);
                
        c1.setBounds(300,240,40,30);
        add(c1);
        
        l14.setBounds(360,240,60,30);
        add(l14);
        
        c2.setBounds(420,240,90,30);
        add(c2);
        
        l15.setBounds(530,240,40,30);
        add(l15);
        
        c3.setBounds(580,240,70,30);
        add(c3);
        
        l6.setBounds(80,290,200,30);
        add(l6);
        
        r1.setBounds(250,290,60,30);
        add(r1);
        
        r2.setBounds(410,290,90,30);
        add(r2);
        
        l7.setBounds(80,340,200,30);
        add(l7);
        
        tf3.setBounds(250,340,400,30);
        add(tf3);
        
        l8.setBounds(80,390,200,30);
        add(l8);
        
        r3.setBounds(250,390,100,30);
        add(r3);
        
        r4.setBounds(410,390,100,30);
        add(r4);
        
        r5.setBounds(590,390,100,30);
        add(r5);
        
        l9.setBounds(80,440,200,30);
        add(l9);
        
        tf4.setBounds(250,440,400,30);
        add(tf4);
        
        l10.setBounds(80,490,400,30);
        add(l10);
        
        tf5.setBounds(250,490,400,30);
        add(tf5);
        
        l11.setBounds(80,540,400,30);
        add(l11);
        
        tf6.setBounds(250,540,400,30);
        add(tf6);
        
        l12.setBounds(80,590,200,30);
        add(l12);
        
        tf7.setBounds(250,590,400,30);
        add(tf7);
        
        b1.setBounds(570,640,80,30);
        add(b1);
        
        b1.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(750,750);
        //setLocation(500,500);
        setResizable(false);
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
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        String a = tf1.getText();
        String b = tf2.getText();
        
        String ac = (String)c1.getSelectedItem();
        String bc = (String)c2.getSelectedItem();
        String cc = (String)c3.getSelectedItem();
        
        String d = null;
        if(r1.isSelected())
        {
            d = "Male";
        }
        else if(r2.isSelected())
        {
            d = "Female";
        }
        String e = tf3.getText();
        String f = null;
        
        if(r3.isSelected())
        {
            f = "Married";
        }
        else if(r4.isSelected())
        {
            f = "Unmarried";
        }
        else if(r5.isSelected())
        {
            f = "Other";
        }
        
        String g = tf4.getText();
        String h = tf5.getText();
        String i = tf6.getText();
        String j = tf7.getText();
        
        try{
            if(tf6.getText().equals(""))
                JOptionPane.showMessageDialog(null,"Fill all the required Fields");
            else
            {
                Conn c1 = new Conn();
                String q1 = "insert into signup values('"+a+"','"+b+"','"+ac+"','"+bc+"','"+cc+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+i+"','"+j+"','"+first+"')";
                c1.stmt.executeUpdate(q1);
                
                new SignUp2().setVisible(true);
                setVisible(false);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public static void main()
    {
        new SignUp().setVisible(true);
    }
}

    

