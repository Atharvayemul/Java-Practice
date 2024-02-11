// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main extends java.lang.Object{
    public static void main(String[] args) {

        Student max = new Student("max",21);
        System.out.println(max);
    }
}

class Student{
    private String name;
    private int age;

    Student(String name , int age)
    {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class primaryschoolstudent extends Student{
    private String parentname;
    primaryschoolstudent(String name, int age , String parentname)
    {

    }
}