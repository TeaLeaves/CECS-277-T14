public class Test {
    public static void main(String[] args){
        //start a new checkout
        Checkout buy = new Checkout();

        //add in the desserts you are buying
        buy.addItem(new Candy("Gummy Bear", 3.1, 4.25, 325));
        buy.addItem(new Cookie("Snickerdoodle", 3, 4, 90));
        buy.addItem(new IceCream("Earl Grey", 2.50, 230));
        buy.addItem(new Sundae("Orange", "Wafer", 1.25, 955));

        //set the tax
        buy.setTax(15);

        //print out the receipt
        buy.toString();
    }
}
