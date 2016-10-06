import java.io.*;

public class MetersConverted {

	public static void main(String[] args)throws Exception {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enetr distance in meters: ");
		double meters=Double.parseDouble(reader.readLine());
		
       //1 meter=39.3701 inches
		double inches=meters*39.3701;
		int miles=(int)inches/63360;
		System.out.println(miles+" miles");
		int feet=(int)(inches-miles*63360)/12;
		System.out.println(feet+" feet");
		
		int inch=(int)(inches-miles*63360-feet*12);
		int inch2=(int)(inches%12);
		System.out.println(inch+" inches");
		System.out.println(inch2+" inches");

	}

}
