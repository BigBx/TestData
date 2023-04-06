package 集合.testgenerics;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<cat> Cat=new ArrayList<>();
        ArrayList<dog> Cat2=new ArrayList<>();
        HusKyDog HK=new HusKyDog("小花",23);
        TeddyDog TD=new TeddyDog("堂东东",17);
        LiHuaCat LH=new LiHuaCat("小五",23);
        BoSiCat BS=new BoSiCat("波希",19);
        Cat.add(BS);
        Cat.add(LH);
        keepPet(Cat);
        koeepPet2(Cat2);

    }
    //猫
    public static void keepPet(ArrayList<? extends cat> list){
        list.forEach((cat i)->{
            i.eat();
        } );
    }
    //狗
    public static  void koeepPet2(ArrayList<? extends dog> list){

    }
}
