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
import com.tolgatastimur.moviestormandroidx.ui.movies.MoviesViewModel;

public abstract class FragmentMoviesBinding extends ViewDataBinding {
  @Bindable
  protected MoviesViewModel mViewModel;

  protected FragmentMoviesBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setViewModel(@Nullable MoviesViewModel viewModel);

  @Nullable
  public MoviesViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentMoviesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentMoviesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentMoviesBinding>inflate(inflater, com.tolgatastimur.moviestormandroidx.R.layout.fragment_movies, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentMoviesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentMoviesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentMoviesBinding>inflate(inflater, com.tolgatastimur.moviestormandroidx.R.layout.fragment_movies, null, false, component);
  }

  public static FragmentMoviesBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentMoviesBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentMoviesBinding)bind(component, view, com.tolgatastimur.moviestormandroidx.R.layout.fragment_movies);
  }
}
