/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pratham
 */
public class PaymentCard {

    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance=openingBalance;
        // write code here
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
        // write code here
    }

    public void eatAffordably() {
        if (balance >= 2.60) {
            balance = balance - 2.60;
        }

        // write code here
    }

    public void eatHeartily() {
        if (balance >= 4.60) {
            balance = balance - 4.60;
        }
        // write code here
    }

    public void addMoney(double amount) {
        if (amount >= 0) {
            if (balance + amount <= 150) {
                balance += amount;
            } else if (balance + amount > 150) {
                balance = 150;
            }

        } 

        // write code here
    }

}
