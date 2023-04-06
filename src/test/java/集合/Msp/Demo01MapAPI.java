package 集合.Msp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Demo01MapAPI {
    public static void main(String[] args) {
        Map<String,String> M=new HashMap<>();
        //添加元素
        M.put("baoxu","shuai");
        M.put("zhansan","haochou");
        //删除
        String v=M.remove("zhansan");
        System.out.println(v);
        //清空 m.clear()
        //判断是否包含
        Boolean b=M.containsKey("baoxu");
        Boolean B=M.containsValue("shuai");
        //判断是否为空
        Boolean o=M.isEmpty();
        //键值对个数
        System.out.println(M.size());

    }
}
