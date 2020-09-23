public class Sundae extends IceCream{
    //instance variable
    double TOPPING_COST;
    String topping;

    /** default argument constructor
     *  given no param
     */
    Sundae(){
        TOPPING_COST = 0.00;
    }

    /** override argument constructor
     * @param TOPPING_COST
     */
    Sundae(String name, String topping, double TOPPING_COST, int calories){
        super(name, TOPPING_COST, calories);
        setName(name, topping);
        setTopping(topping);
        setTOPPING_COST(TOPPING_COST);
        setCalories(calories);
    }

    //methods

    /** accessor
     * get the cost of the topping for the ice cream
     * @return: the topping cost
     */
    public double getTOPPING_COST() {
        return TOPPING_COST;
    }

    //mutators
    public void setName(String name, String topping){
        this.name = name + "(Sundae) with\n" + topping + "(Topping)";
    }

    public void setTopping(String topping){
        this.topping = topping;
    }

    /** set the cost of the topping of the ice cream
     * @param TOPPING_COST: cost of the topping
     */
    public void setTOPPING_COST(double TOPPING_COST) {
        this.TOPPING_COST = TOPPING_COST;
    }

    @Override
    public double getCost() {
        return Math.round((super.getCost()+TOPPING_COST)*100)/100;
    }
}
