/*
PSEUDOCODE FOR HOURGLASS
1.Draw a solid line
	make a method drawLine and have a for loop to print " 10 times
	this can be used for the top and bottom of the hour glass
2.Draw top half
	have nested for loops 
		one for loop to create the spaces
		the other for loop to draw the hour glass 
			one to create the spaces
			the other to draw the :
3.Draw bottom half
	the same as top half but in reverse
4.Draw solid line
	use the previous drawLine for loop


*/

	
public class Hourglass {
	//class constant
	public static final int SIZE = 4;
	
	//calls methods necessary to print the hour glass
	public static void main(String[] args) {
		drawLine();
		topHalf();
		middle();
		bottomHalf();
		drawLine();
	}
	
	//prints the line seen on the top and bottom of the hour glass
	public static void drawLine() {
		System.out.print("|");
		//prints the " 10 times
		for (int i = 1; i <= (2 * SIZE); i++) {
			System.out.print("\"");
		}
		System.out.println("|");
	}
	
	//prints the top half of hour glass
	public static void topHalf() {
		//prints the spaces to move \ in the correct positions
		for (int line = 1; line <= SIZE; line++) {
			for (int i = 1; i <= line; i++) {
				System.out.print(" ");
			}
			System.out.print("\\");
			//prints the : in descending order from 8 to 2
			int semi = 2 * SIZE - 2 * line;
			for (int j = 1; j <= semi; j++) {
				System.out.print(":");
			}
			System.out.print("/");
			System.out.println();
			
		}
	}
	
	//prints the bottom half of the hour glass, reverse of top half
	public static void bottomHalf() {
		//prints the spaces needed
		for (int line = 1; line <= SIZE; line++) {
			for (int i = 1; i <= (SIZE - line); i++) {
				System.out.print(" ");
			}
			System.out.print("/");
			//prints : in ascending order from 2 to 8
			for (int i = 1; i<= 2 * (line - 1); i++) {
				System.out.print(":");
			}
			System.out.print("\\");
			System.out.println();
		}
	}
	
	//prints the middle divider
	public static void middle() {
		System.out.println("     ||");
	}
}
