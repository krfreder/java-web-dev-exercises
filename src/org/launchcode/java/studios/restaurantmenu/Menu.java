package org.launchcode.java.studios.restaurantmenu;

import org.launchcode.java.studios.restaurantmenu.MenuItems;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

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

    public Date getLastModified() { return lastModified; }

    public void addMenuItem (MenuItems menuItem) {
        menuItems.add(menuItem);
    }

//    public void deleteMenuItem (int index) {
//        menuItems.remove(index);
//    }
    public void deleteMenuItem () {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the name of the menu item you would like to remove.");
        String userInput = input.next();

        for (MenuItems item: menuItems ) {
            if (item.getName().equals(userInput)) {
                menuItems.remove(item);
            } else {
                System.out.println("There is no Menu Item by that name, please try again.");
            }
        }

        input.close();

    }

}
