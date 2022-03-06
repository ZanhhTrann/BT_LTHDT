import java.util.Scanner;
public class Fibonacci{
    public static int sumFibonacci(int n){
        if(n==1){
            return 1;
        }else if(n==2){
            return 2;
        }else{
            int sum=0;
            int [] a= new int[n];
            a[0]=a[1]=1;
            for(int i = 2; i < n; i++){
                a[i]=a[i-1]+a[i-2];
                sum+=a[i];
            }
            return sum+2;
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap n: ");
        n= scanner.nextInt();
        System.out.println("\ntong "+n+" phan tu dau tien cua day Fibonacci la: "+sumFibonacci(n));
    }
}
