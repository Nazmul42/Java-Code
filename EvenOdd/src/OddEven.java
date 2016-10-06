import java.io.*;

public class OddEven {

	public static void main(String[] args)throws Exception {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter a Number: ");
         int no=Integer.parseInt(reader.readLine());
         
         if(no%2==0){
        	 System.out.println("Even Number");
         }
         else
         {
        	 System.out.println("Odd Number");
         }
	}

}
