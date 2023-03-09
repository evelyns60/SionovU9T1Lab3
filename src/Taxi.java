public class Taxi extends Car {
  private double fareCollected;

  public Taxi(String licensePlate, double tollFee, int passengers, boolean isElectric, double fareCollected) {
    super(licensePlate, tollFee, passengers, isElectric); // super refers to the Car constructor
    this.fareCollected = fareCollected;
  }

  public double getFareCollected() {
    return fareCollected;
  }

  public boolean chargeAndDropOffRiders(double farePerRider) {
    int riders = getPassengers() - 1;
    fareCollected += riders * farePerRider;
    return dropOffPassengers(riders);
  }

  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println("Fare Collected: " + fareCollected);
  }

  @Override
  public void addPassengers(int num) {
    int maxCapacity = 10;
    if (num + getPassengers() > maxCapacity) {
      System.out.println("Riders Denied. Max capacity reached.");
    } else {
      super.addPassengers(num);
    }
  }
}