/*
Name: Charlie Owen
Class: CS 232-002
Project: The Hungry Knight
    Take in and output a name for the user, and get inputs for how many of each
    item is wanted and calculate and output the sub-total, tax, and total.
Due: August 29th, 2021
 */
package thehungryknight;
import java.util.Scanner;

public class TheHungryKnight {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //Declerations for all variables used
        String name;
        String characteristic;
        String knight;
        int pheasant;
        int stew;
        int bread;
        int fruit;
        double subtotal;
        double tax;
        double total;
      
        //Welcome message
        System.out.println("Welcome to the Red Baron’s Inn and Tavern, Sir.  We are honored to serve the King’s men during these trying days as our\n"
                + "Kingdom readies itself for War.  Your warhorses shall be looked after at our stable and your rooms prepared for you once you\n"
                + "have broken your fast with us for the night.  Please free to encourage your men to eat and drink as much as desired, Sir Knight.\n"
                + "The Crown will pay for your meal and lodging for you and your horses, Sir.  We merely need to keep our accounting accurate for\n"
                + "the Baron’s tax collector.\n");
        
        //Asks and takes in a name and characteristic for the user's name
        System.out.print("May I ask for your name for the records, Sir Knight?  ");
        name = input.next();
        
        System.out.print("And what you are known for?  ");
        characteristic = input.next();
        
        knight = "Sir " + name + " the " + characteristic; //Sets user or "knight's" name
        
        System.out.println(knight);
        
        //Asks and takes in number of each dish
        System.out.print("How many plates of Roast Pheasant will your party require us to prepare, " + knight + "?  ");
        pheasant = input.nextInt();
        System.out.print("How many bowls of Beef Stew will your party require us to prepare, " + knight + "?  ");
        stew = input.nextInt();
        System.out.print("How many loafs of fine bread will your party require us to prepare, " + knight + "?  ");
        bread = input.nextInt();
        System.out.print("How many pieces of fresh fruit will your party require us to prepare, " + knight + "?  ");
        fruit = input.nextInt();
        
        /*
        Roast Pheasant = 15.15
        Beef Stew = 3.79
        Fine Bread = 5.37
        Fresh Fruit = 1.29
        */
        //Calculates and rounds up the subtotal, total, and sales tax
        subtotal = (pheasant * 15.15) + (stew * 3.79) + (bread * 5.37) + (fruit * 1.29);
        tax = subtotal * 0.05;
        total = subtotal + tax;
        subtotal = Math.ceil(subtotal);
        tax = Math.ceil(tax);
        total = Math.ceil(total);
        
        //Outputs the subtotal, sales tax, and total
        System.out.println("The Sub-Total is:  " + subtotal);
        System.out.println("The Baron's 5% tax on your order is:  " + tax);
        System.out.println("The final total for the meal tonight is:  " + total);
        
    }
}