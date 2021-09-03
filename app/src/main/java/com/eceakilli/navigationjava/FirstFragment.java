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

import com.eceakilli.navigationjava.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding firstBinding;


    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        firstBinding = FragmentFirstBinding.inflate(inflater);
        View view = firstBinding.getRoot();
        // Inflate the layout for this fragment
        return view;
    }

    //fragment içerisindeki görünümler olusturulduktan sonra cagırılan methoddur.
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        firstBinding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToSecond(view);
            }
        });

    }

    public void goToSecond(View view){
        //diğer fragmenta yönlendirme yaptım
        //NavDirections action = FirstFragmentDirections.actionFirstFragmentToSecondFragment();
        FirstFragmentDirections.ActionFirstFragmentToSecondFragment action = FirstFragmentDirections.actionFirstFragmentToSecondFragment();
        action.setAge(66);
        Navigation.findNavController(view).navigate(action);

    }
}