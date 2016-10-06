import java.io.*;

public class LeapYear {

	public static void main(String[] args)throws Exception {
	BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter  Year: ");
	int year=Integer.parseInt(reader.readLine());
	if(year%4==0){
		System.out.println("Leap year ");
	}
	else
	{
		System.out.println("Not a Leap year ");
	
	}

}
}
