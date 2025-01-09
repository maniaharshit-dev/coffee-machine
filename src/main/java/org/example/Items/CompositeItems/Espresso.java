package org.example.Items.CompositeItems;

import org.example.IngredientAttrbutes;
import org.example.ItemTypes.CompositeItem;
import org.example.ItemTypes.SimpleItem;
import org.example.Items.SimpleItems.Water;
import org.example.actions.IDispensible;
import org.example.actions.IHeatable;
import org.example.constants.TargetTemperatures;

import java.util.HashMap;
import java.util.Map;

public class Espresso extends CompositeItem implements IDispensible, IHeatable {

    Water water;

    public Espresso() {
        water = new Water();
    }

    public void setEspressoIngredients(){
        Map<SimpleItem, IngredientAttrbutes> ingredientAttrbutesMap = new HashMap<>();
        IngredientAttrbutes waterAttribute = new IngredientAttrbutes(25, TargetTemperatures.WATER_TARGET_TEMPERATURE);
        ingredientAttrbutesMap.put(water, waterAttribute);
    }

    @Override
    public void prepare() throws InterruptedException {
        heat(TargetTemperatures.WATER_TARGET_TEMPERATURE);

//        perform espresso step...

    }

    @Override
    public void dispense() throws InterruptedException {

    }

    @Override
    public void cleanup() throws InterruptedException {
        System.out.println("Cleaning up.");
        Thread.sleep(2000);
        System.out.println("Cleanup done.");
    }

    @Override
    public void pauseAfterDispense() throws InterruptedException {
        System.out.println("paused for a moment before dispensing the next item");
        Thread.sleep(2000);
    }

    @Override
    public void heat(int targetTemperature) throws InterruptedException {
//      heat to target temperature
//        temperature = targetTemperature;
        System.out.println("heating water...");
        Thread.sleep(2000);
//        System.out.println("heated to temperature: " + temperature);
    }
}
