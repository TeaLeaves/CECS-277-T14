/**
 * CECS 277
 * FALL 2020
 * MIDTERM 1 PART 2
 * Tina L Vu
 * 09/30/2020
 */
import java.util.ArrayList;

//create a tester
public class Tester {
    public static void main(String[] args){

        //create an arraylist of class ship
        ArrayList<Ship> Ships = new ArrayList<Ship>();

        //store CruiseShip
        Ships.add(new CruiseShip("Titanic", 1912, 3547));
        Ships.add(new CruiseShip("Britannic", 1915, 3127));

        //store CargoShip
        Ships.add(new CargoShip("SS Cargo", 2005, 30000));
        Ships.add(new CargoShip("Cheapest Cargo", 1901, 10000));

        //output unsorted array list
        System.out.println("Unsorted Ship List: ");
        for(int i = 0; i < Ships.size(); i++){
            System.out.println(Ships.get(i).toString());
        }

        //just to make it neat
        System.out.println("\n---------------------------------------------\n");

        //sort base on the year it was built
        System.out.println("Sorted Ship List: ");
        Ships.sort(Ship::compareTo);
        //output sorted array list
        for(int i = 0; i < Ships.size(); i++){
            System.out.println(Ships.get(i).toString());
        }
    }
}
