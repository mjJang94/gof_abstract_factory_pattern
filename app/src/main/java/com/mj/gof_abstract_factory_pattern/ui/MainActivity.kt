package com.mj.gof_abstract_factory_pattern.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mj.gof_abstract_factory_pattern.Factory.PackageFactory
import com.mj.gof_abstract_factory_pattern.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        callFactory()
    }

    fun callFactory(){
        val packageFactory = PackageFactory()

        packageFactory.createPackage("LOTTE")
        packageFactory.createPackage("ORION")
    }
}