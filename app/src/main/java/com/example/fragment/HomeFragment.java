package com.example.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


public class HomeFragment extends Fragment implements View.OnClickListener {

    public HomeFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container,false);
        Button btnCategory = view.findViewById(R.id.btn_detail_category);
        btnCategory.setOnClickListener(this);
        Button btnTest = view.findViewById(R.id.btn_test);
        btnTest.setOnClickListener(this);
        Button btnActv = view.findViewById(R.id.btn_actv);
        btnActv.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if (v.getId()== R.id.btn_detail_category){

                        CategoryFragment mCategoryFragment = new CategoryFragment();
                        FragmentManager mFragmentManager = getFragmentManager();
                        FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction();
                        mFragmentTransaction.replace(R.id.frame_container,mCategoryFragment,CategoryFragment.class.getSimpleName());
                        mFragmentTransaction.addToBackStack(null);
                        mFragmentTransaction.commit();


            }else if (v.getId()==R.id.btn_test){
            TestFragment mTestFragment = new TestFragment();
            FragmentManager mFragmentManager = getFragmentManager();
            FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frame_container,mTestFragment,TestFragment.class.getSimpleName());
            mFragmentTransaction.addToBackStack(null);
            mFragmentTransaction.commit();
        }else if (v.getId()==R.id.btn_actv){
            Intent tes = new Intent(getActivity(),TesActivity.class);
            startActivity(tes);

        }



        }

    }

