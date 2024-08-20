import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    startGame();
    }

        static void startGame() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Do you want to play as Evens or Odds?\nChoose 1 for Evens\nChoose 2 for Odds\nChoose: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1: System.out.println("Ok, you are Evens!");
                    break;
                case 2: System.out.println("Ok, you are Odds!");
                    break;
                default: System.out.println("Invalid Option, try again");
                    startGame();
                    break;
            }

            String player = (choice == 1) ? "Evens" : "Odds";

            System.out.print("Now, choose a number! If the sum of your number with the computer's number is " + player + " then you win! If it's not, you lose :(\nChoose number: ");
            int chosenNumber = Integer.parseInt(scanner.nextLine());


            int machinesNumber = (int) (Math.random() * 11);

            int addition = chosenNumber + machinesNumber;
            String evenOrOdd = (addition % 2 == 0) ? "Even" : "Odd";

            System.out.println("The number chosen by the computer was " + machinesNumber + "\nAnd the sum of the numbers is " + addition + " which is " + evenOrOdd + "!");

            if ((player.equals("Evens")) && (addition % 2 == 0) || player.equals("Odds") && addition % 2 == 1) {
                System.out.println("You won! Congrats");
            } else {
                System.out.println("You lost :(\nThat's a shame");
            }
            }
        }

