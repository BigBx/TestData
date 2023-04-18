package Stresm流;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo06 {

    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"张无忌-女-23","张无-男-21","张忌-男-63","张三-男-27","马武-男-26");
        //收集到list集合中
        List<String> str1=list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toList());
        System.out.println(str1);
        //收集到set中
        Set<String> set=list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toSet());
        //收集到map中
        Map<String,Integer> map1=list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        return s.split("-")[0];
                    }
                }, new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s.split("-")[2]);
                    }
                }));
        System.out.println(map1);
        Map<String,Integer> map2=list.stream().collect(Collectors.toMap(s -> s.split("-")[0]
                ,s->Integer.parseInt(s.split("-")[2]) ));
        System.out.println(map2);
    }

}
