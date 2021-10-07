/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angel
 */
import java.util.Scanner;

public class EX_17 {
    
public static void main(String[] args) {
		var input = new Scanner(System.in);
		int computer = (int)(Math.random() * 3);
		System.out.print("scissor (1), rock (2), paper (3): ");
		int user = input.nextInt();
		System.out.print("The computer chose ");
		switch (computer)
	{
		case 1: System.out.print("scissor."); break;
		case 2: System.out.print("rock."); break;
		case 3: System.out.print("paper.");
	}

		System.out.print(" Your choice ");
		switch (user)
	{
		case 1: System.out.print("scissor"); break;
		case 2: System.out.print("rock"); break;
		case 3: System.out.print("paper ");
	}

		if (computer == user)
			System.out.println(" too. It is a draw");
		else
	{
		boolean win = (user == 0 && computer == 2) ||
							  (user == 1 && computer == 0) || 
							  (user == 2 && computer == 1);
		if (win)
			System.out.println(". You won");
		else
			System.out.println(". You lose");
	}
	}
}
