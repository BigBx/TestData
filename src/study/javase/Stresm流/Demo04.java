package Stresm流;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Stream;

public class Demo04 {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        Collections.addAll(arr,"张三 1","张三 2","李四 3","王五 4","傻逼 5");
        //1.filter 过滤
        Stream<String> st1=arr.stream();
                st1.filter(s-> s.startsWith("张")).forEach(s -> System.out.println(s));
        //2.limit 获取前几个元素
        arr.stream()
                .limit(4)
                .skip(1)
                .forEach(t -> System.out.println(t));
        //3.distinct 去重
        arr.stream()
                .distinct()
                .forEach(c -> System.out.println(c) );
        //4.concat 合并
        //5.map 转换流中数据类型
        arr.stream().map(new Function<String, Integer>() {

            @Override
            public Integer apply(String s) {
                String[] str=s.split(" ");
                String str1=str[1];
                int b=Integer.parseInt(str1);
                return b;
            }
        });
        arr.stream()
                .map(s -> Integer.parseInt(s.split(" ")[1]));

    }
}
