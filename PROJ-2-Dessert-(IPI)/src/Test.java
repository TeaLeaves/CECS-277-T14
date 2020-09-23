/**tester to make sure the code all works!
 */
public class Test {
    public static void main(String[] args){
        //start a new checkout
        Checkout buy = new Checkout();
        //set the tax to 15%
        buy.setTax(15);

        //add in the desserts you are buying
        buy.addItem(new Candy("Gummy Bear", 3.1, 4.25, 325));
        buy.addItem(new Cookie("Snickerdoodle", 3, 4, 90));
        buy.addItem(new IceCream("Earl Grey", 2.50, 230));
        buy.addItem(new Sundae("Orange", "Wafer", 1.25, 955));


        //print out the receipt
        System.out.println(buy.toString());

        
    }
}
