package kz.just_code.animationapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kz.just_code.animationapp.databinding.FragmentMotionBinding

class MotionFragment: Fragment() {
    private lateinit var binding: FragmentMotionBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMotionBinding.inflate(inflater, container, false)
        return binding.root
    }
}