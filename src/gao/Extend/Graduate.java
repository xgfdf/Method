package gao.Extend;

//大学生类---->模拟大学生考试

/*
* 写完Pupil和Graduate，两个类的属性和方法几乎是一样的
*
* 能否简化一次啊，提高代码复用性！！
* */
public class Graduate {

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

        System.out.println("大学生名字 "+name+" 年龄 "+age+" 成绩"+score);
    }


}
