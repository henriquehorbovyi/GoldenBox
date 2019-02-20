package com.henry.goldenbox.ui.profile

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.henry.goldenbox.R
import com.henry.goldenbox.internal.toggleFloatingActionButtonVisibility
import com.henry.goldenbox.ui.base.ScopedFragment

class ProfileFragment : ScopedFragment() {

    private lateinit var viewModel: ProfileViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.profile_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ProfileViewModel::class.java)
        toggleFloatingActionButtonVisibility(false)
    }

}
