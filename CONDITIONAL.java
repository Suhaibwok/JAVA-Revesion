import java.lang.runtime.SwitchBootstraps;

public class CONDITIONAL {
    public static void main(String[] args) {
        int A = 1;
        int B = 20;
        int C = 30;
        String DAY;

        // IF STATEMENT
        if(A<B)
            System.out.println(A + " is lesser then " + B);

        if (A > 5) {
            System.out.println(A+" is greater than 5");
        }




        // IF-ELSE STATEMENT
        if(A<B)
            System.out.println(A+" is lesser then "+B);
        else
            System.out.println(A+" is greater then "+B);

        if (A > 5) {
            System.out.println(A+" is greater than 5");
        } else {
            System.out.println(A+" is less than or equal to 5");
        }



        // IF-ELSE-IF STATEMENT
        if(A>B){
            if(A>C){
                System.out.println("A is largest");
            }else {
                System.out.println("C is the largest");
            }
        }else if(B>C){
            System.out.println("B is the largest");
        }else{
            System.out.println("C is the largest");
        }

        if (A > 50) {
            System.out.println("x is greater than 50");
        } else if (A > 10) {
            System.out.println("x is greater than 10 but less than or equal to 50");
        } else {
            System.out.println("x is 10 or less");
        }


        //SWITCH STATEMENT
        switch (A){
            case 2:
                DAY ="MONDAY";
                System.out.println(DAY);
                break;
            case 3:
                DAY ="TUESDAY";
                System.out.println(DAY);
                break;
            case 4:
                DAY ="WEDNESDAY";
                System.out.println(DAY);
                break;
            case 5:
                DAY ="THURSDAY";
                System.out.println(DAY);
                break;
            case 6:
                DAY ="FRIDAY";
                System.out.println(DAY);
                break;
            case 7:
                DAY ="SATURDAY";
                System.out.println(DAY);
                break;
            case 1:
                DAY ="SUNDAY";
                System.out.println(DAY);
                break;
            default:
                System.out.println("invalid day");

        }



    }
}
