import java.util.ArrayList;

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
        Candy gummy = new Candy("Gummy", 3.1, 4.25, 325);
        System.out.println("Test Constructor & setMethods: " + gummy);
        System.out.println("Test name getMethod: " + gummy.getName());
        System.out.println("Test Weight getMethod: " + gummy.getWeight());
        System.out.println("Test PRICE_PER_POUND getMethod: " + gummy.getPRICE_PER_POUND());
        System.out.println("Test Calories getMethod: " + gummy.getCalories());
        System.out.println("Test getCost: " + gummy.getCost());
        System.out.println("Test String version of getCost: $" + gummy.getStringCost());

        System.out.println("\n");
        Candy taffy = new Candy("Taffy", 1.6, 1.05, 44);
        System.out.println("Test Constructor & setMethods: " + taffy);
        System.out.println("Test name getMethod: " + taffy.getName());
        System.out.println("Test Weight getMethod: " + taffy.getWeight());
        System.out.println("Test PRICE_PER_POUND getMethod: " + taffy.getPRICE_PER_POUND());
        System.out.println("Test Calories getMethod: " + taffy.getCalories());
        System.out.println("Test getCost: " + taffy.getCost());
        System.out.println("Test String version of getCost: $" + taffy.getStringCost());

        //seperator
        System.out.println("\n---------------------------------------------\n");

        //COOKIE TESTER
        System.out.println("Test Cookie: ");
        Cookie snickerdoodle = new Cookie("Snickerdoodle", 3, 4, 90);
        System.out.println("Test Constructor & setMethods: " + snickerdoodle);
        System.out.println("Test name getMethod: " + snickerdoodle.getName());
        System.out.println("Test numCookies getMethod: " + snickerdoodle.getnumCookies());
        System.out.println("Test PRICE_PER_DOZEN getMethod: " + snickerdoodle.getPRICE_PER_DOZEN());
        System.out.println("Test Calories getMethod: " + snickerdoodle.getCalories());
        System.out.println("Test getCost: " + snickerdoodle.getCost());
        System.out.println("Test String version of getCost: $" + snickerdoodle.getStringCost());

        System.out.println("\n");
        Cookie sugar = new Cookie("Sugar", 3, 4, 90);
        System.out.println("Test Constructor & setMethods: " + sugar);
        System.out.println("Test name getMethod: " + sugar.getName());
        System.out.println("Test numCookies getMethod: " + sugar.getnumCookies());
        System.out.println("Test PRICE_PER_DOZEN getMethod: " + sugar.getPRICE_PER_DOZEN());
        System.out.println("Test Calories getMethod: " + sugar.getCalories());
        System.out.println("Test getCost: " + sugar.getCost());
        System.out.println("Test String version of getCost: $" + sugar.getStringCost());

        //seperator
        System.out.println("\n---------------------------------------------\n");

        //ICE CREAM TESTER
        System.out.println("Test Ice Cream: ");
        IceCream earl_grey = new IceCream("Earl Grey", 2.50, 230);
        System.out.println("Test Constructor & setMethods: " + earl_grey);
        System.out.println("Test name getMethod: " + earl_grey.getName());
        System.out.println("Test Calories getMethod: " + earl_grey.getCalories());
        System.out.println("Test getCost: " + earl_grey.getCost());
        System.out.println("Test String version of getCost: $" + earl_grey.getStringCost());

        System.out.println("\n");
        IceCream vanilla = new IceCream("Vanilla", 2.50, 178);
        System.out.println("Test Constructor & setMethods: " + vanilla);
        System.out.println("Test name getMethod: " + vanilla.getName());
        System.out.println("Test Calories getMethod: " + vanilla.getCalories());
        System.out.println("Test getCost: " + vanilla.getCost());
        System.out.println("Test String version of getCost: $" + vanilla.getStringCost());

        //seperator
        System.out.println("\n---------------------------------------------\n");

        //Sundae TESTER
        System.out.println("Test Sundae: ");
        Sundae orange = new Sundae("Orange", "Wafer", 1.25, 955);
        System.out.println("Test Constructor & setMethods: " + orange);
        System.out.println("Test name getMethod: " + orange.getName());
        System.out.println("Test Calories getMethod: " + orange.getCalories());
        System.out.println("Test getCost: " + orange.getCost());
        System.out.println("Test String version of getCost: $" + orange.getStringCost());

        System.out.println("\n");
        Sundae strawberry = new Sundae("Strawberry", "Strawberry Bits", 1.75, 320);
        System.out.println("Test Constructor & setMethods: " + strawberry);
        System.out.println("Test name getMethod: " + strawberry.getName());
        System.out.println("Test Calories getMethod: " + strawberry.getCalories());
        System.out.println("Test getCost: " + strawberry.getCost());
        System.out.println("Test String version of getCost: $" + strawberry.getStringCost());

        //seperator to keep it neat
        System.out.println("\n---------------------------------------------\n");

        //DESSERT ITEM TESTER
        System.out.println("Test Max of Different Dessert Types: ");
        System.out.println(gummy.getName() + " " + gummy.getCalories() + " cal. v.s. " + snickerdoodle.getName() + " " + snickerdoodle.getCalories() + " cal.: " + DessertItem.max(gummy,snickerdoodle).getName());
        System.out.println(taffy.getName() + " " + taffy.getCalories() + " cal. v.s. " + vanilla.getName() + " " + vanilla.getCalories() + " cal.: " + DessertItem.max(taffy,vanilla).getName());
        //seperator to keep it neat
        System.out.println("\n---------------------------------------------\n");
        System.out.println("Test Max of Same Dessert Types: ");
        System.out.println(strawberry.getName() + " " + strawberry.getCalories() + " cal. v.s. " + orange.getName() + " " + orange.getCalories() + "cal.: " + DessertItem.max(strawberry,orange).getName());
        System.out.println(earl_grey.getName() + " " + earl_grey.getCalories() + " cal. v.s. " + vanilla.getName() + " " + vanilla.getCalories() + " cal.: " + DessertItem.max(earl_grey,vanilla).getName());
        System.out.println("\n---------------------------------------------\n");
        System.out.println("Unsorted Dessert List: ");
        ArrayList<DessertItem> list = new ArrayList<>();
        list.add(gummy);
        list.add(taffy);
        list.add(snickerdoodle);
        list.add(sugar);
        list.add(earl_grey);
        list.add(vanilla);
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).getName() + " " + list.get(i).getCalories() + " calories");
        }
        System.out.println("\n---------------------------------------------\n");
        System.out.println("Sorted Dessert List: ");
        list.sort(DessertItem::compareTo);
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).getName() + " " + list.get(i).getCalories() + " calories");
        }
    }
}
