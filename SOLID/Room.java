class Room {
    private int roomNumber;
    private boolean available;
    private String typeOfRoom;

    public Room(int roomNumber,String typeOfRoom){
        this.available = true;
        this.roomNumber = roomNumber;
        this.typeOfRoom = typeOfRoom;
    }
    public boolean isAvailable(){
        return available;
    }
    public boolean setRoomAvailability(boolean available){
        this.available = available;
        return this.available;
    }
    public int getRoomNumber(){
        return roomNumber;
    }
    public String getTypeOfRoom(){
        return typeOfRoom;
    }
}