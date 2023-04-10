package 集合.Hashset;
/*
哈希值:对象整数的表现形式
通过hascode方法将对象地址值计算为int整型
若未重写hashcode方法，计算的哈希值不同
若重写hashcode方法，不同对象属性值相同，计算的哈希值就相同
小部分情况下，不同属性或者不同地址值计算出的哈希值可能相等
 */

import java.util.Objects;

public class Demo10HasSet {
    public static void main(String[] args) {
        //1.创建对象
        student ste=new student("张三",19);
        student stu=new student("张三",19);
        System.out.println(stu.hashCode());
        System.out.println(ste.hashCode());
    }
}
class student{
    private String name;
    private int age;

    student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void setName(String name1){
        this.name=name1;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age1){
        this.age=age1;
    }
    public int getAge(){
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}