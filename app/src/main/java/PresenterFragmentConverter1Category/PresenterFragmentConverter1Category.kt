package PresenterFragmentConverter1Category

class PresenterFragmentConverter1Category: ContractFragmentConverter1Category.Presenter {
    lateinit var view: ContractFragmentConverter1Category.View
    override fun onAttach(view: ContractFragmentConverter1Category.View) {
        this.view = view
    }

    override fun onClickProduct() {
        view.viewButtonSheet()
    }

    override fun onClickFullDescription() {
        view.viewFullDescription()
    }

    override fun onDetach() {
        this.view = ConverterCategoryEmptyView
    }


}