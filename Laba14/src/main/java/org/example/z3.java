package org.example;
import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class z3 {
    public static void main(String[] args) {
        Random random = new Random();
        try (FileWriter writer = new FileWriter("f.txt")) {
            for (int i = 0; i < 10; i++) {
                int number = random.nextInt(301) - 100;
                writer.write(number + "\n");
            }
        } catch (IOException e) {
            System.out.println("Не записалось " + e.getMessage());
        }

        try (Scanner reader = new Scanner(new File("f.txt"));
             FileWriter writerG = new FileWriter("g.txt");
             FileWriter writerH = new FileWriter("h.txt")) {
            while (reader.hasNextInt()) {
                int number = reader.nextInt();

                if (number < 100) {
                    writerG.write(number + "\n");
                } else {
                    writerH.write(number + "\n");
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка " + e.getMessage());
        }

        try {
            System.out.println("\nf.txt:");
            Scanner fileF = new Scanner(new File("f.txt"));
            while (fileF.hasNextLine()) {
                System.out.println(fileF.nextLine());
            }
            fileF.close();

            System.out.println("\ng.txt:");
            Scanner fileG = new Scanner(new File("g.txt"));
            while (fileG.hasNextLine()) {
                System.out.println(fileG.nextLine());
            }
            fileG.close();

            System.out.println("\nh.txt:");
            Scanner fileH = new Scanner(new File("h.txt"));
            while (fileH.hasNextLine()) {
                System.out.println(fileH.nextLine());
            }
            fileH.close();

        } catch (IOException e) {
            System.out.println("Не читаеться " + e.getMessage());
        }

        System.out.println("\nФайлы f, g, h готовы");
    }
}
