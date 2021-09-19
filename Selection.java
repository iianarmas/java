
public class Selection
{
	
	// switch
  // switch can be done in int, char, and string(only in javac 1.7 ++)
	public static void main(String[] args)
	{
		int n = 1;
		
    
    // if n == 1 print "One", if n == 2 print "Two" and so on...
    
		switch (n)
		{
		case 1:
			System.out.println("One");
			break;			// this will stop the rest of the cases from executing
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		default:
			System.out.println("No match");   // for values not in the case
		}
		
	}
}
