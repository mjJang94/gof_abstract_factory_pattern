package com.mj.gof_abstract_factory_pattern.orion

import com.mj.gof_abstract_factory_pattern.impl.Beverage
import com.mj.gof_abstract_factory_pattern.orion.OrionBeverage
import com.mj.gof_abstract_factory_pattern.impl.Package
import com.mj.gof_abstract_factory_pattern.orion.OrionSnack
import com.mj.gof_abstract_factory_pattern.impl.Snack

class OrionPackageFactory: Package {
    override fun createSnack(): Snack {
        return OrionSnack()
    }

    override fun createBeverage(): Beverage {
       return OrionBeverage()
    }

}