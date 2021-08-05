package com.gongyin;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 *@描述 价格类
 *@创建人 lisongzhi
 *@创建时间 2021/8/5 15:48
 *@修改人和其它信息
 */
public class PriceUtils {

//    处理总价格,對數組相加
public static double totelPrice(double[] price){
    double retPrice = 0.0;
    retPrice = Arrays.stream(price).sum();
    return  retPrice;
   }

   /**
    *@描述 处理满减价格
    * totalPrice 总价格
    * full_minus_Price 满多少的价格减多少
    *@创建人 lisongzhi
    *@创建时间 2021/8/5 16:44
    *@修改人和其它信息
    */
   public static double fullPrice(double totalPrice,double[] full_minus_Price){
       double retPrice = 0.0;
       retPrice = (totalPrice >= full_minus_Price[0]) ?(add(totalPrice,full_minus_Price[1])):totalPrice;

       return  retPrice;
   }



    //加法
    public static double add(double a,double b){
        BigDecimal d1 = new BigDecimal(Double.toString(a));
        BigDecimal d2 = new BigDecimal(Double.toString(b));
        return d1.add(d2).doubleValue();
    }

    //减法
    public static double sub(double a,double b){
        BigDecimal d1 = new BigDecimal(Double.toString(a));
        BigDecimal d2 = new BigDecimal(Double.toString(b));
        return d1.subtract(d2).doubleValue();
    }

    //乘法
    public  static double mul(double a,double b){
        BigDecimal d1 = new BigDecimal(Double.toString(a));
        BigDecimal d2 = new BigDecimal(Double.toString(b));
        return d1.multiply(d2).doubleValue();
    }

}
