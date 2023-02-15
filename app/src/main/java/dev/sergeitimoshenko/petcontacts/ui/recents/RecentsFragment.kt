package dev.sergeitimoshenko.petcontacts.ui.recents

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dev.sergeitimoshenko.petcontacts.R
import dev.sergeitimoshenko.petcontacts.databinding.FragmentRecentsBinding

class RecentsFragment : Fragment(R.layout.fragment_recents) {
    private var binding: FragmentRecentsBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentRecentsBinding.bind(view)
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}