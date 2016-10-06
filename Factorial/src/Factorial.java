import java.io.*;
public class Factorial {

	public static void main(String[] args)throws Exception {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number : ");
        
        int no=Integer.parseInt(reader.readLine());
        int prod=1;
        for(int i=1; i<=no; i++){
        	prod=prod*i;
        	
        }
        System.out.println(prod);
	}

}
