public class Customer {
    int customerId;
    String customerName;
    int roomNumber;
    boolean checkedInStatus;

    public Customer(String customerName) {
        this.customerName = customerName;
        this.checkedInStatus = false;
    }

    public double getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean checkedInStatus() {
        return checkedInStatus;
    }

    public void checkIn() {
        this.checkedInStatus = true;
    }
    public void checkOut() {
        this.checkedInStatus = false;
    }
}
