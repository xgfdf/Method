package gao.Extend.Base_2;

public class Sub1 extends Base1{

    public Sub1() {
        //
        super("smith",18);
        //this("dsd");//Call to 'this()' must be first statement in constructor body
        System.out.println("子类的Sub1()构造器被调用");
    }


    /*
    * 如果父类没有提供无参构造器，则必须在子类的构造器中
    * 用super去指定使用父类的哪个构造器完成对父类的初始化工作，
    * 否则，编译不会通过
    * */
    //父类要是有一个无参构造器，子类构造器中可以啥都不写
    // 因为会默认调用无参构造器
    //如果父类无参构造器被覆盖，必须在子类中的每个构造器中指定要用父类的那个构造器

    public Sub1(String name) {

        super("tom",20);
        System.out.println("子类的(String name)构造器被调用");
    }

    public Sub1(String name, int age) {
        super(name, age);
    }

}
