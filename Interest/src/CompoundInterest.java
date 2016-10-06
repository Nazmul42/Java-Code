import java.io.*;
public class CompoundInterest {

	public static void main(String[] args)throws Exception {
	double amount,rate,years,total;
	BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter amount");
	amount=Double.parseDouble(reader.readLine());
	System.out.println("Enter rate");
	rate=Double.parseDouble(reader.readLine());
	System.out.println("Enter years");
	years=Double.parseDouble(reader.readLine());
	
	total=amount*Math.pow(1+rate, years);
	System.out.println(total);
	}

}
