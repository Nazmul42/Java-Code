/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.volume.of.sphere;
import java.awt.geom.Area;
import java.io.*;
/**
 *
 * @author Md. Nazmul
 */
public class AreaVolumeOfSphere {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception{
        /*System.out.println("Enter Radious:");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String input=br.readLine();
        double radious=Double.parseDouble(input);
        double pi=3.14;
        double SphereArea =pi*4*radious*radious; 

        System.out.println("Sphere is "+SphereArea); */
       //  Volume
                System.out.println("Enter Volume:");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String input=br.readLine();
        double radius=Double.parseDouble(input);
        double pi=3.14;
        double Volume =4/3*pi*radius*radius*radius; 

        System.out.println("Volume is "+Volume);
    }
    
}
