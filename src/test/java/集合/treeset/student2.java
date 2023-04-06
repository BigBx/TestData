package 集合.treeset;

public class student2 implements Comparable<student2> {
    private String name;
    private int Chinese;
    private int math;
    private int English;
    public student2(String a,int b,int c,int d){
        this.name=a;
        this.Chinese=b;
        this.math=c;
        this.English=d;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return Chinese;
    }

    public void setChinese(int chinese) {
        Chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int english) {
        English = english;
    }

    @Override
    public int compareTo(student2 o) {
        int sum1=this.getChinese()+this.getEnglish()+this.getMath();
        int sum2=o.Chinese+o.getMath()+o.getEnglish();
        //比较总分
        int i=sum1-sum2;
        //总分相同则比语文
        i= i==0 ? this.getChinese()-o.getChinese() : i;
        //总分相同比数学
        i= i==0 ? this.getMath() - o.getMath() : i;
        //总分相同比英语
        i= i==0 ? this.getEnglish() - o.getEnglish() : i;
        return i;
    }
    public String toString(){
        return "name:"+name+" Chinese:"+Chinese+" math:"+math+" English:"+English;
    }
}
