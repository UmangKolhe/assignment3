package com.assignment3;
import java.util.*;
//features added are 1.game can be restarted and 2. if player guess invalid number player has to guess again

class Guesser
{
	
	int guessNum;
	
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Guesser kindly guess the number beween 1 to 10");
		guessNum=scan.nextInt();
		
		return guessNum;
	}
	void m1(){
		return;
	}
}

class Player
{
	int guessNum;
	
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Player kindly guess the number between 1 to 10 ");
		int Num=scan.nextInt();
		if(Num <=0 || Num >10) {
			System.out.println(" you have given invalid number kindly try again numbers should be between 1 to 10  ");
			guessNum();
		}
		else {
			guessNum=Num;
		}
		return guessNum;
	}
}


class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum();
	}
	void collectNumFromPlayers()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numFromPlayer1=p1.guessNum();
		numFromPlayer2=p2.guessNum();
		numFromPlayer3=p3.guessNum();
	}
	void compare()
	{
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("All players won the game");
			}
			else if(numFromGuesser==numFromPlayer2 )
			{
				System.out.println("Player 1 & Player2 won");
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1 & Player3 won");
			}
			else
			{
			System.out.println("Player 1 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 2 & Player3 won");
			}
			else
			{
			System.out.println("Player 2 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player 3 won the game");
		}
		else
		{
			System.out.println("Game lost Try Again!");
		}
		
		
		
		
	}
	
}







public class Game {

	public static void main(String[] args) {
		String  str;
		do {
		Umpire u=new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayers();
		u.compare();
		System.out.println("do you want to play again ");
		System.out.println("type y to play again to exet typr n");
		Scanner sc = new Scanner(System.in);
		  str = sc.next();
		}
		while(str.equals("y"));
 
	}
	

}



