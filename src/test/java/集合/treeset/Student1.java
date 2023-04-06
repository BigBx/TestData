package 集合.treeset;

public class Student1 implements Comparable<Student1> {
    private String name;
    private int age;

    public Student1(String name, int age) {
        this.name = name;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name:"+name+" ,age:"+age;
    }
    @Override
    public int compareTo(Student1 o) {
        //排序规则
        System.out.println("-----------------");
        System.out.println("this:"+this);
        System.out.println("o:"+o);
        return this.getAge()-o.getAge();
    }
}
