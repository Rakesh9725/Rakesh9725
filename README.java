import java.util.Scanner;
class Guesser
{
  int gnum;
  int guessingNum()
  {  
	  System.out.print("Guesser,kindly guess anumber!");
	  Scanner scan = new Scanner(System.in);
	  gnum =scan.nextInt();
	  return gnum;
			  
  }
  
}

class Player
{
	int pnum;
	int predictingNum()
	{
		System.out.print("Player,kindly predict a number!");
		Scanner scan = new Scanner(System.in);
		pnum = scan.nextInt();
		return pnum;
		
	}

}

class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	
	void collectingNumFromGuesser()
	{
		Guesser g = new Guesser();
		numFromGuesser=g.guessingNum();
	}
	void collectingNumFromPlayer()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		
		numFromPlayer1 = p1. predictingNum();
		numFromPlayer2 = p2. predictingNum();
		numFromPlayer3 = p3. predictingNum();
	}
	void comparing()
	{
		if (numFromPlayer1== numFromGuesser)
		{
			System.out.print("Player1 has won the game!");
		}
		else if (numFromPlayer2==numFromGuesser)
		{
			System.out.print("Player2 has won the game!");
		}
	   else if (numFromPlayer2==numFromGuesser)
	   {
		System.out.print ("Player3 has won the game!");
	}
	   else
	   {  
		   System.out.print ("Player3 has won the game!");  
	   }
}
  class GuesserGameApp
  {
	  public static void main(String[]args)
	  {
		  Umpire u= new Umpire();
		  u.collectingNumFromGuesser();
		  u.collectingNumFromPlayer();
		  u.comparing();
	  }
  }
}
  
	  
	
	    








