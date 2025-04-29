package org.example.DecortorDesignPattern.PizzaShop.Toppings;

import org.example.DecortorDesignPattern.PizzaShop.Pizza.BasePizza;

public class Mushroom extends ToppingDecorator{
    BasePizza bp;

    public Mushroom(BasePizza bp){
        this.bp = bp;
    }

    @Override
    public int cost() {
        return bp.cost() + 10;
    }
}
