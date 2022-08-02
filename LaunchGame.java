package game.guess;

import java.util.Scanner;

class Guesser{
	int guessNum;
	public int guessNumber() {
		Scanner s=new Scanner(System.in);
		System.out.println("Guesser kindly guess the number : ");
		guessNum=s.nextInt();
		return guessNum;
	}
}

class Player{
	int guessNum;
	public int guessNumb() {
		Scanner s=new Scanner(System.in);
		System.out.println("Player kindly guess the number in the range of 1 to 30 : ");
		guessNum=s.nextInt();
		if(guessNum<=0 || guessNum>30) {
			System.out.println("Invalid Number!! Re-try");
			guessNumb();
		}
		return guessNum;
	}
}

class Umpire{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	public void collectNumFromGuesser(){
		Guesser g=new Guesser();
		numFromGuesser=g.guessNumber();
	}
	public void collectNumFromPlayer() {
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numFromPlayer1=p1.guessNumb();
		numFromPlayer2=p2.guessNumb();
		numFromPlayer3=p3.guessNumb();
	}
	public void compare() {
		if(numFromGuesser==numFromPlayer1) {
			if(numFromGuesser==numFromPlayer1 && numFromGuesser==numFromPlayer2 &&
					numFromGuesser==numFromPlayer3) {
				System.out.println("Game Tied!!");
			}
			else if(numFromGuesser==numFromPlayer1 && numFromGuesser==numFromPlayer2) {
				System.out.println("Player 1 and Player 2 are in finals!!");
				Player p1=new Player();
				int n=p1.guessNumb();
				Player p2=new Player();
				int n1=p2.guessNumb();
				if(numFromGuesser==n && numFromGuesser==n1) {
					System.out.println("Let's have penalty shoot out for Player 1 and Player 2..."); 
					Guesser guess=new Guesser();
					int guesser=guess.guessNumber();
					Player play=new Player();
					Player play1=new Player();
					int player=play.guessNumb();
					int player1=play1.guessNumb();
					if(guesser==player && guesser==player1) {
						System.out.println("Sorry!! Maximum number of limits attended.. Retry again!!");
					}
					else if(guesser==player) {
						System.out.println("Player 1 win the game!!");
					}
					else if(guesser==player1) {
						System.out.println("Player 2 win the game!!");
					}
					else {
						System.out.println("Thanks for participating!!");
					}
				}
				else if(numFromGuesser==n) {
					System.out.println("Player 1 win the game!!");
				}
				else if(numFromGuesser==n1){
					System.out.println("Player 2 win the game!!");
				}
				else {
					System.out.println("Well Tried!!");
				}
			}
			else if(numFromGuesser==numFromPlayer1 && numFromGuesser==numFromPlayer3) {
				System.out.println("Player 1 and Player 3 are in finals!!");
				Player p1=new Player();
				int n=p1.guessNumb();
				Player p2=new Player();
				int n1=p2.guessNumb();
				if(numFromGuesser==n && numFromGuesser==n1) {
					System.out.println("Let's have penalty shoot out for Player 1 and Player 3..."); 
					Guesser guess=new Guesser();
					int guesser=guess.guessNumber();
					Player play=new Player();
					Player play1=new Player();
					int player=play.guessNumb();
					int player1=play1.guessNumb();
					if(guesser==player && guesser==player1) {
						System.out.println("Sorry!! Maximum number of limits attended.. Retry again!!");
					}
					else if(guesser==player) {
						System.out.println("Player 1 win the game!!");
					}
					else if(guesser==player1) {
						System.out.println("Player 3 win the game!!");
					}
					else {
						System.out.println("Thanks for participating!!");
					}
				}
				else if(numFromGuesser==n) {
					System.out.println("Player 1 win the game!!");
				}
				else if(numFromGuesser==n1){
					System.out.println("Player 2 win the game!!");
				}
				else {
					System.out.println("Well Tried!!");
				}
			}
			else {
				System.out.println("Player 1 win the game!!");
			}
		}
		else if(numFromGuesser==numFromPlayer2) {
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3) {
				System.out.println("Player 2 and Player 3 are in finals!!");
				Player p1=new Player();
				int n=p1.guessNumb();
				Player p2=new Player();
				int n1=p2.guessNumb();
				if(numFromGuesser==n && numFromGuesser==n1) {
					System.out.println("Let's have penalty shoot out..."); 
					Guesser guess=new Guesser();
					int guesser=guess.guessNumber();
					Player play=new Player();
					Player play1=new Player();
					int player=play.guessNumb();
					int player1=play1.guessNumb();
					if(guesser==player && guesser==player1) {
						System.out.println("Sorry!! Maximum number of limits attended.. Retry again!!");
					}
					else if(guesser==player) {
						System.out.println("Player 2 win the game!!");
					}
					else if(guesser==player1) {
						System.out.println("Player 3 win the game!!");
					}
					else {
						System.out.println("Thanks for participating!!");
					}
				}
				else if(numFromGuesser==n) {
					System.out.println("Player 2 win the game!!");
				}
				else if(numFromGuesser==n1){
					System.out.println("Player 3 win the game!!");
				}
				else {
					System.out.println("Well Tried!!");
				}
			}
			else {
				System.out.println("Player 2 win the game!!");
			}
		}
		else if(numFromGuesser==numFromPlayer3) {
				System.out.println("Player 3 win the game!!");
		}
		else {
			System.out.println("Game Lost!! Try again...");
		}
	}
}

public class LaunchGame {

	public static void main(String [] args) {
		Umpire u=new Umpire();
		System.out.println("Welcome to the Guessing Game....");
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();
	}

}
