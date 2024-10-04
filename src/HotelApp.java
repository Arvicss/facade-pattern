import facade.FrontDesk;

import java.util.Scanner;

public class HotelApp {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    FrontDesk frontDesk = new FrontDesk();

    do {
      System.out.println("Select Hotel Service:");
      System.out.println("[1] Request Valet Service");
      System.out.println("[2] Request Housekeeping Service");
      System.out.println("[3] Request Cart Service");
      System.out.println("[4] Exit");
      System.out.print("Choose an option: ");
      int choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice) {
        case 1:
          System.out.print("\nEnter the plate number: ");
          String plateNumber = scanner.nextLine();
          frontDesk.requestValetService(plateNumber);
          break;
        case 2:
          System.out.print("\nEnter the room number: ");
          String roomNumber = scanner.nextLine();
          frontDesk.requestHouseKeeping(roomNumber);
          break;
        case 3:
          System.out.print("\nEnter the number of carts: ");
          int numberOfCarts = scanner.nextInt();
          frontDesk.requestCartService(numberOfCarts);
          break;
        case 4:
          System.out.println("\nExiting...");
          System.exit(0);
          return;
        default:
          System.out.println("Invalid choice. Please try again.");
          break;
      }
      System.out.println();
    } while (true);
  }
}