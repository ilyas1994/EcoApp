package PresenterOnBoarding

interface ContractOnBoarding {

    interface  Presenter {

        fun onButtonClick()
    }

    interface View{
        fun nextFragment()
    }
}