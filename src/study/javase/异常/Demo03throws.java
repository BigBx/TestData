package 异常;

public class Demo03throws {
    public static void main(String[] args) {
        int [] str={1,2,3,4,5,6};
        System.out.println(getMax(str));
    }
    public static int getMax(int[] str){
        if(str==null){
            throw new NullPointerException();
        }
        if(str.length==0){
            throw new ArrayIndexOutOfBoundsException();

        }
        int max = 0;
        for (int i = 0; i < str.length-1; i++) {
            if (str[i]>str[i+1]){
                max=str[i];
                str[i+1]=str[i];
                str[i+1]=max;
            }else {
                max=str[i+1];
            }
        }
        return max;
    }
}
