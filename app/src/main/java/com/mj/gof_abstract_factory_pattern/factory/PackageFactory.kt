package com.mj.gof_abstract_factory_pattern.factory

import com.mj.gof_abstract_factory_pattern.impl.Package
import com.mj.gof_abstract_factory_pattern.lotte.LottePackageFactory
import com.mj.gof_abstract_factory_pattern.orion.OrionPackageFactory

class PackageFactory {

    fun createPackage(type: String){
        var factory : Package?= null

        when(type){

            "LOTTE" -> factory =
                LottePackageFactory()

            "ORION" -> factory =
                OrionPackageFactory()
        }

        factory?.createSnack()
        factory?.createBeverage()
    }
}