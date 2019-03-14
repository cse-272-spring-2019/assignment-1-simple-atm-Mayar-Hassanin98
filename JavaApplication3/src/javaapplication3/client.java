package javaapplication3;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Israa Hassanin
 */
public class client {
    
public String name;
 public int creditcard;
 public double balance ;

    public client(String name, int creditcard, double balance) {
        this.name = name;
        this.creditcard = creditcard;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreditcard() {
        return creditcard;
    }

    public void setCreditcard(int creditcard) {
        this.creditcard = creditcard;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

            
   

    
    
    
   
    
    
    
}
