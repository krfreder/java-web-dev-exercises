package org.launchcode.java.studios.restaurantmenu;

public class Receipt {
    private int orderNumber;
    private double total;
    ArrayList<MenuItems> orderItems;

    public Receipt(int aOrderNumber, ArrayList<MenuItems> aOrderItems) {
       orderNumber = aOrderNumber;

       for (MenuItems orderItem: aOrderItems) {
           total += orderItem.cost;
       }

       orderItems = aOrderItems;
    }
}
