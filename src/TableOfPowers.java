import java.util.Scanner;

public class TableOfPowers {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Squares and Cubes Table");
		
		System.out.print("\nEnter and Integer:  ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		String choice= "Y";
		while(choice.equalsIgnoreCase("Y")) 
		{
			String table="Number  Squared  Cubed\n"
					+    "======  =======  =====\n";
			
			for (int i=1 ; i<=number ; i++)
			{
				int s=i*i;
				int c=i*i*i;
				String row = i+"       "+s+"        "+c+ "\n";
				table += row;
				
			}
			System.out.println(table);
			System.out.print("\nContinue? y/n:  ");
			choice = sc.next();
		}
		sc.close();
		System.out.println("Bye!");
	}

}
