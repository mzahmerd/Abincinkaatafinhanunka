package com.gomtech.abincinkaatafinhanunka;

import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements VendorsFragment.OnFragmentInteractionListener {
//    private TextView mTextMessage;
    FragmentManager fm;
    Fragment vendorFrag, ordersFrag, homeFrag;
    ImageView imgTrad, imgFast, imgModern;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    fm.beginTransaction()
                            .replace(R.id.container, homeFrag)
                            .addToBackStack(null)
                            .commit();

//                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_orders:
//                    mTextMessage.setText(R.string.title_orders);
                    return true;
                case R.id.navigation_support:
//                    mTextMessage.setText(R.string.title_support);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);

        imgTrad = (ImageView) findViewById(R.id.imageView2);
        imgModern = (ImageView) findViewById(R.id.imageView3);
        imgFast = (ImageView) findViewById(R.id.imageView4);

        fm = getSupportFragmentManager();
        vendorFrag = new VendorsFragment();
        homeFrag = new HomeFrag();
//        profileFrag = new ProfileFragment();

        fm.beginTransaction()
                .replace(R.id.container, homeFrag)
                .addToBackStack(null)
                .commit();
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

//        imgTrad.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                fm = getSupportFragmentManager();
//                vendorFrag = new VendorsFragment();
////        profileFrag = new ProfileFragment();
//
//                fm.beginTransaction()
//                        .replace(R.id.container, vendorFrag)
//                        .addToBackStack(null)
//                        .commit();
//
//            }
//        });
//        imgModern.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                fm = getSupportFragmentManager();
//                vendorFrag = new VendorsFragment();
////        profileFrag = new ProfileFragment();
//
//                fm.beginTransaction()
//                        .replace(R.id.container, vendorFrag)
//                        .addToBackStack(null)
//                        .commit();
//
//            }
//        });
//        imgFast.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                fm = getSupportFragmentManager();
//                vendorFrag = new VendorsFragment();
////        profileFrag = new ProfileFragment();
//
//                fm.beginTransaction()
//                        .replace(R.id.container, vendorFrag)
//                        .addToBackStack(null)
//                        .commit();
//
//            }
//        });
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
