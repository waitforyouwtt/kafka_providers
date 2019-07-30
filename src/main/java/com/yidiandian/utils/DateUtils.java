package com.yidiandian.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2019/7/28 9:22
 * @Version: 1.0
 * @Email: 15290810931@163.com
 */
public class DateUtils {

    public static Date getDate(String dateString) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = null;
        try {
            date = sdf.parse(dateString);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return date;
    }

    public static String getDateFormat1() {
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        return  df.format(new Date());
    }
    public static String getDateFormat2() {
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
        return  df.format(new Date());
    }
    public static String getDateFormat3() {
        SimpleDateFormat df = new SimpleDateFormat("HHmmss");
        return  df.format(new Date());
    }
}
