package subsystem;

public class Valet implements HotelService {
  private String plateNumber;

  public Valet(String plateNumber) {
    this.plateNumber = plateNumber;
  }

  public Valet() {
  }

  public String getPlateNumber() {
    return plateNumber;
  }

  public void setPlateNumber(String plateNumber) {
    this.plateNumber = plateNumber;
  }

  private void pickUpVehicle(String plateNumber) {
    System.out.println("Getting vehicle: " + plateNumber);
  }

  @Override
  public void provideService() {
    if(plateNumber != null) {
      this.pickUpVehicle(plateNumber);
    }
  }

}