package mx.com.rteck.puppy.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import mx.com.rteck.puppy.R;
import mx.com.rteck.puppy.adapter.MiPerroAdaptador;
import mx.com.rteck.puppy.adapter.PerroAdaptador;
import mx.com.rteck.puppy.pojo.MiPerro;
import mx.com.rteck.puppy.pojo.Perro;


/**
 * A simple {@link Fragment} subclass.
 */
public class TopFragment extends Fragment {

    ArrayList<MiPerro> miPerros;
    private RecyclerView listaPerros;
    public TopFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_top, container, false);
        listaPerros =(RecyclerView) v.findViewById(R.id.rvMiPerro);
        GridLayoutManager glm = new GridLayoutManager(getActivity(),2);

        listaPerros.setLayoutManager(glm);
        inicializarPerros();
        inicializarAdaptador();
        return v;
    }

    public void inicializarPerros()
    {
        miPerros =    new ArrayList<MiPerro>();
        miPerros.add(new MiPerro(R.drawable.miperro,3));
        miPerros.add(new MiPerro(R.drawable.miperro,4));
        miPerros.add(new MiPerro(R.drawable.miperro,5));
        miPerros.add(new MiPerro(R.drawable.miperro,2));
        miPerros.add(new MiPerro(R.drawable.miperro,3));
    }

    public MiPerroAdaptador adaptador;
    public void inicializarAdaptador()
    {
        adaptador = new MiPerroAdaptador(miPerros,getActivity());
        listaPerros.setAdapter(adaptador);
    }

}
