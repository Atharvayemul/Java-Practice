public class SalariedEmployee extends  Employee{

    double annualSalary;
    boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hiredate, double annualSalary) {
        super(name, birthDate, hiredate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectpay(){
        double paycheck = annualSalary / 26;
        double adjustpay = (isRetired) ? 0.9 * paycheck : paycheck;
        return (int) adjustpay;
    }

    public void retire(){

        terminate("12/12/2025");
        isRetired = true;
    }



}
