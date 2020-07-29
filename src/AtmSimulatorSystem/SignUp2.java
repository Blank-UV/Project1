/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtmSimulatorSystem;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author usake
 */
public class SignUp2 extends JFrame implements ActionListener{
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
    JButton b1;
    JRadioButton r1,r2,r3,r4;
    JTextField tf1,tf2,tf3;
    JComboBox c1,c2,c3,c4,c5;
    
    public SignUp2(){
        setFont(new Font("System",Font.BOLD,22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        int y = fm.stringWidth(" ");
        int z = getWidth()/2 - x/2;
        int w = z/y;
        String pad = "";
        pad = String.format("%"+w+"s", pad);
        setTitle(pad + "NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        l1 = new JLabel("Page 2: Additional Details");
        l1.setFont(new Font("Raleway", Font.BOLD,18));
        
        l2 = new JLabel("Religion:");
        l2.setFont(new Font("Raleway", Font.BOLD,18));
        
        l3 = new JLabel("Category:");
        l3.setFont(new Font("Raleway", Font.BOLD,18));
        
        l4 = new JLabel("Income:");
        l4.setFont(new Font("Raleway", Font.BOLD,18));
        
        l5 = new JLabel("Educational");
        l5.setFont(new Font("Raleway", Font.BOLD,18));
        
        l6 = new JLabel("Qualification:");
        l6.setFont(new Font("Raleway", Font.BOLD,18));
        
        l7 = new JLabel("Occupation:");
        l7.setFont(new Font("Raleway", Font.BOLD,18));
        
        l8 = new JLabel("Pan Numer:");
        l8.setFont(new Font("Raleway", Font.BOLD,18));
        
        l9 = new JLabel("Aadhar Number:");
        l9.setFont(new Font("Raleway", Font.BOLD,18));
        
        l10 = new JLabel("Senior Citizen:");
        l10.setFont(new Font("Raleway", Font.BOLD,18));
        
        l11 = new JLabel("Existing  Account:");
        l11.setFont(new Font("Raleway", Font.BOLD,18));
        
        l12 = new JLabel("Form No.:");
        l12.setFont(new Font("Raleway", Font.BOLD,14));
        
        b1 = new JButton("Next");
        b1.setFont(new Font("Raleway", Font.BOLD,14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        tf1 = new JTextField();
        tf1.setFont(new Font("Raleway", Font.BOLD,14));
        
        tf2 = new JTextField();
        tf2.setFont(new Font("Raleway", Font.BOLD,14));
        
        tf3 = new JTextField();
        tf3.setFont(new Font("Raleway", Font.BOLD,14));
        
        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway", Font.BOLD,14));
        r1.setBackground(Color.WHITE);
        
        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway", Font.BOLD,14));
        r2.setBackground(Color.WHITE);
        
        r3 = new JRadioButton("Yes");
        r3.setFont(new Font("Raleway", Font.BOLD,14));
        r3.setBackground(Color.WHITE);
        
        r4 = new JRadioButton("No");
        r4.setFont(new Font("Raleway", Font.BOLD,14));
        r4.setBackground(Color.WHITE);
        
        String Religion[] = {"Hindu","Muslim","Christin","Other"};
        c1 = new JComboBox(Religion);
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 14));
        
        String category[] = {"General","OBC","SC","ST","Other"};
        c2 = new JComboBox(category);
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 14));
        
        String income[] = {"<1,00,000","<2,00,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
        c3 = new JComboBox(income);
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 14));
        
        String education[] = {"Non-Graduate","Graduate","Post-Graduate","Others"};
        c4 = new JComboBox(education);
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 14));
        
        String occupation[] = {"Salaried","Self-Employed","Business","Studet","Retired","Others"};
        c5 = new JComboBox(occupation);
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 14));
        
        setLayout(null);
        
        l12.setBounds(590,10,100,30); //form No.
        add(l12);
        
        tf3.setBounds(690,10,45,30);
        add(tf3);
        
        l1.setBounds(280,30,600,40);
        add(l1);
        
        l2.setBounds(100,120,320,30);
        add(l2);
        
        c1.setBounds(350,120,320,30);
        add(c1);
        
        l3.setBounds(100,170,100,30);
        add(l3);
        
        c2.setBounds(350,170,320,30);
        add(c2);
        
        l4.setBounds(100,220,100,30);
        add(l4);
        
        c3.setBounds(350,220,320,30);
        add(c3);
        
        l5.setBounds(100,270,150,30);
        add(l5);
        
        c4.setBounds(350,270,320,30);
        add(c4);
        
        l6.setBounds(100,290,150,30);
        add(l6);
        
        c5.setBounds(350,340,320,30);
        add(c5);
        
        l7.setBounds(100,340,150,30);
        add(l7);
        
        tf1.setBounds(350,390,150,30);
        add(tf1);
        
        l8.setBounds(100,390,150,30);
        add(l8);
        
        tf2.setBounds(350,440,150,30);
        add(tf2);
        
        l9.setBounds(100,440,320,30);
        add(l9);
        
        r1.setBounds(350,490,100,30);
        add(r1);
        
        r2.setBounds(460,490,100,30);
        add(r2);
        
        l10.setBounds(100,490,180,30);
        add(l10);
        
        r3.setBounds(350,540,100,30);
        add(r3);
        
        r4.setBounds(460,540,100,30);
        add(r4);
        
        l11.setBounds(100,540,180,30);
        add(l11);
        
        b1.setBounds(570,600,100,30);
        add(b1);
        
        b1.addActionListener(this);
        
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
        String a = (String)c1.getSelectedItem();
        String b = (String)c2.getSelectedItem();
        String c = (String)c3.getSelectedItem();
        String d = (String)c4.getSelectedItem();
        String e = (String)c5.getSelectedItem();
        
        String f = tf1.getText();
        String g = tf2.getText();
        
        String h = "";
        if(r1.isSelected())
            h = "Yes";
        else if(r2.isSelected())
            h = "No";
        
        String i = "";
        if(r3.isSelected())
            h = "Yes";
        else if(r4.isSelected())
            h = "No";
        
        String j = tf3.getText();
        
        try{
            if(tf2.getText().equals("") || tf1.getText().equals("") || tf3.getText().equals(""))
                JOptionPane.showMessageDialog(null,"Fill all the required fields");
            else
            {
                Conn con = new Conn();
                String q1 = "insert into signup2 values('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+i+"','"+j+"')";
                con.stmt.executeUpdate(q1);
                
                new SignUp3().setVisible(true);
                setVisible(false);
            }
                      
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public static void main(){
        new SignUp2().setVisible(true);
    }
    
}
