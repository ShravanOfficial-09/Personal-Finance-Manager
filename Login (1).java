
package expenso;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{
    JButton login,signup,password;
    JTextField tfusername,tfpassword ; 
    Login(){
        setTitle("Login to Account");
    setSize(900,400);
    setLocation(350,200);
    setLayout(null);
    
    getContentPane().setBackground(Color.WHITE);
    
    JPanel p1= new JPanel();
    p1.setBackground (new Color(131,193,233));
   p1.setBounds(0,0,400,400);
   p1.setLayout(null);
   add(p1);
   
   ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/Login.png"));
   Image i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
   ImageIcon i3=new ImageIcon(i2);
   JLabel image =new JLabel(i3);
   image.setBounds(100,120,200,200);
   p1.add(image);
   
   JPanel p2 =new JPanel();
   p2.setLayout(null);
   p2.setBounds(400,30,450,300);
   add(p2);
      
   JLabel lb1username= new JLabel("Username");
   lb1username.setBounds(60,20,100,25);
   lb1username.setFont(new Font ("SAN_SERIF",Font.PLAIN,20));
   p2.add(lb1username);
   
   tfusername = new JTextField();
   tfusername.setBounds(60,60,300,30);
   tfusername.setBorder (BorderFactory.createEmptyBorder());
   p2.add(tfusername);
   
     JLabel lb1password= new JLabel("Password");
   lb1password.setBounds(60,100,100,25);
   lb1password.setFont(new Font ("SAN_SERIF",Font.PLAIN,20));
   p2.add(lb1password);
   
    tfpassword = new JTextField();
   tfpassword.setBounds(60,140,300,30);
   tfpassword.setBorder (BorderFactory.createEmptyBorder());
   p2.add(tfpassword);
   
    login =new JButton("Login");
   login.setBackground(new Color(0,128,128));
   login.setBounds(60,200,130,30);
   login.setForeground(Color.WHITE);
   login.addActionListener(this);
   p2.add(login); 
   
    signup =new JButton("Signup");
   signup.setBackground(new Color(0,128,128));
   signup.setBounds(230,200,130,30);
   signup.setForeground(Color.WHITE);
   signup.addActionListener(this);
   p2.add(signup); 
   
    password =new JButton("Forget Password");
   password.setBackground(new Color(0,128,128));
   password.setBounds(145,250,130,30);
   password.setForeground(Color.WHITE);
   password.addActionListener(this);
   p2.add(password); 
   
   JLabel text = new JLabel("Trouble in Login...");
   text.setBounds(300,250,150,20);
  p2. add(text);
   
   
   
   
   setVisible(true);
    
    }
    public void actionPerformed(ActionEvent ae){
    if((ae.getSource()== login)){
    try{
        String username = tfusername.getText();
        String pass = tfpassword.getText();
        
        String query = "select * from account where username ='"+username+"' AND password = '"+pass+"' ";
        Conn c= new Conn();
         ResultSet rs =c.s.executeQuery(query);
  if(rs.next()){
      setVisible(false);
      new Loading(username);
      
      } else {
      JOptionPane.showMessageDialog(null, "Incorrect usename or password");
            }
    }
  
  
  
  catch(Exception e){
    e.printStackTrace();
    }
    }
    
    else if(ae.getSource()==signup){
    
    setVisible(false);
    new Signup();
    }
    else {
    setVisible(false);
            new ForgetPassword();
    }
    }
    
    
    
    
  
    public static void main (String args[]){
    new Login();
    }
}

