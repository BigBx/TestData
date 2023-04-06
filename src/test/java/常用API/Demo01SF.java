package 常用API;

//判断一个数是否为质数
public class Demo01SF {
    public static void main(String[] args) {

        System.out.println(ispream(997));
    }
    public static boolean ispream(int mumnber){
        int count=0;
        for (int i = 2; i <= Math.sqrt(mumnber); i++) {
            count++;
            if (mumnber%i==0) {
                return false;
            }
        }
        System.out.println(count);
        return true;
    }
}
