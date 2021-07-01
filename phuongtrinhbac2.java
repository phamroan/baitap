package sub;
import java.util.Scanner;

public class phuongtrinhbac2 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("hệ số bậc hai, a =  ");
        float a = phuongtrinhbac2.scanner.nextFloat();
        System.out.println("he so bac 1, b = ");
        float b = phuongtrinhbac2.scanner.nextFloat();
        System.out.println("he so tu do c  = ");
        float c = phuongtrinhbac2.scanner.nextFloat();
        phuongtrinhbac2.giaiPt(a,b,c);

    }
    public  static  void giaiPt(float a, float b, float c) {
        if (a==0) {
            if (b == 0) {
                System.out.println("phong trinh vo nghiem");
            } else {
                System.out.println("phuong trinh co mot nghiem la : " + "x = " + (-c/b));
            }
            return;
        }
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        if (delta > 0){
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("phuong trinh co hai nghiem la : " + "x1 = " + x1 + "x2 = " + x2 );
        }else  if (delta == 0) {
            x1= (-b/(2*a));
            System.out.println("phuong trinh co nghiem kep la : " + " x1= x2 = : " + x1);
        }else {
            System.out.println("phuong trinh vo nghiem");
        }
    }


}
