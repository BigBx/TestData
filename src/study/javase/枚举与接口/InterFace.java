package 枚举与接口;

import java.math.BigDecimal;
import java.math.RoundingMode;
public class InterFace {
    public static void main(String[] args) {
        IShape cr=new yuan(5.0);
        //BigDecimal 方法将值转为BigDecimal类型，再由setScala方法四舍五入
        BigDecimal value=BigDecimal.valueOf(cr.getLength());
        value=value.setScale(1,RoundingMode.HALF_UP);
        System.out.println(cr.getArea());
        System.out.println(value);
    }
}
interface IShape{
    static final double pi =3.14;
    abstract double getArea();
    abstract double getLength();
}
class yuan implements IShape{
    double radius;
    public yuan(double R){
        radius=R;
    }

    @Override
    public double getArea() {
        return pi*radius*radius;
    }

    @Override
    public double getLength() {
        return 2*pi*radius;
    }
}