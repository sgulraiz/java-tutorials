public class SwitchStatements {

    public static void main (String[] args){

        char switchValue = 'Z';

        switch (switchValue) {
            case 'A':
                System.out.println("The value is A");
                break;

            case 'B':
                System.out.println("The value is B");
                break;

            default:
                System.out.println("The value is " + switchValue);
        }
        //call print day of the week method
        printDayOfTheWeek(2);
    }

    //Print day of the week example - creating a method

    public static void printDayOfTheWeek(int day){
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day!!!");
        }
    }
}
