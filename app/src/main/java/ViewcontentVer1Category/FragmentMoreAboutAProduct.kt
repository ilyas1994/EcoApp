package ViewcontentVer1Category

import PresenterFragmentConverter1Category.ContractFragmentConverter1Category
import PresenterFragmentConverter1Category.PresenterFragmentConverter1Category
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.isVisible
import com.example.ecoappp.MainActivity
import com.example.ecoappp.R
import com.google.android.material.bottomsheet.BottomSheetBehavior


class FragmentMoreAboutAProduct : Fragment(){

//    lateinit var myPres: ContractFragmentConverter1Category.Presenter
//    lateinit var constraintShowFullDescription: ConstraintLayout
//    lateinit var sheet: ConstraintLayout
//    lateinit var constraintMyBasket: ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_more_about_a_product, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//         constraintShowFullDescription = view.findViewById(R.id.constraintShowFullDescription)
//        val buttonprice: Button = view.findViewById(R.id.buttonprice)
//        constraintMyBasket = view.findViewById(R.id.constraintMyBasket)
//
//
//        sheet = view.findViewById(R.id.sheet)
//        myPres = PresenterFragmentConverter1Category()
//        myPres.onAttach(this)
//
//        buttonprice.setOnClickListener {
//            myPres.onClickFullDescription()
//            sheet.isVisible = false
//        }
//
//    }
//
//    override fun viewButtonSheet() {
//        TODO("Not yet implemented")
//    }
//
//    override fun viewFullDescription() {
//        Toast.makeText(context, "yes", Toast.LENGTH_SHORT).show()
//        constraintShowFullDescription.visibility = View.VISIBLE
//        constraintMyBasket.isVisible = false
    }


}
