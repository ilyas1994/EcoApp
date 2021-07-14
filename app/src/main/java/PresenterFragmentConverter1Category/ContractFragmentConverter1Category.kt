package PresenterFragmentConverter1Category

interface ContractFragmentConverter1Category {
    interface Presenter {
        fun onAttach(view: View)
        fun onClickProduct()
        fun onClickFullDescription()
        fun onDetach()

    }
    interface View {
        fun viewButtonSheet()
        fun viewFullDescription()
    }
}