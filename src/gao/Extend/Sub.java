package gao.Extend;

public class Sub extends Base{//子类


    //子类的构造器
    public Sub() {
        super();//默认调用父类的无参构造器
        System.out.println("子类Sub()构造器被调用...");
    }

    //当创建子类对象时，
    // 不管使用子类的哪个构造器，默认情况下总会去调用父类的无参构造器
    public Sub(String name){
        super("tom",20);
        System.out.println("子类的Sub(String name)构造器被调用");
    }


    //子类方法
    public void sayOk(){

        //不在同一个包下的子类才无法访问父类的默认修饰

        //非私有的属性和方法可以在子类直接访问
        System.out.println(n1+n2+n3);
        //System.out.println(n4);

        test100();
        test200();
        test300();
       /* test400();
        'test400()' has private access in 'gao.Extend.Base'*/

        System.out.println(hi());
    }
}
