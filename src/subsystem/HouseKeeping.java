package subsystem;

public class HouseKeeping implements HotelService {
  private String roomNumber;

  public HouseKeeping(String roomNumber) {
    this.roomNumber = roomNumber;
  }

  public HouseKeeping() {
  }

  public String getRoomNumber() {
    return roomNumber;
  }

  public void setRoomNumber(String roomNumber) {
    this.roomNumber = roomNumber;
  }

  private void cleanRoom(String roomNumber) {
    System.out.println("Cleaning Room: " + roomNumber);
  }

  @Override
  public void provideService() {
    if(roomNumber != null) {
      this.cleanRoom(roomNumber);
    }
  }

}