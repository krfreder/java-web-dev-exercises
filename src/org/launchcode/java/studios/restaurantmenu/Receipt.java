package org.launchcode.java.studios.restaurantmenu;

import org.launchcode.java.studios.restaurantmenu.MenuItems;

import java.util.ArrayList;

public class Receipt {
    private int orderNumber;
    private double total;
    ArrayList<MenuItems> orderItems;

    public Receipt(int aOrderNumber, ArrayList<MenuItems> aOrderItems) {
       this.orderNumber = aOrderNumber;

       for (MenuItems orderItem: aOrderItems) {
           total += orderItem.getCost();
       }
       this.orderItems = aOrderItems;
    }

    public void printReceipt(){

        System.out.println("Order # "+orderNumber);

        for (MenuItems orderItem: orderItems) {
            System.out.println(orderItem.getName() + " $"+ orderItem.getCost());
        }

        System.out.println("Grand total: $" + total);
    }

    public double getTotal(){
        return total;
    }
}
