package com.example.mimenu.ui.listaproductos;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mimenu.R;
import com.example.mimenu.databinding.FragmentListarProductosBinding;
import com.example.mimenu.databinding.FragmentPideValoresBinding;
import com.example.mimenu.ui.sumador.PideValoresViewModel;

public class ListarProductosFragment extends Fragment {
    private ListarProductosViewModel mv;
    private FragmentListarProductosBinding binding ;

    private ListarProductosViewModel mViewModel;

    public static ListarProductosFragment newInstance() {
        return new ListarProductosFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mv = new ViewModelProvider(this).get(ListarProductosViewModel.class);
        binding = FragmentListarProductosBinding.inflate(inflater,container,false);
        View root = binding.getRoot();
        binding.btnListar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(getActivity(),R.id.nav_host_fragment_content_main).navigate(R.id.listadoFragment);
            }
        });

        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(ListarProductosViewModel.class);
        // TODO: Use the ViewModel
    }

}