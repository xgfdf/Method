package gao.Extend.improve;

//Pupil、Graduate的父类
public class Student {
    //Pupil、Graduate 共有的属性
    String name;
    int age;

    //共有方法
    private double score;

    public void setScore(double score) {
        this.score = score;
    }
    public void showInfo(){
        System.out.println("小学生名字 "+name+" 年龄 "+age+" 成绩"+score);
    }
}