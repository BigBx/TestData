package 集合.testgenerics;

public class BoSiCat extends cat{
    public BoSiCat(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat() {
        System.out.println("一只叫做"+getname()+"的波斯猫,"+getAge()+"岁,在吃饼干");
    }
}
