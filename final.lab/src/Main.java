import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int []array ;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of input: ");
        int index = input.nextInt();
        array = new int[index];
        System.out.print("Enter your list of numbers : ");
        for (int i = 0; i < index; i++) {
           array[i] = input.nextInt();
        }
        System.out.print("Enter Number to search: ");
        int search = input.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == search) {
                System.out.println("THE NUMBER IS FOUND IN THE " + i + "th index");

            }
        }






    }
}