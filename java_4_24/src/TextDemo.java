/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 张先生
 * Date: 2021-04-24
 * Time: 9:59
 */
public class TextDemo {

    private float f=1.0f;

    int m=12;

    static int n=1;

    public static void main(String args[]){

        TextDemo t=new TextDemo();
             
    }
/*
    class Test{

        public String toString() {

            System.out.print("aaa");

            return "bbb";

        }

    }

    public static void main(String[] args) {

        System.out.println(new Test());
    }
*/

/*
    static int cnt = 6;
    static{
        cnt += 9;
    }
    public static void main(String[] args){
        System.out.println("cnt =" + cnt);
    }
    static{
        cnt /=3;
    };
*/


/*    private int count;

    public static void main(String[] args) {

        TextDemo test=new TextDemo(88);

        System.out.println(test.count);

    }

    TextDemo(int a) {

        count=a;

    }*/

/*    private static int x = 100;// 2

    public static void main(String args[]) {// 3
        TextDemo hsl = new TextDemo();// 4
        hsl.x++;// 5
        TextDemo hs2 = new TextDemo();// 6
        hs2.x++;// 7
        hsl = new TextDemo();// 8
        hsl.x++;// 9
        TextDemo.x--;// 10
        System.out.println(" x=" + x);// 11

    }*/
}