

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(101,"Deluxe");
        Room room2 = new Room(102,"Deluxe");
        Room room3 = new Room(103,"Deluxe");
        Room room4 = new Room(104,"Deluxe");
        
        BookingService service = new BookingService();
        service.addRoom(room1);
        service.addRoom(room2);
        service.addRoom(room3);
        service.addRoom(room4);

        service.showAllRooms();

        Customer customer1 = new Customer("Yesh");
        Customer customer2 = new Customer("Nish");
        Customer customer3 = new Customer("Aguero");

        try {
            service.bookRoom(101,customer1);
            service.bookRoom(102,customer2);
            service.bookRoom(101,customer3);
        }
        catch(RoomNotFoundException e){
            e.printStackTrace();
        }
        finally{
            service.showAllRooms();
        }
        
    }
}
