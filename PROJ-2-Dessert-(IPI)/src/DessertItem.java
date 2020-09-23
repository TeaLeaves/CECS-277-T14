/**item of desserts (parent class)
 */
public abstract class DessertItem implements Comparable{

    protected String name;

    /**
     * Null constructor for DessertItem class
     */
    public DessertItem() {
        this("");
    }
    /**
     * Initializes DessertItem data
     */
    public DessertItem(String name) {
        this.name = name;
    }

    /**
     * Returns name of DessertItem
     * @return name of DessertItem
     */
    public final String getName() {
        return name;
    }
    /**
     * Returns cost of DessertItem
     * @return cost of DessertItem
     */
    public abstract double getCost();

    /**
     * Return calories of DessertItem
     * @return calories of DessertItem
     */
    public abstract int getCalories();

    /**
     * compare calories of two dessert items
     * @param calories1: first dessert item's calories
     * @param calories2: second dessert item's calories
     * @return the dessert item with the higher calorie
     */
    public static DessertItem max(DessertItem calories1, DessertItem calories2){
        if(calories1.compareTo(calories2) > 0){
            return calories1;
        } else{
            return calories2;
        }
    }

    public abstract int compareTo(DessertItem calories2);
}