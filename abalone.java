package startclass;

import ss.utils.TextIO;

public class abalone {

	public static void main(String[] args) {
		int input;
		boolean play = true;
		Game game = new Game();
		
		System.out.println("Tutorial: moves are made by entering five intigers without spaces");
		System.out.println("first number: the row of the ball, 0-8");
		System.out.println("Second number: index of the field, depends on the row, values range also 0-8, but some rows might not have certain indexes");
		System.out.println("third number: how many balls would you like to move, ranges 1-3");
		System.out.println("fourth and fith numbers: represent direction by a vector of sorts, shown bellow, range from 1-6, fourth number indicates in which direction you want to select and the fith one where to move");
		System.out.println("  1 . 2" + "\n" + "6 . Y . 3" + "\n" + "  5 . 4");
		System.out.println(" think of Y as your ball");
		
		
		
		while(play) {
			System.out.println(" So how many people will play the game? 2-4");
			//for some reason it sometimes console doesn't print immediately, avoid pressing enter multiple times, instead try pressing on another classes tab
			input = TextIO.getInt();
			switch(input) {
				case 2:
					game.play2();
					break;
				case 3:
					game.play3();
					break;
				case 4:
					game.play4();
					break;
				default:
					System.out.println("Inavlid number of players");
					break;
			}
			System.out.println(" Do you wanna play again? anything for yes, 0 for no");
			input = TextIO.getInt();
			if(input == 0) {
				play = false;
				System.out.println("You chose to stop playing, no worries if you still want to play, just run the program again");
			}
		}
	}
}
