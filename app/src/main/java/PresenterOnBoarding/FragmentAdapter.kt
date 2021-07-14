package PresenterOnBoarding

import View.FragmentOnBoardingOne
import View.FragmentOnBoardingThree
import View.FragmentOnBoardingTwo
import androidx.core.content.res.TypedArrayUtils.getText
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.ecoappp.MainActivity
import com.example.ecoappp.R


@Suppress("DEPRECATION")
class FragmentAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm){

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> FragmentOnBoardingOne()
            1 -> FragmentOnBoardingTwo()
            else ->  FragmentOnBoardingThree()
        }

    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "First Boarding"
            1 -> "Second Boarding"
            else -> return "Third Boarding"
        }
    }

}