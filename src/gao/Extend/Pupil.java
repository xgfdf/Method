package gao.Extend;

//小学生类--->模拟考试
public class Pupil extends Extends01{
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }
    public void testing(){
        System.out.println("小学生"+name+"正在考试......");

    }
    public void showInfo(){
        System.out.println("小学生名字 "+name+" 年龄 "+age+" 成绩"+score);
    }


}
