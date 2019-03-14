/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.ArrayList;

/**
 *
 * @author Israa Hassanin
 */
public class MyATM implements ATM {

    ArrayList History = new ArrayList<>();

    client c;
    int y;

    public MyATM(client c) {
        this.c = c;
    }

    @Override
    public String getCurrentBalance() {
        double x = c.getBalance();
       
        return x + "";
       
    }

    @Override
    public void withdraw(String amount) {

     
            double x = c.getBalance();
            c.setBalance((x - Double.parseDouble(amount)));
          
        History.add("withdraw= " + amount);
      
        y = History.size() - 1;
       
    }

    @Override
    public void deposit(String amount) {

        double x = c.getBalance();
        c.setBalance((x + Double.parseDouble(amount)));

        History.add("deposit= " + amount);
        y = History.size() - 1;
    }

    @Override
    public String prev() {
         if (y > -1) {
            String z = (String) History.get(y);
            y--;
            return z;
        }
        return "no more transcations";
    }
    
    @Override
    public String next() {
       if (y < History.size() - 1) {
            y++;
            String z = (String) History.get(y);
         return z;
        } else {
            return "no more transcations";
        } }
    }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.


