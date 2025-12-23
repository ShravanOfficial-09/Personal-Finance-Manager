/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expenso;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Signup extends JFrame implements ActionListener {
   JTextField tfname,tfpassword,tfanswer,tfusername;
    JButton Create,back;
       Choice security;
    
    Signup(){
        setTitle("SignUp");
        setBounds(300,250,900,400);
      getContentPane().setBackground(Color.WHITE);
      setLayout(null);
      
      JPanel p1 =new JPanel();
      p1.setBackground(new Color(100,100,200));
      p1.setBounds(0,0,500,390);
      p1.setLayout(null);
      add(p1);
      
      JLabel lblusername= new JLabel("Username");
      lblusername.setFont(new Font ("Tahoma",Font.BOLD,14));
      lblusername.setBounds(50,20,125 ,25);
      p1.add(lblusername);
      
       tfusername=new JTextField();
      tfusername.setBounds(190,20,180,25);
      tfusername.setBorder(BorderFactory.createEmptyBorder());
      p1.add(tfusername);
      
      
       JLabel lblName= new JLabel("Name");
      lblName.setFont(new Font ("Tahoma",Font.BOLD,14));
      lblName.setBounds(50,60,125,25);
      p1.add(lblName);
      
       tfname=new JTextField();
      tfname.setBounds(190,60,180,25);
      tfname.setBorder(BorderFactory.createEmptyBorder());
      p1.add(tfname);
      
       JLabel lblpassword= new JLabel("Password");
      lblpassword.setFont(new Font ("Tahoma",Font.BOLD,14));
      lblpassword.setBounds(50,100,125,25);
      p1.add(lblpassword);
      
       tfpassword=new JTextField();
      tfpassword.setBounds(190,100,180,25);
      tfpassword.setBorder(BorderFactory.createEmptyBorder());
      p1.add(tfpassword);
      
       JLabel tfsecurity= new JLabel("Security Question");
      tfsecurity.setFont(new Font ("Tahoma",Font.BOLD,14));
      tfsecurity.setBounds(50,140,125,25);
      p1.add(tfsecurity);
      
     security=new Choice();
    security.add("FAV Character from THE BOYS");
    security.add("FAV Marvel Character");
    security.add("Your Lucky number");
    security.add("Your Childhood Superhero");
    security.setBounds(190,140,180,25);
    p1.add(security);
    
    
      JLabel lblanswer= new JLabel("Answer");
      lblanswer.setFont(new Font ("Tahoma",Font.BOLD,14));
      lblanswer.setBounds(50,180,125,25);
      p1.add(lblanswer);
      
           tfanswer=new JTextField();
      tfanswer.setBounds(190,180,180,25);
      tfanswer.setBorder(BorderFactory.createEmptyBorder());
      p1.add(tfanswer);
      
       Create =new JButton("Create");
      Create.setBackground(new Color(133,193,233));
      Create.setForeground(Color.WHITE);
      Create.setFont(new Font ("Tahoma",Font.BOLD,14));
      Create.setBounds(80,250,100,30);
      Create.addActionListener(this);
      p1.add(Create);

       back =new JButton("BACK");
      back.setBackground( Color.WHITE);
      back.setForeground(new Color(133,193,233));
      back.setFont(new Font ("Tahoma",Font.BOLD,14));
      back.setBounds(250,250,100,30);
      back.addActionListener(this);
      p1.add(back);
      
         
   ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/signup.png"));
   Image i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
   ImageIcon i3=new ImageIcon(i2);
   JLabel image =new JLabel(i3);
   image.setBounds(580,50,250,250);
   add(image);

   
      
   
      
      
     
     
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
    if(ae.getSource()==Create){
        String username=tfusername.getText();
        String name=tfname.getText();
        String password = tfpassword.getText();
        String question = security.getSelectedItem();
        String answer=tfanswer.getText();
        
        String query ="insert into account values('"+username+"','"+name+"','"+password+"','"+question+"','"+answer+"')";
        try{
        Conn c = new Conn();
        c.s.executeUpdate(query);
        
        JOptionPane.showMessageDialog(null,"Account Created Successfully");
        setVisible(false);
        new Login();
        
        }
        catch(Exception e){
        e.printStackTrace();}
    }else if(ae.getSource()==back){
        setVisible(false);
        new Login();
    }
    
    
    
    }
    
    public static void main(String args[]){
    new Signup();
            }
    
}
