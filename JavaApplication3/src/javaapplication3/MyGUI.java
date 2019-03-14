package javaapplication3;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyGUI extends JFrame {

    client c1 = new client("Mayar", 5426, 0);
    MyATM m;
    JLabel jLabel1 = new JLabel();
    JButton deposit = new JButton("Deposit");
    JButton withdraw = new JButton("withdraw");
    JButton balanceinquiry = new JButton("balance inquiry");
    JButton previous = new JButton("previous");
    JButton next = new JButton("next");
    JTextField JTextField = new JTextField(50);

    /**
     * Creates new form MyGUI
     */
    public MyGUI(client c) {
       
        this.m = new MyATM(c);
        add(jLabel1);
        jLabel1.setBounds(180, 50, 100, 30);
        setLayout(null);
        add(deposit);
        deposit.setBounds(50, 50, 100, 40);
        deposit.setForeground(Color.red);
        add(withdraw);
        withdraw.setBounds(50, 100, 100, 40);
        withdraw.setForeground(Color.red);
        add(balanceinquiry);
        balanceinquiry.setBounds(50, 150, 100, 40);
        balanceinquiry.setForeground(Color.red);
        add(previous);
        previous.setBounds(180, 150, 100, 40);
        previous.setForeground(Color.red);
        add(next);
        next.setBounds(180, 100, 100, 40);
        next.setForeground(Color.red);
        

        deposit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                screen x = new screen();
                x.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
                x.setSize(600, 400);
                x.setVisible(true);
                String y = x.amount;
                m.deposit(y);
                JOptionPane.showMessageDialog(null, "Your Money has been successfully depsited");

            }
        });

        withdraw.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                screen x = new screen();
                x.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
                x.setSize(600, 400);
                x.setVisible(true);
                String y = x.amount;
                   if (c.getBalance() < Double.parseDouble(x.amount)) {
           
 JOptionPane.showMessageDialog(null, " insufficient balance");
        } else {
                m.withdraw(y); 
                 JOptionPane.showMessageDialog(null, "collect your money");
                
            }}
        });

        balanceinquiry.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel1.setText(m.getCurrentBalance());   
            }
        });

        previous.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel1.setText(m.prev());      
            }
        });

        next.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel1.setText(m.next());         
            }
        });

    }

}
