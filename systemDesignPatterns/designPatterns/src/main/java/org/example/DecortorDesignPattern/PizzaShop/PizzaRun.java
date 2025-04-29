package org.example.DecortorDesignPattern.PizzaShop;

import org.example.DecortorDesignPattern.PizzaShop.Pizza.BasePizza;
import org.example.DecortorDesignPattern.PizzaShop.Pizza.FarmHouse;
import org.example.DecortorDesignPattern.PizzaShop.Pizza.Margherita;
import org.example.DecortorDesignPattern.PizzaShop.Toppings.Cheese;
import org.example.DecortorDesignPattern.PizzaShop.Toppings.Mushroom;

public class PizzaRun {
    public static void main(String[] args) {
        BasePizza bp = new Mushroom(new Margherita());
        System.out.println(bp.cost());

        BasePizza bp1 = new Cheese(new Mushroom(new Cheese(new FarmHouse())));
        System.out.println(bp1.cost());
    }
}
