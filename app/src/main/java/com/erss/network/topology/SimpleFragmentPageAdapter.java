package com.erss.network.topology;
//tab işlemlerini yapabilmek için bu sınıf oluşturuyoruz
import android.content.Context;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SimpleFragmentPageAdapter extends FragmentPagerAdapter {
 private String[] tabTitle = new String[] {"Star", "Bus", "Line", "Ring", "Tree", "Mesh", "Fully Mesh"};
 Context context;

 public SimpleFragmentPageAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {  //hangi fragmentın içeri yansıtılacak
        if (position == 0) {
            FragmentStar fragmentDemo = new FragmentStar();
            return fragmentDemo;
        }
        else if (position == 1){
            FragmentBus fragmentDemo1 = new FragmentBus();
            return fragmentDemo1;
        }
        else if (position == 2) {
            FragmentLine fragmentDemo2 = new FragmentLine();
            return fragmentDemo2;
        }
        else if (position == 3){
            FragmentRing fragmentDemo3 = new FragmentRing();
            return fragmentDemo3;
        }
        else if(position == 4){
            FragmentTree fragmentDemo4 = new FragmentTree();
            return fragmentDemo4;
        }
        else if(position == 5){
            FragmentMesh fragmentDemo5 = new FragmentMesh();
            return fragmentDemo5;
        }
        else{
            FragmentFullyMesh fragmentDemo6 = new FragmentFullyMesh();
            return fragmentDemo6;
        }
    }

    @Override
    public int getCount() {
        return tabTitle.length;
    }

    @Nullable
    @Override //yukarıda tab4 5 gözükmesi için
    public CharSequence getPageTitle(int position) {
        return tabTitle[position];
    }
}
