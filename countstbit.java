import java.util.*; 
import java.io.*;
public class CountSetBit {
	public static int SetBits(int n) 
		{ 
			int count = 0; 
			while (n != 0) { 
				count++; 
				n &=(n-1); 
			} 
			return count; 
		} 
		public static int FlippedCount(int a, int b) 
		{ 
			return SetBits(a ^ b); 
		} 
		public static void main(String[] args) 
		{ 
			int a, b;
			Scanner s = new Sanner(System.in);
			System.out.print("Enter the two numbers : ");
			a = s.nextInt(); b = s.nextInt();
			System.out.print(FlippedCount(a, b)); 
		} 
}
