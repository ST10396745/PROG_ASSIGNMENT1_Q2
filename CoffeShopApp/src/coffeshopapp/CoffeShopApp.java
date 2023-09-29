/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coffeshopapp;

import java.util.Scanner;

/**
 *
 * @author William Stainton
 */
public class CoffeShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CoffeeShop c = new CoffeeShop();
        Scanner sc = new Scanner(System.in);
        System.out.println("--- COFFEE SHOP ---");
        System.out.println("(1)\t Login\n"
                + "(2)\t Sign Up");
        
        String choice = sc.next();
        
        if (choice.equals("1")) {
            c.login();
        }else if (choice.equals("2")) {
            c.signup();
        }
        
    }
    
}
