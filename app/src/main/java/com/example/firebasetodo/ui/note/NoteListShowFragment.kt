package com.example.firebasetodo.ui.note

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.firebasetodo.R
import com.example.firebasetodo.databinding.FragmentNoteListShowBinding
import com.example.firebasetodo.databinding.FragmentNoteShowDetailsBinding


class NoteListShowFragment : Fragment() {

    lateinit var binding: FragmentNoteListShowBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return if (this::binding.isInitialized){
            binding.root
        }else {
            binding=FragmentNoteListShowBinding.inflate(inflater,container,false)

            return binding.root


        }

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.floatingActionButton.setOnClickListener {

            findNavController().navigate(R.id.action_noteListShowFragment_to_createTaskFragment)

        }

    }
}