package View.ViewContent

import PresenterContent_ver1.ContractContentVer1
import PresenterContent_ver1.PresenterContentVer1
import ViewcontentVer1Category.ViewFragmentContentver1Category
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.ecoappp.EmptyFragment
import com.example.ecoappp.R
import com.example.ecoappp.Router
import org.koin.android.ext.android.inject


class ViewFragmentContent_v1 : Fragment(), ContractContentVer1.View {

    private lateinit var imageview6: ImageView
    private val myKoinContent_v1 by inject<PresenterContentVer1>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_view_content_v1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        myKoinContent_v1.setView(this)
        imageview6 = view.findViewById(R.id.imageview6)

        imageview6.setOnClickListener {
            myKoinContent_v1.onClickProduct()
        }
    }

    override fun showCategory() {
        val nextFragment = Router().createFragment(ViewFragmentContentver1Category())
        requireActivity().supportFragmentManager.beginTransaction().apply {
            replace(R.id.emptyFragment, nextFragment, null)
            commit()
        }
    }


}
