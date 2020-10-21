package com.mj.gof_abstract_factory_pattern.Factory

import com.mj.gof_abstract_factory_pattern.Beverage.Beverage
import com.mj.gof_abstract_factory_pattern.Beverage.LotteBeverage
import com.mj.gof_abstract_factory_pattern.Beverage.OrionBeverage

class BeverageFactory {

    fun createBeverage(type: String) : Beverage?{
        var beverage: Beverage? = null
        when(type){

            "LOTTE" -> beverage = LotteBeverage()
            "ORION" -> beverage = OrionBeverage()
        }
        return beverage
    }
}