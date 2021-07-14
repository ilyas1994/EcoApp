package PresenterOnBoarding

class PresenterOnBoarding: ContractOnBoarding.Presenter {

    lateinit var view: ContractOnBoarding.View

    override fun onAttach(view: ContractOnBoarding.View) {
        this.view = view
    }

    override fun onDetach() {
        this.view = onBoardingEmptyView
    }
    override fun onButtonClick() {
        view.nextFragment()
    }


}