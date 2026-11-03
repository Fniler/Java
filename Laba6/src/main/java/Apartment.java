public class Apartment {
    private String adress;

    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    public Apartment(int count, String adress, int room, double area)
    {
        this(adress, room, area);
        this.count = count;
    }


    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    private int rooms;

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    private double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Apartment(String adress, int rooms, double area) {
        this.adress = adress;
        this.rooms = rooms;
        this.area = area;
    }

    public double pricePerSquareMeter(double totalPrice) {
        return totalPrice / area;
    }

    @Override
    public String toString() {
        return "Квартира:" + adress + rooms + area;
        totalMemory -= this.memory;
        this.memory = memory;
        totalMemory += memory;
    }
}
