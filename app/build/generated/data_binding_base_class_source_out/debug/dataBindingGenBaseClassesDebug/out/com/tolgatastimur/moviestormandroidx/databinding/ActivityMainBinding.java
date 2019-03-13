package com.tolgatastimur.moviestormandroidx.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.iammert.library.readablebottombar.ReadableBottomBar;
import com.tolgatastimur.moviestormandroidx.ui.main.MainActivityViewModel;

public abstract class ActivityMainBinding extends ViewDataBinding {
  @NonNull
  public final ReadableBottomBar bottomBar;

  @NonNull
  public final RelativeLayout rlRoot;

  @NonNull
  public final TextView textView;

  @Bindable
  protected MainActivityViewModel mViewModel;

  protected ActivityMainBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ReadableBottomBar bottomBar, RelativeLayout rlRoot, TextView textView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bottomBar = bottomBar;
    this.rlRoot = rlRoot;
    this.textView = textView;
  }

  public abstract void setViewModel(@Nullable MainActivityViewModel viewModel);

  @Nullable
  public MainActivityViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityMainBinding>inflate(inflater, com.tolgatastimur.moviestormandroidx.R.layout.activity_main, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityMainBinding>inflate(inflater, com.tolgatastimur.moviestormandroidx.R.layout.activity_main, null, false, component);
  }

  public static ActivityMainBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityMainBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityMainBinding)bind(component, view, com.tolgatastimur.moviestormandroidx.R.layout.activity_main);
  }
}
