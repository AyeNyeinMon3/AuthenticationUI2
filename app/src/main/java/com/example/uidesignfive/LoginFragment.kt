package com.example.uidesignfive

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.uidesignfive.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return FragmentLoginBinding.inflate(inflater).also {
            binding = it
        }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.tvSignup.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_loginFragment_to_signUpFragment)
        )
        binding.btnLogin.setOnClickListener { view : View ->
            view.findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToHomeFragment())
        }
    }

}