/*Design a Ship class that the following members:
•	A field for the name of the ship (a string).
•	A field for the year that the ship was built (an int).
•	A constructor and appropriate accessors and mutators.
•	A toString method that displays the ship’s name and the year it was built. */
public class Ship implements Comparable{
    private String name;
    private int year;

    //default constuctor
    public Ship() {
        name="noname";
        year=1000;
    }
    //constructor
    public Ship(String iname,int iyear) {
        setName(iname);
        setYear(iyear);
    }

    //accessors
    public String getName() {
        return name;
    }
    public int getYear() {
        return year;
    }

    //muators
    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "The name of the ship is "+getName()+". It was built in " + getYear()+".";
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public int compareTo(Ship ship){
        return year - ship.getYear();
    }
}