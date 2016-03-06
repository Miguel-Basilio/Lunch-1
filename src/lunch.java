//import Scanner
import java.util.Scanner;

public class lunch {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner (System.in);
		// creating the questions for the user
		System.out.println("Welcome");
		
		System.out.println("Are You Hungry? 1.yes 2.no");
		int choice = in.nextInt();
		int answer = 0;
		switch(choice){
		case 1:
			answer = 1;
			System.out.println("Get in Line and Buy Lunch");
		case 2:
			if (answer == 1)
				break; 
			answer = 2;
			System.out.println("");
			break;
		}
		 int case2;
			System.out.println("Are you thirsty? 1.yes 2.no");
			case2 = in.nextInt();
			int answer1 = 0;
		switch (case2){
		case 1:
			answer1 = 1;
			System.out.println("Buy a Coke");
			
		case 2:
			if (answer1 == 1)
				break; 
			answer1 = 2;
			System.out.println("Get Water");
		}
		int case3;
		System.out.println("Are you done? \n 1.yes 2.no");
		case3=in.nextInt();
		
		int answer2 = 0;
		switch (case3){
		case 1:
			answer2 = 1;
			System.out.println("Return Tray and Leave");
			break;
			
		case 2:
			if (answer2== 1)
				break;
			answer = 2;
			System.out.println("Eat Lunch");
			
		
			
		
			
		
	}
		
		
		
				

	}

}
