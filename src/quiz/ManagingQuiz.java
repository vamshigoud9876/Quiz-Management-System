//adding necessary imports
import java.sql.SQLException;
import java.util.Scanner;
/*This Project is done by Vamshi
 * This project is based upon conducting a quiz and managing it.
 * OK then let us check the code.....
 */
public class ManagingQuiz extends StartQuiz{
	
	public static void main(String[] args) throws SQLException,Exception{
		ManagingQuiz conn=new ManagingQuiz();
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Select an option : ");
		System.out.println("1.Play Quiz \t2.Quit");
		int ch=sc.nextInt();
		//we shall call a function to take details
		conn.takeDetails(ch);
	}
	public void takeDetails(int ch) throws Exception {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		//we shall move furthur using a switch case
		switch(ch) {
		case 1:
			System.out.println("Enter your name : ");
		String name=sc.next();
			verify(name);
			break;
		case 2: System.exit(0);
		}
	}
	public void verify(String name) throws Exception{
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			
			
				System.out.println("Hello "+name+", welcome to the Quiz");
						System.out.println("Enter your choice : \n1.Start the quiz\t2.Quit");
						int c=sc.nextInt(); 
						switch(c) {
						//here we are using another method called startQ present in StartQuiz class in order to give questions
						case 1:startQ(name);
							break;
						case 2:System.exit(0);
			
	}
}
}