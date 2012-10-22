import java.util.Scanner;


public class main 
{
	public static void main (String args)
	{
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Vyvedete chislo" );
		int  a = input.nextInt();
		
		switch(a)
		{			
		case 0 : System.out.println( "nula" ) ; break ;
		case 1 : System.out.println( "edno" ) ; break ;
		case 2 : System.out.println( "dve" ) ; break ;
		case 3 : System.out.println( "tri" ) ; break ;
		case 4 : System.out.println( "chetiri" ) ; break ;
		case 5 : System.out.println( "pet" ) ; break ;
		case 6 : System.out.println( "shest" ) ; break ;
		case 7 : System.out.println( "sedem" ) ; break ;
		case 8 : System.out.println( "osem" ) ; break ;
		case 9 : System.out.println( "devet" ) ; break ;
		default : System.out.println( "nevalidno" ); break ;
		}	
		
	
}
}
