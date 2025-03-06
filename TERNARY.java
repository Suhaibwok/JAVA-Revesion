public class TERNARY {
    public static void main(String[] args) {
        int A=40, B=30, C=20;

        int largest = (A>B) ?(A>C)?A:C :(B>C)? B:C;
        System.out.println(largest);

        int large = (A>B) ? A :B;
        System.out.println(large);
    }
}
