public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void  startEngine()
    {
        System.out.println("Car -> StartEngine");
    }

    public void drive()
    {
        System.out.println("Car -> driving type  is " + getClass().getSimpleName());
        runEngine();
    }
    protected void runEngine()
    {
        System.out.println("Car ->runEngine");
    }
}

class GasPoweredCar extends Car
{
    private double avgKmPerLitre;
    private int cylinders = 6;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("Gas -> All " + cylinders + " are fired Up, Ready!");
    }

    @Override
    protected void runEngine() {
        System.out.println("Gas -> usuage exceeds the average :" + avgKmPerLitre);
    }
}

class ElectricCar extends Car
{
    private double avgKmPerCharge;
    private int batterySize = 6;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println("BEV -> switch " +batterySize + " kWH battery on Ready");
    }

    @Override
    protected void runEngine() {
        System.out.println("BEV -> usage under the average " + avgKmPerCharge);
    }
}

class HybridCar extends Car
{
    private double avgKmPerLitre;
    private int cylinders = 6;
    private int batterSize;

    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgKmPerLitre, int cylinders,int batterSize) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
        this.batterSize = batterSize;
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> %d cylinders are fired up %n",cylinders);
        System.out.printf("Hybrid -> switch %d kwh batter on ready %n",batterSize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> usage below average %.2f %n",avgKmPerLitre);
    }
}



