import java.lang.Math;
import java.util.Scanner;
/**
 *
 * @author Gurkirat 981834
 */
public class Assignment1{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int length;
        int width;
        System.out.print("input length of square: ");
        length = sc.nextInt();
        System.out.print("input width of square: ");
        width = sc.nextInt();
        System.out.println(length*width);
        int radius;
        System.out.print("input radius of circle: ");
        radius = sc.nextInt();
        System.out.println(Math.PI*(radius*radius));
        int cradius;
        int height;
        System.out.print("input radius of cylinder: ");
        cradius = sc.nextInt();
        System.out.print("input height of cylinder: ");
        height = sc.nextInt();
        System.out.println(Math.PI*(cradius*cradius)*height);
        int L;
        double G;
        G = 9.8;
        System.out.print("input meters: ");
        L = sc.nextInt();
        System.out.print((Math.PI*Math.PI)+Math.sqrt(L/G));
    }
   
}
