package com.example.gaadtest.UI.learningLeaders

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.gaadtest.MainActivity
import com.example.gaadtest.network.LoadingStatus
import com.example.gaadtest.databinding.LearningLeadersFragmentBinding
import com.wadud.gads.ui.learningLeaders.LearningHourAdapter
import com.wadud.gads.ui.learningLeaders.LearningLeadersViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class LearningLeadersFragment : Fragment() {

    private val mainActivity: MainActivity
        get() {
            return activity as? MainActivity ?: throw IllegalStateException("Not attached!")
        }

    private val viewModel: LearningLeadersViewModel by viewModels()
    private lateinit var binding: LearningLeadersFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = LearningLeadersFragmentBinding.inflate(inflater, container, false)
        val adapter = LearningHourAdapter()
        viewModel._leaders.observe(viewLifecycleOwner) {
            adapter.submitList(it)
        }
        viewModel.loadingStatus.observe(viewLifecycleOwner) {
            when (it) {
                is LoadingStatus.Loading -> mainActivity.showLoading(it.message)
                is LoadingStatus.Success -> mainActivity.dismissLoading()
                is LoadingStatus.Error -> mainActivity.dismissLoading()
            }
        }

        binding.hoursList.adapter = adapter
        return binding.root
    }


}