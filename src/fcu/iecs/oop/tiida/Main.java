package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		NissanTiida drawSquare = new NissanTiida();
		Scanner keyboard = new Scanner(System.in);
		int times;
		
		System.out.print("Please enter a number: ");
		times = keyboard.nextInt();
		System.out.println();
		for(int i=0; i<times; i++){
			drawSquare.setTimes(i+1);
			System.out.printf("²Ä%1d¦¸©I¥stiida()\n", i+1);
			drawSquare.tiida();
			System.out.println();
		}
		keyboard.close();
	}

}