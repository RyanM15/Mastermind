import java.util.Scanner;
import java.util.ArrayList;
public class Tester{
	
	public static void main(String[] args){
		Mastermind m1 = new Mastermind();
		
		System.out.println("Welcome to Mastermind!!");
		System.out.println("Rules: There is a secret code made up of four letters that you must guess. You have ten turns to guess the code.");
		System.out.println("After you guess a score will appear on the right side of the board. If you have a letter correct you will get a white pin.");
		System.out.println("If you have a letter correct and in the correct position you will get a black pin. These will be represented by a 'B' and 'W'.");
		System.out.println("The number of these pins you have will appear under the 'B' and 'W'.");
		System.out.println("Have fun!!!");
		
		//System.out.println("Welcome to Mastermind!");
		//System.out.println("Welcome to Mastermind!");
		//Scanner scan = new Scanner (System.in);
		m1.firstBoard();
		//m1.board();
		m1.playerGuess();
		
		//m1.printBoard();
		
		
		
		
		
	}
	
	
	
}
		
	

