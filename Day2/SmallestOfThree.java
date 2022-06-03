import java.util.*;
public class SmallestOfThree{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Get Number
        System.out.print("Enter 3 numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        scan.close();

        // Calculate Smallest
        if(num1<num2 && num1<num3){
            System.out.println("Smallest: "+num1);
        }
        else if(num2<num3){
            System.out.println("Smallest: "+num2);
        }
        else{
            System.out.println("Smallest: "+num3);
        }
    }
}