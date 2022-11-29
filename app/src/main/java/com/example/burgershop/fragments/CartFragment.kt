package com.example.burgershop.fragments

import android.graphics.Typeface
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.burgershop.ItemAdapter
import com.example.burgershop.R
import com.example.burgershop.adapters.CartAdapter
import com.example.burgershop.models.CartModel
import com.example.burgershop.models.itemList
import kotlinx.android.synthetic.main.fragment_cart.*
import kotlinx.android.synthetic.main.fragment_home.*

class CartFragment : Fragment() {
    lateinit var _cart : CartModel

    fun initCart(cart: CartModel) {
        _cart = cart
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_cart, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter: CartAdapter?
        cart_recyclerView.layoutManager = LinearLayoutManager(context)
        adapter = CartAdapter(context, _cart, sum_price)
        cart_recyclerView.adapter = adapter
    }

    companion object {
        @JvmStatic
        fun newInstance() : CartFragment {
            return CartFragment()
        }
    }
}


