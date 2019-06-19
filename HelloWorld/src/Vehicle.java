public abstract class Vehicle {
    private int id;
    private String brandName;
    private  String vehicleType;

    public Vehicle() {
    }

    public Vehicle(int id, String brandName, String vehicleType) {
        this.id = id;
        this.brandName = brandName;
        this.vehicleType = vehicleType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
}
