import java.io.*;

public class Compare2Number {

	public static void main(String[] args)throws Exception {
		
		int a=0,b=0;
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number1: ");
		System.out.println("Enter Number2: ");
		a=Integer.parseInt(reader.readLine());
		b=Integer.parseInt(reader.readLine());
		
		if(a>b)
		{
			System.out.println("No 1 is Bigger No 2");
		}
		if(a<b){
			System.out.println("No 1 is Smaller No 2");
		}
		if(a==b){
			System.out.println("Both are same");
		}

	}
}
