package View

import PresenterOnBoarding.FragmentAdapter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.ecoappp.R
import com.google.android.material.tabs.TabLayout


class ViewFragmentPager : Fragment() {

    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_view_pager, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tabLayout = view.findViewById(R.id.tabs)
        viewPager = view.findViewById(R.id.viewPager2)

        var fragmentAdapter = FragmentAdapter(parentFragmentManager)
        viewPager.adapter = fragmentAdapter




    }
}