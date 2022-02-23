import java.util.Scanner;

public class EmployeePayment{

    public static int sum(int x, int y){

        int Total = 0;
        for(int i = x; i <= y; i++)
        Total += i;
        
        return Total;
    }

   
    public static void main(String[] args) {

       
        Scanner sc = new Scanner(System.in);

       System.out.println("Enter the first number and last number:");
       int x = sc.nextInt();
       int y = sc.nextInt();

       System.out.println("The sum from " +x+ " to " +y+ " is: " +sum(x, y) );

       

    }
}
