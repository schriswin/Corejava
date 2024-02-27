import java.util.*;
class prog{
    public static void main(String args[])
    {
        Scanner d=new Scanner(System.in);
        int a=d.nextInt();
        int b=d.nextInt();
        int c=d.nextInt();
        int x=(int)Math.pow(b,2)-(4*a*c);
        System.out.println(x);
        if (x==0){
        System.out.println("The roots are real and equal");
        int r1=-b/2*a;
        int r2=r1;
        System.out.println("the 1st root is:"+r1);
        System.out.println("the 2nd root is:"+r2);
        }
        else if(x>0){
            System.out.println("The roots are real and imaginary");
            int r1=-(int)Math.pow(x,0.5);
            int r2=+(int)Math.pow(x,0.5);
            System.out.println("The 1st root is"+r1);
            System.out.println("The 2nd root is"+r2);
        }
        else{
            System.out.println("The roots are imaginary");       
        }

        }
        
}
