package com.henry.goldenbox.ui.moneys

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton

import com.henry.goldenbox.R
import com.henry.goldenbox.internal.toggleFloatingActionButtonVisibility
import com.henry.goldenbox.ui.base.ScopedFragment
import kotlinx.android.synthetic.main.activity_main.*

class MoneysFragment : ScopedFragment() {

    private lateinit var viewModel: MoneysViewModel
    private lateinit var navController: NavController

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.moneys_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MoneysViewModel::class.java)
        navController = findNavController()

        toggleFloatingActionButtonVisibility(true)

        val floatingActionButton= activity?.findViewById<FloatingActionButton>(R.id.add_money_button)
        floatingActionButton?.setOnClickListener {
            navController.navigate(R.id.actionMoneysToAddMoney)
        }

    }

}
