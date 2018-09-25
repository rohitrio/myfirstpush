import java.util.Scanner;

public class Multiplication {
public static void main(String[] args)
{
	Scanner in=new Scanner(System.in);
	System.out.println("enter a number!");
	int num=in.nextInt();
	for(int i=0;i<=10;i++)
	{
	int num1=num*i;	
	System.out.println(num+" X" +(i+1)+" ="+num1);
}
}

}


