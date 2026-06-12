
import java.util.Scanner;

public class AverageTemp {
    public static void main(String[] args)
    {
        double[] temperatures = new double[3];
        System.out.println("Enter the temperatures for 3 days:");
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        for (int i = 1; i <= temperatures.length; i++)
        {
            System.out.print("Day " + i + " high temperature: ");
            double next = sc.nextDouble();
            temperatures[i-1] = next;
            sum += next;
        }
        double average = sum / temperatures.length;
        int aboveAverageCount = 0;
        for (int i=0; i < temperatures.length; i++)
        {
            if (temperatures[i] > average)
            {
                aboveAverageCount++;
            }
        }
        System.out.println("The average temperature is: " + average);
        System.out.println("Number of days with temperature above average: " + aboveAverageCount);
    }
    }
        


         



      

    



