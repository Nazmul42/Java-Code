import java.io.*;
public class IfExample {

	public static void main(String[] args)throws Exception {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		double hours=0,rate=0,pay=0;
		System.out.println("Enter hours workers: ");
		hours=Double.parseDouble(reader.readLine());
		
		System.out.println("Enter rate: ");
		rate=Double.parseDouble(reader.readLine());
		if(hours<=40){
			pay=rate*hours;
		}
		else{
			pay=rate*40+(hours-40)*(rate+0.5*rate);
		}
		
		System.out.println("pay is "+ pay);
	}

}
