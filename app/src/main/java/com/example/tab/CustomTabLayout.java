package com.example.tab;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.google.android.material.tabs.TabLayout;

import java.util.jar.Attributes;

public class CustomTabLayout extends TabLayout {
    public CustomTabLayout(Context context) {
        super(context); }
        public CustomTabLayout(Context context, AttributeSet attrs){
        super(context, attrs); }
        public CustomTabLayout(Context context,AttributeSet attrs, int defStyleAttrs){
        super(context, attrs,defStyleAttrs);}


    @Override
protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec){
        ViewGroup tabLayout = (ViewGroup) getChildAt( 0);
        int childCount = tabLayout.getChildCount();
        if(childCount !=0){
            DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
            int tabMinWidth = displayMetrics.widthPixels / childCount;
            for ( int i=0; i< childCount; ++i){
              tabLayout.getChildAt(i).setMinimumWidth(tabMinWidth);
            }
        }
        super.onMeasure(widthMeasureSpec,heightMeasureSpec);
}
}