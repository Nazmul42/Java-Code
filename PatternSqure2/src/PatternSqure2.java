import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PatternSqure2 {

	public static void main(String[] args)throws Exception {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Size : ");
        int size=Integer.parseInt(reader.readLine());
        
        for(int i=1; i<=size; i++){
        	for(int j=1; j<=size; j++){
        		if(i==1 || i==size || j==1 || j==size)
        			System.out.print("*");
        		else
        			System.out.print(" ");

        	}
        	System.out.println();
        }
	}

}
