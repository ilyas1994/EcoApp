package PresenterContent_ver1

import androidx.fragment.app.Fragment

class PresenterContentVer1: ContractContentVer1.Presenter {

    lateinit var view: ContractContentVer1.View
    override fun Attach(view: ContractContentVer1.View) {
        this.view = view
    }

    override fun onDetach() {
    this.view = ContentEmptyView
    }

    override fun onClickProduct() {
        view.showCategory()
    }
}