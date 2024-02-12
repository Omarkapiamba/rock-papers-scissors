import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {


            String[] rock_paper_scissors = {"sten", "sax", "påse"};
            String computerMove = rock_paper_scissors[new Random().nextInt(rock_paper_scissors.length)];

            String playerMove;
            while (true) {
                System.out.println("Välj (sten, sax eller påse)");
                playerMove = scanner.nextLine();
                if (playerMove.equals("sten") || playerMove.equals("sax") || playerMove.equals("påse")) {
                    break;
                }
                System.out.println(playerMove + " är inget giltigt drag. ");
            }

            System.out.println("\nDu: " + playerMove + "\nDator: " + computerMove);

            if (playerMove.equals(computerMove)) {
                System.out.println("Spelet blev lika");

            } else if (playerMove.equals("sten")) {
                if (computerMove.equals("påse")) {
                    System.out.println("\nDu förlorade!");

                } else if (computerMove.equals("sax")) {
                    System.out.println("\nDu förlorade!");
                }
            } else if (playerMove.equals("sax")) {
                if (computerMove.equals("sten")) {
                    System.out.println("\nDu förlorade!");

                } else if (computerMove.equals("påse")) {
                    System.out.println("\nDu förlorade!");
                }

            } else if (playerMove.equals("påse")) {
                if (computerMove.equals("sax")) {
                    System.out.println("\nDu förlorade!");

                } else if (computerMove.equals("sten")) {
                    System.out.println("\nDu vann!");
                }
            }

            System.out.println("Spela igen ? (ja/nej)");
            String playAgain = scanner.nextLine();

            if (!playAgain.equals("ja")) {
                break;
            }

            scanner.close();
        }

    }
}