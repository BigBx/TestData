package 集合.testgenerics;

public class HusKyDog extends dog{
    public HusKyDog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("一只叫做"+getname()+"的哈士奇,"+getAge()+"岁,在吃屎");
    }
}
