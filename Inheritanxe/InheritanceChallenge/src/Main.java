// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Employee tim = new Employee("Tim","11/11/2003","01/01/2020");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectpay());

        SalariedEmployee joe = new SalariedEmployee("Joe","11/11/1990","02/03/2020",35000);
        System.out.println(joe);
        System.out.println("joe paycheck = $"+ joe.collectpay());

        joe.retire();
        System.out.println("Joe Pension check = $" + joe.collectpay());

        HourlyEmployee mary = new HourlyEmployee("Mary","05/05/1970","03/03/2021",15);
        System.out.println(mary);
        System.out.println("Mary Paycheck = $ "+ mary.collectpay());
        System.out.println("Mary Holiday pay = $" + mary.getDoublepay());
    }
}