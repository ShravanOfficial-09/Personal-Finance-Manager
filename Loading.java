
package expenso;

import javax.swing.*;
import java.awt.*;
public class Loading extends JFrame implements Runnable{
    Thread t;
    JProgressBar bar;
    String username;
    public void run (){
    try{
        for(int i = 1; i<=101;i++){
            int max = bar .getMaximum();
            int value = bar.getValue();
            
            if(value < max){
            bar.setValue(bar.getValue()+1);
            }else{
            setVisible (false);
            new AddCustomer(username).setVisible(true);
            }
            Thread.sleep(40);
        }
    }catch(Exception e){
    e.printStackTrace();}
    
    
    
    }
    Loading(String username){
        this.username=username;
        t = new Thread(this);
        setTitle("Budget Manager");
    setBounds(500,200,650,400);
    getContentPane().setBackground(Color.WHITE);
    setLayout(null);

    JLabel text = new JLabel("ExPenso");
    text.setBounds(50,20,600,40);
    text.setForeground(Color.BLUE);
    text.setFont(new Font("Raleway",Font.BOLD,45));
    add(text);
    
     bar = new JProgressBar();
    bar.setBounds(150,100,300,35);
    bar.setStringPainted(true);
    add(bar);
    
    JLabel Loading = new JLabel("Loading, Please Wait....");
    Loading.setBounds(200,140,400,40);
    Loading.setForeground(Color.RED);
    Loading.setFont(new Font("Raleway",Font.BOLD,16));
    add(Loading);
    
    JLabel lb1username = new JLabel("Welcome  "+  username);
    lb1username.setBounds(20,310,400,40);
    lb1username.setForeground(Color.RED);
    lb1username.setFont(new Font("Raleway",Font.BOLD,18));
    add(lb1username);
    
    
    t.start();
    
    setVisible(true);
    setVisible(true);
   
    }
    
    
public static void main (String args[]){
new Loading("");
        }    
}
