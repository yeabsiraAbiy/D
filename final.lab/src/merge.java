import java.util.Arrays;
import java.util.Scanner;


public class merge {
    public static void mergesort(int[] inputArray) {
        int inputArrayLength = inputArray.length;
        if (inputArrayLength < 2) {
            return;
        }
        int middle = inputArrayLength / 2;
        int[] leftHALF = new int[middle];
        int[] rightHALF = new int[inputArrayLength - middle];
        for (int i = 0; i < middle; i++) {
            leftHALF[i] = inputArray[i];
        }
        for (int i = 0; i < inputArrayLength - middle; i++) {
            rightHALF[i] = inputArray[i + middle];
        }
        mergesort(leftHALF);
        mergesort(rightHALF);
        merge(inputArray, leftHALF, rightHALF);
    }
    public static void merge(int[] inputArray, int[] leftH,int [] rightH) {
        int leftHSize = leftH.length;
        int rightHSize = rightH.length;
        int i=0, j=0; int k=0;
        while (i < leftHSize && j < rightHSize) {
            if (leftH[i] < rightH[j]) {
                inputArray[k] = leftH[i];
                i++;
            }else {
                inputArray[k] = rightH[j];
                j++;
            }
            k++;
        }
        while (i < leftHSize) {
            inputArray[k] = leftH[i];
            i++;
            k++;
        }
        while (j < rightHSize) {
            inputArray[k] = rightH[j];
            j++;
            k++;
        }
    }
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
        mergesort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
