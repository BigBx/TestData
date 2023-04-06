package 集合.generisc;

import java.util.ArrayList;

public class Demo07genericsfunction {
    public static void main(String[] args) {
        ArrayList<Integer> It=new ArrayList<>();
        listutl.addAll(It,2,3,4);
        System.out.println(It);
    }
    public static class listutl<E>{
        public listutl(){}
        public static<E> void addAll(ArrayList<E> list,E e1,E e2,E e3){
            list.add(e1);
            list.add(e2);
            list.add(e3);
        }
    }
}
