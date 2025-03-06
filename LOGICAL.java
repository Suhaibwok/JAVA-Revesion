public class LOGICAL {
    public static void main(String[] args) {


        /*    &&   AND
          0   0  = 0      If both condition1 and condition2 are true, the result is true.
          0   1  = 0      If either condition1 or condition2 is false, the result is false.
          1   0  = 0
          1   1  = 1      */
        boolean A = true;
        boolean B = false;
        int C = 10;
        int D = 20;
        int E = 30;
        System.out.println(A && B);
        System.out.println(C < E && D < E && C < D);


        /*    ||   OR
          0   0 = 0       If either condition1 or condition2 is true, the result is true.
          0   1 = 1       If both condition1 and condition2 are false, the result is false.
          1   0 = 1
          1   1 = 1*/
        System.out.println(A || B);
        System.out.println(C < E || D < E || C < D);


        /*    !    NOT
          0  1     If condition is true, !condition will return false.
          1  0     If condition is false, !condition will return true.
         */
        System.out.println(!A);
        System.out.println(!B);


        /*   ^   XOR
           0   0 = 0     If condition1 and condition2 are different, the result is true.
           0   1 = 1     If condition1 and condition2 are the same, the result is false.
           1   0 = 1
           1   1 = 0
         */
        System.out.println(A || B);
        System.out.println(C < E || D < E || C < D);

    }
}
