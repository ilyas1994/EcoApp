package ViewcontentVer1Category

import PresenterFragmentConverter1Category.ContractFragmentConverter1Category
import PresenterFragmentConverter1Category.PresenterFragmentConverter1Category
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.isVisible
import com.example.ecoappp.MainActivity
import com.example.ecoappp.R
import com.google.android.material.bottomsheet.BottomSheetBehavior


class ViewFragmentContentver1Category : Fragment(), ContractFragmentConverter1Category.View {

    lateinit var imageViewProduct2: ImageView
    lateinit var mainActivity: MainActivity
    lateinit var myPres: ContractFragmentConverter1Category.Presenter
    lateinit var sheet: ConstraintLayout
    lateinit var constraintLayoutMyBasket: ConstraintLayout
    //
      lateinit var buttonprice: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_view_contentver1_category, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mainActivity = (activity as MainActivity)
        sheet = view.findViewById(R.id.sheet)
        constraintLayoutMyBasket = view.findViewById(R.id.constraintLayoutMyBasket)

        //
        buttonprice = view.findViewById(R.id.buttonprice)
//        constraintShowFullDescription = view.findViewById(R.id.constraintShowFullDescription)

        //
        myPres = PresenterFragmentConverter1Category()
        myPres.onAttach(this)
        imageViewProduct2 = view.findViewById(R.id.imageViewProduct2)


            BottomSheetBehavior.from(sheet).apply {
                peekHeight = 0
                this.state = BottomSheetBehavior.STATE_HIDDEN
            }




        imageViewProduct2.setOnClickListener {
            myPres.onClickProduct()
        }
        //
        buttonprice.setOnClickListener {
            myPres.onClickFullDescription()
        }

    }

    override fun viewButtonSheet() {
        BottomSheetBehavior.from(sheet).apply {
            peekHeight = 200
            this.state = BottomSheetBehavior.STATE_EXPANDED
        }
    }

    override fun viewFullDescription() {

    }

    override fun onDestroy() {
        super.onDestroy()
        myPres.onDetach()
    }

}