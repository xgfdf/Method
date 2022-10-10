package gao.Encape;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();

        //person.name = "jack";
        //age是私有化的，没办法直接赋值
        //person.age =

        person.setName("塞缝经脑塞缝 塞缝");//就给person设置了一个名字进去

        person.setAge(150);
        person.setSalary(30000);

        System.out.println(person.info());
        //此时还没有设置条件，比如年龄在1~120之间，怎么设置呢？？

        //怎么设置名字的长度呢



    }
}

/*
* 那么在java中如何实现这种类似的控制呢?

不能随便查看人的年龄，工资等隐私，并对设置的年龄进行合理的验证。年龄合理就设置，否则给默认
年龄，必须在1-120， 年龄，工 资不能直接查看，
name的长度在2-6个字符之间

* */
class Person{
    public String name;
    private int age;
    private double salary;

    //在Person中创建一个公共方法来实现对私有属性的修改

    //然后根据要求完善代码
    public void setName(String name){


        //等号右侧是形参，接收到传进来的jack
        //然后传给当前这个对象(this.name)
        //那个对象呢？谁调用这个对象就是谁
        //this代表哪个对象调用，就是哪个对象

        //也就是把jack设置给person这个对象

        //加入了对数据的校验，相当于增加了业务逻辑
        if (name.length()>=2 && name.length()<=6) {
            this.name = name;
        }else {
            System.out.println("名字的长度是两个字到六个字");
            this.name = "XXX";
        }

    }
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1&& age<= 120) {
            this.age = age;
        }else {
            System.out.println("年龄需要在1~120之间");
            this.age = 18;//可以设置一个默认年龄
        }

    }

    public double getSalary() {
        //可以对当前对象的权限判断
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //写一个方法，返回属性信息
    public String info(){
        return (name+age+salary);
    }
}