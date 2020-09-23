/**testers to make sure the code all works!
 */
public class Test {
    public static void main(String[] args){
        //CHECKOUT TESTER
        System.out.println("CheckOut Tester\n");
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

        //seperator
        System.out.println("\n---------------------------------------------\n");

        //CANDY TESTER
        System.out.println("Test Candy: ");
        Candy gummy = new Candy("Gummy Bear", 3.1, 4.25, 325);
        System.out.println("Test Constructor & setMethods: " + gummy);
        System.out.println("Test name getMethod: " + gummy.getName());
        System.out.println("Test Weight getMethod: " + gummy.getWeight());
        System.out.println("Test PRICE_PER_POUND getMethod: " + gummy.getPRICE_PER_POUND());
        System.out.println("Test Calories getMethod: " + gummy.getCalories());
        System.out.println("Test getCost: " + gummy.getCost());
        System.out.println("Test String version of getCost: $" + gummy.getStringCost());

        //seperator
        System.out.println("\n---------------------------------------------\n");

        //COOKIE TESTER
        System.out.println("Test Candy: ");
        Cookie snickerdoodle = new Cookie("Snickerdoodle", 3, 4, 90);
        System.out.println("Test Constructor & setMethods: " + snickerdoodle);
        System.out.println("Test name getMethod: " + snickerdoodle.getName());
        System.out.println("Test numCookies getMethod: " + snickerdoodle.getnumCookies());
        System.out.println("Test PRICE_PER_DOZEN getMethod: " + snickerdoodle.getPRICE_PER_DOZEN());
        System.out.println("Test Calories getMethod: " + snickerdoodle.getCalories());
        System.out.println("Test getCost: " + snickerdoodle.getCost());
        System.out.println("Test String version of getCost: $" + snickerdoodle.getStringCost());

        //seperator
        System.out.println("\n---------------------------------------------\n");

        //ICE CREAM TESTER
        System.out.println("Test Candy: ");
        IceCream earl_grey = new IceCream("Earl Grey", 2.50, 230);
        System.out.println("Test Constructor & setMethods: " + earl_grey);
        System.out.println("Test name getMethod: " + earl_grey.getName());
        System.out.println("Test Calories getMethod: " + earl_grey.getCalories());
        System.out.println("Test getCost: " + earl_grey.getCost());
        System.out.println("Test String version of getCost: $" + earl_grey.getStringCost());

        //seperator
        System.out.println("\n---------------------------------------------\n");

        //Sundae TESTER
        System.out.println("Test Candy: ");
        Sundae orange = new Sundae("Orange", "Wafer", 1.25, 955);
        System.out.println("Test Constructor & setMethods: " + orange);
        System.out.println("Test name getMethod: " + orange.getName());
        System.out.println("Test Calories getMethod: " + orange.getCalories());
        System.out.println("Test getCost: " + orange.getCost());
        System.out.println("Test String version of getCost: $" + orange.getStringCost());

        //seperator to keep it neat
        System.out.println("\n---------------------------------------------\n");
    }
}
