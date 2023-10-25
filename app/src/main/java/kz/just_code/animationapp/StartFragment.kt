package kz.just_code.animationapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kz.just_code.animationapp.databinding.StartFragmentBinding

class StartFragment : Fragment() {
    private lateinit var binding: StartFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = StartFragmentBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.next.setOnClickListener {
            binding.next.text = ""
            binding.next.isEnabled = false
            binding.loadingView.isVisible = true
            binding.loadingView.playAnimation()

            findNavController().navigate(StartFragmentDirections.actionStartFragmentToViewAnimationFragment())
        }
    }
}