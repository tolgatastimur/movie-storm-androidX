package com.tolgatastimur.moviestormandroidx.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.tolgatastimur.moviestormandroidx.ui.intheaters.InTheaterViewModel;

public abstract class FragmentInTheaterBinding extends ViewDataBinding {
  @Bindable
  protected InTheaterViewModel mViewModel;

  protected FragmentInTheaterBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setViewModel(@Nullable InTheaterViewModel viewModel);

  @Nullable
  public InTheaterViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentInTheaterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentInTheaterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentInTheaterBinding>inflate(inflater, com.tolgatastimur.moviestormandroidx.R.layout.fragment_in_theater, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentInTheaterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentInTheaterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentInTheaterBinding>inflate(inflater, com.tolgatastimur.moviestormandroidx.R.layout.fragment_in_theater, null, false, component);
  }

  public static FragmentInTheaterBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentInTheaterBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentInTheaterBinding)bind(component, view, com.tolgatastimur.moviestormandroidx.R.layout.fragment_in_theater);
  }
}
