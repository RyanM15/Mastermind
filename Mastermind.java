/* Mastermind PvC
- 2d array list makes up bored
- secret does not get printed every time
- secret is 5 non repeat pins
- How many turns or tries?
- class: board, game, player
* */
import java.util.ArrayList;
import java.util.Scanner;
public class Mastermind{
	//public static void main (String[] args){
		
		ArrayList<ArrayList<Character>> board = new ArrayList<ArrayList<Character>>();
		
		public void firstBoard(){
			
		for(int i = 0; i<20; i++)
		{
			board.add(new ArrayList<Character>());
			
			for(int x = 0; x < 7; x++){
				if(i%2 == 0)
				{
					if(x==4)
					{
						board.get(i).add(' ');
					}
					else if (x<4)
					{
						board.get(i).add('?');
					}
					else if (x>4)
					{
						board.get(i).add('-');
					}
					
				}
				
				else
				{
					if(x==4)
					{
						board.get(i).add(' ');
					}
					else if (x<4)
					{
						board.get(i).add(' ');
					}
					else if (x>4)
					{
						board.get(i).add('-');
					}
				}
									
					
				
				
			}
		}
	}
		
		public void printBoard(){ //prints out the board 
		
		
		
		
		
		//System.out.println("NOTE: The position of the score pins does not correlate in any way to the position of the board pins");
		System.out.print("BOARD");
		System.out.println("		SCORE");
		int counter = 0;
		System.out.println("---------------------");
		for(int i = 0; i<board.size(); i++)
		{
			if(counter ==2){
				System.out.println("---------------------");
				counter = -1;
				i--;
			}
			else
			{
				System.out.println(board.get(i));
				
			}
				counter++;
			
		}
	}
	
	/*
	public void guess(){
		System.out.print("\033[H\033[2J");
		System.out.flush();
		System.out.println("");
		System.out.println("Guess:  ");
		
		
		
		
	}
	*/
	
	//public void board(){ //populating random computer generated secret code
		
	//}
	
	public void playerGuess(){
		int counter = 0;
		ArrayList<Character> pins = new ArrayList<Character>();
		ArrayList<Character> selected = new ArrayList<Character>();
		pins.add('R');
		pins.add('Y');
		pins.add('O');
		pins.add('G');
		pins.add('B');
		pins.add('P');  //x
		pins.add('W');
		
		
		int randomm = (int)(Math.random()*pins.size()-1); 	//creates random 
		int temp = (int)(Math.random()*1000); 				
		
		for(int j = 0; j<4; j++)
		{
			
			selected.add(pins.get(randomm)); //add the random from pins to new selecrted array list
			pins.remove(randomm); //removes the random from the pins list so no repeats
			//System.out.println(j);
		}
		//System.out.print(selected);
		
			
		
		
		
		
		
		//ArrayList<Character> guess = new ArrayList<Character>();
		//while (counter == 0)
		//{
		while(counter == 0)
		{
		for(int i = 0; i < 20; i++)
		{
			
				System.out.println("Type your guess of four letters: R,O,W,Y,G,P,B in all caps");
				Scanner scan = new Scanner (System.in);
				String guess = scan.nextLine();
		
		
				board.get(i).set(0, guess.charAt(0));
				board.get(i).set(1, guess.charAt(1));
				board.get(i).set(2, guess.charAt(2));
				board.get(i).set(3, guess.charAt(3));
			
			
				//loop through compare guess and secret
				//  R G B O   GUESS
				//  G O Y B   SECRET
				int whitePin = 0;
				int blackPin = 0;
				board.get((i*2)/2).set(5, 'B');
				board.get((i*2)/2).set(6, 'W');
				//while(blackPin!=4)
				//while(counter != 1)
			//{
				for(int j = 0; j < 4; j++)
				{
				
					for (int k=0;k<4;k++)
					{
						if (guess.charAt(j) == selected.get(k) ) 
						{
						
							if (j==k)
							{
								blackPin++;
								board.get(i+1).set(5, (char)(blackPin+48));
							}
							else if(blackPin == 4)
							{
								counter = 1;
							}
							
							
							else 
							{
								whitePin++;
								board.get(i+1).set(6, (char)(whitePin+48));
							}
						}
						
					}
					
				}
			//System.out.println("Congrats you won!!!");
						
						
						
				/*		
				if(guess.charAt(j) == selected.get(0))
				{
					if (j==0)
					{
						board.get(j).set(5, 'B');
					}	
					else
					{
						board.get(j).set(5, 'W');
					}
				}
				else if(guess.charAt(j) == selected.get(1))
				{
					if (j==1)
					{
						board.get(j).set(6, 'B');
					}	
					else
					{
						board.get(j).set(6, 'W');
					}
					
				}
				else if(guess.charAt(j) == selected.get(2))
				{
					if(j==2)
					{
						board.get(j+1).set(5, 'B');
					}
					else 
					{
						board.get(j+1).set(5, 'W');
					}
				}
				
				else if(guess.charAt(j) == selected.get(3))
				{
					if(j==3)
					{
						board.get(j+1).set(6, 'B');
					}
					else 
					{
						board.get(j+1).set(6, 'W');
					}
				}
				j++;
				*/
			//}
		
			
			
			
			
			printBoard();
			i++;
			
		}
		System.out.println("Sorry you lost.");
	}
	
		System.out.println("Congrats you won!!1");
	
			
	
			
		
		
		
		
		
		
	}
		
		
}
	
	
	
	
	
	
	
	




