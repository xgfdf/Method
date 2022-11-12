package gao.This;

public class This01 {
    public static void main(String[] args) {

        //当new（创建）一个对象时，直接通过构造器指定名字和年龄
        Dog dog = new Dog("大壮",20);

        dog.info();
    }

}
class Dog{  //类
    String name;
    int age;

   /* public Dog(String pName,int pAge){
        name = pName;
        age = pAge;

    }*/
    /*
    * 如果构造器的形参，可以直接写成属性名，不是更好、更简洁吗？
    *
    * */
  /* public Dog(String name,int age) {
       name = name;
       age = age;

   }*/
   /*
   * 按照上面写问题就来了，上面等号右侧的 指的是形参还是属性？？
   *
   * 但是根据变量的作用域原则：
   * 构造器的name就是局部变量，而不是属性了
   * 构造器的age也是局部变量，而不是属性
   *
   * 这个是构造器你需要定义属性的值，如果构造器里面的值变成了局部变量，你其他方法调用不了。
   *
   * 这时候就需要引入this
   * */

    //成员方法，输出属性信息



    //this指向当前调用改方法的对象
    public Dog(String name,int age){
        //this.name 是当前对象的属性
        //      当前对象就是你创建好这个对象以后，谁在调用这个构造器，这个this就是哪一个对象
        //this指的是你new出来的对象
        this.name = name;
        this.age = age;
    }


    public void info(){

        System.out.println(name + "\t" + age);
    }

}
