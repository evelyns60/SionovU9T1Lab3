public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;

    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
        super(licensePlate, tollFee, passengers);
        this.axles = axles;
        this.hasTrailer = hasTrailer;
    }


    public boolean validateLicensePlate() {
        if (!hasTrailer) {
            return true;
        } else if (axles > 4) {
            if (getLicensePlate().substring(getLicensePlate().length() - 2).equals("MX")) {
                return true;
            } else {
                return false;
            }
        } else {
            if (getLicensePlate().substring(getLicensePlate().length() - 2).equals("LX")) {
                return true;
            } else {
                return false;
            }
        }
    }
    public void printTruck() {
        System.out.println("License Plate: " + getLicensePlate());
        System.out.println("Toll Fee: " + getTollFee());
        System.out.println("Passengers: " + getPassengers());
        System.out.println("Axles: " + axles);
        System.out.println("Has Trailer? " + hasTrailer);
    }
}