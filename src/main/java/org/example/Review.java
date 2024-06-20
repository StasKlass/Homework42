package org.example;

public class Review {
    String travelerName;
    String country;
    String reviewText;
    String visitDate;

    public Review(String travelerName, String country, String reviewText, String visitDate) {
        this.travelerName = travelerName;
        this.country = country;
        this.reviewText = reviewText;
        this.visitDate = visitDate;
    }

    @Override
    public String toString() {
        return travelerName + "," + country + "," + reviewText + "," + visitDate;
    }
}
