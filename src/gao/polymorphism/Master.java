package gao.polymorphism;

public class Master {
    private String name;

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
    public void feed(Dog dog,Food food){
        System.out.println("主人"+name +" 给 "+ dog.getName()+" 吃 " + food.getName());

    }
}
