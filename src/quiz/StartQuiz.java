import java.util.Scanner;

public class StartQuiz extends Score{
	static int sum,ch,x,y,m,n;
	//this function is called from the ManagingQuiz class
	public void startQ(String name) throws Exception {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String z;
		
		System.out.println("\tLet's Start:\n");
		
		System.out.println("Question 1:\nimport static java.lang.System.out;\r\n"
				+ "class Test\r\n"
				+ "{static public void main(String ...args)\r\n"
				+ "{\r\n"
				+ "      out.printf(\"Guess me!!\");\r\n"
				+ "}\r\n"
				+ "}\r\n"
				+ "Guess the output of the given snippet.");
		System.out.println("a.Compile time error\r\n"
				+ "b.Runtime exception\r\n"
				+ "c.No Output\r\n"
				+ "d.Guess me!!");
		System.out.println("\n1.Answer\t2.Skip");
		ch=sc.nextInt();
		switch(ch) {
		case 1: z= sc.next();
			x++;
			if(z.equals("d")) {
				m++;
				sum=sum+10;
			}
			else if(z.equals("b") || z.equals("c") || z.equals("a")) {
				n++;
				if(sum==0)
					sum=0;
				else
					sum--;
			}
			break;
		case 2:y++; 
			break;
		}
		System.out.println("\n\n");
		
		System.out.println("Question 2:\nimport java.util.Scanner;\r\n"
				+ "package com.cmritonline;\r\n"
				+ "public class Test\r\n"
				+ "{\r\n"
				+ "public static int main(String[] args)\r\n"
				+ "{\r\n"
				+ "System.out.println(\"correct me if iam wrong!!\");\r\n"
				+ "}\r\n"
				+ "}\r\n"
				+ "Guess the output of the given snippet.");
		System.out.println("\na.Compile time error\r\n"
				+ "b.Runtime exception\r\n"
				+ "c.No Output\r\n"
				+ "d.correct me if iam wrong!!");
		System.out.println("\n1.Answer\t2.Skip");
		ch=sc.nextInt();
		switch(ch) {
		case 1: z= sc.next();
			x++;
			if(z.equals("a")) {
				m++;
				sum=sum+10;
			}
			else if(z.equals("b") || z.equals("c") || z.equals("d")) {
				n++;
				if(sum==0)
					sum=0;
				else
					sum--;
			}
			break;
		case 2:y++; 
			break;
		}
		System.out.println("\n\n");
		
		System.out.println("Question 3:\nCan we have the implementation for a method in interface?");
		System.out.println("\na.No, since interfaces contain only abstract methods.\r\n"
				+ "b.Yes, but from version 8 and adding default modifier.\r\n"
				+ "c.No, compile time error.\r\n"
				+ "d.Yes, but exception");
		System.out.println("\n1.Answer\t2.Skip");
		ch=sc.nextInt();
		switch(ch) {
		case 1: z= sc.next();
			x++;
			if(z.equals("b")) {
				m++;
				sum=sum+10;
			}
			else if(z.equals("a") || z.equals("c") || z.equals("d")) {
				n++;
				if(sum==0)
					sum=0;
				else
					sum--;
			}
			break;
		case 2:y++; 
			break;
		}
		System.out.println("\n\n");
		
		System.out.println("Question 4:\nclass Test1\r\n"
				+ "{ int a=10;\r\n"
				+ "}\r\n"
				+ "class Test2 extends Test1\r\n"
				+ "{private int b=20;\r\n"
				+ "}\r\n"
				+ "Is Test2 tightly encapsulated?");
		System.out.println("\na.Can't say since no methods.\r\n"
				+ "b.Yes, since all variables are private.\r\n"
				+ "c.No, since it extends Test1.\r\n"
				+ "d.Yes, since no methods.");
		System.out.println("\n1.Answer\t2.Skip");
		ch=sc.nextInt();
		switch(ch) {
		case 1: z= sc.next();
			x++;
			if(z.equals("c")) {
				m++;
				sum=sum+10;
			}
			else if(z.equals("b")|| z.equals("a") || z.equals("d")) {
				n++;
				if(sum==0)
					sum=0;
				else
					sum--;
			}
			break;
		case 2:y++; 
			break;
		}
		System.out.println("\n\n");
		
		System.out.println("Question 5:\npublic class Test extends Object\r\n"
				+ "{\r\n"
				+ "     Test()\r\n"
				+ "     {\r\n"
				+ "        this(10);\r\n"
				+ "        super();\r\n"
				+ "      }\r\n"
				+ "    Test(int a)\r\n"
				+ "     {\r\n"
				+ "	//code\r\n"
				+ "     }\r\n"
				+ "}\r\n"
				+ "Guess the output of the given snippet.");
		System.out.println("\na.Compile time error.\r\n"
				+ "b.Runtime Exception.\r\n"
				+ "c.runs fine.\r\n"
				+ "d.none.");
		System.out.println("\n1.Answer\t2.Skip");
		ch=sc.nextInt();
		switch(ch) {
		case 1: z= sc.next();
			x++;
			if(z.equals("a")) {
				m++;
				sum=sum+10;
			}
			else if(z.equals("b") || z.equals("c") || z.equals("d")) {
				n++;
				if(sum==0)
					sum=0;
				else
					sum--;
			}
			break;
		case 2:y++; 
			break;
		}
		System.out.println("\n\n");
		
		System.out.println("Question 6:\npublic class Test\r\n"
				+ "{public static void main(String []args)\r\n"
				+ "{\r\n"
				+ "     try\r\n"
				+ "     {\r\n"
				+ "        int a=2/3;\r\n"
				+ "     }\r\n"
				+ "     catch(java.io.IOException e)\r\n"
				+ "     {\r\n"
				+ "        System.out.println(e.toString());\r\n"
				+ "     }\r\n"
				+ "}\r\n"
				+ "}\r\n"
				+ "Guess the output of the given snippet.");
		System.out.println("\na.Runtime exception.\r\n"
				+ "b.Compile time error: exception IOException must be catch or declared to be thrown.\r\n"
				+ "c.runs fine.\r\n"
				+ "d.Compile time error: exception IOException is never thrown from the try statement.");
		System.out.println("\n1.Answer\t2.Skip");
		ch=sc.nextInt();
		switch(ch) {
		case 1: z= sc.next();
			x++;
			if(z.equals("d")) {
				m++;
				sum=sum+10;
			}
			else if(z.equals("b") || z.equals("c") || z.equals("a")) {
				n++;
				if(sum==0)
					sum=0;
				else
					sum--;
			}
			break;
		case 2:y++; 
			break;
		}
		System.out.println("\n\n");
		
		System.out.println("Question 7:\npublic class Test extends Thread\r\n"
				+ "{public static void main(String []args)\r\n"
				+ "{Test t1=new Test();\r\n"
				+ "    t1.start();\r\n"
				+ "    t1.start();\r\n"
				+ "}}\r\n"
				+ "Guess the output of the given snippet.");
		System.out.println("\na.runs fine.\r\n"
				+ "b.IllegalThreadStateException at runtime.\r\n"
				+ "c.Compile time error cannot call twice.\r\n"
				+ "d.Recursive call.");
		System.out.println("\n1.Answer\t2.Skip");
		ch=sc.nextInt();
		switch(ch) {
		case 1: z= sc.next();
			x++;
			if(z.equals("b")) {
				m++;
				sum=sum+10;
			}
			else if(z.equals("a") || z.equals("c") || z.equals("d")) {
				n++;
				if(sum==0)
					sum=0;
				else
					sum--;
			}
			break;
		case 2:y++; 
			break;
		}
		System.out.println("\n\n");
		
		System.out.println("Question 8:\ninterface Test{}\r\n"
				+ "public class Test1 implements Test\r\n"
				+ "{\r\n"
				+ "   public static void main(String[] args)\r\n"
				+ "   {\r\n"
				+ "       Test t1=new Test1();\r\n"
				+ "   }\r\n"
				+ "}\r\n"
				+ "Guess the output of the given snippet.");
		System.out.println("\na.Compile time error interfaces cannot be instantiated.\r\n"
				+ "b.Runtime error.\r\n"
				+ "c.undefined behavior\r\n"
				+ "d.runs fine.");
		System.out.println("\n1.Answer\t2.Skip");
		ch=sc.nextInt();
		switch(ch) {
		case 1: z= sc.next();
			x++;
			if(z.equals("d")) {
				m++;
				sum=sum+10;
			}
			else if(z.equals("b") || z.equals("c") || z.equals("a")) {
				n++;
				if(sum==0)
					sum=0;
				else
					sum--;
			}
			break;
		case 2:y++; 
			break;
		}
		System.out.println("\n\n");
		
		System.out.println("Question 9:\nclass Test{}\r\n"
				+ "can we run a empty java class successfully without main method.");
		System.out.println("\na.No, compile time error \r\n"
				+ "b.Yes, runs fine.\r\n"
				+ "c.Yes, but only before 1.6 version of java.\r\n"
				+ "d.No, runtime error before 1.6 version of java.");
		System.out.println("\n1.Answer\t2.Skip");
		ch=sc.nextInt();
		switch(ch) {
		case 1: z= sc.next();
			x++;
			if(z.equals("d")) {
				m++;
				sum=sum+10;
			}
			else if(z.equals("b") || z.equals("c") || z.equals("a")) {
				n++;
				if(sum==0)
					sum=0;
				else
					sum--;
			}
			break;
		case 2:y++; 
			break;
		}
		System.out.println("\n\n");
		
		System.out.println("Question 10:\npublic class Test\r\n"
				+ "{public static void main(String[] args)\r\n"
				+ "{\r\n"
				+ "     String s=new String(\"vam\");\r\n"
				+ "     String s1=new String(\"vam\");\r\n"
				+ "     if(s==s1)\r\n"
				+ "           System.out.print(\"Equal\");\r\n"
				+ "     else\r\n"
				+ "           System.out.print(\"Not Equal\");\r\n"
				+ "}\r\n"
				+ "}\r\n"
				+ "Guess the output of the given snippet.");
		System.out.println("\na.Equal.\r\n"
				+ "b.Not Equal.\r\n"
				+ "c.Compile time error: reference can't be compared.\r\n"
				+ "d.No output.");
		System.out.println("\n1.Answer\t2.Skip");
		ch=sc.nextInt();
		switch(ch) {
		case 1: z= sc.next();
			x++;
			if(z.equals("b")) {
				m++;
				sum=sum+10;
			}
			else if(z.equals("a") || z.equals("c") || z.equals("d")) {
				n++;
				if(sum==0)
					sum=0;
				else
					sum--;
			}
			break;
		case 2:y++; 
			break;
		}
		System.out.println("\n\n");
		
		//now all the respective calculated details are sent to printScore method in order to show the result
		printScore(name,x,y,m,n,sum);
		
	}
}