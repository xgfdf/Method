package gao.daily_work.october;

public class hjkb {
    public static void main(String[] args) {
        double salary = 10000; //一个月工资
        double year;
        double sum =0;
        int count = 0;
        boolean tar = true;

        while (sum<=100000000){
            year = salary*12; //一年工资


            sum = sum + year - year*0.2;//存的钱

            salary = salary*1.2;

            count++;

            System.out.println(count);
            System.out.println(sum);

        }
        System.out.println(count);

    }
    /*
    *
    *
    * */








}
