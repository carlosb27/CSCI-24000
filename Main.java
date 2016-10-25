package TTTProject;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		if(game.isVisible() == false){    // sets the visual game
			game.setVisible(true);
		} 
	}
	public static  Scanner scan = new Scanner(System.in); //prints out winner
	public static  TicTacToeGUI game = new TicTacToeGUI(); //new gui game
	public static  boolean nextTurn = true;        //boolean for next turn
	public static  boolean firstPlayer = false;    //boolean for first player      
	public static  boolean secondPlayer = false;   //boolean for second player        
	
	public static void winCalculations(){  //checks win calculations for X
		//checks the X's for a left vertical win
		if(game.button1.getText().equals("X") && game.button4.getText().equals("X") && game.button7.getText().equals("X")){ 
			firstPlayer =true;secondPlayer = false;                       
			System.out.println("Player 1 Wins!");
		} 
			//checks the X's for a middle vertical win
			if(game.button2.getText().equals("X") && game.button5.getText().equals("X") && game.button8.getText().equals("X")){  
					firstPlayer =true;secondPlayer = false;                       
					System.out.println("Player 1 Wins!");
			}
		 	//checks the X's for a right vertical win
		 	if(game.button3.getText().equals("X") && game.button6.getText().equals("X") && game.button9.getText().equals("X")){ 
				firstPlayer =true;secondPlayer = false;                       
				System.out.println("Player 1 Wins!");
		}
		 	//checks the X's for a top horizontal win
		 	if(game.button1.getText().equals("X") && game.button2.getText().equals("X") && game.button3.getText().equals("X")){ 
				firstPlayer =true;secondPlayer = false;                       
				System.out.println("Player 1 Wins!");
		}
		 	//checks the X's for a middle horizontal win
		 	if(game.button4.getText().equals("X") && game.button5.getText().equals("X") && game.button6.getText().equals("X")){ 
				firstPlayer =true;secondPlayer = false;                       
				System.out.println("Player 1 Wins!");
		}
		 	//checks the X's for a bottom horizontal win
		 	if(game.button7.getText().equals("X") && game.button8.getText().equals("X") && game.button9.getText().equals("X")){ 
				firstPlayer =true;secondPlayer = false;                       
				System.out.println("Player 1 Wins!");
		}
		 	//checks the X's for a left diagonal win
		 	if(game.button1.getText().equals("X") && game.button5.getText().equals("X") && game.button9.getText().equals("X")){ 
				firstPlayer =true;secondPlayer = false;                       
				System.out.println("Player 1 Wins!");
		}
		 	//checks the X's for a right diagonal win
		 	if(game.button3.getText().equals("X") && game.button5.getText().equals("X") && game.button7.getText().equals("X")){ 
				firstPlayer =true;secondPlayer = false;                       
				System.out.println("Player 1 Wins!");
		}
			 
//Starts checking for O wins
		 	//checks the O's for a left vertical win
		 	if(game.button1.getText().equals("O") && game.button4.getText().equals("O") && game.button7.getText().equals("O")){ 
				firstPlayer =false;secondPlayer = true;                       
				System.out.println("Player 2 Wins!");
		}
			 //checks the O's for a middle vertical win
		 	if(game.button2.getText().equals("O") && game.button5.getText().equals("O") && game.button8.getText().equals("O")){ 
				firstPlayer =false;secondPlayer = true;                       
				System.out.println("Player 2 Wins!");
		}
			//checks the O's for a right vertical win
		 	if(game.button3.getText().equals("O") && game.button6.getText().equals("O") && game.button9.getText().equals("O")){ 
				firstPlayer =false;secondPlayer = true;                       
				System.out.println("Player 2 Wins!");
		}
			//checks the O's for a top horizontal win
		 	if(game.button1.getText().equals("O") && game.button2.getText().equals("O") && game.button3.getText().equals("O")){ 
				firstPlayer =false;secondPlayer = true;                       
				System.out.println("Player 2 Wins!");
		}
			//checks the O's for a middle horizontal win
		 	if(game.button4.getText().equals("O") && game.button5.getText().equals("O") && game.button6.getText().equals("O")){ 
				firstPlayer =false;secondPlayer = true;                       
				System.out.println("Player 2 Wins!");
		}
			//checks the O's for a bottom horizontal win
		 	if(game.button7.getText().equals("O") && game.button8.getText().equals("O") && game.button9.getText().equals("O")){ 
				firstPlayer =false;secondPlayer = true;                       
				System.out.println("Player 2 Wins!");
		}
			//checks the O's for a left diagonal win
		 	if(game.button1.getText().equals("O") && game.button5.getText().equals("O") && game.button9.getText().equals("O")){ 
				firstPlayer =false;secondPlayer = true;                       
				System.out.println("Player 2 Wins!");
		}
			//checks the O's for a right horizontal win
		 	if(game.button3.getText().equals("O") && game.button5.getText().equals("O") && game.button7.getText().equals("O")){ 
				firstPlayer =false;secondPlayer = true;                       
				System.out.println("Player 2 Wins!");
		}	
	}
}
