package 异常;

public class Demo02Finally {
    public static void main(String[] args) {
        testfinally();
    }
    public static int testfinally(){
        try {
            int [] arr=new int[10];
            System.out.println(arr[10]);
           return 1;
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            return 2;

        }finally {
            System.out.println("一定执行");
            return 3;
        }

    }

}

