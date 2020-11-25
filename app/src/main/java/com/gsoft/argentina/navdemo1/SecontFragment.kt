package com.gsoft.argentina.navdemo1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.gsoft.argentina.navdemo1.databinding.FragmentSecontBinding

// TODO: Rename parameter arguments, choose names that match

class SecontFragment : Fragment() {

    private lateinit var binding : FragmentSecontBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_secont, container, false )
        var input = requireArguments()!!.getString("user_input")
        binding.textView.text = input.toString()

        return binding.root
    }


}