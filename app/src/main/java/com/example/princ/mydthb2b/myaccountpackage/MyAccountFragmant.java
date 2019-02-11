package com.example.princ.mydthb2b.myaccountpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.princ.mydthb2b.R;

import java.util.ArrayList;
import java.util.List;


public class MyAccountFragmant extends Fragment {
    RecyclerView recyclerView1;
     MyAccountPojo myAccountPojo;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_account_fragmant, container, false);
        recyclerView1=view.findViewById(R.id.recyclerView);
        recyclerView1.setHasFixedSize(true);
        recyclerView1.setLayoutManager(new LinearLayoutManager(getActivity()));
        myAccountPojo=new MyAccountPojo(getdetails(),getActivity());

        return view;
    }
    public static List<DetailClass> getdetails(){
        int[] image={R.drawable.shubham};
        String[] name={"Shubham Chauhan"};
        List<DetailClass> list1=new ArrayList<DetailClass>();
        for (int i=0;i<image.length && i<name.length;i++){
            DetailClass detailClass1=new DetailClass(image[i],name[i]);
            list1.add(detailClass1);

        }

        return list1;
    }


}
