package com.example.mimenu.ui.listaproductos;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mimenu.R;
import com.example.mimenu.databinding.FragmentListadoBinding;
import com.example.mimenu.models.Producto;

import java.util.ArrayList;

public class ListadoFragment extends Fragment {

    private ListadoViewModel mViewModel;
    private FragmentListadoBinding binding;

    public static ListadoFragment newInstance() {
        return new ListadoFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = FragmentListadoBinding.inflate(inflater,container,false);
        View root = binding.getRoot();
        ArrayList<Producto> lista = new ArrayList<>();
        lista.add(new Producto("Azucar 1KG",320.55,"http://www.secsanluis.com.ar/servicios/azucar.jpg"));
        lista.add(new Producto("Fideos 500g",100.50,"http://www.secsanluis.com.ar/servicios/yerba.jpg"));
        RecyclerView rv = binding.rvLista;

        GridLayoutManager grilla = new GridLayoutManager(getContext(),2,GridLayoutManager.VERTICAL,false);
        rv.setLayoutManager(grilla);

        ListaProductoAdapter lpa = new ListaProductoAdapter(getContext(),lista,inflater);
        rv.setAdapter(lpa);

        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(ListadoViewModel.class);
        // TODO: Use the ViewModel
    }

}