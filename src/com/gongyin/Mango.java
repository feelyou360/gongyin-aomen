package com.gongyin;

/**
 *@描述 芒果实体类
 *@创建人 lisongzhi
 *@创建时间 2021/8/5 15:32
 *@修改人和其它信息
 */
public class Mango implements SuperMarket{
        public Mango() {
        }

        /**
         *@描述   算出价格，如果有打折活动的话直接打折
         * //jinShu斤數，salesPromotion销售活动，mangoPrice水果价格
         *@创建人 lisongzhi
         *@创建时间 2021/8/5 18:37
         *@修改人和其它信息
         */
        @Override
        public double salesPrice(double jinShu,double salesPromotion){

                double price = PriceUtils.mul(jinShu,StaticPrice.mangoPrice);
                return PriceUtils.mul(price,salesPromotion);
        }

}
