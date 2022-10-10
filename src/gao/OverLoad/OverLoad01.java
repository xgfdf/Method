package gao.OverLoad;

public class OverLoad01 {
    public static void main(String[] args) {
        MyCalculator mc = new MyCalculator();

        mc.calculate(12,43);


    }

}
class MyCalculator {

    //三个calculate方法构成了重载
    public int calculate(int n1, int n2) {
        return n1 + n2;

    }

    public void calaulate(int n3,int n4){
        int res = n3+n4;
        System.out.println(res);
    }

    public double calculate(int n1,double n3){
        return n1 + n3;
    }
    public int calculate(int n1,int n2,int n3){
        return n1+n2+n3;
    }

}
