public class Main {
    public static void main(String[] args) {
        Smartphone phone1 = new Smartphone("самса", 128, 50);
        Smartphone phone2 = new Smartphone("сифон", 256, 48);
        Smartphone phone3 = new Smartphone("хуавей ноова", 128, 108);

        System.out.println(Smartphone.getAverageMemory());
        System.out.println(phone1);
    }
}