package com.example.navigationodevi2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
class SonuclarFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_sonuclar, container, false)

        view.findViewById<Button>(R.id.button_sonuclar_geri).setOnClickListener {
            view.findNavController().navigate(R.id.action_sonuclar_to_giris)
        }
        return view
    }

}