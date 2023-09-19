package com.example.navigationodevi2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController


class GirisFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_giris, container, false)

        view.findViewById<Button>(R.id.button_giris_devam_et).setOnClickListener {
            view.findNavController().navigate(R.id.action_giris_to_kisiselBilgiler)
        }
        return view
    }
}