package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BookingManager {

    public static void main(String[] args) {
        String fileName = "bookings.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length != 5) {
                    System.out.println("Некорректная запись: " + line);
                    continue;
                }
                String customerName = data[0].trim();
                int hotelNumber = Integer.parseInt(data[1].trim());
                String roomType = data[2].trim();
                String checkInDate = data[3].trim();
                String checkOutDate = data[4].trim();

                Booking booking = new Booking(customerName, hotelNumber, roomType, checkInDate, checkOutDate);
                System.out.println(booking);
            }
        } catch (IOException e) {
            System.err.println("Ошибка при работе с файлом: " + e.getMessage());
        }
    }
}
