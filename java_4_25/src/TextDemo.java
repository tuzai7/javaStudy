import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 张先生
 * Date: 2021-04-25
 * Time: 11:10
 */
public class TextDemo {
    //给定两个整型数组, 交换两个数组的内容
    public static void swap(int[]array1,int[]array2){
        int tmp=0;
        for (int i=0;i<array1.length;i++){
            tmp=array1[i];
            array1[i]=array2[i];
            array2[i]=tmp;
        }
    }
    public static void main(String[] args) {
        int[] array1= {1,2,3,4,5};
        int[] array2= {5,4,3,2,1};
        System.out.println("交换前：");
        System.out.println(Arrays.toString(array1) );
        System.out.println(Arrays.toString(array2));
        System.out.println("交换后：");
        swap(array1,array2);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }



    //给定整型数组, 把所有的偶数放到数组前面, 把所有奇数放到数组后面
    public static int[] swap(int[]array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            while (left < right && array[left] % 2 == 0) {
                left++;
            }
            while (left < right && array[right] % 2 != 0) {
                right--;
            }
            if (left < right) {

                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;

            }
        }
    return array;

    }
    public static void main1(String[] args) {
             int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(swap(array)));
    }

}
