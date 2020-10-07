import java.util.ArrayList;

public class VendingMachine {
    //private data members
    private double purchase;
    private double payment;
    private double salary;
    private ArrayList<Product> items = new ArrayList<>();

    /**
     * Constructs a cash register with no money in it.
     */
    public VendingMachine() {
        purchase = 0;
        payment = 0;
        salary = 0;
    }

    /**
     * Records the purchase price of an item.
     * @param itemNum product that is being purchased
     */
    public void recordPurchase(int itemNum) {
        //get the product item
        Product item = items.get(itemNum);
        //if you don't have enough money to buy it
        if(item.getPrice() > payment){
            System.out.println("Insufficient Money\n");
            System.out.println("Received Change: $" + giveChange() + "\n");
        //if the product ran out
        } else if(item.getAmount() == 0){
            System.out.println("SOLD OUT");
            System.out.println("Received Change: $" + giveChange() + "\n");
        }
        //else buy it
        else {
            purchase = purchase + item.getPrice();
            item.getProduct();
            System.out.println("YOU GOT " + item.getItemName());
            System.out.println("Received Change: $" + giveChange() + "\n");
            salary = salary + item.getPrice();
        }
    }

    /**
     * Processes the payment received from the customer.
     * @param coinCount amount of $$$
     * @param coinType type of money used EX: quarter, dollar, dimes, etc.
     */
    public void receivePayment(double coinCount, Coin coinType){
        payment = payment + (coinCount*coinType.getAmount());
        System.out.println("Current Amount: $" + String.format("%.2f", payment));
    }

    /**
     * Computes the change due and resets the machine for the next customer.
     * @return the change due to the customer
     */
    public String giveChange(){
        //calculate the change
        double change = payment - purchase;

        //refresh purchase and payment
        purchase = 0;
        payment = 0;

        //return the change
        return String.format("%.2f",Math.round(change*100.00)/100.00);
    }

    public double getSalary(){
        return salary;
    }

    /**
     * add a product into the vending machine
     * @param cost: the cost of the product item
     * @param name: the name of the product item
     * return 0 to exit method
     */
    public int addProduct(double cost, String name, int amount){
        //if vending machine is empty, just add in the product
        if(items.size() == 0){
            items.add(new Product(cost, name, amount));
        }
        //if it is not empty
        else {
            //loop through the products in the vending machine
            for (int i = 0; i < items.size(); i++) {
                //if product is already in the vending machine, increase the amount
                if (items.get(i).getItemName() == name) {
                    items.get(i).addProduct(amount);
                    return 0;
                }
                //if this product is not yet in the Vending Machine,add it in
                else if (items.get(items.size() - 1).getItemName() != name) {
                    items.add(new Product(cost, name, amount));
                    return 0;
                }
            }
        }
        return 0;
    }

    /**
     * how many products are in the vending machine
     * @return number of products as an integer
     */
    public int amountOFProducts(){
        return items.size();
    }

    /**
     * return a string of all of the products
     * @return the products as a string
     */
    public String showProducts(){
        String lineOfProducts = "";
        for(int i = 0; i < items.size(); i++){
            lineOfProducts = lineOfProducts + i + ") " + items.get(i).showProduct() + "\n";
        }
        return lineOfProducts;
    }
}
