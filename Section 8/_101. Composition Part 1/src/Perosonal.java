public class Perosonal extends Product{

//    This is the way to use the inheritance and composition to create a model

    private ComputerCase computerCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public Perosonal(String model, String manufacturer, ComputerCase computerCase, Monitor monitor, Motherboard motherboard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    private void  drawlogo()
    {
        monitor.drawpixelat(1200,50,"yellow");
    }

    public void powerup()
    {
        computerCase.presspowerButton();
        drawlogo();
    }

//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public Motherboard getMotherboard() {
//        return motherboard;
//    }
}
