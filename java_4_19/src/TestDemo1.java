import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 张先生
 * Date: 2021-04-19
 * Time: 22:26
 */
public class TestDemo1 {
    public static void transform(int[] array){
        int[] array2=new int[array.length];
        for (int i = 0; i <array.length ; i++) {
            array[i]=i+1;
            array2[i]=array[i]*2;

        }
        System.out.println(Arrays.toString(array2));
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        transform(array);

    }


    public static void give(int[] array){
        for (int i = 0; i <=100 ; i++) {
           array[i]=i+1;
            System.out.print(array[i]+" ");
        }

    }
    public static void main4(String[] args) {
        int[] array=new int[100];
        give(array);
    }


    public static void  printArray (int[] array){
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
    }
    public static void main3(String[] args) {
        int[] array ={1,2,3,4,5,6};
        printArray(array);
    }



    public static void sum (int[] array){
        int sum=0;
        for (int i = 0; i <array.length ; i++) {
            sum=sum+array[i];
        }
        System.out.println(sum);
    }
    public static void main2(String[] args) {
        int[] array ={1,2,3,4,5};
        sum(array);
    }




    public  static  void avg(int[] array){
        int sum=0;
        for (int i = 0; i <array.length ; i++) {
            sum=sum+array[i];
        }
        double ret = sum * 1.0 /array.length;
        System.out.println(ret);
    }
    public static void main1(String[] args) {
        int[] array ={1,2,3,4,5,};
        avg(array);
    }
}
