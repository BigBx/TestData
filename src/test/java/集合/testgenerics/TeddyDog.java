package 集合.testgenerics;

public class TeddyDog extends dog{
    public TeddyDog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("一只叫做"+getname()+"的泰迪,"+getAge()+"岁,在上厕所");
    }
}
