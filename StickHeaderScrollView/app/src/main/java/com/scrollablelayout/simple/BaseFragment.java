package com.scrollablelayout.simple;


import androidx.fragment.app.Fragment;

import com.scrollablelayout.ScrollableHelper;


/**
 * A simple {@link Fragment} subclass.
 */
public abstract class BaseFragment extends Fragment implements ScrollableHelper.ScrollableContainer{

    public abstract void pullToRefresh();
    public abstract void refreshComplete();
}
