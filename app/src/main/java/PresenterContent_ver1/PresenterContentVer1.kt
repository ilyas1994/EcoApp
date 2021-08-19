package PresenterContent_ver1

import androidx.fragment.app.Fragment

class PresenterContentVer1: ContractContentVer1.Presenter {

    var showView: ContractContentVer1.View? = null
    fun setView(view: ContractContentVer1.View){
        showView = view
    }

    override fun onClickProduct() {
        showView?.showCategory()
    }
}