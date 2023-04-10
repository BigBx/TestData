package 算法;

public class Demo05blockSerach {
    public static void main(String[] args) {
        int[] arr={ 16,5,9,12,21,18,
                    32,23,37,26,45,34,
                    50,48,61,52,73,66};
        int num=48;
        Block b1=new Block(21,0,5);
        Block b2=new Block(45,6,11);
        Block b3=new Block(73,12,17);
        Block[] blockarr={b1,b2,b3};
        System.out.println(getindex(blockarr,arr,num));
    }
    public static int findindex(Block[] blockarr,int num){
        for (int i = 0; i <blockarr.length ; i++) {
            if ( num<= blockarr[i].getMax()) {
                return i;
            }
        }
        return -1;
    }
    public static int getindex(Block[] blockarr,int[] arr,int num){
        int indexblock=findindex(blockarr,num);
        if (indexblock == -1) {
            return -1;
        }
        int startindex=blockarr[indexblock].getStartindex();
        int endindex=blockarr[indexblock].getEndindex();
        for (int i = startindex; i <=endindex ; i++) {
            if (num == arr[i]) {
                return i;
            }
        }
        return -1;
    }


}
class Block{
    private int max;
    private int startindex;
    private int endindex;
    public Block(int max,int startindex,int endindex){
        this.max=max;
        this.endindex=endindex;
        this.startindex=startindex;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMax() {
        return max;
    }

    public void setEndindex(int endindex) {
        this.endindex = endindex;
    }

    public void setStartindex(int startindex) {
        this.startindex = startindex;
    }

    public int getEndindex() {
        return endindex;
    }

    public int getStartindex() {
        return startindex;
    }
}