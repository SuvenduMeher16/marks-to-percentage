import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        float a, b, c, d, e;
        float total;

        System.out.println("Enter total marks :: ");
        Scanner sc = new Scanner(System.in);
        total = sc.nextFloat();

        System.out.println("Enter the marks of Sub1 : ");
        Scanner s1 = new Scanner(System.in);
        a = s1.nextFloat();
        System.out.println("Enter the marks of Sub2 : ");
        Scanner s2 = new Scanner(System.in);
        b = s2.nextFloat();
        System.out.println("Enter the marks of Sub3 : ");
        Scanner s3 = new Scanner(System.in);
        c = s3.nextFloat();
        System.out.println("Enter the marks of Sub4 : ");
        Scanner s4 = new Scanner(System.in);
        d = s4.nextFloat();
        System.out.println("Enter the marks of Sub5 : ");
        Scanner s5 = new Scanner(System.in);
        e = s5.nextFloat();

        float a1 = (a / total) * 100;
        float a2 = (b / total) * 100;
        float a3 = (c / total) * 100;
        float a4 = (d / total) * 100;
        float a5 = (e / total) * 100;

        System.out.println("Percentage of Sub1 : " + a1 + " %");
        System.out.println("Percentage of Sub2 : " + a2 + " %");
        System.out.println("Percentage of Sub3 : " + a3 + " %");
        System.out.println("Percentage of Sub4 : " + a4 + " %");
        System.out.println("Percentage of Sub4 : " + a5 + " %");

    }
}
