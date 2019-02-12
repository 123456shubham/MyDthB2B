package com.example.princ.mydthb2b.homepackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.princ.mydthb2b.ImageAdapaterClass;
import com.example.princ.mydthb2b.R;
import com.example.princ.mydthb2b.dthpackage.DthActvitiy;

import java.util.Timer;
import java.util.TimerTask;


public class HomeFragment extends Fragment {
   private Unbinder unbinder;

    private static int currentPage = 0;
    private static int NUM_PAGES = 4;

    private static int currentPage1 = 0;
    private static int NUM_PAGES1 = 4;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        final ViewPager mViewPage = view.findViewById(R.id.viewPage);
        unbinder=ButterKnife.bind(this,view);
        ImageAdapaterClass adapterView = new ImageAdapaterClass(getActivity());
        mViewPage.setAdapter(adapterView);
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if(currentPage == NUM_PAGES) {
                    currentPage = 0;
                }
                mViewPage.setCurrentItem(currentPage++, true);
            }
        };
        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 3000, 3000);

        final ViewPager mViewPage1 = view.findViewById(R.id.viewPage1);
        ImageAdapaterClass adapterView1 = new ImageAdapaterClass(getActivity());
        mViewPage1.setAdapter(adapterView1);
        final Handler handler1 = new Handler();
        final Runnable Update1 = new Runnable() {
            public void run() {
                if(currentPage1 == NUM_PAGES1) {
                    currentPage1 = 0;
                }
                mViewPage1.setCurrentItem(currentPage1++, true);
            }
        };
        Timer swipeTimer1 = new Timer();
        swipeTimer1.schedule(new TimerTask() {
            @Override
            public void run() {
                handler1.post(Update1);
            }
        }, 3000, 3000);


        return view;

    }

@OnClick({R.id.dth,R.id.dthlayout})
    public void dth(){
    Intent intent=new Intent(getActivity(), DthActvitiy.class);
    startActivity(intent);
}

}
