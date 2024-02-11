public class Calculator {

    Floor floor;
    Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        double area = floor.getArea();
        return carpet.getCost() * area;
    }
}
