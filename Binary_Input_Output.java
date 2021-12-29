/*Write a program to:

Generate 100 random integers
Create a file named assignment8.dat (using DataOutputStream ) if it does not exist.
Append new  data if it already exists
When complete:

Use DataInputStream to read the integers from the binary file previously created
Display all the numbers and a total*/

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Binary_Input_Output {
	public static void main(String[] args) throws IOException {
		
		//Output values to the file
		try(DataOutputStream output = new DataOutputStream(new FileOutputStream("assignment8.dat", true));) {
			
			for(int i = 0; i < 100; i++) {
				output.writeInt((int)(Math.random() * 100 + 1));
			}
		}
		
		//Read the values back
		try(DataInputStream input = new DataInputStream(new FileInputStream("assignment8.dat"));) {
			
			int[] values = new int[100];
			int total = 0;
			System.out.print("[");
			
			for(int i = 0; i < 100; i++) {
				values[i] = input.readInt();
				System.out.print(values[i] + " ");
				total += values[i];
			}
			
			System.out.println("]");
			System.out.println("---------------------------------------------");
			System.out.print("The total of these 100 random integers: " + total);
		}
		
		catch(IOException ex) {
			ex.printStackTrace();
		
		}
	}
}
