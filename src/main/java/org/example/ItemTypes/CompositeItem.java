package org.example.ItemTypes;

import org.example.IngredientAttrbutes;

import java.util.Map;

public abstract class CompositeItem {
    String name;

    Map<SimpleItem, IngredientAttrbutes> ingredients;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<SimpleItem, IngredientAttrbutes> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Map<SimpleItem, IngredientAttrbutes> ingredients) {
        this.ingredients = ingredients;
    }
}
