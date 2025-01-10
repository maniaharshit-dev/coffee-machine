package org.example.Items.SimpleItems;

import org.example.ItemTypes.SimpleItem;
import org.example.actions.IDispensible;
import org.example.actions.IHeatable;
import org.example.constants.TargetTemperatures;

public class Water extends SimpleItem implements IHeatable, IDispensible {

    int temperature = -1;

    @Override
    public void prepare() throws InterruptedException {
        System.out.println("Preparing Water...");

        heat(TargetTemperatures.WATER_TARGET_TEMPERATURE);

        System.out.println("Prepared Water.");
    }

    @Override
    public void dispense() throws InterruptedException {
        prepare();

        System.out.println("Releasing Water...");
        Thread.sleep(2000);
        System.out.println("Released Water.");

        pauseAfterDispense();

        cleanup();
    }

    @Override
    public void cleanup() throws InterruptedException {
        System.out.println("Cleaning up.");
        Thread.sleep(2000);
        System.out.println("Cleanup done.");
    }

    @Override
    public void pauseAfterDispense() throws InterruptedException {
        System.out.println("paused for a moment before dispensing the next item.");
        Thread.sleep(2000);
    }

    @Override
    //suggestion : water class must extend targetTemperature to use that
    public void heat(int targetTemperature) throws InterruptedException {
//      heat to target temperature
        temperature = targetTemperature;
        System.out.println("heating water...");
        Thread.sleep(2000);
        System.out.println("heated to temperature: " + temperature);
    }
}
