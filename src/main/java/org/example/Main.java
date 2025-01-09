package org.example;

import org.example.Items.CompositeItems.Cappuccino;
import org.example.Items.SimpleItems.Milk;
import org.example.Items.SimpleItems.Water;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Milk milk = new Milk();
        milk.dispense();
        System.out.println("-----------------\n");

        Water water = new Water();
        water.dispense();
        System.out.println("-----------------\n");

        Cappuccino cappuccino = new Cappuccino();
        cappuccino.dispense();


    }
}