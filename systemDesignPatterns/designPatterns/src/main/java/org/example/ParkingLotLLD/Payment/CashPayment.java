package org.example.ParkingLotLLD.Payment;

public class CashPayment implements PaymentType{
    public void pay(double amount){
        System.out.println("PAID amount "+amount);
    }
}
