package gao.Encape;

public class Account {

    //为了封装，讲3个属性设置成private
    private String name;
    private double balance;
    private String password;

    //现在有个默认无参构造器，没办法直接赋值了

    //  所以我们提供一个无参构造器和有三个属性的构造器

    //写无参构造器目的是 创建对象有的时候想初始化 有的时候不想初始化。
    // 你要是只写了有参构造器，那么创建类对象就必须要初始化

    public Account() {
    }

    public Account(String name, double balance, String password) {
        /*this.name = name;
        this.balance = balance;
        this.password = password;*/
        setName(name);
        setBalance(balance);
        setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()>=2&&name.length()<=6){
             this.name = name;
        }else this.name = "无名";

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance>20){
        this.balance = balance;
        }else {
            System.out.println("余额必须大于20");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length()==6){
        this.password = password;
        }else {
            System.out.println("密码必须是6位，默认密码000000");
            this.password = "000000";
        }
    }
    //显示账号信息
    public void showInfo(){

        //可以增加一个权限校验
        System.out.println(name+balance+password);
    }

}
