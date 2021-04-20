import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 张先生
 * Date: 2021-04-16
 * Time: 17:22
 */
public class Clsaa {
    public static int avg(int[]data) {
        int avg=0;
        int sum=0;
        for(int i=0;i<data.length;i++){
            sum=sum+data[i];
        }
       return avg=sum/data.length;

    }
    public static void main(String[] args){
        int[]data=new int[]{1,5,4,7,8,9,11,15,13};
        /*int avg=0;
        int sum=0;
        for(int i=0;i<data.length;i++){
            sum=sum+data[i];
        }
        avg=sum/data.length;
        System.out.println(avg);
        System.out.println(sum);*/
        System.out.println(avg());
    }

/*
    public static void main(String[] args) {
        int[]arry={1,2,3,4,5};
        int i=0;
       if(i=0;i<arry[].length;i++){

        }
    }
*/


    //递归求阶乘
    public static int fac(int n) {
      if(n==1){
          return 1;
       }
       return n*fac(n-1);
    }

    public static void main7(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(fac(n));
    }

   // 递归求 1 + 2 + 3 + ... + 10
   public static int sum(int n) {
       if(n==1){
           return 1;
       }
       return n+sum(n-1);
   }

    public static void main6(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(sum(n));
    }

    //递归打印数字每一位
    public static void print(int n) {
        if (n>9){
            print(n/10);
        }
        System.out.println(n%10);

    }
    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        print(n);
    }
    //返回的数字之和
    public static int add(int n) {
        if(n>10){
            return add(n/10)+n%10;
        }
        return n%10;
    }
    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(add(n));
    }

    //fib
    public static int fib(int n){
        if(n==1 || n==2){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }

    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(fib(n));
    }

    //汉罗塔
    public static void hanoi(int n,char pos1,char pos2,char pos3){
        if(n==1){
            move(pos1,pos3);
        }else{
            hanoi(n-1,pos1,pos3,pos2);
            move(pos1,pos3);
            hanoi(n-1,pos2,pos1,pos3);
        }

    }

    public static void move(char pos1,char pos2) {
        System.out.print(pos1+"-> "+pos2+" ");
    }
    public static void main2(String[] args) {
        hanoi(1,'A','B','C');
        System.out.println();
        hanoi(2,'A','B','C');
        System.out.println();
        hanoi(3,'A','B','C');
    }
    //青蛙跳台阶
    public static int Jump(int n){
        if(n==1 || n==2){
            return n;
        }
        return Jump(n-1)+Jump(n-2);
    }
    public static void main1(String[] args) {
        System.out.println(Jump(1));
        System.out.println(Jump(2));
        System.out.println(Jump(3));
        System.out.println(Jump(4));
        System.out.println(Jump(5));
    }
}
