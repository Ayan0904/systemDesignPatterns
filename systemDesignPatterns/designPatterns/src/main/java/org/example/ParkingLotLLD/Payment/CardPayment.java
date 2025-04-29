package org.example.ParkingLotLLD.Payment;

public class CardPayment implements PaymentType{
    public void pay(double amount){
        System.out.println("PAID AMOUNT USING CREDIT "+amount);
    }
}
