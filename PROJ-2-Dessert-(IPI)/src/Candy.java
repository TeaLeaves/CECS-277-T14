/**candy dessert item
 */
public class Candy extends DessertItem{
    //instance variables
    private double weight; //weight of candy item by lbs.
    private double PRICE_PER_POUND; //round to nearest cent
    private int calories;

    /**default argument constructor
     * given no param
     */
    Candy(){
        weight = 0.00;
        PRICE_PER_POUND = 0.00;
        calories = 0;
    }

    /**overrride argument constructor
     * @param name: the name of the candy item
     * @param weight: weight of candy item in lbs.
     * @param PRICE_PER_POUND: price of candy item per lbs. in cents
     */
    Candy(String name, double weight, double PRICE_PER_POUND, int calories){
        super(name);
        setName(name);
        setWeight(weight);
        setPRICE_PER_POUND(PRICE_PER_POUND);
        setCalories(calories);
    }

    //methods

    //accessors
    /**get the weight of the candy
     * @return: weight of candy item by lbs
     */
    public double getWeight() {
        return weight;
    }

    /**get the price of candy item per lb
     * @return: integer value of price by cents
     */
    public double getPRICE_PER_POUND() {
        return PRICE_PER_POUND;
    }

    /**
     * get the string format of getCost()
     * @return cost of dessert item
     */
    public String getStringCost(){
        return String.format("%.2f", getCost());
    }

    //muators

    /**set the name of the candy item
     * @param name: candy item name
     */
    public void setName(String name){
        this.name = name + "(Candy)";
    }

    /**set weight using given param
     * @param weight: weight of candy item in lb
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**set price of candy item per lb with given param
     * @param PRICE_PER_POUND: price of candy item
     */
    public void setPRICE_PER_POUND(double PRICE_PER_POUND) {
        this.PRICE_PER_POUND = PRICE_PER_POUND;
    }

    /**
     * set the amount of Calories the candy has
     * @param calories: calories of the candy item
     */
    public void setCalories(int calories){
        this.calories = calories;
    }

    @Override
    public double getCost() {
        return Math.round(weight*PRICE_PER_POUND*100.00)/100.00;
    }

    @Override
    public int getCalories() {
        return calories;
    }

    @Override
    public int compareTo(DessertItem calories2) {
        if(this.getCalories() > calories2.getCalories()){
            return 5;
        } else if(this.getCalories() < calories2.getCalories()){
            return -5;
        }
        return 0;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
