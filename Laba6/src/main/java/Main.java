public class Main {
    public static void main(String[] args) {
        double totalPrice = 400000;
        Apartment apartment = new Apartment("Пушкино колотушкино", 4, 234);

        System.out.println(apartment);
        System.out.println(apartment.pricePerSquareMeter(totalPrice));

    }
}