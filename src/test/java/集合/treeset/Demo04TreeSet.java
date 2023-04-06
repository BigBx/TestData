package 集合.treeset;

import sun.reflect.generics.tree.Tree;

import java.util.TreeSet;

public class Demo04TreeSet {
    public static void main(String[] args) {
        student2 s1=new student2("张三",90,90,89);
        student2 s2=new student2("张二",91,89,90);
        student2 s3=new student2("张四",89,90,70);
        student2 s4=new student2("张五",93,78,80);
        TreeSet<student2> stu=new TreeSet<>();
        stu.add(s1);
        stu.add(s2);
        stu.add(s3);
        stu.add(s4);
        System.out.println(stu);
    }
}
