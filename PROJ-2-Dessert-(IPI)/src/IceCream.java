/**ice cream dessert item
 */
public class IceCream extends DessertItem {
    //instance variable
    private double ICECREAM_COST;
    private int calories;

    /** default argument constructor
     *  given no param
     */
    IceCream(){
        ICECREAM_COST = 0.00;
        calories = 0;
    }

    /**override argument constructor
     * @param cost: cost of ice cream
     */
    IceCream(String name, double cost, int calories){
        super(name);
        setName(name);
        setICECREAM_COST(cost);
        setCalories(calories);
    }

    //methods

    //mutator
    /**
     * set the name of the ice cream
     * @param name: the type of ice cream
     */
    public void setName(String name){
        this.name = name + "(Ice Cream)";
    }

    /**
     * set the amount of Calories the ice cream has
     * @param calories: calories of the ice cream
     */
    public void setCalories(int calories){
        this.calories = calories;
    }

    /**
     * set the cost of the ice cream with the given param
     * @param ICECREAM_COST: given price of the ice cream
     */
    public void setICECREAM_COST(double ICECREAM_COST) {
        this.ICECREAM_COST = ICECREAM_COST;
    }

    /** accessor
     * get the string format of getCost()
     * @return cost of dessert item
     */
    public String getStringCost(){
        return String.format("%.2f", getCost());
    }

    @Override
    public double getCost() {
        return Math.round(ICECREAM_COST*100.00)/100.00;
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
