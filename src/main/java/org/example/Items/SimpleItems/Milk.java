package org.example.Items.SimpleItems;

import org.example.ItemTypes.SimpleItem;
import org.example.actions.IDispensible;
import org.example.actions.IHeatable;
import org.example.constants.TargetTemperatures;

public class Milk extends SimpleItem implements IDispensible, IHeatable {

    int temperature = -1;

    @Override
    public void prepare() throws InterruptedException {
        System.out.println("Preparing Milk...");

        heat(TargetTemperatures.MILK_TARGET_TEMPERATURE);

        System.out.println("Prepared Milk.");
    }

    @Override
    public void dispense() throws InterruptedException {
        prepare();

        System.out.println("Releasing Milk...");
        Thread.sleep(2000);
        System.out.println("Released milk");

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

    @Override
    public void heat(int targetTemperature) throws InterruptedException {
//      heat to target temperature
        temperature = targetTemperature;
        System.out.println("heating milk...");
        Thread.sleep(2000);
        System.out.println("heated to temperature: " + temperature);
    }
}
