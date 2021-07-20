package com.example.ecoappp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class EmptyFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_empty, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        routerNextFragment(Fragment())
        }
    fun routerNextFragment(fragment: Fragment){
        parentFragmentManager.beginTransaction().apply {
            replace(R.id.emptyFragment, fragment)
            commit()
        }
    }
    }

