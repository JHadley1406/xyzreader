// Generated code from Butter Knife. Do not modify!
package com.example.xyzreader.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class FragmentArticleList$$ViewBinder<T extends com.example.xyzreader.ui.FragmentArticleList> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558531, "field 'mRecyclerView'");
    target.mRecyclerView = finder.castView(view, 2131558531, "field 'mRecyclerView'");
    view = finder.findRequiredView(source, 2131558508, "field 'mSwipeRefreshLayout'");
    target.mSwipeRefreshLayout = finder.castView(view, 2131558508, "field 'mSwipeRefreshLayout'");
  }

  @Override public void unbind(T target) {
    target.mRecyclerView = null;
    target.mSwipeRefreshLayout = null;
  }
}
