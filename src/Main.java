import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstNum;
        int secondNum;
        int thirdNum;

        System.out.println("Enter a number: ");
        Scanner numberInput = new Scanner(System.in);
        firstNum = Integer.parseInt(numberInput.nextLine());

        System.out.println("Enter a number: ");
        Scanner secNumInput = new Scanner(System.in);
        secondNum = Integer.parseInt(numberInput.nextLine());

        System.out.println("Enter a number: ");
        Scanner thirdNumInput = new Scanner(System.in);
        thirdNum = Integer.parseInt(numberInput.nextLine());

        int finalNum = (firstNum + secondNum + thirdNum)/3;

        System.out.println("Numbers you entered: " + firstNum + ", " + secondNum + ", " + thirdNum);
        System.out.println("Average: " + finalNum);
    }
}
