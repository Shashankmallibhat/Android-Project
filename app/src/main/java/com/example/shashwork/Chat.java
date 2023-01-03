package com.example.shashwork;

import androidx.lifecycle.ViewModelProvider;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Chat extends Fragment {
    ListView listView;
    String contactlist[]={"Sham","Ram","Ramesh","Manohar"};
    int flags[] = {R.drawable.ic_baseline_person_24};
    private ChatViewModel mViewModel;

    public static Chat newInstance() {
        return new Chat();
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chat,container,false);
        listView = view.findViewById(R.id.listview);
//        ArrayAdapter<String> aa = new ArrayAdapter<String>(this.getActivity(),R.layout.listview,R.id.textView4,contactlist);
//        listView.setAdapter(aa);
        CustomAdapter customAdapter = new CustomAdapter(getActivity().getApplicationContext(),contactlist,flags );
        listView.setAdapter(customAdapter);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(ChatViewModel.class);
        // TODO: Use the ViewModel
    }

}