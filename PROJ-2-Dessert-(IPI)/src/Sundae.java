public class Sundae extends IceCream{
    //instance variable
    private double TOPPING_COST;
    private String topping;

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
    //mutators

    /**
     * set the name of the sundae
     * @param name: the type of ice cream
     * @param topping: the topping on the ice cream
     */
    public void setName(String name, String topping){
        this.name = name + "(Sundae) with\n" + topping + "(Topping)";
    }

    /**
     * set the topping with given param
     * @param topping: topping on the ice cream
     */
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
