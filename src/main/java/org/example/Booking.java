package org.example;

public class Booking {
    String customerName;
    int hotelNumber;
    String roomType;
    String checkInDate;
    String checkOutDate;

    public Booking(String customerName, int hotelNumber, String roomType, String checkInDate, String checkOutDate) {
        this.customerName = customerName;
        this.hotelNumber = hotelNumber;
        this.roomType = roomType;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    @Override
    public String toString() {
        return "Клиент [" + customerName + "], Отель №[" + hotelNumber + "], Тип номера: [" + roomType + "], Заезд: [" + checkInDate + "], Выезд: [" + checkOutDate + "]";
    }
}
