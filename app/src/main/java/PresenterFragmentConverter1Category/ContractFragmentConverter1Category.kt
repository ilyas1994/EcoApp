package PresenterFragmentConverter1Category

interface ContractFragmentConverter1Category {
    interface Presenter {

        fun onClickProduct()
        fun onClickFullDescription()


    }
    interface View {
        fun viewButtonSheet()
        fun viewFullDescription()
    }
}