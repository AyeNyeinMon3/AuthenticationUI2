// Generated by view binder compiler. Do not edit!
package com.example.uidesignfive.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.uidesignfive.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatButton button;

  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final EditText editTextTextPersonName;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final ImageView imageView4;

  @NonNull
  public final ImageView ivBasket;

  @NonNull
  public final ImageView ivBookmark;

  @NonNull
  public final ImageView ivCalendar;

  @NonNull
  public final ImageView ivCamera;

  @NonNull
  public final ImageView ivCart;

  @NonNull
  public final ImageView ivContact;

  @NonNull
  public final ImageView ivGallery;

  @NonNull
  public final ImageView ivHome;

  @NonNull
  public final ImageView ivLocation;

  @NonNull
  public final ImageView ivMusic;

  @NonNull
  public final ImageView ivProfile;

  @NonNull
  public final ImageView ivReport;

  @NonNull
  public final ImageView ivSetting;

  @NonNull
  public final LinearLayout linearLayout2;

  @NonNull
  public final RecyclerView rvNews;

  @NonNull
  public final ScrollView scrollView2;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textView7;

  @NonNull
  public final TextView textView8;

  @NonNull
  public final TextView tvBasket;

  @NonNull
  public final TextView tvBookmark;

  @NonNull
  public final TextView tvCalendar;

  @NonNull
  public final TextView tvCamera;

  @NonNull
  public final TextView tvCart;

  @NonNull
  public final TextView tvContact;

  @NonNull
  public final TextView tvGallery;

  @NonNull
  public final TextView tvHome;

  @NonNull
  public final TextView tvLocation;

  @NonNull
  public final TextView tvMusic;

  @NonNull
  public final TextView tvProfile;

  @NonNull
  public final TextView tvReport;

  @NonNull
  public final TextView tvSetting;

  private FragmentHomeBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatButton button,
      @NonNull ConstraintLayout constraintLayout, @NonNull EditText editTextTextPersonName,
      @NonNull ImageView imageView2, @NonNull ImageView imageView4, @NonNull ImageView ivBasket,
      @NonNull ImageView ivBookmark, @NonNull ImageView ivCalendar, @NonNull ImageView ivCamera,
      @NonNull ImageView ivCart, @NonNull ImageView ivContact, @NonNull ImageView ivGallery,
      @NonNull ImageView ivHome, @NonNull ImageView ivLocation, @NonNull ImageView ivMusic,
      @NonNull ImageView ivProfile, @NonNull ImageView ivReport, @NonNull ImageView ivSetting,
      @NonNull LinearLayout linearLayout2, @NonNull RecyclerView rvNews,
      @NonNull ScrollView scrollView2, @NonNull TextView textView3, @NonNull TextView textView4,
      @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView tvBasket,
      @NonNull TextView tvBookmark, @NonNull TextView tvCalendar, @NonNull TextView tvCamera,
      @NonNull TextView tvCart, @NonNull TextView tvContact, @NonNull TextView tvGallery,
      @NonNull TextView tvHome, @NonNull TextView tvLocation, @NonNull TextView tvMusic,
      @NonNull TextView tvProfile, @NonNull TextView tvReport, @NonNull TextView tvSetting) {
    this.rootView = rootView;
    this.button = button;
    this.constraintLayout = constraintLayout;
    this.editTextTextPersonName = editTextTextPersonName;
    this.imageView2 = imageView2;
    this.imageView4 = imageView4;
    this.ivBasket = ivBasket;
    this.ivBookmark = ivBookmark;
    this.ivCalendar = ivCalendar;
    this.ivCamera = ivCamera;
    this.ivCart = ivCart;
    this.ivContact = ivContact;
    this.ivGallery = ivGallery;
    this.ivHome = ivHome;
    this.ivLocation = ivLocation;
    this.ivMusic = ivMusic;
    this.ivProfile = ivProfile;
    this.ivReport = ivReport;
    this.ivSetting = ivSetting;
    this.linearLayout2 = linearLayout2;
    this.rvNews = rvNews;
    this.scrollView2 = scrollView2;
    this.textView3 = textView3;
    this.textView4 = textView4;
    this.textView7 = textView7;
    this.textView8 = textView8;
    this.tvBasket = tvBasket;
    this.tvBookmark = tvBookmark;
    this.tvCalendar = tvCalendar;
    this.tvCamera = tvCamera;
    this.tvCart = tvCart;
    this.tvContact = tvContact;
    this.tvGallery = tvGallery;
    this.tvHome = tvHome;
    this.tvLocation = tvLocation;
    this.tvMusic = tvMusic;
    this.tvProfile = tvProfile;
    this.tvReport = tvReport;
    this.tvSetting = tvSetting;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button;
      AppCompatButton button = ViewBindings.findChildViewById(rootView, id);
      if (button == null) {
        break missingId;
      }

      id = R.id.constraintLayout;
      ConstraintLayout constraintLayout = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout == null) {
        break missingId;
      }

      id = R.id.editTextTextPersonName;
      EditText editTextTextPersonName = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextPersonName == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.imageView4;
      ImageView imageView4 = ViewBindings.findChildViewById(rootView, id);
      if (imageView4 == null) {
        break missingId;
      }

      id = R.id.iv_basket;
      ImageView ivBasket = ViewBindings.findChildViewById(rootView, id);
      if (ivBasket == null) {
        break missingId;
      }

      id = R.id.iv_bookmark;
      ImageView ivBookmark = ViewBindings.findChildViewById(rootView, id);
      if (ivBookmark == null) {
        break missingId;
      }

      id = R.id.iv_calendar;
      ImageView ivCalendar = ViewBindings.findChildViewById(rootView, id);
      if (ivCalendar == null) {
        break missingId;
      }

      id = R.id.iv_camera;
      ImageView ivCamera = ViewBindings.findChildViewById(rootView, id);
      if (ivCamera == null) {
        break missingId;
      }

      id = R.id.iv_cart;
      ImageView ivCart = ViewBindings.findChildViewById(rootView, id);
      if (ivCart == null) {
        break missingId;
      }

      id = R.id.iv_contact;
      ImageView ivContact = ViewBindings.findChildViewById(rootView, id);
      if (ivContact == null) {
        break missingId;
      }

      id = R.id.iv_gallery;
      ImageView ivGallery = ViewBindings.findChildViewById(rootView, id);
      if (ivGallery == null) {
        break missingId;
      }

      id = R.id.iv_home;
      ImageView ivHome = ViewBindings.findChildViewById(rootView, id);
      if (ivHome == null) {
        break missingId;
      }

      id = R.id.iv_location;
      ImageView ivLocation = ViewBindings.findChildViewById(rootView, id);
      if (ivLocation == null) {
        break missingId;
      }

      id = R.id.iv_music;
      ImageView ivMusic = ViewBindings.findChildViewById(rootView, id);
      if (ivMusic == null) {
        break missingId;
      }

      id = R.id.iv_profile;
      ImageView ivProfile = ViewBindings.findChildViewById(rootView, id);
      if (ivProfile == null) {
        break missingId;
      }

      id = R.id.iv_report;
      ImageView ivReport = ViewBindings.findChildViewById(rootView, id);
      if (ivReport == null) {
        break missingId;
      }

      id = R.id.iv_setting;
      ImageView ivSetting = ViewBindings.findChildViewById(rootView, id);
      if (ivSetting == null) {
        break missingId;
      }

      id = R.id.linearLayout2;
      LinearLayout linearLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout2 == null) {
        break missingId;
      }

      id = R.id.rv_news;
      RecyclerView rvNews = ViewBindings.findChildViewById(rootView, id);
      if (rvNews == null) {
        break missingId;
      }

      id = R.id.scrollView2;
      ScrollView scrollView2 = ViewBindings.findChildViewById(rootView, id);
      if (scrollView2 == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.textView7;
      TextView textView7 = ViewBindings.findChildViewById(rootView, id);
      if (textView7 == null) {
        break missingId;
      }

      id = R.id.textView8;
      TextView textView8 = ViewBindings.findChildViewById(rootView, id);
      if (textView8 == null) {
        break missingId;
      }

      id = R.id.tv_basket;
      TextView tvBasket = ViewBindings.findChildViewById(rootView, id);
      if (tvBasket == null) {
        break missingId;
      }

      id = R.id.tv_bookmark;
      TextView tvBookmark = ViewBindings.findChildViewById(rootView, id);
      if (tvBookmark == null) {
        break missingId;
      }

      id = R.id.tv_calendar;
      TextView tvCalendar = ViewBindings.findChildViewById(rootView, id);
      if (tvCalendar == null) {
        break missingId;
      }

      id = R.id.tv_camera;
      TextView tvCamera = ViewBindings.findChildViewById(rootView, id);
      if (tvCamera == null) {
        break missingId;
      }

      id = R.id.tv_cart;
      TextView tvCart = ViewBindings.findChildViewById(rootView, id);
      if (tvCart == null) {
        break missingId;
      }

      id = R.id.tv_contact;
      TextView tvContact = ViewBindings.findChildViewById(rootView, id);
      if (tvContact == null) {
        break missingId;
      }

      id = R.id.tv_gallery;
      TextView tvGallery = ViewBindings.findChildViewById(rootView, id);
      if (tvGallery == null) {
        break missingId;
      }

      id = R.id.tv_home;
      TextView tvHome = ViewBindings.findChildViewById(rootView, id);
      if (tvHome == null) {
        break missingId;
      }

      id = R.id.tv_location;
      TextView tvLocation = ViewBindings.findChildViewById(rootView, id);
      if (tvLocation == null) {
        break missingId;
      }

      id = R.id.tv_music;
      TextView tvMusic = ViewBindings.findChildViewById(rootView, id);
      if (tvMusic == null) {
        break missingId;
      }

      id = R.id.tv_profile;
      TextView tvProfile = ViewBindings.findChildViewById(rootView, id);
      if (tvProfile == null) {
        break missingId;
      }

      id = R.id.tv_report;
      TextView tvReport = ViewBindings.findChildViewById(rootView, id);
      if (tvReport == null) {
        break missingId;
      }

      id = R.id.tv_setting;
      TextView tvSetting = ViewBindings.findChildViewById(rootView, id);
      if (tvSetting == null) {
        break missingId;
      }

      return new FragmentHomeBinding((ConstraintLayout) rootView, button, constraintLayout,
          editTextTextPersonName, imageView2, imageView4, ivBasket, ivBookmark, ivCalendar,
          ivCamera, ivCart, ivContact, ivGallery, ivHome, ivLocation, ivMusic, ivProfile, ivReport,
          ivSetting, linearLayout2, rvNews, scrollView2, textView3, textView4, textView7, textView8,
          tvBasket, tvBookmark, tvCalendar, tvCamera, tvCart, tvContact, tvGallery, tvHome,
          tvLocation, tvMusic, tvProfile, tvReport, tvSetting);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}