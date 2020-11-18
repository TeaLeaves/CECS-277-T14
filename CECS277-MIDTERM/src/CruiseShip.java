public class CruiseShip extends Ship{
    private int passenger;

    //default constructor
    public CruiseShip(){
        super();
        passenger = 0;
    }

    //argument constructor
    public CruiseShip(String iname,int iyear, int passenger){
        super(iname,iyear);
        setPassenger(passenger);
    }

    //accessor
    public int getPassenger() {
        return passenger;
    }

    //mutator
    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    @Override
    public String toString() {
        return super.toString() + " Number of passengers is " + getPassenger() + ".";
    }
}
