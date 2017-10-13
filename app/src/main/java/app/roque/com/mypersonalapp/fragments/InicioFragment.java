package app.roque.com.mypersonalapp.fragments;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import app.roque.com.mypersonalapp.HomeActivity;
import app.roque.com.mypersonalapp.R;
import app.roque.com.mypersonalapp.model.User;
import app.roque.com.mypersonalapp.repository.UserRepository;

/**
 * A simple {@link Fragment} subclass.
 */
public class InicioFragment extends Fragment {

    private TextView nombre;
    private SharedPreferences sharedPreferences;

    public InicioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_inicio, container, false);
        ((HomeActivity) getActivity()).getSupportActionBar().setTitle("Inicio");
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getContext());
        String username = sharedPreferences.getString("username", null);
        User user = UserRepository.getUser(username);
        nombre = (TextView)view.findViewById(R.id.txtBNombre);
        nombre.setText(username);

        return view;
    }

}
