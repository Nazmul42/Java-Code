import java.io.*;

public class DivisiblityTest {

	public static void main(String[] args)throws Exception {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n1,n2;
		System.out.println("Enter Number 1: ");
		n1=Integer.parseInt(reader.readLine());
		
		System.out.println("Enter Number 2: ");
		n2=Integer.parseInt(reader.readLine());
		
		if(n1%n2==0){
			System.out.println(n1+ " is multiple of "+n2);
			
		}
		else
		{
			System.out.println(n1+ " is not multiple of "+n2);
		}
	}
	

}
