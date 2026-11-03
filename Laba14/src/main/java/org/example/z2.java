package org.example;
import java.io.*;
import java.util.Scanner;

public class z2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (FileWriter writer = new FileWriter("f.txt")) {
            for (int i = 0; i < 10; i++) {
                System.out.print("Ввод числа: ");
                int number = scanner.nextInt();

                writer.write(number + "\n");
            }
        } catch (IOException e) {
            System.out.println("Не записалось" + e.getMessage());
        }
        int count = 0;
        try (Scanner reader = new Scanner(new File("f.txt"))) {
            while (reader.hasNextInt()) {
                int number = reader.nextInt();
                System.out.println(number);
                if (number > 0) {
                    count++;
                }
            }
        } catch (IOException e) {
            System.out.println("Не читаеться " + e.getMessage());
        }

        System.out.println("положительные чисел: " + count);
    }
}
