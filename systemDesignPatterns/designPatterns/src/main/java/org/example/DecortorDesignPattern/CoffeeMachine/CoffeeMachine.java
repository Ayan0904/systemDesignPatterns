package org.example.DecortorDesignPattern.CoffeeMachine;

import org.example.DecortorDesignPattern.CoffeeMachine.Coffee.BaseCoffee;
import org.example.DecortorDesignPattern.CoffeeMachine.Coffee.Mocha;
import org.example.DecortorDesignPattern.CoffeeMachine.Toppings.Cream;
import org.example.DecortorDesignPattern.CoffeeMachine.Toppings.Milk;

public class CoffeeMachine {
    public static void main(String[] args) {
        BaseCoffee bc = new Milk(new Cream(new Mocha()));
        System.out.println(bc.cost());
    }
}
