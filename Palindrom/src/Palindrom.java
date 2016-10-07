import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Palindrom {

	public static void main(String[] args)throws Exception {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number : ");
        int no=Integer.parseInt(reader.readLine());
        
        StringBuffer b=new StringBuffer(no+"");
        b.reverse();
        String x=b.toString();
        int rev=Integer.parseInt(x);
        
        if(no==rev){
        	System.out.println("Palindrome");
        }
        else{
        	System.out.println("Not Palindrome");
        }

	}

}
