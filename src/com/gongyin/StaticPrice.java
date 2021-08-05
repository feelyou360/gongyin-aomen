package com.gongyin;

/**
 *@描述 价格静态类，简单来说就是价格表，促销，满减的价格
 *@创建人 lisongzhi
 *@创建时间 2021/8/5 15:48
 *@修改人和其它信息
 */
public class StaticPrice {

    //销售价格
    public static double applePrice = 8;
    public static double strawberryPrice = 13;
    public static double mangoPrice = 20;

    //促销活动销售价格
    public static double no_salePrice = 1.0;
    public static double strawberry_salePrice = 0.8;

    //满减操作
    public static double fullPrice[] = {100,-10};

}
