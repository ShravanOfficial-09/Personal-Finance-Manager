/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expenso;

import javax.swing.*;
import java.awt.*;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Splash  extends JFrame implements Runnable {
    Thread thread;
    Splash(){
        setTitle("WELCOME");
       setSize(1200,600);
        setLocation(200,100);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/pigy1.jpg"));
        Image i2 =i1.getImage().getScaledInstance(1050,600,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image =new JLabel(i3);
        add(image);
        
        setVisible(true);
        thread= new Thread(this);
        thread.start();
   
    }
    public void run(){
        try{
        Thread.sleep(5000);
        new Login();
        setVisible(false);
        }
        catch(Exception e){}
  
    }    
    public static void main (String args []){
      Splash frame=  new Splash();
      int x=1;
      for(int i=1; i <=500; x+=6, i+=5){
          frame.setLocation(700-(x+i)/2,400-(i/2));
      frame.setSize  (x + i, i);
      try{
          Thread.sleep(10);
      }
      catch(Exception e){
       }
      }
    
    }
    
}
 