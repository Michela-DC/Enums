//Exercise: Enumerations
//        create an enumeration Month with all the name of the months
//        iterate all the values of the enumeration, printing the name of the month followed by:
//        ends with y if the name ends with Y
//        doesn't end with y if the name doesn't end with y

public class Main {
    public static void main(String[] args) {
        for (Month month : Month.values()) {
            System.out.println(month);

            String monthString = month.toString();

            if(monthString.endsWith("Y")) {
                System.out.println("ends with y");
            } else {
                System.out.println("doesn't end with y");
            }
        }
    }
}