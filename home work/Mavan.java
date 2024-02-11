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
public class Mavan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        PaymentContext paymentContext = new PaymentContext();

        // Process credit card payment
        paymentContext.setPaymentStrategy(new CreditCardPaymentStrategy());
        paymentContext.processPayment(50.0);

        // Process PayPal payment
        paymentContext.setPaymentStrategy(new PayPalPaymentStrategy());
        paymentContext.processPayment(100.0);

        // Process cash on delivery payment
        paymentContext.setPaymentStrategy(new CashOnDeliveryPaymentStrategy());
        paymentContext.processPayment(75.0);

        // Add more payment method processing as needed
    }

    }