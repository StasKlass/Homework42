package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReviewManager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "reviews.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            boolean addMoreReviews = true;

            while (addMoreReviews) {
                System.out.println("Введите имя путешественника:");
                String travelerName = scanner.nextLine();

                System.out.println("Введите страну посещения:");
                String country = scanner.nextLine();

                System.out.println("Введите отзыв:");
                String reviewText = scanner.nextLine();

                System.out.println("Введите дату посещения:");
                String visitDate = scanner.nextLine();

                Review review = new Review(travelerName, country, reviewText, visitDate);
                writer.write(review.toString());
                writer.newLine();

                System.out.println("Желаете добавить ещё отзыв? (да/нет)");
                String response = scanner.nextLine().trim().toLowerCase();
                addMoreReviews = response.equals("да");
            }
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }

        scanner.close();
    }
}
