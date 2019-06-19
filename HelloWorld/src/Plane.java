public class Plane extends Vehicle {
    public Plane(int noWings) {
        this.noWings = noWings;
    }

    public Plane(int id, String brandName, String vehicleType, int noWings) {
        super(id, brandName, vehicleType);
        this.noWings = noWings;
    }

    private int noWings;

    public int getNoWings() {
        return noWings;
    }

    public void setNoWings(int noWings) {
        this.noWings = noWings;
    }
}
