package org.launchcode.java.studios.restaurantmenu;


import org.launchcode.java.studios.restaurantmenu.Category;
import org.launchcode.java.studios.restaurantmenu.FoodItem;

import java.util.ArrayList;

public class MenuItems {
//    defaults to private, no need to actually type out
    private String name;
    private float cost;
    private String description;
    private Boolean isNew;
    private Category category;
    private ArrayList<FoodItem> ingredients;

    public MenuItems (String aName, String aDescription, float aCost, Category aCategory) {
        this.name = aName;
        this.description = aDescription;
        this.cost = aCost;
        this.isNew = true;
        this.category = aCategory;
    }

    public String getDescription() {
        return description;
    }

    public float getCost() {
        return cost;
    }

    public String getName() { return name; }

//    public String getIsNewString() { return isNew.toString(); }

    public Boolean getIsNew() { return isNew; }

    public Category getCategory() { return category; }

    @Override
    public String toString() {
        return getName() + ": " + getDescription() + " $" + getCost();
    }
}
