package org.launchcode.java.studios.restaurantmenu;

public class MenuItems {
//    defaults to private, no need to actually type out
    private float cost;
    private String description;
    private Boolean isNew;
    private Category category;

    public MenuItems (float aCost, String aDescription, boolean aIsNew, Category aCategory) {
        this.cost = aCost;
        this.description = aDescription;
        this.isNew = aIsNew;
        this.category = aCategory;
    }
}
