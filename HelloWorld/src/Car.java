public class Car extends Vehicle {
    public String gearType;

    public Car(String gearType) {
        this.gearType = gearType;
    }

    public Car(int id, String brandName, String vehicleType, String gearType) {
        super(id, brandName, vehicleType);
        this.gearType = gearType;
    }

    public String getGearType() {
        return gearType;
    }

    public void setGearType(String gearType) {
        this.gearType = gearType;
    }
}
