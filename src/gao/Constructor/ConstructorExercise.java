package gao.Constructor;

public class ConstructorExercise {
    public static void main(String[] args) {
        Person01 person01 = new Person01();
        System.out.println(person01.name+person01.age);

        Person01 person011 = new Person01("小明",28);
        System.out.println(person011.name+person011.age);

    }
}
/*在前面定义的Person类中添加两个构造器:
第一个无参构造器:利用构造器设置所有人的age属性初始值都为18
第二个带pName和pAge两个参数的构造器:使得每次创建Person对象的同
时初始化对象的age属性值和name属性值。分别使用不同的构造器，创建对
象 */
class Person01{
    String name;
    int age;

    public Person01(){
        age = 18;
    }
    public Person01(String pName,int pAge){
        name = pName;
        age = pAge;
    }
}