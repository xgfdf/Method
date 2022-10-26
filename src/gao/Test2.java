package gao;

public class Test2 {
    public static void main(String[] args) {
        Aaa aaa = new Aaa("小明");
        System.out.println(aaa.getName());
        aaa.say();

    }
}

class Aa{
    private String name;

    public void say(){
        System.out.println("sdf");
    }

    public Aa(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Aaa extends Aa{

    public Aaa(String name) {
        super(name);
    }


}
