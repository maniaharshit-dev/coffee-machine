package org.example.Items.CompositeItems;

import org.example.ItemTypes.CompositeItem;
import org.example.Items.SimpleItems.Milk;
import org.example.Items.SimpleItems.Water;
import org.example.actions.IDispensible;

public class Cappuccino extends CompositeItem implements IDispensible {

    Milk milk;
    Water water;
    Espresso espresso;

    public Cappuccino(){
        milk = new Milk();
        water = new Water();
        espresso = new Espresso();
    }

//  to make cappuccino:
//  1. Add espresso
//  2. add hot water
//  3. add hot milk
    @Override
    public void prepare() throws InterruptedException {
        espresso.dispense();
        water.dispense();
        milk.dispense();


    }

    @Override
    public void dispense() throws InterruptedException {
        prepare();

        System.out.println("Releasing Cappuccino...");
        Thread.sleep(2000);
        System.out.println("Released Cappuccino");

        pauseAfterDispense();

        cleanup();
    }

    @Override
    public void cleanup() throws InterruptedException {
        System.out.println("Cleaning up");
        Thread.sleep(2000);
        System.out.println("Cleanup done");
    }

    @Override
    public void pauseAfterDispense() throws InterruptedException {
        System.out.println("paused for a moment before dispensing the next item");
        Thread.sleep(2000);
    }
}
