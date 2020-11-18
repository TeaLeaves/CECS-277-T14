public class CargoShip extends Ship {
    private int cargoCapacity;

    //default constructor
    public CargoShip(){
        super();
        cargoCapacity = 0;
    }

    //argument constructor
    public CargoShip(String iname,int iyear, int cargoCapacity){
        super(iname, iyear);
        setCargoCapacity(cargoCapacity);
    }

    //accessor
    public int getCargoCapacity() {
        return cargoCapacity;
    }

    //mutator
    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + " The cargo capacity is " + getCargoCapacity() + ".";
    }
}
