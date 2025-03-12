import java.util.Scanner;
public class USERINPUT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        float C = sc.nextFloat();
        long D = sc.nextLong();
        sc.nextLine();
        String E = sc.nextLine();
        System.out.println(A+"    " +B+"    " +C+"    " +D+"    " +E);
        System.out.printf("You entered:\n%d\n%d\n%.2f\n%d\n%s", A, B, C, D, E);
    }
}
