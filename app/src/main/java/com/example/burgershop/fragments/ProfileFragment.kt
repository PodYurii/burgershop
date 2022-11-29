package com.example.burgershop.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.burgershop.MainActivity
import com.example.burgershop.R
import com.example.burgershop.curLocale
import com.example.burgershop.models.testUser1
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_profile.*
import java.util.*


class ProfileFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        settings_name.text = testUser1.name
        settings_phone.text = testUser1.phone
        settings_adress.text = testUser1.address

        radio_en.setOnClickListener(languageClickListener)
        radio_rus.setOnClickListener(languageClickListener)

        when (curLocale) {
            "ru" -> {
                radio_rus.isChecked = true
            }
            "en" -> {
                radio_en.isChecked = true
            }
        }

    }

    private var languageClickListener = View.OnClickListener {
        v -> val rb = v as RadioButton
        when (rb.id) {
            this.radio_rus.id -> {
                (activity as MainActivity).updateActivityWithLocale("ru")
            }
            this.radio_en.id -> {
                (activity as MainActivity).updateActivityWithLocale("en")
            }
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() : ProfileFragment {
            return ProfileFragment()
        }
    }
}