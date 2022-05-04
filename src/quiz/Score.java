import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Score {
	static int i;
	String userName;
	String password;
	String url;
	String driver;
	Connection con;
	Statement stmt;
	public void printScore(String name,int x,int y,int m,int n,int sum) throws SQLException, ClassNotFoundException{
		//Connecting to JDBC *please use your respective username and password*
		userName="root";
		password="Vampass123@";
		url="jdbc:mysql://localhost:3306/workingdb";
		driver="com.mysql.cj.jdbc.Driver";
		Class.forName(driver);
		con=DriverManager.getConnection(url,userName,password);
		stmt=con.createStatement();
		
		float k=(float)sum;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String selectQuery="select * from quizdetails";
		ResultSet rs=stmt.executeQuery(selectQuery);
		//inserting details into database by using statement query
		while(rs.next()) {
			i++;
		}
		rs.close();
		String insertQuery="insert into quizdetails values("+(i+1)+",'"+name+"',"+sum+")";
		stmt.executeUpdate(insertQuery);
		//printing the result
		System.out.println("The quiz is completed. ");
		System.out.println("Thank you "+name+" for participating in the quiz.\n");
		System.out.println("Your results are : ");
		System.out.println("\tTotal questions : 10");
		System.out.println("\tQuestions answered : "+x+"\n\tQuestions unanswered : "+y+"\n\tCorrect answers : "+m+"\n\tWrong answers : "+n);
		System.out.println("\tYour Score is :"+sum+"\n\tPercentage : "+k+"%");
		System.out.println("Select an option\n1.Check Leaderboard\t2.Quit");
		int c=sc.nextInt();
		switch(c) {
		case 1:String seleQuery="select * from quizdetails order by Score desc";
		ResultSet rt=stmt.executeQuery(seleQuery);
		int p=0;
		//this process is to show the leaderboard
		System.out.println("Rank\tName\tScore\n");
		while(rt.next() && p<=10) {
			System.out.print((p+1)+"\t");
			System.out.print(rt.getString(2)+"\t"+rt.getString(3));			
			System.out.print("\n");
			p++;
		}
		break;
		case 2:System.exit(0);
		}
		//this is the end of code
	}
}
