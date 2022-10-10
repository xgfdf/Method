package gao.Extend.improve;

public class Extend01 {
    public static void main(String[] args) {


        gao.Extend.improve.Pupil pupil1 = new Pupil();
        pupil1.name = "银角大王";
        pupil1.age = 10;

        pupil1.testing();
        pupil1.setScore(60);
        pupil1.showInfo();

        Graduate graduate = new gao.Extend.improve.Graduate();
        graduate.name = "金角大王";
        graduate.age = 23;
        graduate.testing();
        graduate.setScore(100);
        graduate.showInfo();
    }
}
