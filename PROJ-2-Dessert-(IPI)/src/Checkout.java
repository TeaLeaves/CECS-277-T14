import java.util.ArrayList;
//System.out.printf("\nTotal Salary: $%.2f",total);
//

//methods to enter dessert items
public class Checkout{
    //instance variable
    ArrayList cashRegister;
    double cost;
    int taxRate;

    /**
     * default argument constructor
     * creates an empty list of Dessert Items
     */
    Checkout() {
        ArrayList<DessertItem> cashRegister = new ArrayList<DessertItem>();
        cost = 0.00;
    }

    //methods
    //add into cash register
    public void addItem(DessertItem item){
        cashRegister.add(item);
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
                DessertItem item = (DessertItem)cashRegister.get(i);
                cost += item.getCost();
            }
        }
        return cost;
    }

    //total tax for items rounded to nearest cent
    public double totalTax(){
        return Math.round(totalCost()*getTax()*100/100);
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
        return taxRate/100;
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
                receipt = receipt + ((Candy) cashRegister.get(i)).getName() + "  " + ((Candy) cashRegister.get(i)).getCalories() + "\n";
                receipt = receipt + ((Candy) cashRegister.get(i)).getCost() + "\n";
            }
            //if cookie
            else if(cashRegister.get(i) instanceof  Cookie){
                receipt = receipt + ((Cookie) cashRegister.get(i)).getnumCookies() + " @ ";
                receipt = receipt + ((Cookie) cashRegister.get(i)).getPRICE_PER_DOZEN() + " /dz.\n";
                receipt = receipt + ((Cookie) cashRegister.get(i)).getName() + "  " + ((Cookie) cashRegister.get(i)).getCalories() + "\n";
                receipt = receipt + ((Cookie) cashRegister.get(i)).getCost() + "\n";
            }
            //if ice cream
            else if(cashRegister.get(i) instanceof IceCream){
                receipt = receipt + ((IceCream) cashRegister.get(i)).name + "  " + ((IceCream) cashRegister.get(i)).getCalories() + "\n";
                receipt = receipt + ((IceCream) cashRegister.get(i)).getCost() + "\n";
            }
            //if sundae
            else if(cashRegister.get(i) instanceof Sundae){
                receipt = receipt + ((Sundae) cashRegister.get(i)).getName() + "\n";
                receipt = receipt + ((Sundae) cashRegister.get(i)).getCalories() + "\n";
                receipt = receipt + ((Sundae) cashRegister.get(i)).getCost() + "\n";
            }
            else{
                receipt = "empty";
            }
        }

        //space for neatness + number of items
        receipt = receipt + "\nNumber of Items: " + numOfItems() + "\n";
        //total cost
        receipt = receipt + "Total Cost: " + totalCost() + "\n";
        //total tax
        receipt = receipt + "Total Tax: " + totalTax() + "\n";
        //final total
        receipt = receipt + "Final Total: " + (totalCost() + totalTax()) + "\n";
        //end of receipt
        receipt = receipt + "---------------------------------------------\n";

        return receipt;
    }
}