import java.util.Scanner;

public class DeckOfCards {

    // Suits and ranks of cards
    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                                           "Jack", "Queen", "King", "Ace"};

    // Method to initialize the deck
    public static String[] initializeDeck() {
        int numOfCards = SUITS.length * RANKS.length;
        String[] deck = new String[numOfCards];
        int index = 0;
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck
    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            // Swap cards
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    // Method to distribute the deck to players
    public static String[][] distributeDeck(String[] deck, int numOfPlayers, int numOfCardsPerPlayer) {
        if (numOfPlayers * numOfCardsPerPlayer > deck.length) {
            System.out.println("Not enough cards to distribute to players!");
            return null;
        }

        String[][] players = new String[numOfPlayers][numOfCardsPerPlayer];
        int cardIndex = 0;

        for (int i = 0; i < numOfPlayers; i++) {
            for (int j = 0; j < numOfCardsPerPlayer; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
        return players;
    }

    // Method to print players and their cards
    public static void printPlayersCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + " cards:");
            for (String card : players[i]) {
                System.out.println("  " + card);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize deck
        String[] deck = initializeDeck();

        // Shuffle deck
        deck = shuffleDeck(deck);

        // Take input for number of players and cards per player
        System.out.print("Enter number of players: ");
        int numOfPlayers = sc.nextInt();

        System.out.print("Enter number of cards per player: ");
        int numOfCardsPerPlayer = sc.nextInt();

        // Distribute deck
        String[][] players = distributeDeck(deck, numOfPlayers, numOfCardsPerPlayer);

        // Print players and their cards
        if (players != null) {
            printPlayersCards(players);
        }

        sc.close();
    }
}
