package fcu.iecs.oop.password;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		PasswordEncorder encodeString = new PasswordEncorder();
		Scanner keyboard = new Scanner(System.in);
		String waitEncodeString = "";
		
		do{
			System.out.print("Please enter a password: ");
			waitEncodeString = keyboard.next();
			if(!waitEncodeString.equals("exit")){
				System.out.println(encodeString.encode(waitEncodeString));
			}
		}while(!waitEncodeString.equals("exit"));
		
		keyboard.close();
	}

}
