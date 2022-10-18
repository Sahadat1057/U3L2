import java.util.Scanner;
public class U3L2Runner {
    public static void main(String[] args) {

        int score = 83;
        String grade = "";

        if (score >= 90)
        {
            grade = "A";
        }
        if (score >= 80)
        {
            grade = "B";
        }
        if (score >= 70)
        {
            grade = "C";
        }
        if (score >= 60)
        {
            grade = "D";
        }
        if (score < 60)
        {
            grade = "F";
        }
        System.out.println("Your grade is: " + grade);


    }

    }

