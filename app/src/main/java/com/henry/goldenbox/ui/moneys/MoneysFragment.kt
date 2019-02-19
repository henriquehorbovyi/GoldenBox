package com.henry.goldenbox.ui.moneys

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.henry.goldenbox.R
import com.henry.presenter.moneys.MoneysViewModel

class MoneysFragment : Fragment() {

    private lateinit var viewModel: MoneysViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.moneys_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MoneysViewModel::class.java)
    }

}
