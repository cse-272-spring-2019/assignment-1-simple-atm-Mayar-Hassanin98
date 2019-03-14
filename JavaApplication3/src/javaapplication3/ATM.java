/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Israa Hassanin
 */
public interface ATM {
  
            
    
    
    
    //Returnsthe current balance in string format
public String getCurrentBalance();
//withdraws from current balance and update
public void withdraw(String amount);
//adds to the current balance and update
public void deposit(String amount);
//returns the prevtransaction
public String prev();
//returns the next transaction
public String next();
}

