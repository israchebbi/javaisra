import java.util.Scanner;
public class app3 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("donner x :");
    int x=sc.nextInt();
    System.out.println("donner y :");
    int y=sc.nextInt();
    while (x <= 0 && y <= 0 && x <= y ) { 
        System.out.println("donner x :");
        x=sc.nextInt();
        System.out.println("donner y :");
        y=sc.nextInt();
    }
    int res = x;
    int q = 0;
    do { 
        res = res - y;
        q++;
    } while (res >= y);
    System.err.println("le quotient est "+ q +" et le reste de le division est " + res);
}
}
