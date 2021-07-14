package PresenterOnBoarding

interface ContractOnBoarding {

    interface  Presenter {
        fun onAttach(view: View)
        fun onDetach()
        fun onButtonClick()
    }

    interface View{
        fun nextFragment()
    }
}