import java.util.Scanner;
public class Nonscientificcalculator {
    public static void main(String[]args){
        int operator,n1,n2;
        System.out.println(" 1 - ADD \n 2 - SUBTRACT \n 3 - MULTIPICATION \n 4 - DIVISION");
        System.out.print("Choose the Operator:");
        Scanner sc = new Scanner(System.in);
        operator=sc.nextInt();
        System.out.println("Enter the First number");
        n1=sc.nextInt();
        System.out.println("Enter the Second number");
        n2=sc.nextInt();

        int result=0;
        switch ((operator)) {
            case 1:
                result=n1+n2;
                break;
            case 2:
                result=n1-n2;
                break;
            case 3:
                result=n1*n2;
                break;
            case 4:
                result=n1/n2;
                break;
        
            default:
            System.out.println("Entered opeartor is not valid");
                break;
        }
        System.out.println("Result is:"+result);
    }
    
}
