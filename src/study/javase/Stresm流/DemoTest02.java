package Stresm流;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoTest02 {
    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        Collections.addAll(list1,"蔡徐坤,23","吴倩,30","刘不甜,22","叶猴先,23");
        Collections.addAll(list2,"赵晓应,35","杨颖,36","高圆圆,43","刘诗诗,35","杨晓敏,33");
        Stream<String> str1=list1.stream()
                .filter(s -> Arrays.stream(s.split(",")[0].split("")).count()>=3)
                .limit(1);
        Stream<String> str2=list2.stream()
                .filter(s -> s.split(",")[0].startsWith("杨"))
                .skip(1);
        /*List<actor> List= Stream.concat(str1,str2).map(new Function<String, actor>() {

            @Override
            public actor apply(String s) {
                String name=s.split(",")[0];
                int age=Integer.parseInt(s.split(",")[1]);
                return new actor(name,age);
            }
        })
                .collect(Collectors.toList());

         */
        List<actor> List=Stream.concat(str1,str2).map(s -> new actor(s.split(",")[0],
                Integer.parseInt(s.split(",")[1])))
                        .collect(Collectors.toList());
        System.out.println(List);

    }
}
class actor{
    private String name;
    private int age;

    public actor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }
    public String toString(){
        return "name="+getName()+" ,age="+getAge();
    }

}