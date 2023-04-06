package 集合.generisc;

import java.util.Arrays;

public class Demo06generics {
    public static void main(String[] args) {
        MyArrayList<String > str=new MyArrayList<>();
        str.add("aaa");
        System.out.println(str.get(0));
    }
    public static class MyArrayList<E>{
        Object[] obj=new Object[10];
        int size;
        public boolean add(E e){
            obj[size]=e;
            size++;
            return true;
        }
        public E get(int index){
            return (E)obj[index];
        }

        @Override
        public String toString() {
            return Arrays.toString(obj);
        }
    }
}
