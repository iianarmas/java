
public class IfElse
{

	public static void main(String[] args)
	{
		int n = 0;
		
		if (n == 0)
		{            // curly brackets are added if there are more than 1 statements
			System.out.println("n is null");
			System.out.println("bye");
		}
		else if (n % 2 == 0)
			System.out.println("n is even");
		else
			System.out.println("n is odd");
		
	}
}
