import java.io.*;
public class OctalToDecimal {

	public static void main(String[] args)throws Exception {
		/*int no=010;
		System.out.println(no);*/
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number : ");
        int no=Integer.parseInt(reader.readLine(),8);
        System.out.println(no);
	}

}
