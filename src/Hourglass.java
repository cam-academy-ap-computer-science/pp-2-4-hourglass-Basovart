/*
PSEUDOCODE FOR HOURGLASS
1.Draw a solid line
	make a method drawLine and have a for loop to print " 10 times
	this can be used for the top and bottom of the hour glass
2.Draw top half
	have nested for loops 
		one for loop to create the spaces
		the other for loop to draw the :, / and \
3.Draw bottom half
	the same as top half but in reverse
4.Draw solid line
	use the previous drawLine for loop


*/

	
public class Hourglass {
	
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
		for (int i = 1; i <= 10; i++) {
			System.out.print("\"");
		}
		System.out.println("|");
	}
	
	//prints the top half of hour glass
	public static void topHalf() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			System.out.print("\\");
			for (int j = 10-i*2; j>=1; j--) {
				System.out.print(":");
			}
			System.out.print("/");
			System.out.println();
			
		}
	}
	
	//prints the bottom half of the hour glass, reverse of top half
	public static void bottomHalf() {
		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j<= i; j++) {
				System.out.print(" ");
			}
			System.out.print("/");
			for (int j = 10-i*2; j>=1; j--) {
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
