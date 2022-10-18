import java.util.Scanner;
public class U3L2Runner {
    public static void main(String[] args) {

                // Tell the user to enter a question
                Scanner scan = new Scanner(System.in);
                System.out.println("Welcome to the Magic 8 Ball!");
                System.out.print("Enter your yes-no question and I will answer it: ");
                String question = scan.nextLine();
                int x = (int) (Math.random() * 7);
                if (x==1) {
                    System.out.println("yes");
        }
                else if (x==2) {
                    System.out.println("obviously");
                }
                else if (x==3) {
                    System.out.println("of course");
                }
                else if (x==4) {
                    System.out.println("No");
                }
                else if (x==5) {
                    System.out.println("Hell no");
                }
                else  {
                    System.out.println("Nah, rethink your life choices");
                }
                // Get a random number from 1 to 6

                // Use selection statements (if, if-else, else-if)
                // to choose from 1 of 6 responses to yes-no questions, then print it out!

            }

    }

