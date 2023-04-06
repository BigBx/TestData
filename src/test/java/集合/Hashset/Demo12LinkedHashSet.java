package 集合.Hashset;

import java.util.LinkedHashSet;

public class Demo12LinkedHashSet {
    public static void main(String[] args) {
    Student st1=new Student("张三",19);
    Student st2=new Student("李四",19);
    Student st3=new Student("王五",19);
    Student st4=new Student("张三",19);

    //创建hashset添加学生
    LinkedHashSet<Student> hs=new LinkedHashSet<>();
    System.out.println(hs.add(st1));
    System.out.println(hs.add(st2));
    System.out.println(hs.add(st3));
    System.out.println(hs.add(st4));

    for (Student s:hs){
        System.out.println(s);
    }
}
}
