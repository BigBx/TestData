package 枚举与接口;

public class MeiJu {
    public static void main(String[] args) {
      Direction dir=Direction.EAST;
      Direction dir1=Direction.valueOf("NORTH");
      System.out.println(dir);
      System.out.println(" "+dir1);
      for(Direction d:Direction.values())
          System.out.println("序号："+d.ordinal()+"的值为；"+d.name());

    }
}
enum Direction{
    EAST,SOUTH,WEST,NORTH
}
