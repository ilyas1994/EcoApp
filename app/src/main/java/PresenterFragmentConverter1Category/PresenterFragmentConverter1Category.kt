package PresenterFragmentConverter1Category

class PresenterFragmentConverter1Category: ContractFragmentConverter1Category.Presenter {


   private var koinConverter1Category: ContractFragmentConverter1Category.View? = null
    fun setView(view: ContractFragmentConverter1Category.View){
        koinConverter1Category = view
    }


    override fun onClickProduct() {
        koinConverter1Category?.viewButtonSheet()
    }

    override fun onClickFullDescription() {
        koinConverter1Category?.viewFullDescription()
    }




}