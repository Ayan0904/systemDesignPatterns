package org.example.DecortorDesignPattern.CoffeeMachine.Toppings;

import org.example.DecortorDesignPattern.CoffeeMachine.Coffee.BaseCoffee;

public class Cream extends CoffeeToppingDecorator{
    BaseCoffee bc;

    public Cream(BaseCoffee bc){
        this.bc = bc;
    }

    @Override
    public int cost() {
        return this.bc.cost() + 20;
    }
}
