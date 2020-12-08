package com.example.tab;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm , int behavitor) {
        super(fm, behavitor);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
       switch (position){
           case 0:
               return new GiaoHangFragment();
           case 1:
               return new BinhLuanFragment();
           case 2:
               return new ThongTinFragment();
           default:
               return new GiaoHangFragment();
       }
       
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
     String title= "";
        switch (position){
            case 0:
                title="Giao hàng";
                break;
            case 1:
                title="Bình luận";
                break;
            case 2:
                title="Thông tin";
                break;
     }
        return title;
    }
}
