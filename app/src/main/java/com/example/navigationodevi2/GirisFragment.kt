package com.example.navigationodevi2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.textfield.TextInputLayout


class GirisFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_giris, container, false)
        val buton_devam_et = view.findViewById<Button>(R.id.button_giris_devam_et)
        val textInputAdSoyad = view.findViewById<TextInputLayout>(R.id.texInputAdSoyad)

        buton_devam_et.setOnClickListener {
            if (textInputAdSoyad.editText?.text?.isEmpty() == true ||
                textInputAdSoyad.editText?.text?.isEmpty() == true
            ) {
                Toast.makeText(activity, "Lütfen adınızı girin", Toast.LENGTH_SHORT).show()
            } else {
                val name = textInputAdSoyad.editText?.text.toString()
                val action = GirisFragmentDirections.actionGirisToKisiselBilgiler(name)
                findNavController().navigate(action)
            }
        }
        return view
    }
}