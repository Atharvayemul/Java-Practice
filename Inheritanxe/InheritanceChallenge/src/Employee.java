public class Employee extends Worker {

    private long employeeid;
    private String hiredate;

    private static  int employeeNo = 1;

    public Employee(String name, String birthDate, String hiredate) {
        super(name, birthDate);
        this.employeeid = Employee.employeeNo++;
        this.hiredate = hiredate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeid=" + employeeid +
                ", hiredate='" + hiredate + '\'' +
                "} " + super.toString();
    }
}
