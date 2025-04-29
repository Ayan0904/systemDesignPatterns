package org.example.DecortorDesignPattern.PizzaShop.Toppings;

import org.example.DecortorDesignPattern.PizzaShop.Pizza.BasePizza;

public class Cheese extends ToppingDecorator{
    BasePizza bp;

    public Cheese(BasePizza bp){
        this.bp = bp;
    }

    @Override
    public int cost() {
        return bp.cost() + 20;
    }
}
