import java.io.*;
public class TimeConverted {

	public static void main(String[] args)throws Exception {
		
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter distancce km: ");
		double distance=Double.parseDouble(reader.readLine());
		System.out.println("Enter speed km/hr: ");
		double speed=Double.parseDouble(reader.readLine());
		
		distance=distance*1000;
		speed=speed*1000/3600;
		double time=distance/speed;
		System.out.println(time);
		int hours=(int)time/3600;
		System.out.println(hours + " hours");
		
		int minutes=(int)(time-hours*3600)/60;
		System.out.println(minutes + " minutes");
       
		int second=(int)(time-hours*3600-minutes*60);
		int seconds2=(int)time%60;
		System.out.println(second + " second");
		System.out.println(seconds2 + " seconds");


	}

}
