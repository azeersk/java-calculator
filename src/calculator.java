import java.util.Scanner;
public class calculator {
    public static void main(String []args){
        Scanner forinput = new Scanner(System.in);
        System.out.println("please select your operation:\n 1.addition \n 2.subtraction \n 3.multiplication ");
        int operator = forinput.nextInt();
        if (operator != 1 && operator!= 2 && operator != 3){
            System.out.print("Invalid input!");
        }
        else {
            System.out.print("Enter your first number: ");
            int A = forinput.nextInt();
            System.out.print("Enter your second number: ");
            int R = forinput.nextInt();
            if (operator == 1) {
                System.out.print("Answer: " + (A+R));
            }
            else if (operator == 2){
                System.out.print("Answer: " + (A-R));
            }
            else if (operator == 3){
                System.out.print("Answer: " + (A*R));
            }
        }
    }
}
