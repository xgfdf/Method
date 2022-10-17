package gao.polymorphism;

public class Polymorphism01 {
    public static void main(String[] args) {

        Master 小明 = new Master("小明");

        Dog dog = new Dog("大黄狗");
        Food bone = new Food("大棒骨");
        Cat cat = new Cat("家猫");
        Fish fish = new Fish("<・)))><<");




        小明.feed(dog,bone);
        小明.feed(cat,fish);
        ///////////////////////////
        ///////////////////////////
        System.out.println("多态改进以后");

        小明.food_poly(dog,bone);
        小明.food_poly(cat,fish);

        Pig pig = new Pig("佩奇");
        Rice rice = new Rice("米饭");
        小明.food_poly(pig,rice);






    }


}
