package com.gongyin;

/**
 *@描述 草莓实体类
 *@创建人 lisongzhi
 *@创建时间 2021/8/5 15:32
 *@修改人和其它信息
 */
public class Strawberry implements SuperMarket{
        public Strawberry() {
        }

        @Override
        public double salesPrice(double jinShu,double salesPromotion){

                double price = PriceUtils.mul(jinShu,StaticPrice.strawberryPrice);
                return PriceUtils.mul(price,salesPromotion);
        }


}
