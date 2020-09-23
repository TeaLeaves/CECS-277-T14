/**cookie dessert item
 */
public class Cookie extends DessertItem {
    //instance variables
    private int numCookies;
    private double PRICE_PER_DOZEN;
    private int calories;

    /**default argument constructor
     * given no param
     */
    Cookie(){
        numCookies = 0;
        PRICE_PER_DOZEN = 0;
    }

    /**overrride argument constructor
     * @param name: the type of the cookie
     * @param numCookies: number of cookies
     * @param PRICE_PER_DOZEN: price of cookies per dozen in cents
     */
    Cookie(String name, int numCookies, double PRICE_PER_DOZEN, int calories){
        super(name);
        setName(name);
        setnumCookies(numCookies);
        setPRICE_PER_DOZEN(PRICE_PER_DOZEN);
        setCalories(calories);
    }

    //methods

    //accessors
    /**get the number of cookies
     * @return: integers of number of cookies
     */
    public int getnumCookies() {
        return numCookies;
    }

    /**get the price of cookies per dozen
     * @return: integer value of price by cents
     */
    public double getPRICE_PER_DOZEN() {
        return PRICE_PER_DOZEN;
    }

    /**
     * get the string format of getCost()
     * @return cost of dessert item
     */
    public String getStringCost(){
        return String.format("%.2f", getCost());
    }

    /**set the name of the cookie!
     * @param name: type of cookie
     */
    public void setName(String name){
        this.name = name + "(Cookie)";
    }

    //muators
    /**set number of cookies using given param
     * @param numCookies: number of cookies
     */
    public void setnumCookies(int numCookies) {
        this.numCookies = numCookies;
    }

    /**set price of cookies per dozen with given param
     * @param PRICE_PER_DOZEN: price of cookies
     */
    public void setPRICE_PER_DOZEN(double PRICE_PER_DOZEN) {
        this.PRICE_PER_DOZEN = PRICE_PER_DOZEN;
    }

    /**
     * set the amount of Calories the cookie
     * @param calories: calories of the cookie
     */
    public void setCalories(int calories){
        this.calories = calories;
    }

    @Override
    public double getCost() {
        return Math.round(numCookies*PRICE_PER_DOZEN*100.00)/100.00;
    }

    @Override
    public int getCalories() {
        return calories;
    }
}
