public class Main {
    public static void main(String[] args) {

        String birthdate = "25/11/1982";
        int startingindex = birthdate.indexOf("1982");
        System.out.println("Starting index = " + startingindex);
        System.out.println("Bith year = " + birthdate.substring(startingindex));

        System.out.println("Month " + birthdate.substring(3,5));

        String newDate = String.join("/","25","11","1982");
        System.out.println("newDate = " + newDate);

        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1982");
        System.out.println("newDate = " + newDate);

        newDate = "25" + "/" + "11" + "/" + "1982";
        System.out.println("newDate = " + newDate);

        newDate = "25".concat("/").concat("11").concat("/").concat("1982");
        System.out.println("newDate = " + newDate);

        System.out.println(newDate.replace('/','-'));
        System.out.println(newDate.replace("2","00"));

        System.out.println(newDate.replaceFirst("/","-"));
        System.out.println(newDate.replaceAll("/","---"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));


    }
}