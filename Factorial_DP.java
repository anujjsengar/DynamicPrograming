import java.util.Scanner;
public class Factorial_DP{
    public static int fibo(int n,int f[]){
        if(n==0 || n==1){
            return n;
        }
        if(f[n]!=0){
            return f[n];
        }
        f[n]=fibo(n-1,f)+fibo(n-2,f);
        return f[n];
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fibo(n,new int[n+1]));
    }
}