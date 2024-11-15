import java.util.Scanner;
public class ArrayValue14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] finalscore = new int [10];

        for (int i = 0; i < finalscore.length; i++) {
            System.out.print("Enter the final score " + i + " : ");
            finalscore[i] = sc.nextInt();
        }
        for (int i = 0; i < finalscore.length; i++) {
            if (finalscore[i] > 70){
                System.out.println("Student " + i + " Passed!");
            }
            if (finalscore[i] < 70) {
            System.out.println("Student " + i + " Failed!");
            }
        }
    }
}
