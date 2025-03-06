public class TYPECASTING {
    public static void main(String[] args) {
        // IMPLICIT TYPECASTING
        int x = 10;
        double y = x;  // Implicit casting from int to double
        System.out.println(y);  // Output: 10.0

        // EXPLICIT TYPECASTING
        double a = 9.78;
        int b = (int) a;  // Explicit casting from double to int
        System.out.println(b);  // Output: 9 (the fractional part is discarded)


    }
}
