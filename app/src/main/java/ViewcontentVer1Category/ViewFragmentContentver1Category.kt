package ViewcontentVer1Category

import PresenterFragmentConverter1Category.ContractFragmentConverter1Category
import PresenterFragmentConverter1Category.PresenterFragmentConverter1Category
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import com.example.ecoappp.R
import com.google.android.material.bottomsheet.BottomSheetBehavior
import org.koin.android.ext.android.inject


class ViewFragmentContentver1Category : Fragment(), ContractFragmentConverter1Category.View {

    private lateinit var imageViewProduct2: ImageView
    private lateinit var sheet: ConstraintLayout
    private lateinit var constraintLayoutMyBasket: ConstraintLayout
    private lateinit var buttonprice: Button
    private val koin by inject<PresenterFragmentConverter1Category>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_view_contentver1_category, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()

        koin.setView(this)
        BottomSheetBehavior.from(sheet).apply {
            peekHeight = 0
            this.state = BottomSheetBehavior.STATE_HIDDEN
        }

        imageViewProduct2.setOnClickListener {
            koin.onClickProduct()
        }

        buttonprice.setOnClickListener {
            koin.onClickFullDescription()
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

    private fun init(){
        sheet = view?.findViewById(R.id.sheet)!!
        constraintLayoutMyBasket = view?.findViewById(R.id.constraintLayoutMyBasket)!!
        buttonprice = view?.findViewById(R.id.buttonprice)!!
        imageViewProduct2 = view?.findViewById(R.id.imageViewProduct2)!!
    }
}