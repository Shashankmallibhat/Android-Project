package com.example.shashwork.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.shashwork.R;
import com.example.shashwork.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    String[] domain = {"Web development","Android development","IOS development", "Cyber Security"};
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHome;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);


        View view = inflater.inflate(R.layout.fragment_home,container,false);
        Spinner spin = view.findViewById(R.id.spinner);
        ArrayAdapter aa = new ArrayAdapter(this.getActivity(), android.R.layout.simple_spinner_item,domain);
        aa.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spin.setAdapter(aa);
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()  {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i,
                                       long l) {
                Toast.makeText(getActivity().getApplicationContext(),domain[i] ,
                        Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }

        });
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}