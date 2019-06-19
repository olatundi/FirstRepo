import java.util.ArrayList;
import java.util.List;

public class Garage {

    public static void main(String[] args) {
        Garage gar1 = new Garage();
        gar1.addVehicle(new Car(1, "Ford", "Car", "Automatic"));
        gar1.addVehicle(new Plane(2, "Vueling", "Plane", 2));
        gar1.addVehicle(new Helicopter(3, "Airbus", "Plane", 3));
        gar1.calculateBill();
    }

    private List<Vehicle> vehicles = new ArrayList<>();

    public List<Vehicle> getVehicles() {
        return this.vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }


    public int calculateBill() {
        int total = 0;
        for (Vehicle vehicle : this.vehicles) {
            if (vehicle.getVehicleType().toLowerCase().equals("helicopter")) {
                total = total + 1000;
            } else if (vehicle.getVehicleType().toLowerCase().equals("car")) {
                total = total + 500;
            } else if (vehicle.getVehicleType().toLowerCase().equals("plane")) {
                total = total + 1500;
            }
        }
        return total;
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    public void removeVehicleByType(List<Vehicle> vehicles, String type) {

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleType().toLowerCase().equals(type)) {
                this.vehicles.remove(vehicle);
            }
        }
    }

    public void removeVehicleByID(List<Vehicle> vehicles, int iD) {

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId() == iD ) {
                this.vehicles.remove(vehicle);
            }
        }
    }

    public void emptyGarage(List<Vehicle> vehicles) {

        this.vehicles.clear();
    }
}

