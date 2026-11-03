public class Smartphone {

    private String model;

    public String getModel() {
        return model;
    }

    public static void vivod()
    {
        System.out.println(totalMemory + totalPhones);
    }

    public void vivod2()
    {
        System.out.println(model + memory + cameraMP + totalPhones + totalMemory);
    }
    /*
    Smartphone.vivod();

    saamsung.vivod2();
     */

    public void setModel(String model) {
        this.model = model;
    }

    private double memory;

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    private int cameraMP;

    public int getCameraMP() {
        return cameraMP;
    }

    public void setCameraMP(int cameraMP) {
        this.cameraMP = cameraMP;
    }

    private static int totalPhones;
    private static double totalMemory;

    public Smartphone(String model, double memory, int cameraMP){
        this.model = model;
        this.memory = memory;
        this.cameraMP = cameraMP;

        totalPhones++;
        totalMemory += memory;
    }

    public static double getAverageMemory()
    {
        return totalMemory / totalPhones;
    }


    @Override
    public String toString() {
        return model + memory +  cameraMP;
    }
}
