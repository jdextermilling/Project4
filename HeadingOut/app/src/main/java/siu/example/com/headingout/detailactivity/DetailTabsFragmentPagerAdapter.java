package siu.example.com.headingout.detailactivity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import siu.example.com.headingout.detailactivity.tabfragment.DetailFlightTabFragment;
import siu.example.com.headingout.detailactivity.tabfragment.DetailHotelTabFragment;

/**
 * Created by samsiu on 4/29/16.
 */
public class DetailTabsFragmentPagerAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 3;
    private String tabTitles[] = new String[]{"FLIGHT", "HOTELS", "TRANSIT"};

    public DetailTabsFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return DetailFlightTabFragment.newInstance(position + 1);
            case 1:
                return DetailHotelTabFragment.newInstance(position + 1);
            default:
                return DetailFlightTabFragment.newInstance(position + 1);
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
