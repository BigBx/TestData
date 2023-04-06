package 集合.testgenerics;

public class LiHuaCat extends cat{
    public LiHuaCat(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat() {
        System.out.println("一只叫做"+getname()+"的狸花猫,"+getAge()+"岁,在吃喝水");
    }
}
