//Write a Java program to calculate the average value of array elements.
import java.util.Scanner;

public class average {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of elements in the array: ");
      int n = input.nextInt();
     
      int[] numbers = new int[n];
      System.out.println("Enter the elements of the array:");
      for(int i=0; i < n ; i++)
        numbers[i] = input.nextInt(); //Input array elemets from user.
     
      int sum = 0;
      for(int i=0; i < numbers.length ; i++)//Sum of array elements
        sum = sum + numbers[i];
     
      double average = (double) sum / numbers.length;
      System.out.println("Average value of the array elements is : " + average);
   }
}