/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Israa Hassanin
 */
public class screen extends JDialog {
     String amount;
      JLabel label=new JLabel("Enter amount");
      JButton Button=new JButton("okay");
    JButton Button0=new JButton("0");
    JButton Button1=new JButton("1");
    JButton Button2=new JButton("2");
    JButton Button3=new JButton("3");
    JButton Button4=new JButton("4");
    JButton Button5=new JButton("5");
    JButton Button6=new JButton("6");
    JButton Button7=new JButton("7");
    JButton Button8=new JButton("8");
    JButton Button9=new JButton("9");
   JTextField jTextField1 = new JTextField(30);
    public screen() {
                setLayout(null);
         add(label);
        label.setBounds(30, 50, 80, 30);
        add(jTextField1);
          jTextField1.setBounds(120,50,170,30);
          add(Button0);
          Button0.setBounds(120, 100, 50, 50);
          add(Button1);
          Button1.setBounds(180,100, 50, 50);
          add(Button2);
          Button2.setBounds(240, 100, 50, 50);
          add(Button3);
          Button3.setBounds(120, 160, 50, 50);
          add(Button4);
          Button4.setBounds(180, 160, 50, 50);
          add(Button5);
          Button5.setBounds(240, 160, 50, 50);
          add(Button6);
          Button6.setBounds(120, 220, 50, 50);
          add(Button7);
          Button7.setBounds(180, 220, 50, 50);
          add(Button8);
          Button8.setBounds(240, 220, 50, 50);
          add(Button9);
          Button9.setBounds(120, 280, 50, 50);
          add(Button);
          Button.setBounds(320, 120, 120, 120);
          
          
          
          
           Button0.addActionListener(new ActionListener() {

            @Override
                //To change body of generated methods, choose Tools | Templates.
          public void actionPerformed(ActionEvent e) {
              
              jTextField1.setText( jTextField1.getText()+"0");  
              }
        });
          
          
           Button1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               jTextField1.setText( jTextField1.getText()+"1");   //To change body of generated methods, choose Tools | Templates.
            }
        });
          
           Button2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
              jTextField1.setText( jTextField1.getText()+"2");   //To change body of generated methods, choose Tools | Templates.
            }
        });
          
          
          
       
           Button3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               jTextField1.setText( jTextField1.getText()+"3");   //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        
        
        
        
           Button4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               jTextField1.setText( jTextField1.getText()+"4");   //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        
        
           Button5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
              jTextField1.setText( jTextField1.getText()+"5");   //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        
           
           Button6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField1.setText( jTextField1.getText()+"6");   //To change body of generated methods, choose Tools | Templates.
            }
        });
        
           
           Button7.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               jTextField1.setText( jTextField1.getText()+"7");   //To change body of generated methods, choose Tools | Templates.
            }
        });
           
           
           Button8.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
              jTextField1.setText( jTextField1.getText()+"8");   //To change body of generated methods, choose Tools | Templates.
            }
        });
           
           Button9.addActionListener( new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField1.setText( jTextField1.getText()+"9");   //To change body of generated methods, choose Tools | Templates.
            }
        });
           
           Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            amount =jTextField1.getText();
            
                    
            setVisible(false);
       
              //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
 
        
}
