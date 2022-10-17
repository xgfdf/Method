package gao.override;

public class Dog extends Animal{
    //Dog是Animal子类
    //Dog的cry方法和Animal的cry方法定义形式一样（名称、返回类型、参数）
    //这就是Dog的cry方法重写了Animal方法

    @Override
    public void cry() {
        System.out.println("小狗在叫");
    }
}
