/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeshopapp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author William Stainton
 */
public class CoffeeOrder extends CoffeeShop {

    private ArrayList<String> order = new ArrayList<>();
    private int price = 0;
    private int tPrice = 0;

    public CoffeeOrder() {
    }

    public CoffeeOrder(String order, int price) {
        this.order.add(order);
        this.price = price;
        this.tPrice += price;
    }
    public void displayOrder() {
        System.out.println("Coffee Order:");
        for (String item : order) {
            System.out.println(item);
        }
        System.out.println("Total Cost: R" + tPrice);
        System.out.println("Your Balance Is: R" + checkAmount());
        Scanner sc = new Scanner(System.in);
        System.out.println("Press (1) To Go Back To Main Menu Or Press Any Key To Exit");
        String choice2 = sc.next();

        if (choice2.equals("1")) {
            menu();
        } else {
            System.exit(0);
        }
    }

}
