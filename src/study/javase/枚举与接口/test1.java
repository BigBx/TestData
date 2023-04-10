package 枚举与接口;

public class test1 {
    public static void main(String[] args) {
        shape cr = new circle("圆", 4.3);
        System.out.println(cr.getArea());
        System.out.println(cr.getLength());
    }
}
    abstract class shape{
        protected String name;
        public shape(String xm){
            this.name=xm;
            System.out.println("名称"+name);
        }
        abstract public double getArea();
        abstract public double getLength();
    }
     class circle extends shape{
      private final double pi=3.14;
      private double r;
        public circle(String xm,double radios) {
            super(xm);
            r=radios;
        }

        @Override
        public double getArea() {
            return pi*r*r;
        }

        @Override
        public double getLength() {
            return 2*pi*r;
        }
    }

