package week06;

public class App {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        for (int i = 0; i < 26; i++) {
            player1.draw(deck);
            player2.draw(deck);
        }

        for (int i = 0; i < 26; i++) {
        	System.out.println("Round " + (i+1) + ":");
            Card card1 = player1.flip();
            Card card2 = player2.flip();

            if (card1 != null && card2 != null) {
                System.out.print(player1.getName() + " flips ");
                card1.describe();
                System.out.print(player2.getName() + " flips ");
                card2.describe();

                if (card1.getValue() > card2.getValue()) {
                    player1.incrementScore();
                    System.out.println("Player 1 wins the round.");
                } else if (card1.getValue() < card2.getValue()) {
                    player2.incrementScore();
                    System.out.println("Player 2 wins the round.");
                } else {
                    System.out.println("It's a tie! No points awarded.");
                }
                System.out.println();
            }
        }

        System.out.println("Final Scores:");
        System.out.println("Player 1: " + player1.getScore());
        System.out.println("Player 2: " + player2.getScore());

        if (player1.getScore() > player2.getScore()) {
            System.out.println("Player 1 wins the game!");
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println("Player 2 wins the game!");
        } else {
            System.out.println("The game is a draw!");
        }
    }
}

