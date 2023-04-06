package 常用API;

//自幂数
public class Demo02SF {
    public static void main(String[] args) {
        int count=0;
        for (int i = 100; i <=999 ; i++) {
            int a=i%10;
            int b=i/10%10;
            int c=i/100%10;
            double sum=Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3);
            if (sum == i) {
                count++;

            }
        }


        System.out.println(count);
    }

}
