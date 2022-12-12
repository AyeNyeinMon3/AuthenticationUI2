package com.example.uidesignfive

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.uidesignfive.databinding.FragmentSignupBinding

class SignUpFragment : Fragment() {

    private lateinit var binding: FragmentSignupBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return FragmentSignupBinding.inflate(inflater).also {
            binding = it
        }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnSignUp.setOnClickListener { view : View ->
            view.findNavController().navigate(SignUpFragmentDirections.actionSignUpFragmentToHomeFragment())
        }
    }

}