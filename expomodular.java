import java.io.*; 
import java.util.*;
public class ExpoModular {
	
	static int exponentMod(int A, 
						int B, int C) 
	{ 
		if (A == 0) 
			return 0; 
		if (B == 0) 
			return 1; 
		
		long y; 
		if (B % 2 == 0) 
		{ 
			y = exponentMod(A, B / 2, C); 
			y = (y * y) % C; 
		}
		else
		{ 
			y = A % C; 
			y = (y * exponentMod(A, B - 1, 
								C) % C) % C; 
		} 
		
		return (int)((y + C) % C); 
	}
	public static void main(String args[]) 
	{ 
		int A, B, C;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter three numbers : ");
		A = s.nextInt();
		B = s.nextInt();
		C = s.nextInt();
		System.out.println("Power is " + exponentMod(A, B, C)); 
	} 
	
}
