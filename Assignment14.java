import java.util.Scanner;
public class Assignment14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of element : ");
        int n = sc.nextInt();

        int[] number = new int [n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element " + (i + 1) + " : " );
            number[i] = sc.nextInt();
        }

        int highest = number[0];
        int lowest = number[0];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if(number[i] > highest) {
                highest = number[i];
            }
            if (number[i] < lowest) {
                lowest = number[i];
            }
            sum += number[i];
        }
    double average = sum / n;
    System.out.println("The highest value : " + highest);
    System.out.println("The lowest value : " + lowest);
    System.out.println("The average value : " + average);
    }
}
