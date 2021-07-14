package View

import PresenterOnBoarding.ContractOnBoarding
import PresenterOnBoarding.PresenterOnBoarding
import View.ViewContent.ViewFragmentContent_v1
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.ecoappp.MainActivity
import com.example.ecoappp.R


class FragmentOnBoardingThree : Fragment(), ContractOnBoarding.View {
    lateinit var myPresenter: ContractOnBoarding.Presenter
    lateinit var mainActivity: MainActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_on_boarding_three, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var buttonSkip: Button = view.findViewById(R.id.button_skip3)
        myPresenter = PresenterOnBoarding()
        myPresenter.onAttach(this)
        mainActivity = (activity as MainActivity)

        buttonSkip.setOnClickListener {
            myPresenter.onButtonClick()
        }
    }

    override fun nextFragment() {
        mainActivity.switchFragment(ViewFragmentContent_v1())
        mainActivity.switchStatusTablayout(false)
    }

    override fun onDestroy() {
        super.onDestroy()
        myPresenter.onDetach()
    }
}