package View

import PresenterOnBoarding.ContractOnBoarding
import PresenterOnBoarding.PresenterOnBoarding
import View.ViewContent.ViewFragmentContent_v1
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.ecoappp.EmptyFragment
import com.example.ecoappp.R
import com.example.ecoappp.Router


class FragmentOnBoardingTwo : Fragment(), ContractOnBoarding.View {

    private lateinit var myPresenter: ContractOnBoarding.Presenter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_on_boarding_two, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var buttonskip: Button = view.findViewById(R.id.button_skip2)
        myPresenter = PresenterOnBoarding()
        myPresenter.onAttach(this)

        buttonskip.setOnClickListener {
            myPresenter.onButtonClick()
        }
    }

    override fun nextFragment() {
        val nextFragment = Router().createFragment(ViewFragmentContent_v1())
        requireActivity().supportFragmentManager.beginTransaction().apply {
            replace(R.id.emptyFragment, nextFragment, null)
            commit()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        myPresenter.onDetach()
    }
}