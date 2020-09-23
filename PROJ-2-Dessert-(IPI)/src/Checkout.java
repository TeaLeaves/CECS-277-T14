import java.util.ArrayList;
/** proceed to pay for the dessert items being bought
 * methods to enter dessert items into checkout to pay
 */
public class Checkout{
    //instance variable
    private ArrayList<DessertItem> cashRegister = new ArrayList<DessertItem>();
    private double cost;
    private int taxRate;

    /**
     * default argument constructor
     * creates an empty list of Dessert Items
     */
    Checkout() {
        ArrayList<DessertItem> cashRegister = new ArrayList<DessertItem>();
        cost = 0.00;
        taxRate = 0;
    }

    //methods
    //add into cash register
    public void addItem(DessertItem dessert){
        cashRegister.add(dessert);
    }

    //clear cash register
    public void clear(){
        ArrayList<DessertItem> cashRegister = new ArrayList<>();
    }

    //total number of items
    public int numOfItems(){
        return cashRegister.size();
    }

    //total cost of items before tax
    public double totalCost(){
        for(int i = 0; i < cashRegister.size(); i++){
            if(cashRegister.get(i) instanceof DessertItem) {
                DessertItem item = cashRegister.get(i);
                cost += item.getCost();
            }
        }
        return cost;
    }

    //total tax for items rounded to nearest cent
    public double totalTax(){
        return cost*getTax();
    }

    //string format of Total Cost
    public String getTotalCost(){
        return String.format("%.2f", totalCost());
    }

    //String format of Total Tax
    public String getTotalTax(){
        return String.format("%.2f", totalTax());
    }

    //String format of Final Cost
    public String getFinalCost(){
        double finalCost = cost + totalTax();
        return String.format("%.2f", finalCost);
    }

    /**
     * set the tax rate for purchase
     */
    public void setTax(int tax){
        this.taxRate = tax;
    }

    /**
     * get the tax cost of the purchase
     * @return tax for this purchase
     */
    public double getTax(){
        return taxRate/100.0f;
    }

    //toString = receipt
    @Override
    public String toString() {
        //a very very long string
        String receipt = "";

        //start of a receipt
        receipt = receipt + "---------------------------------------------\n";

        //content of a receipt
        for(int i = 0; i < cashRegister.size(); i++){
            //if candy
            if(cashRegister.get(i) instanceof Candy) {
                receipt = receipt + ((Candy) cashRegister.get(i)).getWeight() + " lbs. @ ";
                receipt = receipt + ((Candy) cashRegister.get(i)).getPRICE_PER_POUND() + " /lb.\n";
                receipt = receipt + ((Candy) cashRegister.get(i)).getName() + "  Calories " + ((Candy) cashRegister.get(i)).getCalories() + "\n";
                receipt = receipt + "$" + ((Candy) cashRegister.get(i)).getStringCost() + "\n";
            }
            //if cookie
            else if(cashRegister.get(i) instanceof  Cookie){
                receipt = receipt + ((Cookie) cashRegister.get(i)).getnumCookies() + " @ ";
                receipt = receipt + ((Cookie) cashRegister.get(i)).getPRICE_PER_DOZEN() + " /dz.\n";
                receipt = receipt + ((Cookie) cashRegister.get(i)).getName() + "  Calories " + ((Cookie) cashRegister.get(i)).getCalories() + "\n";
                receipt = receipt + "$" + ((Cookie) cashRegister.get(i)).getStringCost() + "\n";
            }
            //if ice cream
            else if(cashRegister.get(i) instanceof IceCream){
                receipt = receipt + ((IceCream) cashRegister.get(i)).name + "  Calories " + ((IceCream) cashRegister.get(i)).getCalories() + "\n";
                receipt = receipt + "$" + ((IceCream) cashRegister.get(i)).getStringCost() + "\n";
            }
            //if sundae
            else if(cashRegister.get(i) instanceof Sundae){
                receipt = receipt + ((Sundae) cashRegister.get(i)).getName() + "\n";
                receipt = receipt + "Calories " + ((Sundae) cashRegister.get(i)).getCalories() + "\n";
                receipt = receipt + "$" + ((Sundae) cashRegister.get(i)).getStringCost() + "\n";
            }
            else{
                receipt = "empty";
            }
            receipt = receipt + "\n";
        }

        //space for neatness + number of items
        receipt = receipt + "\nNumber of Items: " + numOfItems() + "\n";
        //total cost
        receipt = receipt + "Total Cost: $" + getTotalCost() + "\n";
        //total tax
        receipt = receipt + "Total Tax: $" + getTotalTax() + "\n";
        //final total
        receipt = receipt + "Final Total: $" + getFinalCost() + "\n";
        //end of receipt
        receipt = receipt + "---------------------------------------------\n";

        return receipt;
    }
}
