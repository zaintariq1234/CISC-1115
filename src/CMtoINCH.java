import java.util.Scanner;
public class CMtoINCH {
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            int cm;
            double in;
            System.out.println ("Enter a value for  centimeters and press Return.");

            cm = sc.nextInt();
            // formulae 1cm = 0.3937 in
            in = cm * 0.3937;
            System.out.println (" = " + in + "inches" );





        }
    }


