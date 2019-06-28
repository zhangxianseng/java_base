package com.example.java_base.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @Author: zzq
 * @Description:
 * @Date: 2019/6/28 16:04
 */
public class DateDemo {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        System.out.println(sdf.format(cal.getTime()));
        cal.set(Calendar.MONTH,Calendar.MAY);
        System.out.println(sdf.format(cal.getTime()));
    }
}
