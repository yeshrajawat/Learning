import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookingService {
    private Map<Integer,Room> rooms = new HashMap<Integer,Room>();
    private Map<String,Integer> roomPrices = new HashMap<String,Integer>();
    private List<Customer> customers = new ArrayList<Customer>();

    public void addRoom(Room room) {
        rooms.put(room.getRoomNumber(), room);
    }

    public void showAllRooms() {
        for (Map.Entry<Integer,Room> room:rooms.entrySet()) {
            if (room.getValue().isAvailable()) {
                System.out.println("Room Number: " + room.getKey() + " is available and the room is of "
                        + room.getValue().getTypeOfRoom());
            }
            else {
                System.out.println("Room Number: " + room.getKey() + " is not available");
            }
        }
    }
    public void bookRoom(int roomNumber, Customer customer) throws RoomNotFoundException{
        
        if(rooms.containsKey(roomNumber) && rooms.get(roomNumber).isAvailable()) {
            rooms.get(roomNumber).setRoomAvailability(false);
            customer.setCustomerId(customers.size()+1);
            this.customers.add(customer);

            customer.setRoomNumber(roomNumber);
        }else {
            throw new RoomNotFoundException("Room Not Found");
        }

    }

    
}
