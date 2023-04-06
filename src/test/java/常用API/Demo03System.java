package 常用API;

public class Demo03System {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={7,8,9,0};
        System.arraycopy(arr1,0,arr2,1,2);
        for (int i : arr2) {
            System.out.println(i);
        }
    }

}
