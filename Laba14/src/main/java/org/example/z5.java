package org.example;
import java.io.*;
import java.util.Scanner;

public class z5 {
    public static void main(String[] args) {
        int[] numbers = {6, 10, 12, 15, 18, 20, 24, 7, 30, 11};
        try (FileWriter writer = new FileWriter("f.txt")) {
            for (int number : numbers) {
                writer.write(number + "\n");
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }

        int count = 0;
        try (Scanner reader = new Scanner(new File("f.txt"))) {
            while (reader.hasNextInt()) {
                int number = reader.nextInt();

                if (number % 2 == 0 && number % 3 == 0) {
                    count++;
                }
            }   
        } catch (IOException e) {
            System.out.println("не читаеться " + e.getMessage());
        }
        System.out.println("кратных 2 и 3:\n " + count);
    }
}