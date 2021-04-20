import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Random;
import java.util.Scanner;


public class Class {
    public static void  print (int n, int tmp) {
        if(n < 0) {//当输入一个负数时，先把它变成整数。
            System.out.println("-");
            n = -n;
        }
        if(n > 9) {
            print(n / 10, tmp);//递归
        }
        System.out.print(n % 10);//打印个位数
        if (n != tmp) {
            System.out.print(", ");
        }


    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字：");
        int n = scanner.nextInt();
        int tmp = n;
        print(n,tmp);
    }

    public static void main24(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(123);
        int rand=random.nextInt(100)+1;
        while(true){
            System.out.println("输入你猜的数字：");
            int n=scanner.nextInt();
            if(n>rand){
                System.out.println("猜大了");
            }else if(n==rand){
                System.out.println("猜对了");
                break;
            }else{
                System.out.println("猜小了");
            }


        }
    }
        public static void main23(String[] args){
            Scanner scanner = new Scanner(System.in);
            while(scanner.hasNextInt()){
                int n = scanner.nextInt();
                for(int i=0;i<n;i++){
                    for(int j=0;j<n;j++){
                        if(i == j){
                            System.out.print("*");
                        }else if(i == n-1-j){
                            System.out.print("*");
                        }else{
                            System.out.print(".");
                        }

                    }
                    System.out.println();

                }


            }
        }
    //分别打印位数
    public static void main22(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n < 0) {//当输入一个负数时，先把它变成整数。
            System.out.println("-");
            n = -n;
        }
        if(n>9) {
            System.out.print(n/10);//递归
        }
        System.out.print(" ");
        System.out.println(n%10);//打印个位数
    }

//9*9
    public static void main21(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i=1;
        int j=1;
        for(i=1;i<=n;i++) {
            for(j=1;j<=i;j++) {
                System.out.print(j+"*"+i+"="+j*i+" " );
            }
            System.out.println();
        }
    }



    //二进制中 奇数位和偶数位的数
    public static void main20(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int i=0;
        int n= scanner.nextInt();
        for(i=30;i>=0;i=i-2){
            System.out.print(((n >>> i)&1)+" ");
        }
        System.out.println();
        for (i = 31; i >=1 ; i=i-2) {
            System.out.print(((n >>> i)&1)+" ");
        }
    }
    //二进制中1的个数
    public static void main19(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=0;
        int n = scanner.nextInt();
        while(n!=0){
            if((n&1)!=0){
                count++;
            }
            n=n>>>1;
        }
        System.out.println(count);
    }

//输入三次密码
    public static void main18(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int count =3;
            while(count != 0){
                System.out.println("请输入密码：");
                String password = scanner.nextLine();
                if(password.equals("123")){
                    System.out.println("密码正确 登陆成功！");
                    break;
                }
                else{
                    count--;
                    System.out.println("密码错误 你还有"+count+"次机会");
                }
            }

    }
    //水仙花数z'z
    public static void main17(String[] args) {

        for (int i=0 ; i<=1000; i++){
            int count =0;
            int tmp=i;
            while(tmp!=0){
                count ++;
                tmp/=10;
            }
            tmp=i;
            int sum=0;
            while(tmp!=0){
                sum+=Math.pow(tmp%10,count);
                tmp /= 10;
            }
            if(sum==i){
                System.out.println("水仙花数："+i);
            }
        }
    }

    public static void main16(String[] args) {
        double sum = 0.0;
        int flag = 1;
        for(int i=1;i<=100;i++){
            sum += 1.0/i * flag;
            flag = -flag;
        }
        System.out.println(sum);
    }
    //最大公倍数
    public static void main15(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int i=scanner.nextInt();
            int j=scanner.nextInt();

            while(i%j != 0){
           int n=i%j;
           i = j;
           j = n;

       }
        System.out.println(j);
    }
   //判断年龄
    public static void main14(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        if(n<=18){
            System.out.println("少年");
        }
        else if(n>19 && n<=28){
            System.out.println("青年");
        }
        else if(n>29 && n<=55){
            System.out.println("中年");
        }
        else{
            System.out.println("老年");
        }
    }
//素数
    public static void main13(String[] args) {
        int j=0;
        for(j=1;j<=100;j++){
        int i=2;
        for(;i<=Math.sqrt(j);i++){
            if(j%i==0){
                break;
            }
        }
        if(i>Math.sqrt(j)){
            System.out.println(j);
        }
      }
    }
    //素数打印
    public static void main12(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int i=2;
        for(;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println("不是素数");
                break;
            }
        }
        if(i>Math.sqrt(n)){
            System.out.println("是素数");
        }
    }
    //闰年
    public static void main11(String[] args) {
        int i=0;
        for(i=1000;i<2000;i++){
            if(i%4==0 && i%100 != 0 || i%400==0){
                System.out.println(i);
            }
        }

    }
    //记录多少个数字9
    public static void main10(String[] args) {
        int count=0;
        for(int i=1;i<100;i++){
            if(i%10==9){
                count++;
            }

           if(i/10==9){
               count++;
           }

        }
        System.out.println(count);

    }
    public static void main9(String[] args) {
        int a=10;
        short b= (short)a;
        System.out.println(b);
    }
    public static void main8(String[] args) {
        String name = "shuaige";
        String a ="shuai";
        String b="ge";
        int c=20;
        int d=20;
        System.out.println(c+d+a+b);
    }
    public static void main7(String[] args) {
        boolean value = true;
        System.out.println(value);
    }
    public static void main6(String[] args) {
        short value = 0;
        System.out.println(value);
    }
    public static void main5(String[] args) {
        char ch='a';
        System.out.println(ch);
    }
    public static void main4(String[] args) {
        float num=1.0f;
        System.out.println(num);

    }
    public static void main3(String[] args) {
        double num =1.1;
        System.out.println(num*num);
    }
    public static void main2(String[] args) {
        long num =10l;// 10后面是字母l 不是数字1
        System.out.println(num);
    }
    public static void main1(String[] args) {
                int num=10;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
                System.out.println(num);
            }
        }

 