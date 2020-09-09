package com.example.gaadtest.UI.submissions

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gaadtest.R

class SubmissionFragment : Fragment() {

    companion object {
        fun newInstance() = SubmissionFragment()
    }

    private lateinit var viewModel: SubmissionViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.submission_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SubmissionViewModel::class.java)
        // TODO: Use the ViewModel
    }

}