package com.mj.gof_abstract_factory_pattern.lotte

import com.mj.gof_abstract_factory_pattern.impl.Beverage
import com.mj.gof_abstract_factory_pattern.lotte.LotteBeverage
import com.mj.gof_abstract_factory_pattern.impl.Package
import com.mj.gof_abstract_factory_pattern.lotte.LotteSnack
import com.mj.gof_abstract_factory_pattern.impl.Snack

class LottePackageFactory: Package {
    override fun createSnack(): Snack {

        return LotteSnack()
    }

    override fun createBeverage(): Beverage {

        return LotteBeverage()
    }
}