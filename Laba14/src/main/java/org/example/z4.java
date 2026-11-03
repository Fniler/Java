package org.example;
import java.util.Scanner;
import java.io.*;
import java.util.Locale;

public class z4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (FileWriter writer = new FileWriter("concentr.txt")) {
            for (int i = 0; i < 15; i++) {
                System.out.print("Введите концентрацию: ");

                double value = scanner.nextDouble();

                writer.write(value + "\n");
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }

        double sum = 0;
        int count = 0;

        try (Scanner reader = new Scanner(new File("concentr.txt"))) {
            reader.useLocale(Locale.US);
            while (reader.hasNextDouble()) {
                double value = reader.nextDouble();
                sum += value;
                count++;
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }

        if (count > 0) {
            double average = sum / count;
            System.out.println("Средняя концентрация: " + average);
        }
    }
}
