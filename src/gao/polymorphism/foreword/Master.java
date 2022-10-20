package gao.polymorphism.foreword;

import gao.polymorphism.foreword.*;

public class Master {
    private String name;


    //构造器
    //用处就是初始化 我们原本创建对象的时候 都是默认值
    // 现在可以直接在创建的时候赋值
    public Master(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //主人给 狗 喂食物
    public void feed(Dog dog, Food food){

        //)提供一个公共的(public)的get方法， 用于获取属性的值

        System.out.println("主人"+name +" 给 "+ dog.getName()+" 吃 " + food.getName());
    }
    public void feed(Cat cat, Fish fish){
        System.out.println("主人"+name +" 给 "+ cat.getName()+" 吃 " + fish.getName());
    }
    //如果动物很多，食物也多
    //===> feed方法也就更多，不利于管理和维护

    //////////////////
    //////////////////
    //使用多态统一管理主人给动物喂食

    //animal 编译类型是Animal,可以指向（接受）Animal子类的对象;-
    //food 编译类型是Food,可以指向（接受）Food子类的对象;
    public void food_poly(Animal animal, Food food){
        System.out.println("主人"+name +" 给 "+ animal.getName()+" 吃 " + food.getName());
    }
    }


































