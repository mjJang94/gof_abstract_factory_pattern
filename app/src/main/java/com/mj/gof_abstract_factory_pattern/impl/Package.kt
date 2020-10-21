package com.mj.gof_abstract_factory_pattern.impl

interface Package {
    fun createSnack() : Snack
    fun createBeverage() : Beverage
}