package 集合.generisc;

import java.util.ArrayList;

public class Demo09enericsTongPeiFu {
    public static void main(String[] args) {
        ArrayList<fu> list1=new ArrayList<>();
        method(list1);
        ArrayList<zi> list2 =new ArrayList<>();
        method(list2);
    }
    /*
    泛型通配符：
    ？可以表示不确定类型
    进行类型限定：
    ? extend E:表示可以传递E或者E的所有子类类型
    ? super E:表示可以传递E或者E的所有父类类型
     */
    public static void method(ArrayList<? super zi> list){

    }
}
class ye{

}
class fu extends ye{

}
class zi extends fu{

}