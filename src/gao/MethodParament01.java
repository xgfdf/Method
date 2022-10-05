package gao;

public class MethodParament01 {
    public static void main(String[] args) {

        //基本数据类型，传递的是值(值拷贝) ,形参的任何改变不影响实参!

        int a = 10, b = 30;
        AAP aap = new AAP();
        aap.swap(a,b);
        System.out.println("a= "+ a+"b= "+b);

    }
}
class AAP{

    public void swap(int a,int b){
        System.out.println("a= "+ a+"b= "+b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("a= "+ a+"b= "+b);
    }

}
