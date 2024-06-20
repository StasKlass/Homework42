package org.example;

import java.io.Serializable;

public class TourRoute implements Serializable {
    private static final long serialVersionUID = 1L;

    String routeName;
    String country;
    String city;
    int durationDays;
    double cost;

    public TourRoute(String routeName, String country, String city, int durationDays, double cost) {
        this.routeName = routeName;
        this.country = country;
        this.city = city;
        this.durationDays = durationDays;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Маршрут: " + routeName + ", Страна: " + country + ", Город: " + city + ", Длительность: " + durationDays + " дней, Стоимость: " + cost + " рублей";
    }
}
