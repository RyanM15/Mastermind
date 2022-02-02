# Mastermind

From Wikipedia: Mastermind or Master Mind is a code-breaking game for two players. The modern game with pegs was invented in 1970 by Mordecai Meirowitz, an Israeli postmaster and telecommunications expert.[1][2] It resembles an earlier pencil and paper game called Bulls and Cows that may date back a century or more.

# Red, Yellow, Orange, Green, Blue, Purple, White
# Scoring Black, White

Mastermind.  (Main.java class if using Repl.it but ok)
*Make a game class
**gives rules at beginning (could be a method call printRules() )
**Scanner class - input user prompts, etc
***would make calls to methods to guess position
***return for this? int[#cPcL][#cPwL]
**Instructions - capture instructions (for text file and UI)\
**?PvP = play1 choses secret code (swap places at keyboard)
***play2 - takes turn guessing
**?PvC	= play1 - computer randomizes colors and location of pins				
***play2 - takes turn guessing
		
*Make a board Class
**Pins - Encoding colors - do we use ints or chars?
**[R, G, Y, O]   [R, B, Y, G]  [2][1]
**[R, G, Y, O]   [R, O, Y, G]  [2][2]   
**int - translate btwn colors
**chars - individual letter

|  | PROS| CONS |
|Ints|-simple to code | -translate back and forth |
|   |		     |-might be confusing to player|
|chars| -less confusion for player | -a bit more code to learn |	 

*Arrays - 1-2D array for player guesses
	**1-1D array for the secret code
	
	
# Descrpition
In this project I coded the game mastermind. In this game the computer randomly generates a code that the player must guess. The player has ten turns to guess the secret code. After each guess the player will receive a score telling them if the had any black or white pins. A black pin means they have a guess that is the correct letter and in the correct position. A white pin means that they have guessed a correct letter but it is not in the correct position. 

# Process
I began my process by creating a double array list to form the board. This was relatively easy, however, I did run into a bit of a challenge when I had to make the code pop up on every other line. I then moved on to making the secret code randomly generated by the computer. This did not present much of a challenge for me and did not take me too long. The most difficult part of this project for me was when I had to code the part where the computer checks the users guess against the secret code. This took me a while as I had to run through many iterations of the code. It took me a while because when I attempted to add the function to end the game if the player wins, it continously messed up the print out of the board. Eventually I was able to figure it out with a more simple code.

