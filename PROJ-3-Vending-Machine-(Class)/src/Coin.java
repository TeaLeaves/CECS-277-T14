/**
 *A coin with a monetary value.
 */
public class Coin {
    //private data members
    private double amount;
    private String type;

    /**
     * Constructs a coin.
     * @param aValue the monetary value of the coin
     * @param aName the name of the coin
     */
    public Coin(double aValue, String aName){
        amount = aValue;
        type = aName;
    }

    /**
     * Gets the coin value.
     * @return the value
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Gets the coin name.
     * @return the name
     */
    public String getType() {
        return type;
    }
}
