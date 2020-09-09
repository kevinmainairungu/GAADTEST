package com.example.gaadtest.UI.skillLeaders

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gaadtest.R

class SkillLeaderFragment : Fragment() {

    companion object {
        fun newInstance() = SkillLeaderFragment()
    }

    private lateinit var viewModel: SkillLeaderViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.skill_leader_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SkillLeaderViewModel::class.java)
        // TODO: Use the ViewModel
    }

}