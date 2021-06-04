package com.erss.network.nodes;
//tab işlemlerini yapabilmek için bu sınıf oluşturuyoruz
import android.content.Context;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class SimpleFragmentPageAdapter2 extends FragmentPagerAdapter {

    private String[] tabTitle = new String[] {"Repeaters", "Bridges", "Switches", "Routers", "Modems", "Firewalls"};
    Context context;

    public SimpleFragmentPageAdapter2(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {  //hangi fragmentın içeri yansıtılacak
        if (position == 0) {
            FragmentRepeater fragmentDemo = new FragmentRepeater();
            return fragmentDemo;
        }
        else if (position == 1){
            FragmentBridges fragmentDemo1 = new FragmentBridges();
            return fragmentDemo1;
        }
        else if (position == 2) {
            FragmentSwitches fragmentDemo2 = new FragmentSwitches();
            return fragmentDemo2;
        }
        else if (position == 3) {
            FragmentRouters fragmentDemo3 = new FragmentRouters();
            return fragmentDemo3;
        }
        else if (position == 4){
            FragmentModems fragmentDemo4 = new FragmentModems();
            return fragmentDemo4;
        }
        else{
            FragmentFirewalls fragmentDemo5 = new FragmentFirewalls();
            return fragmentDemo5;
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
