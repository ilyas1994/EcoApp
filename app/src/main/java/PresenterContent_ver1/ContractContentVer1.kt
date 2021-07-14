package PresenterContent_ver1

interface ContractContentVer1 {

    interface Presenter{
        fun Attach(view: View)
        fun onDetach()
        fun onClickProduct()
    }
    interface View {
        fun showCategory()
    }
}