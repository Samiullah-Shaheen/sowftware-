/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mavan;

/**
 *
 * @author M_ullah_M.L
 */
public class CashOnDeliveryPaymentStrategy implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing cash on delivery payment of $" + amount);
        // Implement cash on delivery payment processing logic here
    }
}

