import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		System.out.println("enter a number!");
		int n=in.nextInt();
		for(int i=1;i<=n;++i)
		{
			
			for(int j=1;j<=i;++j)
			{
				System.out.print(j);
				
			}
			System.out.println();
		}
		
	}

}
