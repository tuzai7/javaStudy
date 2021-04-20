import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 张先生
 * Date: 2021-04-20
 * Time: 16:40
 */
public class TextDemo {
    public static String toSting(int[] array){
        String ret = "\"[";
        for (int i = 0; i <array.length ; i++) {
            if(i<array.length-1){
                ret+=array[i]+",";
            }else if (i==array.length-1){
                ret+=array[i]+"]\"";
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        String ret = toSting(array);
        System.out.println(ret);
    }
    public static int[] copyOf(int[] array){
        int[] array2 = new int[array.length];
        for (int i = 0; i <array.length ; i++) {
            array2[i] = array[i];
        }
        return array2;
    }
    public static void main3(String[] args) {
        int[] array = {1,2,3,4,};
        int[] array2 =copyOf(array);
        System.out.println(Arrays.toString(array2));

    }

    /*public static int binarySearch(int []arr,int key){
        int left=0;
        int right=arr.length-1;
        while(left<=right) {
            int mid = (left + right) / 2;
            if (key < arr[mid]) {
                right = mid - 1;
            } else if (key>arr[mid]){
                left = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8};
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(binarySearch(arr,n));
    }
*/
    public static int binayrSearch(int[] array,int key){
          int left = 0;
          int right = array.length-1;
          while (left<=right){
              int mid = (left+right)/2;
              if(key < array[mid]){
                  right = mid-1;
              }else if(key > array[mid]){
                  left = mid+1;
              }else{
                 return mid;
              }

          }
          return -1;
    }
    public static void main2(String[] args) {
        int[] array={1,2,3,4,5,6,7};
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();
        System.out.println(binayrSearch(array, key));
    }

    //排序
    public static boolean sqrt(int[] array){
        for (int i = 0; i <array.length-1 ; i++) {
            if(array[i]>array[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main1(String[] args) {
        int[] array={1,3,2,4,5};
        System.out.println(sqrt(array));

    }
   /* public static void sort(int[] array){
        boolean flg;
        int i = 0;
        int j = array.length-1;
        while(i<j){
            if(i<j && array[i]<array[i+1]){
                i++;

            }
            System.out.println(flg = true);
            if (i<j && array[i]>array[i+1]){

                System.out.println(flg = false);
                break;
            }

        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,5,4};
        sort(array);
    }*/
}
