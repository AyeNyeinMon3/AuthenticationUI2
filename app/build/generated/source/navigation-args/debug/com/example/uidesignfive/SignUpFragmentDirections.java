package com.example.uidesignfive;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class SignUpFragmentDirections {
  private SignUpFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionSignUpFragmentToHomeFragment() {
    return new ActionOnlyNavDirections(R.id.action_signUpFragment_to_homeFragment);
  }
}
