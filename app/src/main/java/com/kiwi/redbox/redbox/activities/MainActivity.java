package com.kiwi.redbox.redbox.activities;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.kiwi.redbox.redbox.R;
import com.kiwi.redbox.redbox.adapters.SectionPagerAdapter;
import com.kiwi.redbox.redbox.fragments.NewWatchFragment;
import com.kiwi.redbox.redbox.fragments.WatchingFragment;
import com.kiwi.redbox.redbox.adapters.WatchingItemRecyclerViewAdapter;
import com.kiwi.redbox.redbox.fragments.content.WatchingFlightsContent;

public class MainActivity extends AppCompatActivity implements WatchingFragment.OnListFragmentInteractionListener, NewWatchFragment.OnFragmentInteractionListener{

    private static final String TAG = "MainActivity";
    private ViewPager mPager;
    private TabLayout mTabLayout;
    private SectionPagerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPager = (ViewPager) findViewById(R.id.pager);
        mTabLayout = (TabLayout) findViewById(R.id.tabs);

        mAdapter = new SectionPagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(mAdapter);


        // Tabs Configuration
        final TabLayout.Tab newWatch = mTabLayout.newTab();
        final TabLayout.Tab watching = mTabLayout.newTab();

        newWatch.setText("New watch");
        watching.setText("Watching");

        mTabLayout.addTab(newWatch, 0);
        mTabLayout.addTab(watching, 1);

        mPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));

        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public void onListFragmentInteraction(WatchingFlightsContent.WatchingFlight item) {
        Toast.makeText(getApplicationContext(), TAG + " onListFragmentInteraction",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {
        Toast.makeText(getApplicationContext(), TAG + " onFragmentInteraction",Toast.LENGTH_SHORT).show();

    }
}
