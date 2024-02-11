public class HourlyEmployee extends Employee{

    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String hiredate, double hourlyPayRate) {
        super(name, birthDate, hiredate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectpay(){
        return  40 * hourlyPayRate;
    }

    public double getDoublepay(){
        return 2 * collectpay();

    }
}
