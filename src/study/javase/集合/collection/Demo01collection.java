package 集合.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo01collection {
    public static void main(String[] args) {
        Collection<String> coll=new ArrayList<>();
        //添加
        coll.add("aaa");
        coll.add("bbb");
        //清除
        //coll.clear();

        //删除元素
        coll.remove("aaa");
        System.out.println(coll);

        //判断是否包含某元素
        //注意：在底层依赖equals方法判断是否存在
        //如果集合中存储的是自定义对象，也想通过contains判断，则在javabean中重写equals方法
        coll.contains("aaa");
        System.out.println(coll);

        //判断集合是否为空
        boolean result=coll.isEmpty();
        System.out.println(result);

        //获取集合长度
        int size=coll.size();
        System.out.println(size);
    }
}
