import java.io.*;

public class BinaryToDecimal {

	public static void main(String[] args)throws Exception {
		/*int no=0b1110;
		System.out.println(no);*/
		
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number : ");
        int no=Integer.parseInt(reader.readLine(),2);
        System.out.println(no);

	}

}
