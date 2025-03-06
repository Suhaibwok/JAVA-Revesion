public class LOOPS {
    public static void main(String[] args) {


        //WHILE LOOP
        int i = 1;
        while(i<=5){
            System.out.println(i);
            i++;
        }
        //NESTED WHILE
        i = 1;
        while(i<=4){
            System.out.println("WEEK"+i);
            int j=1;
            while(j<=7){
                System.out.println("DAY" + j);
                j++;
            }
            i++;
        }



        //DO WHILE LOOP
        i=1;
        do {
            System.out.println(i);
            i++;
        }while(i<=5);
        //NESTED DO WHILE
        i=1;
        do {
            System.out.println("WEEK"+i);
            int j = 1;
            do {
                System.out.println("DAY"+j);
                j++;
            } while (j <= 7);
            i++;

        } while (i <= 4);



        //FOR LOOP
        for(i=1;i<=5;i++){
            System.out.println(i);
        }
        //NESTED FOR LOOP
        for(i=1;i<=4;i++){
            System.out.println("WEEK"+i);
            int j;
            for(j=1;j<=7;j++){
                System.out.println("DAY"+j);
            }
        }

    }
}
