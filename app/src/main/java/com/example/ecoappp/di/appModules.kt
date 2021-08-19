package com.example.ecoappp.di

import PresenterContent_ver1.PresenterContentVer1
import PresenterFragmentConverter1Category.PresenterFragmentConverter1Category
import PresenterOnBoarding.PresenterOnBoarding
import org.koin.dsl.module


val appModules = module {

    factory { PresenterContentVer1() }

}

val fragmentConverter1Categoryy = module {

    factory { PresenterFragmentConverter1Category() }
}

val fragmentonBoarding = module {
    factory { PresenterOnBoarding() }
}

