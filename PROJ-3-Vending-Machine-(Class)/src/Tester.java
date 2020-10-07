import java.util.*;
import java.util.Scanner;
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
            Scanner in = new Scanner(System.in);
            input = in.nextInt();

            //make sure input is valid
            while(input < 1 || input > 6){
                System.out.println("Invalid Input");
                input = in.nextInt();
            }

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
                int userType = in.nextInt();

                //make sure the input is valid
                while(userType < 1 || userType > 4){
                    System.out.println("Incorrect Input");
                    userType = in.nextInt();
                }

                //enter amount
                System.out.println("Enter Money Amount: ");
                double userAmount = in.nextDouble();

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
            }
            //buy product
            else if(input == 3){
                System.out.println("Enter Item Number: ");
                //get item that user wish to purchase
                int purchaseNum = in.nextInt();

                //make sure the number is valid
                while(purchaseNum < 0 || purchaseNum > (register.amountOFProducts()-1)){
                    System.out.println("INVALID INPUT. ");
                    purchaseNum = in.nextInt();
                }

                //buy the product
                register.recordPurchase(purchaseNum);
            }
            //add product
            else if(input == 4){
                //ask for the name of the product
                System.out.println("Product Name: ");
                String productType = in.next();

                //ask for the cost of the product
                System.out.println("Product Cost: ");
                double productCost = in.nextDouble();

                //ask for the amount of the product
                System.out.println("Product Amount: ");
                int productAmount = in.nextInt();

                //add in the product into the vending machine
                register.addProduct(productCost, productType, productAmount);
            }
            //removes money from machine
            else if(input == 5){
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
