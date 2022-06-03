import java.util.*;
public class Fibonacci{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Get Number
        System.out.print("Enter number: ");
        int num = scan.nextInt();
        scan.close();

        // Print Fibonacci
        int num1 = 0;
        int num2 = 1;
        System.out.print(num1+" ");
        for(int i=1;i<num;i++){
            System.out.print(num2+" ");
            int temp = num1;
            num1 = num2;
            num2 = temp + num2;
        }
    }
}