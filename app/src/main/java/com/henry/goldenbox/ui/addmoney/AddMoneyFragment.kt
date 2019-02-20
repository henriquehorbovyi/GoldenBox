package com.henry.goldenbox.ui.addmoney

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders

import com.henry.goldenbox.R
import com.henry.goldenbox.internal.toggleFloatingActionButtonVisibility

class AddMoneyFragment : Fragment() {

    private lateinit var viewModel: AddMoneyViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.add_money_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(AddMoneyViewModel::class.java)
        toggleFloatingActionButtonVisibility(false)
    }

}
