package com.mj.gof_abstract_factory_pattern.Factory

class PackageFactory {

    fun createPackage(type: String){

        val beverageFactory = BeverageFactory()
        val snackFactory = SnackFactory()

        beverageFactory.createBeverage(type)
        snackFactory.createKeyboard(type)
    }
}