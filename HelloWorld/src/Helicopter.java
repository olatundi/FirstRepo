public class Helicopter extends Vehicle {

    private  int noRotors;

    public Helicopter(int noRotors) {
        this.noRotors = noRotors;
    }

    public Helicopter(int id, String brandName, String vehicleType, int noRotors) {
        super(id, brandName, vehicleType);
        this.noRotors = noRotors;
    }

    public int getNoRotors() {
        return noRotors;
    }

    public void setNoRotors(int noRotors) {
        this.noRotors = noRotors;
    }
}
