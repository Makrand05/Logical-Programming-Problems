import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        int sum=0;
        int tmp=number;
        for(int i=1;i<number;i++){
            if(number%i==0)
            {
                sum+=i;
            }
            //System.out.println(sum);
        }
        if(sum==tmp){
            System.out.println(tmp+" is a perfect number");
        }
        else {

            System.out.println(tmp+" is not a perfect number");
        }
    }
}
