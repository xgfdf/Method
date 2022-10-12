package gao.Encape;


//构造器与setXXX结合

public class Encapsulation02 {
    public static void main(String[] args) {
        Person02 person = new Person02();



        person.setName("塞缝经脑");//给person设置一个名字进去

        person.setAge(150);
        person.setSalary(30000);

        System.out.println(person.info());
        System.out.println(person.name);

        //用我们自己写的构造器指定属性
        Person02 person02 = new Person02("smith",200,5000);
        System.out.println(person02.info());
        //这样就有问题了，通过自己写的构造器，就把之前的set设置给绕过了



    }
}

class Person02{
    public String name;
    private int age;
    private double salary;


    //首先写一个无参构造器
    public Person02() {
    }

    //₍₂₎写无参是因为又创建了一个有参构造器，
    // 如果不写一个，那么默认的无参会被覆盖，上边那个就不能用了，老师以前讲过的


    //再写带三个属性的构造器
    public Person02(String name, int age, double salary) {
        /*this.name = name;
        this.age = age;
        this.salary = salary;*/
        //将上面的改成下面就可以了 ！
        setName(name);
        setAge(age);
        setSalary(salary);
    }


    public void setName(String name){



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
            this.age = 18;
        }

    }

    public double getSalary() {

        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public String info(){
        return (name+age+salary);
    }

}
