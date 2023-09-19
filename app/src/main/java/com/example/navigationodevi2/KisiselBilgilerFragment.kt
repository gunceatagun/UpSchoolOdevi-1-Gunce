package com.example.navigationodevi2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class KisiselBilgilerFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_kisisel_bilgiler, container, false)
        val giris_name =
            arguments?.let { arguments ->
                KisiselBilgilerFragmentArgs.fromBundle(arguments).nameArgument
            }
        val baslik = view.findViewById<TextView>(R.id.textViewAd)
        baslik.text = resources.getString(R.string.kisisel_bilgiler_baslık, giris_name)
        val email = view.findViewById<EditText>(R.id.editTextEmail)
        val telefon = view.findViewById<EditText>(R.id.editTextTelefon)
        val sehir = view.findViewById<EditText>(R.id.editTextSehir)
        val devamButon = view.findViewById<Button>(R.id.button_kisisel_devam_et)


        devamButon.setOnClickListener {
            if (email.text.isNullOrBlank() || telefon.text.isNullOrBlank() || sehir.text.isNullOrBlank()) {
                Toast.makeText(activity, "Lütfen gerekli alanları doldurun", Toast.LENGTH_SHORT)
                    .show()
            } else {
//data class doldurulacak ve action ile gönderilecek
            }

            view.findNavController().navigate(R.id.action_kisiselBilgiler_to_custom)
        }
        return view
    }

}