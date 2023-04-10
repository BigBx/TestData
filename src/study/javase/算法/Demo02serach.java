package 算法;

public class Demo02serach {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int num = 0;
        System.out.println(basicserach(arr, num));
    }

    //基本查找
    public static boolean basicserach(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                return true;
            }

        }
        return false;
    }
}
