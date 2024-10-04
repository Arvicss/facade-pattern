package subsystem;

public class Cart implements HotelService {
  private Integer numberOfCarts;

  public Cart(Integer roomNumber) {
    this.numberOfCarts = roomNumber;
  }

  public Cart() {
  }

  public Integer getNumberOfCarts() {
    return numberOfCarts;
  }

  public void setNumberOfCarts(Integer numberOfCarts) {
    this.numberOfCarts = numberOfCarts;
  }

  private void requestCart(Integer numberOfCarts) {
    System.out.println("Handling luggage's with " + numberOfCarts + " carts.");
  }

  @Override
  public void provideService() {
    if(numberOfCarts != null) {
      this.requestCart(numberOfCarts);
    }
  }

}