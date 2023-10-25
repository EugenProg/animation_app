package kz.just_code.animationapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import kz.just_code.animationapp.databinding.FragmentSharedStartBinding

class SharedStartFragment: Fragment() {
    private lateinit var binding: FragmentSharedStartBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSharedStartBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.next.setOnClickListener {
            val extras = FragmentNavigatorExtras(
                binding.container to "container",
                binding.title to "title",
                binding.description to "description"
            )
            findNavController().navigate(
                SharedStartFragmentDirections.actionSharedStartFragmentToSharedEndFragment(), extras
            )
        }
    }
}