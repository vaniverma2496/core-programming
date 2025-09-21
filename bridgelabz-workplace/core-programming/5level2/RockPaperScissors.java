import java.util.Scanner;

public class RockPaperScissors {

    // Method to get computer choice randomly
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3); // 0, 1, 2
        switch (choice) {
            case 0: return "Rock";
            case 1: return "Paper";
            case 2: return "Scissors";
            default: return "Rock"; // fallback
        }
    }

    // Method to determine winner between user and computer
    public static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equalsIgnoreCase(computerChoice)) {
            return "Draw";
        } else if (
                (userChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Scissors")) ||
                (userChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Rock")) ||
                (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Paper"))
        ) {
            return "User";
        } else {
            return "Computer";
        }
    }

    // Method to calculate stats and percentages
    public static String[][] calculateStats(int userWins, int computerWins, int draws, int totalGames) {
        String[][] stats = new String[3][3];
        stats[0][0] = "User Wins"; stats[0][1] = String.valueOf(userWins); stats[0][2] = String.format("%.2f%%", (userWins * 100.0) / totalGames);
        stats[1][0] = "Computer Wins"; stats[1][1] = String.valueOf(computerWins); stats[1][2] = String.format("%.2f%%", (computerWins * 100.0) / totalGames);
        stats[2][0] = "Draws"; stats[2][1] = String.valueOf(draws); stats[2][2] = String.format("%.2f%%", (draws * 100.0) / totalGames);
        return stats;
    }

    // Method to display game results and stats
    public static void displayResults(String[][] gameResults, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.printf("%-10s%-15s%-15s%-10s%n", "Game#", "User Choice", "Computer Choice", "Winner");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < gameResults.length; i++) {
            System.out.printf("%-10s%-15s%-15s%-10s%n", gameResults[i][0], gameResults[i][1], gameResults[i][2], gameResults[i][3]);
        }

        System.out.println("\nStatistics:");
        System.out.printf("%-15s%-10s%-10s%n", "Result", "Count", "Percentage");
        System.out.println("---------------------------------");
        for (int i = 0; i < stats.length; i++) {
            System.out.printf("%-15s%-10s%-10s%n", stats[i][0], stats[i][1], stats[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games to play: ");
        int totalGames = sc.nextInt();
        sc.nextLine(); // consume newline

        String[][] gameResults = new String[totalGames][4];
        int userWins = 0, computerWins = 0, draws = 0;

        for (int i = 0; i < totalGames; i++) {
            System.out.print("Enter your choice (Rock, Paper, Scissors) for Game " + (i + 1) + ": ");
            String userChoice = sc.nextLine();
            String computerChoice = getComputerChoice();
            String winner = determineWinner(userChoice, computerChoice);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;
            else draws++;

            gameResults[i][0] = String.valueOf(i + 1);
            gameResults[i][1] = userChoice;
            gameResults[i][2] = computerChoice;
            gameResults[i][3] = winner;
        }

        String[][] stats = calculateStats(userWins, computerWins, draws, totalGames);
        displayResults(gameResults, stats);

        sc.close();
    }
}
