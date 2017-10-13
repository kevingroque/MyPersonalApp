package app.roque.com.mypersonalapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.roque.com.mypersonalapp.HomeActivity;
import app.roque.com.mypersonalapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ConfigFragment extends Fragment {


    public ConfigFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_config, container, false);
        ((HomeActivity) getActivity()).getSupportActionBar().setTitle("Configuración");

        return view;
    }

}
