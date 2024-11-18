import java.util.Scanner;
public class ArrayAverageScore14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Total Student : ");
        int numberStudent = sc.nextInt();

        int[] score = new int[numberStudent];
        double totalPassed = 0, totalFailed = 0;
        double averagePassed, averageFailed;
        double numberPassed = 0, numberFailed = 0;

        for (int i = 0; i < numberStudent; i++) {
            System.out.print("Enter student score " + (i + 1) + " : ");
            score[i] = sc.nextInt();
            
            if (score[i] > 70) {
                totalPassed += score[i];
                numberPassed++;
            }else{
                totalFailed += score[i];
                numberFailed++;
            }
        }
        averagePassed = totalPassed / numberPassed;
        averageFailed = totalFailed / numberFailed;
        System.out.println("The average score of student who passed is : " + averagePassed);
        System.out.println("The average score of student who failed is : " + averageFailed);
    }
}
