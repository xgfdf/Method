package gao.polymorphism;

public class Polymorphism01 {
    public static void main(String[] args) {

        Master 小明 = new Master("小明");

        Dog dog = new Dog("大黄狗");

        Food bone = new Food("大棒骨");
        小明.feed(dog,bone);



    }


}
