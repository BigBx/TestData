package 集合.Hashset;

import java.util.HashSet;

/*
注意：
JDK8以后，当链表长度超过8，而且数组长度超过64，自动转化为红黑树
如果集合中存储的是自定义对象，必须抽个血hashcode和equals放法，判断对象内部属性值是否相同

1.为什么hashcode存和取的顺序不同？按照哈希值来确定位置，位置可能在前可能在后
2.为什么没有索引？不同位置下悬挂的链表和红黑树不好利用索引确定数值位置
3，利用什么机制去重？通过hashcode计算出哈希值找到对应位置，通过eqauls判断是否相同
 */
public class Demo11HashSet {
    public static void main(String[] args) {
        Student st1=new Student("张三",19);
        Student st2=new Student("李四",19);
        Student st3=new Student("王五",19);
        Student st4=new Student("张三",19);

        //创建hashset添加学生
        HashSet<Student> hs=new HashSet<>();
        System.out.println(hs.add(st1));
        System.out.println(hs.add(st2));
        System.out.println(hs.add(st3));
        System.out.println(hs.add(st4));


    }
}
