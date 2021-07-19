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
import com.example.ecoappp.R


class FragmentOnBoardingOne : Fragment(), ContractOnBoarding.View {

    private lateinit var button_skip: Button
    private lateinit var myPresenter: ContractOnBoarding.Presenter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_on_boarding_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        button_skip = view.findViewById(R.id.button_skip)
        myPresenter = PresenterOnBoarding()
        myPresenter.onAttach(this)

        button_skip.setOnClickListener {
            myPresenter.onButtonClick()
        }

    }

    override fun nextFragment() {
        parentFragmentManager.beginTransaction().apply {
            replace(R.id.emptyFragment, ViewFragmentContent_v1())
            commit()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        myPresenter.onDetach()
    }

}