
import java.util.Scanner;
public class app4 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("donner r :");
    int r=sc.nextInt();
    System.out.println("donner s :");
    int s=sc.nextInt();
    int s1=0;
    int s2=0;
    int i;
    for(i=1; i<= r/2; i++){
        if (r % i==0) {
            s1=s1+i;
        }
    }
    for(i=1; i<= s/2; i++){
        if (s % i==0) {
            s2=s2+i;
        }
    }
    if  (s1==s && s2==r ) {
        System.err.println("r est s sont amis");
        
        
    } else {
        System.err.println("r est s n'sont pas amis");
    }
    sc.close();
        
        
    }
    

}
