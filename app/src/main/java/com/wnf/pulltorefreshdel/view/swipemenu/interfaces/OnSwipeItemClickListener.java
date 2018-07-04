package com.wnf.pulltorefreshdel.view.swipemenu.interfaces;


import com.wnf.pulltorefreshdel.view.swipemenu.bean.SwipeMenu;
import com.wnf.pulltorefreshdel.view.swipemenu.view.SwipeMenuView;

public interface OnSwipeItemClickListener {
    void onItemClick(SwipeMenuView view, SwipeMenu menu, int index);
}