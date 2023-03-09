public class VehicleTests {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("BB8123", 7.0, 3);
        vehicle.addPassengers(9);

        Truck truck = new Truck("CJP5667", 3.50, 6, 4, true);
        truck.addPassengers(5);

        Taxi taxi1 = new Taxi("TX1412", 13.75, 4, true, 2.0);
        taxi1.addPassengers(4);

        Taxi taxi2 = new Taxi("TX1412", 13.75, 4, true, 2.0);
        taxi2.addPassengers(7);
    }
}
