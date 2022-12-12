package com.example.uidesignfive;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class LoginFragmentDirections {
  private LoginFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionLoginFragmentToSignUpFragment() {
    return new ActionOnlyNavDirections(R.id.action_loginFragment_to_signUpFragment);
  }

  @NonNull
  public static NavDirections actionLoginFragmentToHomeFragment() {
    return new ActionOnlyNavDirections(R.id.action_loginFragment_to_homeFragment);
  }
}
