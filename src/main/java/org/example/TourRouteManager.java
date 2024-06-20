package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TourRouteManager {

    public static void serializeTourRoutes(List<TourRoute> routes, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(routes);
        } catch (IOException e) {
            System.err.println("Ошибка при сериализации: " + e.getMessage());
        }
    }

    public static List<TourRoute> deserializeTourRoutes(String fileName) {
        List<TourRoute> routes = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            routes = (List<TourRoute>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Ошибка при десериализации: " + e.getMessage());
        }
        return routes;
    }

    public static void main(String[] args) {
        List<TourRoute> routes = new ArrayList<>();
        routes.add(new TourRoute("Золотое кольцо", "Россия", "Москва", 7, 50000));
        routes.add(new TourRoute("Великие озера", "США", "Чикаго", 10, 100000));
        routes.add(new TourRoute("Античная Греция", "Греция", "Афины", 5, 75000));

        String fileName = "routes.ser";

        serializeTourRoutes(routes, fileName);
        System.out.println("Список маршрутов сериализован в файл " + fileName);

        List<TourRoute> deserializedRoutes = deserializeTourRoutes(fileName);
        if (deserializedRoutes != null) {
            System.out.println("Список маршрутов десериализован из файла " + fileName);
            for (TourRoute route : deserializedRoutes) {
                System.out.println(route);
            }
        }
    }
}
