import java.util.Scanner;
import java.util.InputMismatchException;


public class Lab8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String [][] studentTable = new String [10][4];
		studentTable[0] = new String [] {"Tom", "Speedwell", "London", "poke"};
		studentTable[1] = new String [] {"Sarah", "Thompson", "Chicago", "steak"};
		studentTable[2] = new String [] {"Maud", "Doop", "Lake Placid", "spaghetti"};
		studentTable[3] = new String [] {"James", "Ball", "Oregon City", "cake"};
		studentTable[4] = new String [] {"Marion", "Ferguson", "Winslow", "curry"};
		studentTable[5] = new String [] {"Kathy", "Blast", "Manistee", "macaroni and cheese"};
		studentTable[6] = new String [] {"Laura", "Olsson", "Marazion", "sweet corn"};
		studentTable[7] = new String [] {"Fransesca", "Huffman", "Cheshunt", "soup"};
		studentTable[8] = new String [] {"Tiegan", "Bates", "Eton", "rice"};
		studentTable[9] = new String [] {"Dafydd", "Creswell", "Henley-on-Thames", "lettuce"};
		
		System.out.println("Welcome to our Java class! Which student would you like to learn more about? (enter a number 1-10)");
		int stuID = -1;
		boolean validInt = false;
		while (!validInt) {
			try {
				int input = scan.nextInt();
				scan.nextLine();
				
				stuID = input - 1;
				System.out.println("Student " + input + " is " + studentTable[stuID][0] + " " + studentTable[stuID][1] + ". What would you like to know about " + studentTable[stuID][0] + "? (enter \"hometown\" or \"favorite food\")");
				validInt = true;
			} catch (InputMismatchException e) {
				scan.nextLine();
				System.out.println("That student does not exist. Please try again. (enter a number 1-10)");
				continue;
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("That student does not exist. Please try again. (enter a number 1-10)");
				continue;
			}
		}	
		
		boolean validString = false;
		while (!validString) {
			String infoRequest = scan.nextLine();
			try {
				if (infoRequest.equalsIgnoreCase("hometown")) {
					System.out.println(studentTable[stuID][0] + " is from " + studentTable[stuID][2] + ". Would you like to know more? (enter \"yes\" or \"no\")");
					validString = true;
				}
				else if (infoRequest.equalsIgnoreCase("favorite food")) {
					System.out.println(studentTable[stuID][0] + " likes to eat " + studentTable[stuID][3] + ". Would you like to know more? (enter \"yes\" or \"no\")");
					validString = true;
				}
				else {
					throw new IllegalArgumentException();
				}
			} catch (IllegalArgumentException e) {
				System.out.println("That data does not exist. Please try again.");
				continue;
			}
			
		}
	}
}
