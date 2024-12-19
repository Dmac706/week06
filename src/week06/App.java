package week06;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
			
//			2. Create a class called App with a main method.
//			a.      Instantiate a Deck and two Players, call the shuffle method on the deck.
//			b.     Using a traditional for loop, iterate 52 times calling the Draw method on the other 
//			       player each iteration using the Deck you instantiated.
//		    c.      Using a traditional for loop, iterate 26 times and call the flip method for each player.
//			
//		Card card = new Card();
			Deck deck = new Deck();
			Player player1 =  new Player("1");
			Player player2 =  new Player("2");
			deck.shuffle();
	 
			for(int i = 0; i < 52; i++) {
				if (i % 2 == 0) {
					player1.draw(deck);
					
				}else {
					player2.draw(deck);
				}
				}
				for (int i = 0; i < 26; i++) {
					
					Card player1Card = player1.flip();
					Card player2Card = player2.flip();
					if (player1Card.getValue() > player2Card.getValue()) {
						player1.incrementScore();
						
						System.out.println("Player1 Wins this round!");	
					}else if (player1Card.getValue() < player2Card.getValue()) {
						player2.incrementScore();
						System.out.println("Player2 Wins this round!");
					} else {
				    	System.out.println("It is a Draw!");
					}
					System.out.println("Player1 score = " + player1.getScore());
					System.out.println("Player2 score = " + player2.getScore());
					System.out.println();
				
				}
					System.out.println("Player1 score = " + player1.getScore());
					System.out.println("Player2 score = " + player2.getScore());
					if (player1.getScore() > player2.getScore()) {
						System.out.println("Player1 is the winner!");
					}else if (player1.getScore() < player2.getScore()) {
						System.out.println("Player2 is the winner!");
				    }else {
				    	System.out.println("It is a Draw!");
				    }
				
				
			}
			
			
			
		}





