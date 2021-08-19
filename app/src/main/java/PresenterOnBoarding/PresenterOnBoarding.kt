package PresenterOnBoarding

class PresenterOnBoarding: ContractOnBoarding.Presenter {

    private var viewOnBoarding: ContractOnBoarding.View? = null
    fun setView(view: ContractOnBoarding.View){
        viewOnBoarding = view
    }

    override fun onButtonClick() {
        viewOnBoarding?.nextFragment()
    }


}