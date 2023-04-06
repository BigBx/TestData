package 集合.treeset;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Consumer;

public class Demo01treeset {
    public static void main(String[] args) {
        //1.创建treeset集合对象
        TreeSet<Integer> ts=new TreeSet<>();
        //2.添加元素
        ts.add(1);
        ts.add(3);
        ts.add(2);
        ts.add(5);
        //3.遍历
        //迭代器
        Iterator<Integer> it=ts.iterator();
        while (it.hasNext()){
            int i=it.next();
            System.out.println(i);

        }
        //增强for
        for (Integer t: ts
             ) {
            System.out.println(t);
        }
        //lamda表达式
        ts.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
    }
}
