package gao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class demo01 {
    //创建一个时间对象
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        String dateStr = sf.format(date);
        System.out.println(dateStr);

        List<String> list = new ArrayList<>();
        list.add("asdf");

        int len = list.size();
        System.out.println(len);






    }
}






















