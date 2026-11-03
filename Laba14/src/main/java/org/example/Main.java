package org.example;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        File file = new File("myfam");
        try (FileWriter writer = new FileWriter(file)) {
            writer.write("многооо инфы");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Имя " + file.getName());
        System.out.println("Размер " + file.length());
        System.out.println("gуть: " + file.getAbsolutePath());
        System.out.println("Есть: " + file.exists());

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Не читаеться: " + e.getMessage());
        }
    }
}