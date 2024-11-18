import java.util.Scanner;

public class App { 
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n :");
        int n=sc.nextInt();
        while (n<=0) { 
            System.out.println("n doit etre > 0 :");
             n=sc.nextInt();
        }
        System.out.println("enter x :");
        int x=sc.nextInt(); 
        int res =1 ;
        for (int i=1 ; i<=n; i++) {
            res = res*x ;
        }
        System.out.println(res);

        
}
}
