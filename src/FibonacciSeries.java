import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the lenght : ");
        int l= sc.nextInt();
        int m1=0,m2=1,n3;
        System.out.println("Fibonacci Series : ");
        System.out.print(m1+" "+m2);
        for(int i=2;i<l;i++){
            int m3 = m1 + m2;
            System.out.print(" "+m3);
            m1=m2;
            m2=m3;
        }
    }
}
