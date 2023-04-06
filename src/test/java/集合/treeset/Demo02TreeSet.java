package 集合.treeset;
import java.util.TreeSet;
/*
1.默认排序：实现一个Comparable接口
 */
public class Demo02TreeSet {
    public static void main(String[] args) {
        Student1 s1=new Student1("zhangsan",19);
        Student1 s2=new Student1("lisi",15);
        Student1 s3=new Student1("wangwu",30);
        Student1 s4=new Student1("niuliu",18);

        TreeSet<Student1> ts=new TreeSet<>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
    }


}
