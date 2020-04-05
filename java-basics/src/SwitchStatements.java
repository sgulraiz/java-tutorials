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


    }

}
