package 算法;

public class Demo04Binaryserach {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8};
        int num=4;
        System.out.println(test(arr, num));
    }
    public static int test(int[] arr,int num){
        int min=0;
        int max=arr.length-1;
        while (true){
            if (min>max){
                return -1;
            }
            //int mid=(max+min)/2;
            //插值查找
            int mid=min+(max-min)*(num-arr[min])/(arr[max]-arr[min]);
            if (arr[mid] > num) {
                max=mid-1;
            }
            if (arr[mid]<num){
                min=min+1;
            }
            if (arr[mid] ==num ) {
                return mid;
            }
        }

    }
}
