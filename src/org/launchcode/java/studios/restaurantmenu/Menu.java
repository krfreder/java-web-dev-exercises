package org.launchcode.java.studios.restaurantmenu;

import org.launchcode.java.studios.restaurantmenu.MenuItems;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private String name;
    private Date lastModified;
    private ArrayList<MenuItems> menuItems;

    public Menu(String name, Date lastModified, ArrayList<MenuItems> menuItems){
        this.name = name;
        this.lastModified = lastModified;
        this.menuItems = menuItems;
    }

    public void print(){
        System.out.println(name);
        System.out.println("Last Modified: "+ lastModified.toString());
        for (MenuItems menuItem: menuItems ) {
            System.out.println(menuItem.getName() + ": " + menuItem.getDescription()+ " $"+menuItem.getCost());
        }
    }

}
