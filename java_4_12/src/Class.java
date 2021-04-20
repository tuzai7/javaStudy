import java.util.Scanner;

public class Class {

    public static void fib(int n) {
        if(n==1 || n==2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        int n=7;
        int ret=fib(n);
    }

}
/*    public static int max2(int a,int b) {
        return a>b?a:b;
    }

    public static int max3(int a, int b, int c) {
        int max= max2(a,b);
        return max>c?max:c;
    }
    public static void main(String[] args) {
        System.out.println(max3(5,2,1));
    }
    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ret=1;
        for (int i = 1; i <=n ; i++) {
            ret*=i;
        }
        System.out.println(ret);

    }
}*/
 /*   public static void main4(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n= scanner.nextInt();

        int sum=0;
        for (int i = 0; i <=n ; i++) {
           int tmp=1;
           for(int j=1;j<=i;j++){
               tmp*=j;
           }
           sum+=tmp;
        }
        System.out.println(sum);
    }
    public static int fib(int n){
        int f1=1;
        int f2=1;
        int f3=1;
        for(int i=3;i<=n;i++){
            f3=f1+f2;
            f1=f2;
            f2=f3;
        }
        return f3;
    }
    public static void main2(String[] args) {
        int ret=fib(4);
        System.out.println(ret);
    }
    public static void main1(String[] args) {
        int[]array={1,2,3,3,2,1,4};
        int ret=0;
        for(int i=0;i<array.length;i++){
            ret^=array[i];
        }
        System.out.println(ret);
    }
}
*/