package 集合.Hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

//set系列集合：添加的元素是无序、不重复、无索引
public class Demo02set {
    public static void main(String[] args) {
        /*
        利用Set系列的集合，添加字符串，并使用多种方式遍历
        迭代器，增强for，lamda表达式
         */
        Set<String> s=new HashSet<>();
        //添加元素
        //当前元素第一次添加返回true
        //第二次则返回false
        s.add("张三");
        s.add("李四");
        s.add("王五");

        //打印集合
        System.out.println(s);

        //迭代器遍历
        Iterator<String> it=s.iterator();
        while (it.hasNext()){
            String str=it.next();
            System.out.println(str);
        }

        //增强for循环
        for (String str:s){
            System.out.println(str);
        }

        //lamda表达式
       s.forEach(str-> System.out.println(str));



    }
}
