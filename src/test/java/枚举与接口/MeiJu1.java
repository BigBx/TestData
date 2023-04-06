package 枚举与接口;

import java.lang.Enum;
public class MeiJu1 {
    public static void main(String[] args) {
        DrecTion dir=Enum.valueOf(DrecTion.class,"NORTH");
        System.out.println(dir);
        for(DrecTion d:DrecTion.values())
            System.out.println(d.name()+"的属性为:"+d.toString());
    }
}
enum DrecTion{
    EAST("东"),SOUTH("南"),WEST("西"),NORTH("北");
    private String name;
    private DrecTion(String str){
        this.name=str;
    }
    public String toString(){
        return name;
    }
}