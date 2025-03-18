// Abstract class: Transport
abstract class Transport {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Transport(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: ₹" + ratePerKm);
    }
}

// Interface: GPS
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

// Subclass: Car
class Car extends Transport implements GPS {
    private String currentLocation;

    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown"; // Default location
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

// Subclass: Bike
class Bike extends Transport implements GPS {
    private String currentLocation;

    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown"; // Default location
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

// Subclass: Auto
class Auto extends Transport implements GPS {
    private String currentLocation;

    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown"; // Default location
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

// Main class: RideHailingApplication
public class RideHailingSystem {
    // Method to dynamically calculate fare for any transport type
    public static void displayRideDetails(Transport transport, double distance) {
        System.out.println("\n=== Ride Details ===");
        transport.getVehicleDetails();
        System.out.println("Distance: " + distance + " km");
        System.out.println("Total Fare: ₹" + transport.calculateFare(distance));
    }

    public static void main(String[] args) {
        Transport car = new Car("CAR789", "Arjun Mehta", 18.0);
        Transport bike = new Bike("BIKE321", "Neeraj Singh", 10.0);
        Transport auto = new Auto("AUTO654", "Vikram Patel", 12.0);

        // Simulating rides
        displayRideDetails(car, 12);  // Car ride for 12 km
        displayRideDetails(bike, 6);  // Bike ride for 6 km
        displayRideDetails(auto, 8);  // Auto ride for 8 km
    }
}
