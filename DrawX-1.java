package assignment4;

import java.util.Scanner;

//Nicolas Salado
//nas17b

public class DrawX {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the height of the X: ");
		int height = input.nextInt();
		while(height % 2 ==0)
		{
			System.out.print("Error! The height should be an odd number. ");
			height = input.nextInt();
		}
		int num1 = height;
		
		for(int i =1; i <= num1; i ++)
		{
			for (int j =1; j <= num1 ; j ++)
			{
				if (j == i || j == num1-i+1)
					System.out.print("#");
				else
					System.out.print(" ");
			}
			System.out.println("");
		
		}
	}
}
