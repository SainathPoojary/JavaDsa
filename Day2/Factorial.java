import java.util.*;
public class Factorial{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Get Number
        System.out.print("Enter number: ");
        int num = scan.nextInt();
        scan.close();

        // Calculate Fact
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }

        System.out.println("Factorial: "+fact);
    }
}