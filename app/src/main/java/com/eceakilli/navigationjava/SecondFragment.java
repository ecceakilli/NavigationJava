package com.eceakilli.navigationjava;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.eceakilli.navigationjava.databinding.FragmentSecondBinding;


public class SecondFragment extends Fragment {

    private FragmentSecondBinding secondBinding;

    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        secondBinding = FragmentSecondBinding.inflate(getLayoutInflater());
        View view = secondBinding.getRoot();
        return view;

    }


    //fragment içerisindeki görünümler olusturulduktan sonra cagırılan methoddur.
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        secondBinding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               goToFisrt(view);
            }
        });

        if (getArguments() != null){
            int age = SecondFragmentArgs.fromBundle(getArguments()).getAge();
            secondBinding.textView.setText("Age: "+ age );
        }
    }

    public void goToFisrt(View view){
        NavDirections action = SecondFragmentDirections.actionSecondFragmentToFirstFragment();
        Navigation.findNavController(view).navigate(action);



    }
}