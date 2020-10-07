/**
 *  CECS 277 Project 3
 *  @authors: Matthew Chen, Ryan Ignasiak, Tina Vu
 *  Due Date: 10/07/20
 *  Professor Mimi Opkins
 *  Summary: a tester so that the user can use the vending machine
 */
import java.util.*;
public class Tester {
    public static void main(String[] args) {

        //input currency being used = I'm using US currency
        final Coin DOLLAR = new Coin(1.0, "Dollar");
        final Coin QUARTER = new Coin(0.25, "Quarter");
        final Coin DIME = new Coin(0.10, "Dime");
        final Coin NICKLE = new Coin(0.05, "Nickle");
        final Coin PENNY = new Coin(0.01, "Penny");

        //create the vendingMachine
        VendingMachine register = new VendingMachine();

        //lets add some products into the vending machine
        //so it doesn't look lonely
        register.addProduct(1.50,"Water", 3);
        register.addProduct(1.05, "Coke", 3);
        register.addProduct(1.00, "Lays", 3);
        register.addProduct(0.50, "Pencil", 5);
        register.addProduct(0.25,"Tootsie", 5);
        register.addProduct(.65, "Cookie", 2);
        register.addProduct(1.25, "Noodles", 1);

        //temp
        int input = 1;

        //create a loop
        while(input != 6){
            //output menu
            System.out.println("1) Show Products");
            System.out.println("2) Insert Coin");
            System.out.println("3) Buy Product");
            System.out.println("4) Add Product");
            System.out.println("5) Remove Money");
            System.out.println("6) Quit");

            //get users menu choice
            System.out.println("Enter Your Choice: ");
            input = CheckInput.getIntRange(1,6);

            //run through users choice
            //1 = show products
            if(input == 1){
                System.out.println("----------------------------------------------");
                System.out.println("|     ----------------------------------     |");
                System.out.println("|    |    OLD SCHOOL VENDING MACHINE    |    |");
                System.out.println("|     ----------------------------------     |");
                System.out.println("|--------------------------------------------|");
                System.out.println("|                                            |");
                System.out.println("|     ----------------------------------     |");

                //printing out products in a vending machine
                Scanner scan = new Scanner(register.showProducts());
                while(scan.hasNext()) {
                    System.out.print("|    | ");
                    System.out.printf("%-25s %s\n", scan.nextLine()," |    |");
                }
                System.out.println("|     ----------------------------------     |");
                System.out.println("|                                            |");
                System.out.println("|              ----------------              |");
                System.out.println("|             |                |             |");
                System.out.println("|              ----------------              |");
                System.out.println("|                                            |");
                System.out.println("----------------------------------------------");
            }
            //insert coin
            else if(input == 2){
                //enter type of money
                System.out.println("\nEnter Type of Money From List: ");
                System.out.println("1) Nickel  @ $0.05");
                System.out.println("2) Dime    @ $0.10");
                System.out.println("3) Quarter @ $0.25");
                System.out.println("4) Dollar  @ $1.00");
                int userType = CheckInput.getIntRange(1,4);

                //enter amount
                System.out.println("Enter Money Amount: ");
                double userAmount = CheckInput.getDouble();

                //add it into the vending machine
                if(userType == 1) {
                    register.receivePayment(userAmount, NICKLE);
                }
                else if(userType == 2){
                    register.receivePayment(userAmount, DIME);
                }
                else if(userType == 3){
                    register.receivePayment(userAmount, QUARTER);
                }
                else {
                    register.receivePayment(userAmount, DOLLAR);
                }

                //show the current amount of money in the vending machine
                System.out.println("Current Amount: $" + register.getCurrentAmount());
            }
            //buy product
            else if(input == 3){
                System.out.println("Enter Item Number: ");
                //get item that user wish to purchase
                int purchaseNum = CheckInput.getIntRange(0,register.amountOFProducts()-1);

                //buy the product and output a message
                System.out.print(register.recordPurchase(purchaseNum));

            }
            //add product
            else if(input == 4){
                //ask for the name of the product
                System.out.println("Product Name: ");
                String productType = CheckInput.getString();

                //ask for the cost of the product
                System.out.println("Product Cost: ");
                double productCost = CheckInput.getDouble();

                //ask for the amount of the product
                System.out.println("Product Amount: ");
                int productAmount = CheckInput.getPositiveInt();

                //add in the product into the vending machine
                register.addProduct(productCost, productType, productAmount);
            }
            //removes money from machine
            else if(input == 5){
                System.out.println("Canceled Order");
                System.out.println("Money Returned: $" + register.giveChange() + "\n");
            }
            //exit
            else {
                System.out.println("Machine Salary: $" + register.getSalary() + "\n");
                System.out.println("Good'Buy'. Please Come Again! ;D");
            }

        }//end loop
    }//end main
}//end tester class
