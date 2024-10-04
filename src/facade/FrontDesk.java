package facade;

import subsystem.*;

public class FrontDesk {
  public void requestValetService(String plateNumber) {
    Valet valet = new Valet(plateNumber);
    valet.provideService();
  }

  public void requestHouseKeeping(String roomNumber) {
    HouseKeeping houseKeeping = new HouseKeeping(roomNumber);
    houseKeeping.provideService();
  }

  public void requestCartService(Integer numberOfCarts) {
    Cart cart = new Cart(numberOfCarts);
    cart.provideService();
  }
}
