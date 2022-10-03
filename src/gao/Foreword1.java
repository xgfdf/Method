package gao;

public class Foreword1 {
    public static void main(String[] args) {

        //创建Person对象
        //p1是对象名（对象引用）
        //new Personn() 创建的空间（数据）才是真正的对象
        //对面的属性默认值，遵守数组规则;

        Person1 p1 = new Person1();
        p1.name = "※";

        System.out.println("name= " + p1.name + "age= " + p1.age + "isPass = " + p1.isPass);


    }
}

    class Person1 {
        String name;
        int age;
        boolean isPass;

    }

