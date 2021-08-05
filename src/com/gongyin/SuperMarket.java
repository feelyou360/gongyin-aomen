package com.gongyin;

/**
 *@描述 超市抽象类
 *@创建人 lisongzhi
 *@创建时间 2021/8/5 15:32
 *@修改人和其它信息
 */
public interface SuperMarket {

        /**
         * 策略接口
         * jinShu 斤数  salesPromotion促销活动打折
         * @param userName
         * @return
         */
        public double salesPrice(double jinShu,double salesPromotion);

}
