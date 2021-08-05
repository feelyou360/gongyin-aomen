import com.gongyin.*;

/**
 *@描述 超市买水果main类
 *@创建人 lisongzhi
 *@创建时间 2021/8/5 17:15
 *@修改人和其它信息
 */
public class GongyinMain {

    public static void main(String[] args) {

        Apple apple = new Apple();
        Strawberry strawberry = new Strawberry();
        Mango mango = new Mango();

        /**
         *@描述 1、有一家超市，出售苹果和草莓。其中苹果 8 元/斤，草莓 13 元/斤。
         * 现在顾客 A 在超市购买了若干斤苹果和草莓，需要计算一共多少钱？
         * 请编写函数，对于 A 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
         *@创建人 lisongzhi
         *@创建时间 2021/8/5 16:51
         *@修改人和其它信息
         */
        double applePrice = apple.salesPrice(6, StaticPrice.no_salePrice);
        double strawberryPrice = strawberry.salesPrice(8, StaticPrice.no_salePrice);
        double[] douPrice = new double[]{applePrice,strawberryPrice};
        double totalPrice = PriceUtils.totelPrice(douPrice);
        System.out.println("1、价格"+totalPrice);

        /**
         *@描述 2、超市增加了一种水果芒果，其定价为 20 元/斤。
         * 现在顾客 B 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
         * 请编写函数，对于 B 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
         *@创建人 lisongzhi
         *@创建时间 2021/8/5 17:00
         *@修改人和其它信息
         */
        double applePrice2 = apple.salesPrice(6, StaticPrice.no_salePrice);
        double strawberryPrice2 = strawberry.salesPrice(8, StaticPrice.no_salePrice);
        double mangoPrice2 = mango.salesPrice(11, StaticPrice.no_salePrice);
        double[] douPrice2 = new double[]{applePrice2,strawberryPrice2,mangoPrice2};
        double totalPrice2 = PriceUtils.totelPrice(douPrice2);
        System.out.println("2、多买芒果"+totalPrice2);


        /**
         *@描述 3、超市做促销活动，草莓限时打 8 折。
         * 现在顾客 C 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
         * 请编写函数，对于 C 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
         *@创建人 lisongzhi
         *@创建时间 2021/8/5 17:00
         *@修改人和其它信息
         */
        double applePrice3 = apple.salesPrice(6, StaticPrice.no_salePrice);
        double strawberryPrice3 = strawberry.salesPrice(8, StaticPrice.no_salePrice);
        double mangoPrice3 = mango.salesPrice(11, StaticPrice.strawberry_salePrice);
        double[] douPrice3 = new double[]{applePrice3,strawberryPrice3,mangoPrice3};
        double totalPrice3 = PriceUtils.totelPrice(douPrice3);
        System.out.println("3、促销活动打折"+totalPrice3);


        /**
         *@描述 4、促销活动效果明显，超市继续加大促销力度，购物满 100 减 10 块。
         * 现在顾客 D 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
         * 请编写函数，对于 D购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
         *@创建人 lisongzhi
         *@创建时间 2021/8/5 17:00
         *@修改人和其它信息
         */
        double applePrice4 = apple.salesPrice(6, StaticPrice.no_salePrice);
        double strawberryPrice4 = strawberry.salesPrice(8, StaticPrice.no_salePrice);
        double mangoPrice4 = mango.salesPrice(11, StaticPrice.strawberry_salePrice);
        double[] douPrice4 = new double[]{applePrice4,strawberryPrice4,mangoPrice4};
        double totalPrice4 = PriceUtils.totelPrice(douPrice4);
        double totalPrice5 = PriceUtils.fullPrice(totalPrice4,new double[]{100,-10});
        System.out.println("4、促销活动满减"+totalPrice5);

    }


}
