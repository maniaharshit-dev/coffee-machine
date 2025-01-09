package org.example.Items.CompositeItems;

import org.example.ItemTypes.CompositeItem;
import org.example.actions.IDispensible;
import org.example.actions.IHeatable;

public class Tea extends CompositeItem implements IDispensible, IHeatable {
    @Override
    public void prepare() {

    }

    @Override
    public void dispense() {

    }

    @Override
    public void cleanup() {

    }

    @Override
    public void pauseAfterDispense() {

    }

    @Override
    public void heat(int targetTemperature) {

    }
}
