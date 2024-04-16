package com.example.myapplication4;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment2 extends Fragment {

    private ListView listView;
    private ArrayAdapter<String> adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2_layout, container, false);

        listView = view.findViewById(R.id.listView);

        String[] data = {"Аптечка", "Палатка", "Фонарик", "Дождевик", "Тент", "Еда", "Вода", "Рюкзак"};

        adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, data);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), "Нажат элемент: " + data[position], Toast.LENGTH_SHORT).show();
                Log.d("Fragment2", "Нажат элемент: " + data[position]);
            }
        });
        return view;
    }
}