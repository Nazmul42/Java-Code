import java.io.*;

public class HextoDecimal {

	public static void main(String[] args)throws Exception {
		/*int no=0xF;
		System.out.println(no);*/
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number : ");
        int no=Integer.parseInt(reader.readLine(),16);
        System.out.println(no);

	}

}
