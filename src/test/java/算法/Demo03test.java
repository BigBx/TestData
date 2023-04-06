package 算法;

import java.util.ArrayList;
import java.util.List;

public class Demo03test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 8,67, 8, 9};
        int num = 8;
        System.out.println(test1(arr, num));
        System.out.println(test2(arr, num));
    }
    //用基本方法查找，查询某个数组中的索引
    public static Object test1(int[] arr,int num){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return null;
    }
    //查找数组返回多个索引
    public static List test2(int[] arr, int num){
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                list.add(i);
            }
        }
        return list;

    }
}
