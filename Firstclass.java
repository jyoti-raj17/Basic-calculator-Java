// Basic calculator using conditional statements
import java.util.*;
class Firstclass{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Select the Operation: \n 1. Addition\n 2. Subtraction\n 3. Multiplication\n 4. Division\n 5. Modulo\n");
        int select = sc.nextInt();
        if(select==1){
            System.out.print(a+b);
        }                  
        else if(select==2){
            System.out.println(a-b);
        }
        else if(select==3){
            System.out.println(a*b);
        }
        else if(select==4){
            System.out.println(a/b);
        }
        else if(select==5){
            System.out.println(a%b);
        }
        else{
            System.out.println("Enter valid Option");
        }
        
                         
    }
}